package com.company;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class text extends JFrame implements ActionListener {
    // JTextField
    static JTextField t;

    // JFrame
    static JFrame f;

    // JButton
    static JButton b;


    // default constructor
    text()
    {
    }

    // main class
    public static void main(String[] args)
    {
        // create a new frame to store text field and button
        f = new JFrame("textfield");

        // create a new button
        b = new JButton("submit");

        // create a object of the text class
        text te = new text();

        // addActionListener to button
        b.addActionListener(te);

        // create a object of JTextField with 16 columns and a given initial text
        t = new JTextField("enter the text", 16);

        // create a panel to add buttons and textfield
        JPanel p = new JPanel();

        // add buttons and textfield to panel
        p.add(t);
        p.add(b);

        // add panel to frame
        f.add(p);

        // set the size of frame
        f.setSize(300, 300);

        f.show();
    }


    // if the button is pressed
    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if (s.equals("submit")) {

            String input = t.getText();
            // set the text of field to blank
            try {
                t.setText(t.getText()+ "="+mathEvaluation(input));
            } catch (ScriptException scriptException) {
                scriptException.printStackTrace();
            }
        }

    }

    public String mathEvaluation(String input) throws ScriptException, NullPointerException {
        String[]  inputArray = input.split("\\+");
        int operant1 = Integer.parseInt(inputArray[0]);
        int operant2 = Integer.parseInt(inputArray[1]);

        String result = Integer.toString((operant1) + (operant2));
        return result;
    }
}
