package io.lis.spring.view;

import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;
import io.lis.spring.template.BookForm;
import io.lis.spring.template.BookTemplate;
import org.springframework.beans.factory.annotation.Autowired;

@HtmlImport("styles/shared-styles.html")
@Route("book")
@Theme(Lumo.class)
public class BookView extends VerticalLayout {


    public BookView(@Autowired BookForm bookForm,
                    @Autowired BookTemplate bookTemplate) {
        add(bookForm);
    }
}
