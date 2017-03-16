package cn.pushhand.blog.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.BoundSetOperations;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Service;

/**
 * Redis缓存工具类
 *  ValueOperations　　——基本数据类型和实体类的缓存
	ListOperations　　   ——list的缓存
	SetOperations　　  ——set的缓存
	HashOperations　　--Map的缓存
 * @author Errol
 *
 * @param <T>
 * @param <V>
 */
@Service("redisCache")
public class RedisCacheUtil {
	
	@Autowired @Qualifier("jedisTemplate")
    public RedisTemplate<String, Object> redisTemplate;
	

	
	
	/**
	 * 缓存基本类型
	 * 包括实体类
	 * 实体类必须实现序列化接口
	 * @param key
	 * @param value
	 * @return
	 */
	public ValueOperations<String, Object> setCacheObject(String key , Object value){
		
		ValueOperations<String, Object> option = (ValueOperations<String, Object>) redisTemplate.opsForValue();
		
		System.out.println(redisTemplate.getValueSerializer());
		
		option.set(key, value);
		
		return option;
		
	}
	
	/**
	 * 基本类型数值加一
	 * @param key
	 * @return
	 */
	public Object increseCacheObject(String key ){
		//使用increment命令
		//底层使用incrby命令
		//需要手动设置一下序列化工具	
		/**
		 * 此处设置序列化工具会导致pojo序列化失败，暂时无法使用
		 */
		redisTemplate.setValueSerializer(new StringRedisSerializer());
		

		
		ValueOperations<String, Object> option = (ValueOperations<String, Object>) redisTemplate.opsForValue();
		
		long value = option.increment(key, 1);
		
		return value;
		
	}
	
	
	/**
	 * 获取基本类型的缓存
	 * @param value
	 * @return
	 */
	public Object getCacheObject(String key){
		
		ValueOperations<String, Object> option = (ValueOperations<String, Object>) redisTemplate.opsForValue();
		
		return option.get(key);
		
	}
	
	/**
	 * 缓存List
	 * @param key
	 * @param dataList
	 * @return
	 */
	public ListOperations<String, Object> setCacheList(String key , List<Object> dataList){
		
		ListOperations<String, Object> option = redisTemplate.opsForList();
		
		if(dataList != null){
			int size = dataList.size();
			//循环存入
			for(int i = 0 ; i < size  ; i++){
				option.rightPush(key, dataList.get(i));
			}
		}
		
		return option;
		
	}
	
	/**
	 * 获取缓存的List
	 * @param key
	 * @return
	 */
	public List<Object> getCacheList(String key){
		
		ListOperations<String, Object> option = redisTemplate.opsForList();
		List<Object> dataList = new ArrayList<Object>();
		long size = option.size(key);
		//循环读取
		for(int i = 0 ; i < size ; i++){
			dataList.add(option.leftPop(key));
		}
		return dataList;
	}
	
	/**
     * 缓存Set
     * @param key        缓存键值
     * @param dataSet    缓存的数据
     * @return            缓存数据的对象
     */
    public BoundSetOperations<String,Object> setCacheSet(String key,Set<Object> dataSet)
    {
    	
        BoundSetOperations<String,Object> setOperation = redisTemplate.boundSetOps(key);    
        Object[] t = (Object[]) dataSet.toArray();
             setOperation.add(t);
        if(dataSet != null){
        	Iterator<Object> it = dataSet.iterator();
        	while(it.hasNext())
        	{
        		setOperation.add(it.next());
        	}
        }
        
        return setOperation;
    }
    
    /**
     * 获得缓存的set
     * @param key
     * @param operation
     * @return
     */
    public Set<Object> getCacheSet(String key)
    {
    	
        Set<Object> dataSet = new HashSet<Object>();
        BoundSetOperations<String,Object> operation = redisTemplate.boundSetOps(key);    
        
        Long size = operation.size();
        for(int i = 0 ; i < size ; i++)
        {
            dataSet.add(operation.pop());
        }
        return dataSet;
    }
    
    /**
     * 缓存Map
     * @param key
     * @param dataMap
     * @return
     */
    public HashOperations<String,String,Object> setCacheMap(String key,Map<String,Object> dataMap)
    {
    	
        HashOperations<String, String, Object> hashOperations = redisTemplate.opsForHash();
        if(null != dataMap)
        {
            
            for (Map.Entry<String, Object> entry : dataMap.entrySet()) {  
                  
                hashOperations.put(key,entry.getKey(),entry.getValue());
            } 
            
        }
        
        return hashOperations;
    }
    
    /**
     * 获得缓存的Map
     * @param key
     * @param hashOperation
     * @return
     */
	public Map<Object,Object> getCacheMap(String key)
    {
		
        Map<Object, Object> map = (Map<Object, Object>) redisTemplate.opsForHash().entries(key);
        return map;
    }
    
    /**
     * 删除key
     * @param key
     */
    public void deleteKey(String key){
    	
    	redisTemplate.delete(key);
    }
    

}
