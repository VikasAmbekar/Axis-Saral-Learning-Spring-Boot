package com.axis.repository;

import com.axis.entity.NewsFeed;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsFeedRepository extends CrudRepository<NewsFeed, Long> {
}
