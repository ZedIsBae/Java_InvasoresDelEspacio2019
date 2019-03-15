/*
 * La nave del juego :D
 * 
 * 
 */
package codigo;

import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author Jon
 */
public class Nave {
    public Image imagen = null;
    public int x =0;
    public int y = 0; 
    private boolean pulsadoIzquierda = false;
    private boolean pulsadoDerecha = false;
    
    public Nave(){ try {
        // esto es un constructor
        imagen = ImageIO.read(getClass().getResource("/imagenes/nave.png"));
        } catch (IOException ex) {
            
        }
        
    }
    
    public void movimiento(){
        if (pulsadoIzquierda){
            x--;
        }
        if (pulsadoDerecha){
            x++;
        }
       
    }

    public boolean isPulsadoIzquierda() {
        return pulsadoIzquierda;
    }

    public void setPulsadoIzquierda(boolean pulsadoIzquierda) {
        this.pulsadoIzquierda = pulsadoIzquierda;
        this.pulsadoDerecha =false;
    }

    public boolean isPulsadoDerecha() {
        return pulsadoDerecha;
    }

    public void setPulsadoDerecha(boolean pulsadoDerecha) {
        this.pulsadoDerecha = pulsadoDerecha;
        this.pulsadoIzquierda = false;
    }
    
}
