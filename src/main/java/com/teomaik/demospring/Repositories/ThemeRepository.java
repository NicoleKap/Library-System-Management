package com.teomaik.demospring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teomaik.demospring.themes.Theme;

public interface ThemeRepository extends JpaRepository<Theme, Integer> {

	
	
}
