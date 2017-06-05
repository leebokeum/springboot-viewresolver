package com.example.viewresolver.resolver;

import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

/**
 * Created by 이복음 on 2017-06-05.
 */
public class PdfViewResolver implements ViewResolver {

    @Override
    public View resolveViewName(String viewName, Locale locale) throws Exception {

        PdfView view = new PdfView();
        return view;

    }

}