package io.lis.spring.template;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class HomeTemplate extends VerticalLayout {
    private TopBarTemplate top = new TopBarTemplate();
    private MiddleBarTemplate middle = new MiddleBarTemplate();
    private BottomBarTemplate bottom = new BottomBarTemplate();

    public HomeTemplate() {
        top = new TopBarTemplate();
        add(top, middle, bottom);
    }
}
