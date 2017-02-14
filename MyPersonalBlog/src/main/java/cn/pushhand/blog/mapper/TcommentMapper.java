package cn.pushhand.blog.mapper;

import cn.pushhand.blog.model.Tcomment;
import cn.pushhand.blog.model.TcommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcommentMapper {
    int countByExample(TcommentExample example);

    int deleteByExample(TcommentExample example);

    int deleteByPrimaryKey(String vcCommentid);

    int insert(Tcomment record);

    int insertSelective(Tcomment record);

    List<Tcomment> selectByExample(TcommentExample example);

    Tcomment selectByPrimaryKey(String vcCommentid);

    int updateByExampleSelective(@Param("record") Tcomment record, @Param("example") TcommentExample example);

    int updateByExample(@Param("record") Tcomment record, @Param("example") TcommentExample example);

    int updateByPrimaryKeySelective(Tcomment record);

    int updateByPrimaryKey(Tcomment record);
}