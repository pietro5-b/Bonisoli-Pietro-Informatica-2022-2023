package tastierino;
import logica.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import grafica.*;
public class Card extends TastieraBase implements ActionListener{
        private int check;
    public Card(){
        this.textpanel.setText("INSERIRE CODICE BANCOMAT");
        this.textpanel.setVerticalTextPosition(JLabel.TOP);
        this.textpanel.setHorizontalTextPosition(JLabel.CENTER);
        this.textpanel.setForeground(new Color(0,0,0));//colore 171,205,239 azzurro // 255,255,255 BIANCO
        this.textpanel.setFont(new Font("Verdana",Font.BOLD,15));
        this.paneltesto.add(textpanel);
        frameCard.setVisible(true);
        check=0;
    }
    public void actionPerformed(ActionEvent e) {
        
    for(int i=0;i<10;i++) {
            if(e.getSource() == numberButtons[i]) {
                textfield.setText(textfield.getText().concat(String.valueOf(i)));
            }
        }
        
        if(e.getSource()==okButton) {
            this.testo = textfield.getText();
            check=Checkcarta(testo);
            if(check==1){
                textfield.setText("");
                this.frameCard.dispose();
                new ATMFrame1();
            }else{
                textfield.setText("");
                this.frameCard.dispose();
                new ErrorCard();
            }
        }
        
            /**if(e.getSource()==backButton) {
            textfield.setText("");
            this.frameCard.dispose();
            new ATMFrame6();
        }**/
        
        if(e.getSource()==clrButton) {
            textfield.setText("");
        }
        if(e.getSource()==delButton) {
            this.testo = textfield.getText();
            textfield.setText("");
            for(int i=0;i<testo.length()-1;i++) {
                textfield.setText(textfield.getText()+testo.charAt(i));
            }
        }
        
    }    
        
}
