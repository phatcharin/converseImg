/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converseimg;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Phatcharin
 */
public class ConverseImg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        File f = new File("C:/Users/Phatcharin/Documents/NetBeansProjects/converseImg");
        File[] matchingFiles = f.listFiles(new FilenameFilter() {
        public boolean accept(File dir, String name) {
            return name.endsWith("jpg");
        }
        });
    
    File file = new File("C:/Users/Phatcharin/Documents/NetBeansProjects/converseImg/1.JPG");
    
    BufferedImage orginalImage = ImageIO.read(file);

    BufferedImage blackAndWhiteImg = new BufferedImage(
        orginalImage.getWidth(), orginalImage.getHeight(),
        BufferedImage.TYPE_BYTE_BINARY);
    
    Graphics2D graphics = blackAndWhiteImg.createGraphics();
    graphics.drawImage(orginalImage, 0, 222, null);

    ImageIO.write(blackAndWhiteImg, "png", new File("C:/Users/Phatcharin/Documents/NetBeansProjects/converseImg/2.JPG")); 
  }
}

