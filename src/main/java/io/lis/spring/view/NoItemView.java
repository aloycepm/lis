package io.lis.spring.view;

import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

@HtmlImport("styles/shared-styles.html")
@Route("no-item")
public class NoItemView extends Div {
    public NoItemView() {
        setText("No item found !");
    }
}
