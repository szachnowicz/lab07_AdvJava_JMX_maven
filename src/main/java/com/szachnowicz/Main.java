package com.szachnowicz;

import com.szachnowicz.ui.Frame;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//http://blog.lstachowiak.pl/2008/10/pierwsze-kroki-z-jmx.html

        List<Task> taskList = new ArrayList();
        Frame frame = new Frame();

        frame.getHandleCase().addActionListener(arga -> {


            frame.setTextd("nastepny nr : " + 0);

        });

        frame.getTakeNubmerBtn().addActionListener(e -> {


            Task task = new Task(taskList.size());
            taskList.add(task);
            task.setFinish(false);
            JDialog d = new JDialog(frame, "Numer", true);
            d.setSize(new Dimension(100, 100));
            d.setLocationRelativeTo(frame);

            JTextField text = new JTextField();
            text.setEditable(false);
            text.setText("nr Sprawy : " + task.getTaskNo());
            d.add(text);
            d.setVisible(true);

        });


    }
}
