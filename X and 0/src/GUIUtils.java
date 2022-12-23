
import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Toolkit;
import javax.swing.JFrame;


/* @author radoi ovidiu */
public class GUIUtils {
    
    public static void setBackground(JLabel label, String path) {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(path));
        } catch (IOException ex) {
            Logger.getLogger(FirstPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Image dimg = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ii = new ImageIcon(dimg);
        label.setIcon(ii);
    }
    public static void fullScreen(JFrame fr){
        Toolkit tk = fr.getToolkit();
        Dimension dim = tk.getScreenSize();
        fr.setBounds(0, 0,dim.width, dim.height);
    }
    
    public static void center(JFrame fr){
        Toolkit tk = fr.getToolkit();
        Dimension dim = tk.getScreenSize();
        fr.setLocation(dim.width/2 - fr.getWidth()/2, dim.height/2 - fr.getHeight()/2);
    }
}
