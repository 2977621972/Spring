package com.warehouse.pro.controller.base;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.warehouse.pro.po.base.Comment;
import com.warehouse.pro.service.base.CommentService;

@Controller
@RequestMapping("/comment")
public class CommentController {
	@Autowired
	private CommentService commentService;
	@RequestMapping(value="list")
	@ResponseBody
	public List<Comment> getlist(){
		List<Comment> list=commentService.selectByExample(null);
		return list;
	}
}
