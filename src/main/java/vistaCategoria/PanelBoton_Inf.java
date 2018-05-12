/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaCategoria;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author rdt
 */
public class PanelBoton_Inf extends JPanel {

    //Attr
    public JButton btnConfirmar;

    //Constructor
    public PanelBoton_Inf() {
        this.initComp();
    }

    //Funciones
    private void initComp() {

        //Panel
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

        //JButton
        this.btnConfirmar = new JButton("Siguiente");

        //Add
        this.add(this.btnConfirmar);
    }

}
