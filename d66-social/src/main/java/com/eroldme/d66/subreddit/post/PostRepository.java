package com.eroldme.d66.subreddit.post;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
  * @author Mompati 'Patco' Keetile
  * @created 19-12-2022 @ 12:39
  *
  *
 */
@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}
