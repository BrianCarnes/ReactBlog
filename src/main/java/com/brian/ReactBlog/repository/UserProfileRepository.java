package com.brian.ReactBlog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.brian.ReactBlog.profile.UserProfile;

public interface UserProfileRepository extends JpaRepository <UserProfile, Long> {

        }

