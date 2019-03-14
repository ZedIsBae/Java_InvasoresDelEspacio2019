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
    
    public Nave(){ try {
        // esto es un constructor
        imagen = ImageIO.read(getClass().getResource("/imagenes/nave.png"));
        } catch (IOException ex) {
            
        }
        
    }
}
