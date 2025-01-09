package Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nikoletakapsali.test.Library.Services.ThemeServices;

@RestController
@RequestMapping("Themes")
public class ThemeControler {

	@Autowired
	ThemeServices themeService;
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello from theme controller";
	}
	
}
