package gui;

import store.*;

/*
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
*/

import java.io.*;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.*;

import javax.imageio.ImageIO;
import java.lang.Math;

public class MainWin extends JFrame{
    private Store store;
    private JLabel data;
    
    private File filename;
    
    private String NAME = "Jade";
    private String VERSON = "1.0";
    private String FILE_VERSION = "1.0";
    private String MAGIC_COOKIE = "JADE";
    
    private JMenuItem mJava;
    private JButton bJava;
    private JMenuItem mDonut;
    private JButton bDonut;
    
    private JButton bAbout;
    private JButton bQuit;
    
    private GridBagConstraints constraints;
    
    private JLabel priceNumber;
    private JLabel costNumber;
    
    private JTextField name;
    private JSlider price;
    private JSlider cost;
    
    private JComboBox combo;
    
    private JComboBox darkness;
    private JComboBox frosting;
    private JComboBox filling;
    
    
    private JMenuItem mNew;
    private JButton bNew;
    
    private JMenuItem mOpen;
    private JButton bOpen;
    
    private JMenuItem mSave;
    private JButton bSave;
    
    private JMenuItem mSaveAs;
    private JButton bSaveAs;
    
    public MainWin(String mainWindowTitle){
        super(mainWindowTitle);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        filename = new File("untitled.jade");
        
        JMenuBar menubar = new JMenuBar();
        
        JMenu file = new JMenu("File");
        JMenu create = new JMenu("Create");
        JMenu help = new JMenu("Help");
        
        JMenuItem quit = new JMenu("Quit");
        mJava = new JMenu("Java");
        mDonut= new JMenu("Donut");
        JMenuItem about= new JMenu("About");
        
        mNew   = new JMenu("New");
        mOpen  = new JMenu("Open");
        mSave  = new JMenu("Save");
        mSaveAs= new JMenu("Save As");
        
        file.add(quit);
        create.add(mJava);
        create.add(mDonut);
        help.add(about);
        
        file.add(mNew);
        file.add(mOpen);
        file.add(mSave);
        file.add(mSaveAs);
        
        menubar.add(file);
        menubar.add(create);
        menubar.add(help);
        
        
        quit.addActionListener(event -> onQuitClick());
        mJava.addActionListener(event -> onCreateJavaClick());
        mDonut.addActionListener(event -> onCreateDonutClick());
        about.addActionListener(event -> onAboutClick());
        
        setJMenuBar(menubar);
        
        JToolBar toolbar = new JToolBar("Java Controls");
        
        bNew = new JButton(new ImageIcon("new.png"));
            bNew.setActionCommand("Create new Store");
            bNew.setActionCommand("Create new Store");
            toolbar.add(bNew);
            bNew.addActionListener(event -> onNewClick());
            
        bOpen = new JButton(new ImageIcon("open.png"));
            bOpen.setActionCommand("Open Exisitng Store");
            bOpen.setActionCommand("Open Exisitng Store");
            toolbar.add(bOpen);
            bOpen.addActionListener(event -> onOpenClick());
            
        bSave = new JButton(new ImageIcon("save.png"));
            bSave.setActionCommand("Save your store onto an existing file");
            bSave.setActionCommand("Save your store onto an existing file");
            toolbar.add(bSave);
            bNew.addActionListener(event -> onSaveClick());
            
        bSaveAs = new JButton(new ImageIcon("saveAs.png"));
            bSaveAs.setActionCommand("Save your store as a new file");
            bSaveAs.setActionCommand("Save your store as a new file");
            toolbar.add(bSaveAs);
            bSaveAs.addActionListener(event -> onSaveAsClick());
            
            
            
            
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
        
        data = new JLabel();
        add(data, BorderLayout.CENTER);
        
        setLayout(new GridBagLayout());
        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = GridBagConstraints.RELATIVE;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weightx = 1;
        constraints.weighty = 1;
        constraints.insets = new Insets(0,5,0,5);
        constraints.fill= GridBagConstraints.BOTH;
        constraints.anchor=GridBagConstraints.CENTER;
        
        onNewClick();
    }
    
    protected void onNewClick(){
        store = new Store("JADE");
        updateDisplay();
    }
    
    protected void onOpenClick(){
        final JFileChooser fc = new JFileChooser(filename);
        FileFilter jadeFiles = new FileNameExtensionFilter("JADE files","jade");
        fc.addChoosableFileFilter(jadeFiles);
        fc.setFileFilter(jadeFiles);
        
        int result = fc.showOpenDialog(this);
        if(result == JFileChooser.APPROVE_OPTION){
            filename = fc.getSelectedFile();
            
            try (BufferedReader br = new BufferedReader(new FileReader(filename))){
                String magicCookie = br.readLine();
                if(!magicCookie.equals(MAGIC_COOKIE)){
                 throw new RuntimeException("Not a jade file");
                }
                String fileVersion = br.readLine();
                if(!fileVersion.equals(FILE_VERSION)){
                 throw new RuntimeException("Incompatible JADE file format");
                }
                
                store = new Store("JADE");
                //TODO: implement proper open method
                int numProducts = Integer.parseInt(br.readLine());
                for(int i=0; i<numProducts; i++){
                    //String readName = String.parse
                    //double readPrice = Integer.parseDouble(args[1]);
                    //double readCost  = Integer.parseDouble(args[2]);
                    if(Integer.parseInt(br.readLine())==0){
                        Java java = new Java("Pumpkin Spice Latte", 8.00, 1.00, Darkness.blond);
                    }
                    else if(Integer.parseInt(br.readLine())==1){
                        Donut donut=new Donut("Choco Dough", 4.00, 1.00, Frosting.chocolate, true, Filling.unfilled);
                    }
                }
                
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(this,"Unable to open" + filename + '\n' + e, "Failed", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    protected void onSaveClick(){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))){
            bw.write(MAGIC_COOKIE + '\n');
            bw.write(FILE_VERSION + '\n');
            save(bw);
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(this, "Unable to open " + filename + '\n' + e, "Failed", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void save(BufferedWriter bw) throws IOException{
        //TODO Teach program how to write
          //hardcoded cause i dont know how to get products :/
        bw.write(""+store.numberOfProducts()+'\n');
        for(int i=0; i<store.numberOfProducts(); i++){
            if(i%2==0){
                bw.write("0"+'\n');
            }
            else if(i%2==1){
                bw.write("1"+'\n');
            }
            bw.write(""+ store.toString(i)+ "\n6.00 " + "\n1.00" + '\n');
            //bw.write("" +store.products.get(i).name+ "" +store.products.get(i).price+ "" +store.products.get(i).cost+ '\n');
            //smh imagine protecting your stuff just leave it out in the open and public lmaooooooooooooo
        }
    }
    
    protected void onSaveAsClick(){
        final JFileChooser fc = new JFileChooser(filename);
        FileFilter jadeFiles = new FileNameExtensionFilter("JADE files","jade");
        fc.addChoosableFileFilter(jadeFiles);
        fc.setFileFilter(jadeFiles);
        
        int result = fc.showSaveDialog(this);
        if (result == JFileChooser.APPROVE_OPTION){
            filename = fc.getSelectedFile();
            if(!filename.getAbsolutePath().endsWith(".jade")){
                filename=new File(filename.getAbsolutePath()+ ".jade");
            }
            onSaveClick();
        }
    }
    
        
    protected void onCreateJavaClick(){
        //super("Java");
        /*JDialog createJava = new JDialog();
        createJava.setLayout(new FlowLayout());
        createJava.setSize(480,110);
        createJava.setLayout(new GridBagLayout());
        */
        //try{
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(480,110);
        //setLayout(new GridBagLayout());      
        
            JLabel nameLabel = new JLabel("<HTML><br/>Name of new drink</HTML>");
            add(nameLabel,constraints);
        
            name = new JTextField(20);
            name.addActionListener(
                event -> JOptionPane.showMessageDialog(this, name.getText()));
            add(name,constraints);
        
        
        
            priceNumber = new JLabel("0");
            add(priceNumber, constraints);
        
            JLabel priceLabel = new JLabel("<HTML><br/>Price of new drink</HTML>");
            add(priceLabel,constraints);
        
            price = new JSlider(0, 10);
            price.setValue(0);
            price.addChangeListener(
                event -> {
                    double val=price.getValue();
                    priceNumber.setText(Double.toString(val));
                });
            add(price,constraints);
        
            
        
            costNumber = new JLabel("0");
            add(costNumber, constraints);
        
            JLabel costLabel = new JLabel("<HTML><br/>Cost of new drink</HTML>");
            add(costLabel,constraints);
        
            cost = new JSlider(0, 10);
            cost.setValue(0);
            cost.addChangeListener(
                event -> {
                    double val=cost.getValue();
                    costNumber.setText(Double.toString(val));
                });
            add(cost,constraints);
            
            
            
            JLabel darknessLabel = new JLabel("<HTML><br/>Darkness of new drink"); 
            Darkness[] darknessOptions = {Darkness.blond, Darkness.light, Darkness.medium, Darkness.dark, Darkness.extreme};
            
            darkness = new JComboBox<Darkness>(darknessOptions);
            darkness.addActionListener(
                event -> JOptionPane.showMessageDialog(this, (Darkness)darkness.getSelectedItem()));
            add(darkness,constraints);
        
        Object[] objects = {
            nameLabel, name,
            priceLabel, price, priceNumber,
            costLabel, cost, costNumber,
            darknessLabel, darkness
        };
        
        int button = JOptionPane.showConfirmDialog(
            this,     
            objects,
            "New Java",
            JOptionPane.OK_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE
        );
        
        
        if(button == JOptionPane.OK_OPTION){
            Java java = new Java(name.getText(),(double)price.getValue(),(double)cost.getValue(),(Darkness)darkness.getSelectedItem());
            store.addProduct(java);
        }
        
        updateDisplay();
        setVisible(true);
    }
    
    protected void onCreateDonutClick(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(480,110);

        JLabel nameLabel = new JLabel("<HTML><br/>Name of new donut</HTML>");
        add(nameLabel,constraints);
        
        name = new JTextField(20);
        name.addActionListener(
            event -> JOptionPane.showMessageDialog(this, name.getText()));
        add(name,constraints);
        
        
        
        
        priceNumber = new JLabel("0");
        add(priceNumber, constraints);
        
        JLabel priceLabel = new JLabel("<HTML><br/>Price of new donut</HTML>");
        add(priceLabel,constraints);
        
        price = new JSlider(0, 10);
        price.setValue(0);
        price.addChangeListener(
            event -> {
                double val=price.getValue();
                priceNumber.setText(Double.toString(val));
            });
        add(price,constraints);
        
        
        
        
        costNumber = new JLabel("0");
        add(costNumber, constraints);
        
        JLabel costLabel = new JLabel("<HTML><br/>Cost of new donut</HTML>");
        add(costLabel,constraints);
        
        cost = new JSlider(0, 10);
        cost.setValue(0);
        cost.addChangeListener(
            event -> {
                double val=cost.getValue();
                costNumber.setText(Double.toString(val));
            });
        add(cost,constraints);
        
        
        
        
        JLabel frostingLabel = new JLabel("<HTML><br/>Frosting of new Donut"); 
        Frosting[] frostingOptions = {Frosting.unfrosted, Frosting.chocolate, Frosting.vanilla, Frosting.strawberry};
        
        frosting = new JComboBox<Frosting>(frostingOptions);
        frosting.addActionListener(
            event -> JOptionPane.showMessageDialog(this, (Frosting)frosting.getSelectedItem()));
        add(frosting,constraints);
        
        
        
        JLabel fillingLabel = new JLabel("<HTML><br/>Filling of new Donut");
        Filling[] fillingOptions = {Filling.unfilled, Filling.creme, Filling.Bavarian, Filling.strawberry};
        filling = new JComboBox<Filling>(fillingOptions);
        filling.addActionListener(
            event -> JOptionPane.showMessageDialog(this, (Filling)filling.getSelectedItem()));
        add(filling,constraints);
        
        
        
        Object[] objects = {
            nameLabel, name,
            priceLabel, price, priceNumber,
            costLabel, cost, costNumber,
            frostingLabel, frosting,
            fillingLabel, filling
        };
        
        int button = JOptionPane.showConfirmDialog(
            this,     
            objects,
            "New Java",
            JOptionPane.OK_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE
        );
        if(button == JOptionPane.OK_OPTION){
            Donut donut = new Donut(name.getText(), (double)price.getValue(), (double)cost.getValue(), (Frosting)frosting.getSelectedItem(), false, (Filling)filling.getSelectedItem());
            store.addProduct(donut);
        }
        
        updateDisplay();
        setVisible(true);
    }
    
    private void updateDisplay(){
        data.setText("<html>" + store.toString()
                                     .replaceAll("<","%lt;")
                                     .replaceAll(">","&gt;")
                                     .replaceAll("\n","<br/>")
                              + "</html>");
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


