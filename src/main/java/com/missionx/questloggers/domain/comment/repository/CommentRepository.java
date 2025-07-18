package com.missionx.questloggers.domain.comment.repository;

import com.missionx.questloggers.domain.comment.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
