package grafica;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import logica.*;
import tastierino.*;
public class ATMFrame4 extends Controllo implements ActionListener{

   private JLabel text4= new JLabel();
   private JFrame frame4 = new JFrame();
   
   private JPanel sinistra = new JPanel();
   private JPanel destra = new JPanel();
   private JPanel inizio = new JPanel();
   private JPanel fine = new JPanel();
   private JPanel centro = new JPanel();
   
   private JButton Africa = new JButton("Help Africa");
   private JButton Guerra = new JButton("Liberi Tutti");
   private JButton Medici = new JButton("Cure x tutti");
   private JButton Chiesa = new JButton(" 5 x 1000");
   private JButton back = new JButton("torna indietro");
   
   //private Container Sfondo;

   private static final int FRAME_WIDTH = 700; //definizione larghezza finestra
   private static final int FRAME_HEIGHT = 600; //definizione altezza finestra
   private static final int FRAME_X_ORIGIN =500; // punto di origine asse x (dove appare la finestra)
   private static final int FRAME_Y_ORIGIN =300; // punto di origine asse Y
   private static final int BUTTON_WIDTH=200;
   private static final int BUTTON_HEIGHT=100;
   private static final Color AZZURRO= new Color(171,205,239);
   
   public ATMFrame4(){
    this.frame4.setTitle("Donazione ATM");
    this.frame4.setLocation(FRAME_X_ORIGIN,FRAME_Y_ORIGIN);
    
    this.text4.setText("Selezionare il beneficiario");
    this.text4.setVerticalTextPosition(JLabel.TOP);
    this.text4.setHorizontalTextPosition(JLabel.CENTER);
    this.text4.setForeground(new Color(255,255,255));//colore 171,205,239 azzurro // 255,255,255 BIANCO
    this.text4.setFont(new Font("Verdana",Font.BOLD,25));
    //definizione frame
    
    this.frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.frame4.setSize(FRAME_WIDTH,FRAME_HEIGHT);
    this.frame4.setVisible(true);
                                                              //settaggio panel
      this.destra.setBackground(AZZURRO);//Color.red
      this.sinistra.setBackground(AZZURRO);//Color.green
      this.inizio.setBackground(AZZURRO);//Color.yellow
      this.fine.setBackground(AZZURRO);//Color.magenta
      this.centro.setBackground(AZZURRO);//Color.blue
                                                                  //grandezza panel
      this.destra.setPreferredSize(new Dimension(50,100));
      this.sinistra.setPreferredSize(new Dimension(50,100));
      
      
      this.inizio.add(text4);
      this.inizio.setPreferredSize(new Dimension(BUTTON_WIDTH,100));
      
      this.Africa.setPreferredSize(new Dimension(BUTTON_WIDTH,BUTTON_HEIGHT)); //dimensionamento bottoni
      this.centro.add(Africa);
      this.Africa.setFocusable(false);
      this.Africa.addActionListener(this);
      this.Africa.setFont(new Font("Verdana",Font.BOLD,15));
      
      
      this.Guerra.setPreferredSize(new Dimension(BUTTON_WIDTH,BUTTON_HEIGHT));
      this.centro.add(Guerra);
      this.Guerra.setFocusable(false);
      this.Guerra.addActionListener(this);
      this.Guerra.setFont(new Font("Verdana",Font.BOLD,15));
      
      this.Medici.setPreferredSize(new Dimension(BUTTON_WIDTH,BUTTON_HEIGHT));
      this.centro.add(Medici);
      this.Medici.setFocusable(false);
      this.Medici.addActionListener(this);
      this.Medici.setFont(new Font("Verdana",Font.BOLD,15));
      
      this.Chiesa.setPreferredSize(new Dimension(BUTTON_WIDTH,BUTTON_HEIGHT));
      this.centro.add(Chiesa);
      this.Chiesa.setFocusable(false);
      this.Chiesa.addActionListener(this);
      this.Chiesa.setFont(new Font("Verdana",Font.BOLD,15));
      
      this.back.setPreferredSize(new Dimension(BUTTON_WIDTH,BUTTON_HEIGHT));
      this.centro.add(back);
      this.back.setFocusable(false);
      this.back.addActionListener(this);
      this.back.setFont(new Font("Verdana",Font.BOLD,15));
                                                          //posizionamento dei panel all'interno del frame
      this.frame4.add(destra,BorderLayout.EAST);
      this.frame4.add(sinistra,BorderLayout.WEST);
      this.frame4.add(inizio,BorderLayout.NORTH);
      this.frame4.add(fine,BorderLayout.SOUTH);
      this.frame4.add(centro,BorderLayout.CENTER);
      
}
 public void actionPerformed(ActionEvent event){
       if(event.getSource()==Africa){
        this.frame4.dispose();
        donare("Help Africa");       
        new Password();
       }
       if(event.getSource()==Guerra){
        this.frame4.dispose();
        donare("Liberi Tutti");       
        new Password();  
               
       }
       if(event.getSource()==Medici){
        this.frame4.dispose();
        donare("Cure x tutti");       
        new Password();   
               
       }
       if(event.getSource()==Chiesa){
        this.frame4.dispose();
        donare("5 x 1000");       
        new Password();  
               
       }
       if(event.getSource()==back){
        this.frame4.dispose();
        new ATMFrame3();   
               
       }
            
    }
}
