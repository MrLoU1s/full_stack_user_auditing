package com.muiyurocodes.full_stack_user_auditing.service;

import com.muiyurocodes.full_stack_user_auditing.dto.CreatePostDTO;
import com.muiyurocodes.full_stack_user_auditing.dto.PostDTO;
import com.muiyurocodes.full_stack_user_auditing.entities.PostEntity;
import com.muiyurocodes.full_stack_user_auditing.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;
    private final ModelMapper modelMapper;


    public PostDTO createPost(CreatePostDTO postDTO) {
        PostEntity postEntity = modelMapper.map(postDTO, PostEntity.class);
        PostEntity savedPost = postRepository.save(postEntity);
        return modelMapper.map(savedPost, PostDTO.class);
    }

    public List<PostDTO> getAllPosts() {
        return postRepository.findAll().stream()
                .map(post->modelMapper.map(post, PostDTO.class))
                .collect(Collectors.toList());

    }
}
