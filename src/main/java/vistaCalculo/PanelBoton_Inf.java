/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaCalculo;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author rdt
 */
public class PanelBoton_Inf extends JPanel {

    //Attr
    public JButton btnCalcular;
    public JButton btnLimpiar;
    public JButton btnRegresar;

    //Constructor
    public PanelBoton_Inf() {
        this.initComp();
    }

    //Funciones
    private void initComp() {

        //Panel
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

        //JButton
        this.btnCalcular = new JButton("Calcular");
        this.btnLimpiar = new JButton("Limpiar");
        this.btnRegresar = new JButton("Regresar");

        //Add
        this.add(this.btnCalcular);
        this.add(this.btnLimpiar);
        this.add(this.btnRegresar);
    }

}
