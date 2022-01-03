package com.todolist.apptodolist.job;

import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;

public class WorkOfAddingARecordOfCasesByClickingOnTheButton extends VerticalLayout {
    public WorkOfAddingARecordOfCasesByClickingOnTheButton(){

        VerticalLayout verticalLayoutComponents = new VerticalLayout();

        Button additionButton = new Button("Добавить запись");
        additionButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        TextField textField = new TextField();

        additionButton.addClickListener(click->{
            Checkbox checkBox = new Checkbox(textField.getValue());
            verticalLayoutComponents.add(checkBox);
        });

        additionButton.addClickShortcut(Key.ENTER);
    }
}
