import grafica.*;
import javax.swing.*;
import logica.*;
import java.awt.*;
import tastierino.*;
public class ATM{
public static void main(String[] agrs){
    //JFrame primo;
    //primo= new JFrame();//costruttore
    //primo.setSize(400,300);
    //primo.setVisible(true);
    //JOptionPane.showMessageDialog(primo, "come stai?"); comando allert comunicazione
    //System.out.println("grazie per la collaborazione"); comando scrittura non grafica
    String carta="";
    String codice="";
    Controllo utente=new Controllo();
    /**
    carta=JOptionPane.showInputDialog(null,"inserire il numero della carta");

    for (int ciclo=0;ciclo<1;){
        if(utente.Checkcarta(carta)==1 )ciclo++;
        else carta=JOptionPane.showInputDialog(null,"numero di carta errato, vi preghiamo di riprovare");
    }//ciclo di contollo carta
    
    codice=JOptionPane.showInputDialog(null,"inserire il PIN dlla carta");
    
    for (int ciclo=0;ciclo<1;){
        if(utente.CheckPssw(codice)==1 )ciclo++;    
        else codice=JOptionPane.showInputDialog(null,"codice PIN errato, vi preghiamo di riprovare");
    }//ciclo di contollo pin carta**/
    
    //System.out.println("benvenuto senior");
    //new GraficaATM();//visualizzazione monitor ATM
    //new ATMFrame1();    
    new TastieraBase();
}
}
