package cn.pushhand.blog.mapper;

import cn.pushhand.blog.model.Tarticlelable;
import cn.pushhand.blog.model.TarticlelableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TarticlelableMapper {
    int countByExample(TarticlelableExample example);

    int deleteByExample(TarticlelableExample example);

    int insert(Tarticlelable record);

    int insertSelective(Tarticlelable record);

    List<Tarticlelable> selectByExample(TarticlelableExample example);

    int updateByExampleSelective(@Param("record") Tarticlelable record, @Param("example") TarticlelableExample example);

    int updateByExample(@Param("record") Tarticlelable record, @Param("example") TarticlelableExample example);
}