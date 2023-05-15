package logica;
import java.util.*;//utilizzo Objects per il confronto tra stringhe
public class Controllo{
    

    static String[] archivio_carta;
    static String[] password_carta;
    
    public Controllo(){
    this.archivio_carta=new String[]{"0001","0002","0003","0004","0005"};
    this.password_carta=new String[]{"4321","1234","5678","8756","9999"};
    }//ch costruttore
    static String[] archivio_attivo=new String[100];
    static String[] archivio_denaro=new String[100];
    static int CounterCarta=0,numerazione=0,spostamenti=0;
    static String company="",resoconto="";
    
    public int Checkcarta(String carta){
        CounterCarta=0;
        while(CounterCarta<5){
            if(Objects.equals(this.archivio_carta[CounterCarta],carta)==true){
                break;
            }else CounterCarta++;
        }
        if(CounterCarta!=5){
            return 1;   
        }
        else{
            CounterCarta=0;
            return 0;
        }
    }//ch controllo carta
    
    public int CheckPssw(String Pssw){
            if(Objects.equals(this.password_carta[CounterCarta],Pssw)==true){
                return 1;

            }else return 0;
        
       
    }//ch controllo carta
    
    public int Cell(String Cellulare){
        if((Cellulare.length()==10)||(Cellulare.length()==9)){
            archivio_attivo[spostamenti]="€ ricarica " +company+" numero "+ Cellulare;            
            return 1;
        }else return 0;
    }
    
    public void compagnia(String mobile){
            company=mobile;
    }
    
    public void contabile(String money){
        archivio_denaro[spostamenti]=money;
    }
    
    public void movimenti(String move){
        archivio_attivo[spostamenti]=move;
    }
    
    public void action(){
        
        spostamenti++;
        if(spostamenti==100)spostamenti=0;
    }
    
    public void donare(String charity){
        archivio_attivo[spostamenti]="€ in beneficienza a " + charity;
    }
    
    public void azzeramento(){
        if(spostamenti==0){
            archivio_attivo[0]="";
            archivio_denaro[0]="";
        }
        for(int i=0;i<spostamenti;i++){
            archivio_attivo[i]="";
            archivio_denaro[i]="";
        }
        spostamenti=0;
        CounterCarta=0;
    }
    public String REC(){
            resoconto="<html>";
        if((spostamenti!=0) && (resoconto=="<html>")){
                for(int i=0;i<spostamenti;i++){
                    numerazione++;
                    resoconto=resoconto + numerazione + ". " +archivio_denaro[i] + archivio_attivo[i] +"<br>";
                }        
                resoconto=resoconto + "</html>";
        }
        numerazione=0;
        return resoconto;
        
    }
}
