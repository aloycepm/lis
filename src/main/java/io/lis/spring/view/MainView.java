package io.lis.spring.view;

import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;
import io.lis.spring.template.BookForm;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * The main view contains a simple label element and a template element.
 */
@HtmlImport("styles/shared-styles.html")
@Route("")
@Theme(Lumo.class)
public class MainView extends VerticalLayout {
    public MainView(@Autowired BookForm bookForm) {
        add(bookForm);
    }


}
