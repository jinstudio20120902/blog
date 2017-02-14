package cn.pushhand.blog.mapper;

import cn.pushhand.blog.model.Tarticle;
import cn.pushhand.blog.model.TarticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TarticleMapper {
    int countByExample(TarticleExample example);

    int deleteByExample(TarticleExample example);

    int deleteByPrimaryKey(String vcArticleid);

    int insert(Tarticle record);

    int insertSelective(Tarticle record);

    List<Tarticle> selectByExample(TarticleExample example);

    Tarticle selectByPrimaryKey(String vcArticleid);

    int updateByExampleSelective(@Param("record") Tarticle record, @Param("example") TarticleExample example);

    int updateByExample(@Param("record") Tarticle record, @Param("example") TarticleExample example);

    int updateByPrimaryKeySelective(Tarticle record);

    int updateByPrimaryKey(Tarticle record);
}