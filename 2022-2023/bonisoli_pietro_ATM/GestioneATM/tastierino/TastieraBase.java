package tastierino;
import logica.*;
import grafica.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TastieraBase extends Controllo implements ActionListener{
       
       private static final int FRAME_WIDTH = 700; //definizione larghezza finestra
       private static final int FRAME_HEIGHT = 600; //definizione altezza finestra
       private static final int FRAME_X_ORIGIN =500; // punto di origine asse x (dove appare la finestra)
       private static final int FRAME_Y_ORIGIN =300; // punto di origine asse Y
       private static final int BUTTON_WIDTH=200;
       private static final int BUTTON_HEIGHT=100;
       private static final Color AZZURRO= new Color(171,205,239);
        
        protected JFrame frameCard;
        protected JTextField textfield;
        protected JButton[] numberButtons = new JButton[10];
        protected JButton[] functionButtons = new JButton[9];
        protected JButton okButton, delButton, clrButton, backButton;
        protected JPanel panelnumeri,paneltesto;
    
        private static final Font verdana = new Font("Verdana",Font.BOLD,15);
        protected String testo;
        protected JLabel textpanel= new JLabel();
        
    public TastieraBase(){
        
        testo="";
        frameCard = new JFrame("Pannello Numerico");
        frameCard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameCard.setSize(420, 600);
        frameCard.setLocation(FRAME_X_ORIGIN,FRAME_Y_ORIGIN);
        frameCard.setLayout(null);
        //frame.setBackground(AZZURRO);
        paneltesto = new JPanel();
        paneltesto.setBounds(50, 500, 300, 50);
        //paneltesto.setBackground(AZZURRO);
        
        textfield = new JTextField();
        textfield.setBounds(50, 25, 300, 50);
        textfield.setFont(this.verdana);
        textfield.setEditable(false);
        
        
        okButton = new JButton("invio");
        delButton = new JButton("Del");
        clrButton = new JButton("Clr");
        backButton = new JButton("indietro");
        
        functionButtons[0] = okButton;
        functionButtons[1] = delButton;
        functionButtons[2] = clrButton;
        functionButtons[3] = backButton;
        
        for(int i =0;i<4;i++) {
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(this.verdana);
            functionButtons[i].setFocusable(false);
        }
        
        for(int i =0;i<10;i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(this.verdana);
            numberButtons[i].setFocusable(false);
        }
        
        backButton.setBounds(50,430,100,50);
        okButton.setBounds(150,430,75,50);
        delButton.setBounds(225,430,75,50);
        clrButton.setBounds(300,430,75,50);
        
        
        panelnumeri = new JPanel();
        
        panelnumeri.setBounds(50, 100, 300, 300);
        panelnumeri.setLayout(new GridLayout(4,3,10,10));
        //panel.setBackground(AZZURRO);
        panelnumeri.add(numberButtons[1]);
        panelnumeri.add(numberButtons[2]);
        panelnumeri.add(numberButtons[3]);
        panelnumeri.add(numberButtons[4]);
        panelnumeri.add(numberButtons[5]);
        panelnumeri.add(numberButtons[6]);
        panelnumeri.add(numberButtons[7]);
        panelnumeri.add(numberButtons[8]);
        panelnumeri.add(numberButtons[9]);
        panelnumeri.add(numberButtons[0]);
        
        
        frameCard.add(panelnumeri);
        frameCard.add(okButton);
        //frameCard.add(backButton);
        frameCard.add(delButton);
        frameCard.add(clrButton);
        frameCard.add(paneltesto);
        frameCard.add(textfield);
    }
    
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==okButton) {
            
        }
        if(e.getSource()==backButton) {
            
        }
        if(e.getSource()==clrButton) {
            
        }
        if(e.getSource()==delButton) {
            
        }
        
    }
}
