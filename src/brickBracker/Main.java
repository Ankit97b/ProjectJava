/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brickBracker;

/**
 *
 * @author Ankit
 */

    
import javax.swing.JFrame;
public class Main {
 public static void main(String[] args) {
  JFrame obj = new JFrame(); 
  Gameplay gamePlay = new Gameplay();
  obj.setBounds(10, 10, 700, 600);
  obj.setTitle("Breakout Ball");
  obj.setResizable(false);
  obj.setVisible(true);
  obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  obj.add(gamePlay);  
 }
}
    

