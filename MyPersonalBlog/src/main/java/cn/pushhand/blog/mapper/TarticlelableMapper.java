package cn.pushhand.blog.mapper;

import cn.pushhand.blog.model.Tarticlelable;
import cn.pushhand.blog.model.TarticlelableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TarticlelableMapper {
    int countByExample(TarticlelableExample example);

    int deleteByExample(TarticlelableExample example);

    int deleteByPrimaryKey(String vcArticleid);

    int insert(Tarticlelable record);

    int insertSelective(Tarticlelable record);

    List<Tarticlelable> selectByExample(TarticlelableExample example);

    Tarticlelable selectByPrimaryKey(String vcArticleid);

    int updateByExampleSelective(@Param("record") Tarticlelable record, @Param("example") TarticlelableExample example);

    int updateByExample(@Param("record") Tarticlelable record, @Param("example") TarticlelableExample example);

    int updateByPrimaryKeySelective(Tarticlelable record);

    int updateByPrimaryKey(Tarticlelable record);
}