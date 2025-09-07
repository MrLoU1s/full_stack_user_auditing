package com.muiyurocodes.full_stack_user_auditing.dto;

import lombok.*;
import org.springframework.web.bind.annotation.CrossOrigin;

//Purpose of this DTO is for creating a new Post.Why?
// The other fields i.e. id, createdBy, createdDate are set automatically
//for security purposes preventing malicious users changing createdBy
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class CreatePostDTO {
private String title;
private String description;
}
