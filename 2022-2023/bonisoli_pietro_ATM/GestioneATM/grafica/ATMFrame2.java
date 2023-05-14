package grafica;
import logica.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import tastierino.*;
public class ATMFrame2 extends Controllo implements ActionListener{

   private JLabel text2= new JLabel();
   protected JFrame frame2 = new JFrame();
   
   private JPanel sinistra = new JPanel();
   private JPanel destra = new JPanel();
   private JPanel inizio = new JPanel();
   private JPanel fine = new JPanel();
   private JPanel centro = new JPanel();
   
   protected JButton cash50 = new JButton("€ 50");
   protected JButton cash100 = new JButton("€ 100");
   protected JButton cash150 = new JButton("€ 150");
   protected JButton cash200 = new JButton("€ 200");
   protected JButton cash250 = new JButton("€ 250");
   protected JButton back = new JButton("torna indietro");
   
   //private Container Sfondo;
   
   protected String testo="Selezionare l'importo";
   private static final int FRAME_WIDTH = 700; //definizione larghezza finestra
   private static final int FRAME_HEIGHT = 600; //definizione altezza finestra
   private static final int FRAME_X_ORIGIN =500; // punto di origine asse x (dove appare la finestra)
   private static final int FRAME_Y_ORIGIN =300; // punto di origine asse Y
   private static final int BUTTON_WIDTH=200;
   private static final int BUTTON_HEIGHT=100;
   private static final Color AZZURRO= new Color(171,205,239);
   
   public ATMFrame2(){
    frame2.setTitle("Ritiro ATM");
    frame2.setLocation(FRAME_X_ORIGIN,FRAME_Y_ORIGIN);
    
    this.text2.setText(testo);
    this.text2.setVerticalTextPosition(JLabel.TOP);
    this.text2.setHorizontalTextPosition(JLabel.CENTER);
    this.text2.setForeground(new Color(255,255,255));//colore 171,205,239 azzurro // 255,255,255 BIANCO
    this.text2.setFont(new Font("Verdana",Font.BOLD,30));
    //definizione frame
    
    frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame2.setSize(FRAME_WIDTH,FRAME_HEIGHT);
    frame2.setVisible(true);
                                                              //settaggio panel
      this.destra.setBackground(AZZURRO);//Color.red
      this.sinistra.setBackground(AZZURRO);//Color.green
      this.inizio.setBackground(AZZURRO);//Color.yellow
      this.fine.setBackground(AZZURRO);//Color.magenta
      this.centro.setBackground(AZZURRO);//Color.blue
                                                                  //grandezza panel
      this.destra.setPreferredSize(new Dimension(BUTTON_WIDTH,100));
      this.sinistra.setPreferredSize(new Dimension(BUTTON_WIDTH,100));
      
      this.inizio.add(text2);
      this.inizio.setPreferredSize(new Dimension(BUTTON_WIDTH,100));
      
      this.cash50.setPreferredSize(new Dimension(BUTTON_WIDTH,BUTTON_HEIGHT)); //dimensionamento bottoni
      this.sinistra.add(cash50);
      this.cash50.setFocusable(false);
      this.cash50.addActionListener(this);
      this.cash50.setFont(new Font("Verdana",Font.BOLD,15));
      
      
      this.cash100.setPreferredSize(new Dimension(BUTTON_WIDTH,BUTTON_HEIGHT));
      this.sinistra.add(cash100);
      this.cash100.setFocusable(false);
      this.cash100.addActionListener(this);
      this.cash100.setFont(new Font("Verdana",Font.BOLD,15));
      
      this.cash150.setPreferredSize(new Dimension(BUTTON_WIDTH,BUTTON_HEIGHT));
      this.sinistra.add(cash150);
      this.cash150.setFocusable(false);
      this.cash150.addActionListener(this);
      this.cash150.setFont(new Font("Verdana",Font.BOLD,15));
      
      this.cash200.setPreferredSize(new Dimension(BUTTON_WIDTH,BUTTON_HEIGHT));
      this.destra.add(cash200);
      this.cash200.setFocusable(false);
      this.cash200.addActionListener(this);
      this.cash200.setFont(new Font("Verdana",Font.BOLD,15));
      
      this.cash250.setPreferredSize(new Dimension(BUTTON_WIDTH,BUTTON_HEIGHT));
      this.destra.add(cash250);
      this.cash250.setFocusable(false);
      this.cash250.addActionListener(this);
      this.cash250.setFont(new Font("Verdana",Font.BOLD,15));
      
      this.back.setPreferredSize(new Dimension(BUTTON_WIDTH,BUTTON_HEIGHT));
      this.destra.add(back);
      this.back.setFocusable(false);
      this.back.addActionListener(this);
      this.back.setFont(new Font("Verdana",Font.BOLD,15));
                                                          //posizionamento dei panel all'interno del frame
      frame2.add(destra,BorderLayout.EAST);
      frame2.add(sinistra,BorderLayout.WEST);
      frame2.add(inizio,BorderLayout.NORTH);
      frame2.add(fine,BorderLayout.SOUTH);
      frame2.add(centro,BorderLayout.CENTER);
      
}
 public void actionPerformed(ActionEvent event){
       if(event.getSource()==cash50){
        this.frame2.dispose();
        contabile("50");
        movimenti("€ ritiro contante");
        new Password();
        }
       if(event.getSource()==cash100){
        this.frame2.dispose();
        contabile("100");   
        movimenti("€ ritiro contante");       
        new Password();
        }
       if(event.getSource()==cash150){
        this.frame2.dispose();
        contabile("150");  
        movimenti("€ ritiro contante");       
        new Password();
        }
       if(event.getSource()==cash200){
        this.frame2.dispose();
        contabile("200");  
        movimenti("€ ritiro contante");       
        new Password();
        }
       if(event.getSource()==cash250){
        this.frame2.dispose();
        contabile("250"); 
        movimenti("€ ritiro contante");       
        new Password();
        }
       if(event.getSource()==back){
        this.frame2.dispose();
        new ATMFrame1();   
               
       }
            
    }
}
