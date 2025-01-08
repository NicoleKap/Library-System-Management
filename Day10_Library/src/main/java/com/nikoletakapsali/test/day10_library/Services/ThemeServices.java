package com.nikoletakapsali.test.day10_library.Services;

import com.nikoletakapsali.test.day10_library.Entities.Theme;

import java.util.ArrayList;
import java.util.List;

public class ThemeServices {

    private List<Theme> themes = new ArrayList<Theme>();

    //adds a new theme to my list
    public void AddTheme(Theme theme) {
        themes.add(theme);
    }

    //removes a theme from the list
    public void RemoveTheme(Theme theme) {
        themes.remove(theme);
    }

    public void UpdateTheme(Theme theme) {

        for (int i = 0; i < themes.size(); i++) {
            if (themes.get(i).equals(theme)) {
                themes.set(i, theme);
                break;
            }
        }

    }

}
