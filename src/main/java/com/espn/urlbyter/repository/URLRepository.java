package com.espn.urlbyter.repository;

import com.espn.urlbyter.domain.URLEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface URLRepository extends JpaRepository<URLEntity, Long>
{
    List<URLEntity> findByRedirectId(String redirectId);
}
