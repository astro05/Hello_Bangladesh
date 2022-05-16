package hello_bangladesh;


//import static Registration.scaleImage;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sadman Jahin
 */
public class ImageOperation {
    
    BufferedImage bimage;
    ImageIcon ii;
    
     File selectImage()
    {
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        // String filename = f.getAbsolutePath();
        //jTextField1.setText(filename);
        try {
             ii=new ImageIcon(bimage=scaleImage(120, 120, ImageIO.read(new File(f.getAbsolutePath()))));//get the image from file chooser and scale it to match JLabel size
            
            
         } catch (Exception ex) {
            ex.printStackTrace();
        }
        return f;
    }
    public static BufferedImage scaleImage(int w, int h, BufferedImage img) throws Exception {
        BufferedImage bi;
        bi = new BufferedImage(w, h, BufferedImage.TRANSLUCENT);
        Graphics2D g2d = (Graphics2D) bi.createGraphics();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY));
        g2d.drawImage(img, 0, 0, w, h, null);
        g2d.dispose();
        return bi;
    }
    
    public void saveImage(String location)
{
    BufferedImage img =bimage; 

String format = "PNG"; // "PNG" for example
try
{   
ImageIO.write(img, format, new File(location+"\\Photo.png"));
}
catch(Exception e)
{
    ;
}
}
}
