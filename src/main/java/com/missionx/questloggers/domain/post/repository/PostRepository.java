package com.missionx.questloggers.domain.post.repository;

import com.missionx.questloggers.domain.post.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
