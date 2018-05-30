package io.lis.spring.template;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.spring.annotation.SpringComponent;
import com.vaadin.flow.templatemodel.TemplateModel;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;

@HtmlImport("src/book/book-form.html")
@Tag("book-form")
@SpringComponent
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BookForm extends PolymerTemplate<BookForm.FormItem> {
    private @Id("ISBN")
    TextField isbn;
    private @Id("title")
    TextField title;
    private @Id("year")
    TextField year;
    private @Id("publisher")
    TextField publisher;
    private @Id("author")
    TextField author;
    private @Id("save")
    Button save;

    public interface FormItem extends TemplateModel {

    }

    public BookForm() {
        save.addClickListener((e) -> {
            String text = "ISBN : " + isbn.getValue()
                    + " Title: " + title.getValue()
                    + " Year: " + year.getValue()
                    + " Publisher: " + publisher.getValue();
            Notification.show(text, 5000, Notification.Position.MIDDLE);
        });
    }
}


//    private TextField titleField = new TextField();
//    private TextField isbnField = new TextField();
//    private TextField categoryField = new TextField();
//    private TextField yearCreatedField = new TextField();
//
//    public BookForm() {
//        titleField.setLabel("Title");
//        isbnField.setLabel("ISBN");
//        categoryField.setLabel("Category");
//        yearCreatedField.setLabel("Year");
//        Button save = new Button("Save");
//        add(titleField, isbnField, categoryField,
//                yearCreatedField, save);
//        setResponsiveSteps(
//                new ResponsiveStep("0", 1),
//                new ResponsiveStep("21em", 2),
//                new ResponsiveStep("22em", 3)
//        );
//    }