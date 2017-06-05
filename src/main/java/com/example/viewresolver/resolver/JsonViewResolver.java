package com.example.viewresolver.resolver;

import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import java.util.Locale;

/**
 * Created by 이복음 on 2017-06-05.
 */
public class JsonViewResolver implements ViewResolver {

    public View resolveViewName(String viewName, Locale locale) throws Exception {

        MappingJackson2JsonView view = new MappingJackson2JsonView();
        view.setPrettyPrint(true);
        return view;

    }

}