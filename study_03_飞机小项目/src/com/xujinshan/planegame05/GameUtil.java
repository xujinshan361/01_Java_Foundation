package com.xujinshan.planegame05;
 
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
 
public class GameUtil {
    //工具类最好私有化构造器
    private GameUtil() {
    } 
 
    
    /**
     * 返回指定路径文件的图片对象
     * @param path
     * @return
     */
    public static Image getImage(String path) {
        BufferedImage bi = null;
        try {
            URL u = GameUtil.class.getClassLoader().getResource(path);
            bi = ImageIO.read(u);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bi;
    }
}