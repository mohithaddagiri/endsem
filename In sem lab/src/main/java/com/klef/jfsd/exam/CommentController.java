package com.klef.jfsd.exam;

import com.klef.jfsd.exam.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/comments")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @GetMapping
    public ResponseEntity<List<Object>> fetchAllComments() {
        List<Object> comments = commentService.getAllComments();
        return ResponseEntity.ok(comments);
    }
}
