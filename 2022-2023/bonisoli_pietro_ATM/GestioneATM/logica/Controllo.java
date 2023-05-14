package logica;
import java.util.*;//utilizzo Objects per il confronto tra stringhe
public class Controllo{
    
    protected int spostamenti;
    private int CounterCarta,numerazione;
    private String[] archivio_carta;
    private String[] password_carta;
    private String[] archivio_attivo=new String[]{""};
    private String[] archivio_denaro=new String[]{""};
    private String company,resoconto;
    
    public Controllo(){
    this.company="";
    this.resoconto="";
    this.archivio_carta=new String[]{"0001","0002","0003","0004","0005"};
    this.password_carta=new String[]{"4321","1234","5678","8756","9999"};
    this.spostamenti=0;
    this.CounterCarta=0;
    this.numerazione=0;
   
    
    }//ch costruttore

    public int Checkcarta(String carta){
        while(this.CounterCarta<5){
            if(Objects.equals(this.archivio_carta[CounterCarta],carta)==true){
                //this.CounterCarta=6;
                break;
            }else CounterCarta++;
        }
        if(this.CounterCarta!=5){
            return 1;   
        }
        else{
            this.CounterCarta=0;
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
            this.archivio_attivo[spostamenti]="€ ricarica " +this.company+" numero "+ Cellulare;            
            return 1;
        }else return 0;
    }
    
    public void compagnia(String mobile){
            this.company=mobile;
    }
    
    public void contabile(String money){
        this.archivio_denaro[spostamenti]=money;
    }
    
    public void movimenti(String move){
        this.archivio_attivo[spostamenti]=move;
    }
    
    public void action(){
        this.spostamenti++;
    }
    
    public void donare(String charity){
        this.archivio_attivo[spostamenti]="€ in beneficienza a " + charity;
    }
    
    public void azzeramento(){
        if(this.spostamenti==0){
            this.archivio_attivo[0]="";
            this.archivio_denaro[0]="";
        }
        for(int i=0;i<this.spostamenti;i++){
            this.archivio_attivo[i]="";
            this.archivio_denaro[i]="";
        }
        this.spostamenti=0;
        this.CounterCarta=0;
    }
    public String REC(){
        this.resoconto="<html>";
        if(this.spostamenti==0 && this.archivio_denaro[0]!=null && this.archivio_attivo[0]!=null){
            this.numerazione=1;
            this.resoconto=this.resoconto+ this.numerazione + ". " + this.archivio_denaro[0] + this.archivio_attivo[0] +"<br>";
        }
        this.numerazione=0;
        for(int i=0;i<this.spostamenti;i++){
            this.numerazione++;
            this.resoconto=this.resoconto + this.numerazione + ". " +this.archivio_denaro[i] + this.archivio_attivo[i] +"<br>";
        }        
        this.numerazione=0;
        this.resoconto=this.resoconto + "</html>";
        return this.resoconto;
    }
}
