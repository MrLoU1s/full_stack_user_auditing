package com.muiyurocodes.full_stack_user_auditing.repository;

import com.muiyurocodes.full_stack_user_auditing.entities.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<PostEntity,Long> {

}
