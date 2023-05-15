package grafica;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import logica.*;
import tastierino.*;
public class ATMFrame7 extends Controllo implements ActionListener{
   
   private JLabel datiContoLabel = new JLabel(" ");
   private JFrame frame7 = new JFrame();
   
   private JPanel sinistra = new JPanel();
   private JPanel destra = new JPanel();
   private JPanel inizio = new JPanel();
   private JPanel fine = new JPanel();
   private JPanel centro = new JPanel();
   
   private JButton Resoconto = new JButton("Resoconto carta");
   private JButton back = new JButton("torna indietro");
   
   //private Container Sfondo;

   private static final int FRAME_WIDTH = 700; //definizione larghezza finestra
   private static final int FRAME_HEIGHT = 600; //definizione altezza finestra
   private static final int FRAME_X_ORIGIN =500; // punto di origine asse x (dove appare la finestra)
   private static final int FRAME_Y_ORIGIN =300; // punto di origine asse Y
   private static final int BUTTON_WIDTH=700;
   private static final int BUTTON_HEIGHT=100;
   private static final Color AZZURRO= new Color(171,205,239);
   private String operazioni;
   public ATMFrame7(){
    this.frame7.setTitle("Resoconto Operazioni Carta");
    this.frame7.setLocation(FRAME_X_ORIGIN,FRAME_Y_ORIGIN);
    this.operazioni="";
    /**this.text6.setText("Seleziona la Compagnia");
    this.text6.setVerticalTextPosition(JLabel.TOP);
    this.text6.setHorizontalTextPosition(JLabel.CENTER);
    this.text6.setForeground(new Color(255,255,255));//colore 171,205,239 azzurro // 255,255,255 BIANCO
    this.text6.setFont(new Font("Verdana",Font.BOLD,25));
    **///definizione frame
    
    this.frame7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.frame7.setSize(FRAME_WIDTH,FRAME_HEIGHT);
    this.frame7.setVisible(true);
                                                              //settaggio panel
      this.destra.setBackground(AZZURRO);//Color.red
      this.sinistra.setBackground(AZZURRO);//Color.green
      this.inizio.setBackground(AZZURRO);//Color.yellow
      this.fine.setBackground(AZZURRO);//Color.magenta
      this.centro.setBackground(AZZURRO);//Color.blue
                                                                  //grandezza panel
      this.destra.setPreferredSize(new Dimension(50,100));
      this.sinistra.setPreferredSize(new Dimension(50,100));
      
      
      //this.inizio.add(text6);
      //this.inizio.setPreferredSize(new Dimension(BUTTON_WIDTH,100));
      
      this.Resoconto.setPreferredSize(new Dimension(BUTTON_WIDTH,BUTTON_HEIGHT));
      this.inizio.add(Resoconto);
      this.Resoconto.setFocusable(false);
      this.Resoconto.addActionListener(this);
      this.Resoconto.setFont(new Font("Verdana",Font.BOLD,15));
      
      this.back.setPreferredSize(new Dimension(BUTTON_WIDTH,BUTTON_HEIGHT));
      this.fine.add(back);
      this.back.setFocusable(false);
      this.back.addActionListener(this);
      this.back.setFont(new Font("Verdana",Font.BOLD,15));
      
      //this.datiContoLabel.setText("<html>prova 1<br> prova 2</html>");
      this.datiContoLabel.setVerticalTextPosition(JLabel.TOP);
      this.datiContoLabel.setForeground(new Color(0,0,0));//colore 171,205,239 azzurro // 255,255,255 BIANCO
      this.datiContoLabel.setFont(new Font("Verdana",Font.BOLD,15));
      this.datiContoLabel.setHorizontalAlignment(JLabel.CENTER);
      this.centro.add(datiContoLabel);
          
      //posizionamento dei panel all'interno del frame
      this.frame7.add(destra,BorderLayout.EAST);
      this.frame7.add(sinistra,BorderLayout.WEST);
      this.frame7.add(inizio,BorderLayout.NORTH);
      this.frame7.add(fine,BorderLayout.SOUTH);
      this.frame7.add(centro,BorderLayout.CENTER);
      
}
 public void actionPerformed(ActionEvent event){
       if(event.getSource()==Resoconto){
           this.operazioni=REC();
           this.datiContoLabel.setText(this.operazioni);    
       }
       if(event.getSource()==back){
        this.frame7.dispose();
        new ATMFrame1();   
               
       }
            
    }
}
