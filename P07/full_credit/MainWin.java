package gui;

import store.*;

import java.awt.*;
import java.io.File;
import java.io.IOException;

import javax.swing.*;

import javax.imageio.ImageIO;

public class MainWin extends JFrame{
    private Store store;
    private JLabel data;
    private JMenuItem mJava;
    private JButton bJava;
    private JMenuItem mDonut;
    private JButton bDonut;
        
    public MainWin(String mainWindowTitle){
        super(mainWindowTitle);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
    }
    
    protected void onCreateJavaClick(){
    }
    
    protected void onCreateDonutClick(){
    }
    
    protected void onAboutClick(){
    }
    
    protected void onQuitClick(){
    }

    public static void main(String args[]){
        MainWin mainWin = new MainWin("JADE");
        mainWin.setVisible(true);
    }
}


