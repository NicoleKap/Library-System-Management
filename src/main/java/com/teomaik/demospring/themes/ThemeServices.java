package com.teomaik.demospring.themes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.teomaik.demospring.Repositories.ThemeRepository;


@Service
public class ThemeServices {

	
	@Autowired ThemeRepository repository;
	
	
//	List<Theme> themes = new ArrayList<Theme>();

	public List<Theme> getAllThemes() {
		return repository.findAll(); // Έχω 
	}

	public List<Theme> addTheme(Theme theme) {
		repository.save(theme);
		return this.getAllThemes();
	}

	public List<Theme> removeTheme(Integer id) {
		repository.deleteById(id);
		return this.getAllThemes();
	}

	public List<Theme> updateTheme(int id, String name, String description) {
		for (Theme theme : getAllThemes()) {
			if (theme.getId() == id) {
				if (name != null)
					theme.setName(name);
				if (description != null)
					theme.setDescription(description);
				return this.getAllThemes();
			}
		}
		throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Theme with id " + id + " doesnt exist");
	}
}

