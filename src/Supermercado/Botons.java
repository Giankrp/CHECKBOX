package Supermercado;//aca importamos el package supermercado

import java.awt.*;//aca importamos la libreria para acomodar los items de la interfaz
import java.awt.event.*;// luego importamos la libreria para agregar los eventos a cada uno de los checkboxes
import javax.swing.*;//y por ultimo importamos swing para la interfaz

// creamos la clase botones que extienede de JFrame e implementa el evento de checkbox
public class Botons extends JFrame implements ItemListener {

    JCheckBox manzanaCB, arrozCB, galletasCB, bebidasCB;// creamos cada una de las checkboxes
    JLabel imagenLbl;// aca creamos el label para la imagen correspondiente

    // luego creamos el espacio de imagen para cada una de las imagenes
    ImageIcon manzanaImg = new ImageIcon("manzana.jpg");
    ImageIcon arrozImg = new ImageIcon("arroz.jpg");
    ImageIcon galletasImg = new ImageIcon("galletas.jpg");
    ImageIcon bebidasImg = new ImageIcon("bebidas.jpg");

    // creamos la clase bonotes para colocar y poner el evento en cada uno de los
    // checkboxes
    public Botons() {
        super("Selecciona una imagen");// como estamos heredando, tenemos que usar el super
        setLayout(new BorderLayout());// aca implementamos el layout para acomodar bien los componentes

        JPanel panelIzquierdo = new JPanel(new GridLayout(4, 1)); // y aca para repartimos el espacio en 4 filas y 1
                                                                  // columna
        setLocation(400, 150);

        // ya despues agregamos cada checkbox en el panel
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

        // y luego los ponemos a la izquierda ponemos
        add(panelIzquierdo, BorderLayout.WEST);

        // y aca e el label pnemos la imagen en el centro
        imagenLbl = new JLabel();
        imagenLbl.setHorizontalAlignment(SwingConstants.CENTER);
        add(imagenLbl, BorderLayout.CENTER);
    }

    // creamos la funcion para el evento
    public void itemStateChanged(ItemEvent event) {// para el evento tenemos que pasarale como parametro ItemEvent
        // y luego evaluar cada una de las condiciones
        if (event.getSource() == manzanaCB && manzanaCB.isSelected()) {
            Image manzana = manzanaImg.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
            imagenLbl.setIcon(new ImageIcon(manzana));
        } else if (event.getSource() == arrozCB && arrozCB.isSelected()) {
            Image arroz = arrozImg.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
            imagenLbl.setIcon(new ImageIcon(arroz));
        } else if (event.getSource() == galletasCB && galletasCB.isSelected()) {
            Image galletas = galletasImg.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
            imagenLbl.setIcon(new ImageIcon(galletas));
        } else if (event.getSource() == bebidasCB && bebidasCB.isSelected()) {
            Image bebidas = bebidasImg.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
            imagenLbl.setIcon(new ImageIcon(bebidas));
        } else {
            imagenLbl.setIcon(null);
        }
    }

    // y por ultimo la funcion que ejecuta todo la interfaz
    public static void main(String[] args) {
        Botons ventana = new Botons();
        ventana.setSize(600, 450);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}