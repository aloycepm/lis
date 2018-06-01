package io.lis.spring.view;

import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;
import io.lis.spring.model.MaterialType;
import io.lis.spring.service.MaterialTypeService;
import io.lis.spring.template.HomeTemplate;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * The main view contains a simple label element and a template element.
 */
@HtmlImport("styles/shared-styles.html")
@Route("")
@Theme(Lumo.class)
public class MainView extends Div {


    public MainView() {
        setClassName("main-page");
        setSizeFull();
        HomeTemplate homeTemplate = new HomeTemplate();
        add(homeTemplate);
    }


}
