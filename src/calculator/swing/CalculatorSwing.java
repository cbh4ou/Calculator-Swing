/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.swing;

/**
 *
 * @author Connor
 */
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;

public class CalculatorSwing extends JFrame {

    public CalculatorSwing() {
        
        initUI();
    }
    
    private void initUI() {
        
        add(new Calculator());
        
        setResizable(false);
        pack();
        
        setTitle("Calculator");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        
        EventQueue.invokeLater(() -> {
            JFrame ex = new CalculatorSwing();
            ex.setVisible(true);
        });
    }
    
}