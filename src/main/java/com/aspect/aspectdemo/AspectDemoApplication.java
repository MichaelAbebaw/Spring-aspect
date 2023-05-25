package com.aspects.aspectdemo;

import com.aspects.aspectdemo.configuration.ProjectConfiguration;
import com.aspects.aspectdemo.entity.Comment;
import com.aspects.aspectdemo.service.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AspectDemoApplication {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
		var service = context.getBean(CommentService.class);
		//
		service.publishComment(new Comment("Aspect programming", "Spring"));
		System.out.println(service.publishComment2(new Comment("Aspect", "Programming")));
	}
}
