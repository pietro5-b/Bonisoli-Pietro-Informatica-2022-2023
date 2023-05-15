package grafica;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ATMFrame5 extends ATMFrame2 implements ActionListener{

            ATMFrame5(){
                super();
                frame2.setTitle("Ricarica telefonica");
            }
   
 public void actionPerformed(ActionEvent event){
       if(event.getSource()==cash50){
        frame2.dispose();
        contabile("50");
        new ATMFrame6();        
       }
       if(event.getSource()==cash100){
        frame2.dispose();
        contabile("100");
        new ATMFrame6();   
               
       }
       if(event.getSource()==cash150){
        frame2.dispose();
        contabile("150");
        new ATMFrame6();   
               
       }
       if(event.getSource()==cash200){
        frame2.dispose();
        contabile("200");
        new ATMFrame6();   
               
       }
       if(event.getSource()==cash250){
        frame2.dispose();
        contabile("250");
        new ATMFrame6();
               
       }
       if(event.getSource()==back){
        frame2.dispose();
        new ATMFrame1();   
               
       }
            
    }
}
