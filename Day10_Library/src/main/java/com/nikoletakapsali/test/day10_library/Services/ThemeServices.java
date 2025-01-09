package com.nikoletakapsali.test.day10_library.Services;

import com.nikoletakapsali.test.day10_library.Entities.Theme;

import java.util.ArrayList;
import java.util.List;

public class ThemeServices {

    private List<Theme> themes = new ArrayList<Theme>();

    //adds a new theme to my list
    public List<Theme> AddTheme(Theme theme) {
        themes.add(theme);
        return themes;
    }

    //removes a theme from the list
    public void RemoveTheme(Integer id) {
        themes.removeIf(theme -> theme.getId() == id);
    }

    public void UpdateTheme(int id, String new_name, String new_description) {
        for (int i = 0; i < themes.size(); i++) {
            for(Theme theme : themes) {
            	if (theme.getId() == id) {
            		if (new_name != null)
            			theme.setName(new_name);
            		if (new_description != null)
            			theme.setDescription(new_description);
            	}
            }
        }

    }

}
