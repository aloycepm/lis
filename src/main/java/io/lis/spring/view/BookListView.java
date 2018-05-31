package io.lis.spring.view;

import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.router.Route;
import io.lis.spring.model.Book;
import io.lis.spring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;

@HtmlImport("styles/shared-styles.html")
@Route("book/list")
public class BookListView extends Div implements
        BeforeEnterObserver {

    @Autowired
    private BookService bookService;

    @Override
    public void beforeEnter(BeforeEnterEvent beforeEnterEvent) {
        Book book = getBooks();
        if (book == null) {
            beforeEnterEvent.rerouteTo(NoItemView.class);
        }
    }

    public BookListView() {

    }

    private Book getBooks() {
        return null;
    }

}
