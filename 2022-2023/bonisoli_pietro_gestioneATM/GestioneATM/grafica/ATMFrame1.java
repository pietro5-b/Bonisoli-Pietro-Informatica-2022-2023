package grafica;
import logica.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import tastierino.*;
public class ATMFrame1 extends Controllo implements ActionListener{
   private int counterzero;
   private JFrame frame1 = new JFrame();
   
   private JPanel sinistra = new JPanel();
   private JPanel destra = new JPanel();
   private JPanel inizio = new JPanel();
   private JPanel fine = new JPanel();
   private JPanel centro = new JPanel();
   
   private JButton Esci = new JButton("Espelli Carta");
   private JButton Ritira = new JButton("Ritira dal conto");
   private JButton RicaricaCell = new JButton("Ricarica telefonica");
   private JButton Resoconto = new JButton("Estratto conto");
   private JButton Donazione = new JButton("Donazione");
   
   //private Container Sfondo;

   private static final int FRAME_WIDTH = 700; //definizione larghezza finestra
   private static final int FRAME_HEIGHT = 600; //definizione altezza finestra
   private static final int FRAME_X_ORIGIN =500; // punto di origine asse x (dove appare la finestra)
   private static final int FRAME_Y_ORIGIN =300; // punto di origine asse Y
   private static final int BUTTON_WIDTH=200;
   private static final int BUTTON_HEIGHT=100;
   private static final Color AZZURRO= new Color(171,205,239); // creazione del colore azzurro 
   
   public ATMFrame1(){
    this.counterzero=0;
    this.frame1.setTitle("Pannello Di Controllo ATM");
    this.frame1.setLocation(FRAME_X_ORIGIN,FRAME_Y_ORIGIN);
                                                                //definizione frame
    this.frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.frame1.setSize(FRAME_WIDTH,FRAME_HEIGHT);
    this.frame1.setVisible(true);
                                                              //settaggio panel
      this.destra.setBackground(AZZURRO);//Color.red
      this.sinistra.setBackground(AZZURRO);//Color.green
      this.inizio.setBackground(AZZURRO);//Color.yellow
      this.fine.setBackground(AZZURRO);//Color.magenta
      this.centro.setBackground(AZZURRO);//Color.blue
                                                                  //grandezza panel
      this.destra.setPreferredSize(new Dimension(BUTTON_WIDTH,100));
      this.sinistra.setPreferredSize(new Dimension(BUTTON_WIDTH,100));
     
      this.inizio.setPreferredSize(new Dimension(BUTTON_WIDTH,100));
      
      this.Esci.setPreferredSize(new Dimension(BUTTON_WIDTH,BUTTON_HEIGHT)); //dimensionamento bottoni
      this.sinistra.add(Esci);
      this.Esci.setFocusable(false);
      this.Esci.addActionListener(this);
      this.Esci.setFont(new Font("Verdana",Font.BOLD,15));
      
      
      this.Ritira.setPreferredSize(new Dimension(BUTTON_WIDTH,BUTTON_HEIGHT));
      this.sinistra.add(Ritira);
      this.Ritira.setFocusable(false);
      this.Ritira.addActionListener(this);
      this.Ritira.setFont(new Font("Verdana",Font.BOLD,15));
      
      this.RicaricaCell.setPreferredSize(new Dimension(BUTTON_WIDTH,BUTTON_HEIGHT));
      this.sinistra.add(RicaricaCell);
      this.RicaricaCell.setFocusable(false);
      this.RicaricaCell.addActionListener(this);
      this.RicaricaCell.setFont(new Font("Verdana",Font.BOLD,15));
      
      this.Resoconto.setPreferredSize(new Dimension(BUTTON_WIDTH,BUTTON_HEIGHT));
      this.destra.add(Resoconto);
      this.Resoconto.setFocusable(false);
      this.Resoconto.addActionListener(this);
      this.Resoconto.setFont(new Font("Verdana",Font.BOLD,15));
      
      this.Donazione.setPreferredSize(new Dimension(BUTTON_WIDTH,BUTTON_HEIGHT));
      this.destra.add(Donazione);
      this.Donazione.setFocusable(false);
      this.Donazione.addActionListener(this);
      this.Donazione.setFont(new Font("Verdana",Font.BOLD,15));
                                                          //posizionamento dei panel all'interno del frame
      this.frame1.add(destra,BorderLayout.EAST);
      this.frame1.add(sinistra,BorderLayout.WEST);
      this.frame1.add(inizio,BorderLayout.NORTH);
      this.frame1.add(fine,BorderLayout.SOUTH);
      this.frame1.add(centro,BorderLayout.CENTER);
}
 public void actionPerformed(ActionEvent event){
       if(event.getSource()==Esci){
        azzeramento();  
        this.frame1.dispose();
        new Card();
        
       }
       if(event.getSource()==Ritira){
        this.frame1.dispose();
        new ATMFrame2();
               
       }
       if(event.getSource()==RicaricaCell){
        this.frame1.dispose();  
        new ATMFrame5();       
       }
       if(event.getSource()==Resoconto){
        this.frame1.dispose();   
        new ATMFrame7();       
       }
       if(event.getSource()==Donazione){
        this.frame1.dispose();
        new ATMFrame3();
               
       }
            
}
}
