package com.syrine.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.transaction.annotation.Transactional;

import com.syrine.demo.entities.Image;

public interface ImageRepository extends JpaRepository<Image , Long> {
	 
	 }