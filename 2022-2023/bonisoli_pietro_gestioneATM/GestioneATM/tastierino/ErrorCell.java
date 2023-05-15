package tastierino;
import logica.*;
import grafica.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ErrorCell extends TastieraBase implements ActionListener{
        private int check;
    public ErrorCell(){
        this.textpanel.setText("NUMERO ERRATO RIPROVARE");
        this.textpanel.setVerticalTextPosition(JLabel.TOP);
        this.textpanel.setHorizontalTextPosition(JLabel.CENTER);
        this.textpanel.setForeground(new Color(203,50,52));//colore 171,205,239 azzurro // 255,255,255 BIANCO
        this.textpanel.setFont(new Font("Verdana",Font.BOLD,15));
        this.paneltesto.add(textpanel);
        frameCard.add(backButton);
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
            check=Cell(testo);
            if(check==1){
                textfield.setText("");
                this.frameCard.dispose();
                new Password();
            }else{
                textfield.setText("");
                this.frameCard.dispose();
                new ErrorCell();
            }
        }
        
            if(e.getSource()==backButton) {
            textfield.setText("");
            this.frameCard.dispose();
            new ATMFrame6();
        }
        
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
