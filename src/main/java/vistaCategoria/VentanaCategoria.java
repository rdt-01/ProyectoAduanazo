/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaCategoria;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;

import vistaCalculo.VentanaCalculo;

/**
 *
 * @author rdt
 */
public class VentanaCategoria extends JFrame {

    //Attr
    private PanelCat_Izq pizq;
    private PanelDesc_Der pder;
    private PanelBoton_Inf pinf;

    //Constructor
    public VentanaCategoria() {
        this.initComp();
    }

    //Funciones
    private void initComp() {

        //Instancias
        this.pizq = new PanelCat_Izq(5, 2); //fil, col
        this.pder = new PanelDesc_Der();
        this.pinf = new PanelBoton_Inf();

        //Propiedades JFrame
        this.setTitle("Aduanazo");
        this.setSize(460, 500); //w, h
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //JPanels
        this.add(this.pizq, BorderLayout.WEST);
        this.add(this.pder, BorderLayout.EAST);
        this.add(this.pinf, BorderLayout.SOUTH);

        //ActionEvents
        this.pinf.btnConfirmar.addActionListener((ActionEvent e) -> {
            VentanaCalculo vcalc = new VentanaCalculo();
        });

        //Visibilidad
        this.setVisible(true);

    }

}
