package com.muiyurocodes.full_stack_user_auditing.controller;

import com.muiyurocodes.full_stack_user_auditing.dto.CreatePostDTO;
import com.muiyurocodes.full_stack_user_auditing.dto.PostDTO;
import com.muiyurocodes.full_stack_user_auditing.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/posts")
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @PostMapping
    public PostDTO createPost(@RequestBody CreatePostDTO postDTO ){
        return postService.createPost(postDTO);
    }

    @GetMapping
    public List<PostDTO> getAll(){
        return postService.getAllPosts();
    }




}
