package com.warehouse.pro.service.base;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.warehouse.pro.po.base.Comment;
import com.warehouse.pro.po.base.CommentExample;

public interface CommentService {
	 int countByExample(CommentExample example);

	    int deleteByExample(CommentExample example);

	    int deleteByPrimaryKey(Integer id);

	    int insert(Comment record);

	    int insertSelective(Comment record);

	    List<Comment> selectByExample(CommentExample example);

	    Comment selectByPrimaryKey(Integer id);

	    int updateByExampleSelective(@Param("record") Comment record, @Param("example") CommentExample example);

	    int updateByExample(@Param("record") Comment record, @Param("example") CommentExample example);

	    int updateByPrimaryKeySelective(Comment record);

	    int updateByPrimaryKey(Comment record);
}
