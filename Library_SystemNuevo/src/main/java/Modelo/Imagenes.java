/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;

/**
 *
 * @author Vkaiido
 */
public class Imagenes extends javax.swing.JPanel {

    BufferedImage url;

    public Imagenes(int x, int y, BufferedImage url) {
        this.setSize(x, y);
        this.url = url;
    }

    public void paint(Graphics g) {
        Dimension height = getSize();
        BufferedImage img = url;

        g.drawImage(img, 0, 0, height.width, height.height, null);
        setOpaque(false);
        super.paintComponent(g);
    }
}
