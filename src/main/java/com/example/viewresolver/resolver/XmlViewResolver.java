package com.example.viewresolver.resolver;

import org.springframework.oxm.Marshaller;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.xml.MarshallingView;

import java.util.Locale;

/**
 * Created by 이복음 on 2017-06-05.
 */
public class XmlViewResolver implements ViewResolver {

    private Marshaller marshaller;

    public XmlViewResolver(Marshaller marshaller) {
        this.marshaller = marshaller;
    }

    public View resolveViewName(String viewName, Locale locale) throws Exception {
        MarshallingView marshallingView = new MarshallingView();
        marshallingView.setMarshaller(marshaller);
        return marshallingView;
    }

}