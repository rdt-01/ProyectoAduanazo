/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaCalculo;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;

import modelo.Calculadora;

/**
 *
 * @author rdt
 */
public class VentanaCalculo extends JFrame {

    //Attr
    private PanelEntrada_Sup psup;
    private PanelSalida_Cen pcen;
    private PanelBoton_Inf pinf;
    
    private Calculadora calc;

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
        this.calc = new Calculadora();

        //Propiedades JFrame
        this.setTitle("Aduanazo");
        this.setSize(350, 189); //w, h
        this.setLocationRelativeTo(null);
        this.setResizable(true);
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //JPanels
        this.add(this.psup, BorderLayout.NORTH);
        this.add(this.pcen, BorderLayout.CENTER);
        this.add(this.pinf, BorderLayout.SOUTH);

        //ActionEvents
          this.pinf.btnCalcular.addActionListener((ActionEvent e) -> {
              this.psup.setData();
              System.out.println(this.calc.getValorProducto());
        });
          
        //Visibilidad
        this.setVisible(true);

    }

}
