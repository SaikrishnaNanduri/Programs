package org.example;

import easy.Add;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Add add = new Add();
        int result = add.addition(1,2);
        System.out.println("Addition :"+result);
    }
}