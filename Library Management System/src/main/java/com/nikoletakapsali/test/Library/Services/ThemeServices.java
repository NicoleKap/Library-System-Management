package com.nikoletakapsali.test.Library.Services;

import com.nikoletakapsali.test.Library.Entities.Theme;

import java.util.ArrayList;
import java.util.List;

public class ThemeServices {

    private List<Theme> themes = new ArrayList<Theme>();

    
    public List<Theme> getThemes() {
		return themes;
	}

	public void setThemes(List<Theme> themes) {
		this.themes = themes;
	}

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

	@Override
	public String toString() {
		return "ThemeServices [themes=" + themes + "]";
	}
    
    

}
