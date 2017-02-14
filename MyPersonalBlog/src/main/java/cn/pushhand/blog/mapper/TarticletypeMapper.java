package cn.pushhand.blog.mapper;

import cn.pushhand.blog.model.Tarticletype;
import cn.pushhand.blog.model.TarticletypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TarticletypeMapper {
    int countByExample(TarticletypeExample example);

    int deleteByExample(TarticletypeExample example);

    int deleteByPrimaryKey(String vcTypeid);

    int insert(Tarticletype record);

    int insertSelective(Tarticletype record);

    List<Tarticletype> selectByExample(TarticletypeExample example);

    Tarticletype selectByPrimaryKey(String vcTypeid);

    int updateByExampleSelective(@Param("record") Tarticletype record, @Param("example") TarticletypeExample example);

    int updateByExample(@Param("record") Tarticletype record, @Param("example") TarticletypeExample example);

    int updateByPrimaryKeySelective(Tarticletype record);

    int updateByPrimaryKey(Tarticletype record);
}