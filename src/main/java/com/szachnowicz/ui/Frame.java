package com.szachnowicz.ui;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    private Button handleCase;
    private Button takeNubmerBtn;
    private JTextField textField;


    private static final Dimension dimension = new Dimension(200, 200);


    public void setTextd(String text) {
        textField.setText(text);
    }

    public Frame() {
        super("Ubsluga kolejki");
        setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //   this.pack();
        this.setVisible(true);
        addGridLayout();

    }

    public Button getHandleCase() {
        return handleCase;
    }

    public Button getTakeNubmerBtn() {
        return takeNubmerBtn;
    }

    private void addGridLayout() {
        JPanel comp = new JPanel(new GridLayout(1, 3));
        this.add(comp);

        takeNubmerBtn = new Button("wez numerek");
        takeNubmerBtn.setSize(dimension);
        comp.add(takeNubmerBtn);

        handleCase = new Button("obsluz sprawe");
        comp.add(handleCase);
        handleCase.setSize(dimension);
        textField = new JTextField("case NR");
        comp.add(textField);
        textField.setEditable(false);
    }
}
