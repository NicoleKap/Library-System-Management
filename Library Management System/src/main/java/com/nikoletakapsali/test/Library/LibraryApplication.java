package com.nikoletakapsali.test.Library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nikoletakapsali.test.Library.Entities.Theme;
import com.nikoletakapsali.test.Library.Services.ThemeServices;

@SpringBootApplication
public class LibraryApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibraryApplication.class, args);
        
        ThemeServices themeService = new ThemeServices();
        Theme theme = new Theme(456,"Spring","Description_Testing");
        
        themeService.AddTheme(theme);
        
        themeService.AddTheme(new Theme(457,"Spring2","Description_Testing2"));
        
        for(Theme theTheme : themeService.getThemes()) {
        	System.out.println(theTheme.toString());
        }
        
    }

}
