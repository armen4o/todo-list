package com.todolist.apptodolist.views;

import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.datetimepicker.DateTimePicker;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import java.time.LocalDateTime;


@Route(value = "tdl")
@PageTitle("Main | To Do List")
public class MainWindow extends VerticalLayout {
    public MainWindow() {
        try {

            DateTimePicker dateTimePicker = new DateTimePicker();

            TextField recordsTextField = new TextField();

            VerticalLayout verticalLayout = new VerticalLayout();

            Button buttonAdd = new Button("Add");
            Button buttonClear = new Button("Clear");

            dateTimePicker.setValue(LocalDateTime.now());


            buttonAdd.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
            buttonAdd.addClickShortcut(Key.ENTER);
            buttonAdd.addClickListener(click -> {
                Checkbox checkbox = new Checkbox(recordsTextField.getValue());
                verticalLayout.add(checkbox);
            });

            buttonClear.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
            buttonClear.addClickListener(click -> {
                recordsTextField.clear();
            });



            add(new HorizontalLayout(dateTimePicker),
                    verticalLayout,
                    new HorizontalLayout(recordsTextField, buttonAdd, buttonClear)
            );

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
