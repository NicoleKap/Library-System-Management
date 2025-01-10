package com.teomaik.demospring.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.teomaik.demospring.themes.Theme;
import com.teomaik.demospring.themes.ThemeServices;

@RestController
@RequestMapping("themes") // Ορίζεται το path στο οποίο ακούει ο controller 
public class ThemeController {
	
	@Autowired
	ThemeServices themeservices;
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello from the controler";
	}
	
	@GetMapping("/all")
	public List<Theme> getAllThemes(){
		return themeservices.getAllThemes();
	}
	
	@PostMapping("/addTheme")
	public String addTheme(@RequestBody Theme theme) {
		themeservices.addTheme(theme);
		return "The theme is added";
	}

	@DeleteMapping("/deleteTheme")
	public String removeTheme(@RequestParam int id) {
		themeservices.removeTheme(id);
		return "The theme removed successfully";
	}
	
	@PutMapping("/updateTheme")
	public String updateTheme(@RequestParam int id, @RequestParam(required=false) String name, @RequestParam String description) {
		themeservices.updateTheme(id, name, description);
		return "Updated";
	}
}
