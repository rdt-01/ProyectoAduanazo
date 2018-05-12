/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaCalculo;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author rdt
 */
public class VentanaCalculo extends JFrame {

    //Attr
    private PanelEntrada_Sup psup;
    private PanelSalida_Cen pcen;
    private PanelBoton_Inf pinf;

    //Constructor
    public VentanaCalculo() {
        this.initComp();
    }

    //Funciones
    private void initComp() {

        //Instancias
        this.psup = new PanelEntrada_Sup(2,2);
        this.pcen = new PanelSalida_Cen(2,2);
        this.pinf = new PanelBoton_Inf();

        //Propiedades JFrame
        this.setTitle("Aduanazo");
        this.setSize(380, 255); //w, h
        this.setLocationRelativeTo(null);
        this.setResizable(true);
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //JPanels
        this.add(this.psup, BorderLayout.NORTH);
        this.add(this.pcen, BorderLayout.CENTER);
        this.add(this.pinf, BorderLayout.SOUTH);

        //ActionEvents
        //Visibilidad
        this.setVisible(true);

    }

}
