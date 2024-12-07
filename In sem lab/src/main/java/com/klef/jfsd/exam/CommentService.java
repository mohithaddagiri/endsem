package com.klef.jfsd.exam;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class CommentService {
    private final RestTemplate restTemplate = new RestTemplate();
    private final String apiUrl = "https://jsonplaceholder.typicode.com/comments";

    public List<Object> getAllComments() {
        // Fetch comments from the external API
        Object[] comments = restTemplate.getForObject(apiUrl, Object[].class);
        return Arrays.asList(comments);
    }
}
