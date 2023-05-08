package Supermercado;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Botons extends JFrame implements ItemListener {

    JCheckBox manzanaCB, arrozCB, galletasCB, bebidasCB;
    JLabel imagenLbl;

    ImageIcon manzanaImg = new ImageIcon("manzana.jpg");
    ImageIcon arrozImg = new ImageIcon("arroz.jpg");
    ImageIcon galletasImg = new ImageIcon("galletas.jpg");
    ImageIcon bebidasImg = new ImageIcon("bebidas.jpg");

    public Botons() {
        super("Selecciona una imagen");
        setLayout(new BorderLayout());

        JPanel panelIzquierdo = new JPanel(new GridLayout(4, 1));

        manzanaCB = new JCheckBox("Manzana");
        manzanaCB.addItemListener(this);
        panelIzquierdo.add(manzanaCB);

        arrozCB = new JCheckBox("Arroz");
        arrozCB.addItemListener(this);
        panelIzquierdo.add(arrozCB);

        galletasCB = new JCheckBox("Galletas");
        galletasCB.addItemListener(this);
        panelIzquierdo.add(galletasCB);

        bebidasCB = new JCheckBox("Bebidas");
        bebidasCB.addItemListener(this);
        panelIzquierdo.add(bebidasCB);

        add(panelIzquierdo, BorderLayout.WEST);

        imagenLbl = new JLabel();
        imagenLbl.setHorizontalAlignment(SwingConstants.CENTER);
        add(imagenLbl, BorderLayout.CENTER);
    }

    public void itemStateChanged(ItemEvent event) {
        if (event.getSource() == manzanaCB && manzanaCB.isSelected()) {
            Image manzana = manzanaImg.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
            imagenLbl.setIcon(new ImageIcon(manzana));
        } else if (event.getSource() == arrozCB && arrozCB.isSelected()) {
            Image arroz = arrozImg.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
            imagenLbl.setIcon(new ImageIcon(arroz));
        } else if (event.getSource() == galletasCB && galletasCB.isSelected()) {
            Image galletas = galletasImg.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
            imagenLbl.setIcon(new ImageIcon(galletas));
        } else if (event.getSource() == bebidasCB && bebidasCB.isSelected()) {
            Image bebidas = bebidasImg.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
            imagenLbl.setIcon(new ImageIcon(bebidas));
        } else {
            imagenLbl.setIcon(null);
        }
    }

    public static void main(String[] args) {
        Botons ventana = new Botons();
        ventana.setSize(400, 300);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}