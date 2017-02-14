package cn.pushhand.blog.mapper;

import cn.pushhand.blog.model.Tlable;
import cn.pushhand.blog.model.TlableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TlableMapper {
    int countByExample(TlableExample example);

    int deleteByExample(TlableExample example);

    int deleteByPrimaryKey(String vcLableid);

    int insert(Tlable record);

    int insertSelective(Tlable record);

    List<Tlable> selectByExample(TlableExample example);

    Tlable selectByPrimaryKey(String vcLableid);

    int updateByExampleSelective(@Param("record") Tlable record, @Param("example") TlableExample example);

    int updateByExample(@Param("record") Tlable record, @Param("example") TlableExample example);

    int updateByPrimaryKeySelective(Tlable record);

    int updateByPrimaryKey(Tlable record);
}