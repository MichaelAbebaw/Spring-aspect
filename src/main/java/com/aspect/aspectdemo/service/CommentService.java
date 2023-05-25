package com.aspects.aspectdemo.service;

import com.aspects.aspectdemo.entity.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {
    private Logger logger = Logger.getLogger(CommentService.class.getName());

    public void publishComment (Comment comment) {
        logger.info("Publish comment : " + comment.text());
    }

    public String publishComment2 (Comment comment) {
        logger.info("Publishing comment:" + comment.text());
        return "SUCCESS";
    }
}
