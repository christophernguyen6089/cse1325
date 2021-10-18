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
    
    private JButton bAbout;
    private JButton bQuit;
        
    public MainWin(String mainWindowTitle){
        super(mainWindowTitle);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        
        JMenuBar menubar = new JMenuBar();
        
        JMenu file = new JMenu("File");
        JMenu create = new JMenu("Create");
        JMenu help = new JMenu("Help");
        
        JMenuItem quit = new JMenu("Quit");
        mJava = new JMenu("Java");
        mDonut= new JMenu("Donut");
        JMenuItem about= new JMenu("About");
        
        menubar.add(file);
        menubar.add(create);
        menubar.add(help);
        
        file.add(quit);
        create.add(mJava);
        create.add(mDonut);
        help.add(about);
        
        setJMenuBar(menubar);
        
        JToolBar toolbar = new JToolBar("Java Controls");
        
        bJava = new JButton(new ImageIcon("java.png"));
            bJava.setActionCommand("Create new Java");
            bJava.setToolTipText("Create a new drink");
            toolbar.add(bJava);
            bJava.addActionListener(event -> onCreateJavaClick());
        
        bDonut= new JButton(new ImageIcon("donut.png"));
            bDonut.setActionCommand("Create new Donut");
            bDonut.setToolTipText("Create a new donut");
            toolbar.add(bDonut);
            bDonut.addActionListener(event -> onCreateDonutClick());
            
        bAbout= new JButton(new ImageIcon("question.png"));
            bAbout.setActionCommand("About the program");
            bAbout.setToolTipText("About the program");
            toolbar.add(bAbout);
            bAbout.addActionListener(event -> onAboutClick());
            
        bQuit = new JButton(new ImageIcon("x.png"));
            bQuit.setActionCommand("Quit");
            bQuit.setToolTipText("Quit the program");
            toolbar.add(bQuit);
            bQuit.addActionListener(event -> onQuitClick());
        
        getContentPane().add(toolbar, BorderLayout.PAGE_START);
    }
    
    protected void onCreateJavaClick(){
    }
    
    protected void onCreateDonutClick(){
    }
    
    protected void onAboutClick(){
        JDialog about = new JDialog();
        about.setLayout(new FlowLayout());
        about.setTitle("Java and Donut Express");
        
        JLabel title = new JLabel("<html>"+
               "<p>Jade</p>"+
               "</html>");
        about.add(title);
        
        JLabel string = new JLabel("<html>"+
                "<p>Click the Java Icon to create a new Java</p>"+
                "<p>Click the Donut Icon to create a new Donut</p>"+
                "<p>Copyright, patents, trademarks, bleh. What's important is that I made this and that I'm not in law school XD</p>"+
                "<p>Front end design is my passion</p>"+
                "</html>");
        about.add(string);
        
        about.setSize(900,200);
        about.setVisible(true);
    }
    
    protected void onQuitClick(){
        System.exit(0);
    }

    public static void main(String args[]){
        MainWin mainWin = new MainWin("JADE");
        mainWin.setVisible(true);
    }
}


