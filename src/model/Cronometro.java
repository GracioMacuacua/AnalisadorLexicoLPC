package timerexample;

/**
 *
 * @author HelioSimango
 */
public class Cronometro {
    
    private long inicio;
    public void start(){
        inicio = System.currentTimeMillis();
    }
    
    public long stop(){      
        long fim = System.currentTimeMillis();
        long resultado =  fim - inicio;
        
        return resultado;
    }
    
    public void reniciarCronometro(){
        inicio = 0;
    }
    
}
