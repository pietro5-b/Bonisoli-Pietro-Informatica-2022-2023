package grafica;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import logica.*;
import tastierino.*;
public class ATMFrame6 extends Controllo implements ActionListener{

   private JLabel text6= new JLabel();
   private JFrame frame6 = new JFrame();
   
   private JPanel sinistra = new JPanel();
   private JPanel destra = new JPanel();
   private JPanel inizio = new JPanel();
   private JPanel fine = new JPanel();
   private JPanel centro = new JPanel();
   
   private JButton Tim = new JButton("Tim");
   private JButton Vodafone = new JButton("Vodafone");
   private JButton Iliad = new JButton("Iliad");
   private JButton back = new JButton("torna indietro");
   
   //private Container Sfondo;

   private static final int FRAME_WIDTH = 700; //definizione larghezza finestra
   private static final int FRAME_HEIGHT = 600; //definizione altezza finestra
   private static final int FRAME_X_ORIGIN =500; // punto di origine asse x (dove appare la finestra)
   private static final int FRAME_Y_ORIGIN =300; // punto di origine asse Y
   private static final int BUTTON_WIDTH=200;
   private static final int BUTTON_HEIGHT=100;
   private static final Color AZZURRO= new Color(171,205,239);
   
   public ATMFrame6(){
    this.frame6.setTitle("Donazione ATM");
    this.frame6.setLocation(FRAME_X_ORIGIN,FRAME_Y_ORIGIN);
    
    this.text6.setText("Seleziona la Compagnia");
    this.text6.setVerticalTextPosition(JLabel.TOP);
    this.text6.setHorizontalTextPosition(JLabel.CENTER);
    this.text6.setForeground(new Color(255,255,255));//colore 171,205,239 azzurro // 255,255,255 BIANCO
    this.text6.setFont(new Font("Verdana",Font.BOLD,25));
    //definizione frame
    
    this.frame6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.frame6.setSize(FRAME_WIDTH,FRAME_HEIGHT);
    this.frame6.setVisible(true);
                                                              //settaggio panel
      this.destra.setBackground(AZZURRO);//Color.red
      this.sinistra.setBackground(AZZURRO);//Color.green
      this.inizio.setBackground(AZZURRO);//Color.yellow
      this.fine.setBackground(AZZURRO);//Color.magenta
      this.centro.setBackground(AZZURRO);//Color.blue
                                                                  //grandezza panel
      this.destra.setPreferredSize(new Dimension(50,100));
      this.sinistra.setPreferredSize(new Dimension(50,100));
      
      
      this.inizio.add(text6);
      this.inizio.setPreferredSize(new Dimension(BUTTON_WIDTH,100));
      
      this.Tim.setPreferredSize(new Dimension(BUTTON_WIDTH,BUTTON_HEIGHT)); //dimensionamento bottoni
      this.centro.add(Tim);
      this.Tim.setFocusable(false);
      this.Tim.addActionListener(this);
      this.Tim.setFont(new Font("Verdana",Font.BOLD,15));
      
      
      this.Vodafone.setPreferredSize(new Dimension(BUTTON_WIDTH,BUTTON_HEIGHT));
      this.centro.add(Vodafone);
      this.Vodafone.setFocusable(false);
      this.Vodafone.addActionListener(this);
      this.Vodafone.setFont(new Font("Verdana",Font.BOLD,15));
      
      this.Iliad.setPreferredSize(new Dimension(BUTTON_WIDTH,BUTTON_HEIGHT));
      this.centro.add(Iliad);
      this.Iliad.setFocusable(false);
      this.Iliad.addActionListener(this);
      this.Iliad.setFont(new Font("Verdana",Font.BOLD,15));
      
      this.back.setPreferredSize(new Dimension(BUTTON_WIDTH,BUTTON_HEIGHT));
      this.centro.add(back);
      this.back.setFocusable(false);
      this.back.addActionListener(this);
      this.back.setFont(new Font("Verdana",Font.BOLD,15));
                                                          //posizionamento dei panel all'interno del frame
      this.frame6.add(destra,BorderLayout.EAST);
      this.frame6.add(sinistra,BorderLayout.WEST);
      this.frame6.add(inizio,BorderLayout.NORTH);
      this.frame6.add(fine,BorderLayout.SOUTH);
      this.frame6.add(centro,BorderLayout.CENTER);
      
}
 public void actionPerformed(ActionEvent event){
       if(event.getSource()==Tim){
        this.frame6.dispose();       
        compagnia("Tim");
        new CellPhone();
        }
       if(event.getSource()==Vodafone){
        this.frame6.dispose();  
        compagnia("Vodafone");
        new CellPhone();       
       }
       if(event.getSource()==Iliad){
        this.frame6.dispose();  
        compagnia("Iliad");
        new CellPhone();      
       }
       if(event.getSource()==back){
        this.frame6.dispose();
        new ATMFrame5();   
               
       }
            
    }
}
