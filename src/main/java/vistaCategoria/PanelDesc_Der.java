/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaCategoria;

import java.awt.FlowLayout;
import java.awt.TextArea;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 *
 * @author rdt
 */
public class PanelDesc_Der extends JPanel {

    //Attr
    private TextArea taDesc;

    //Constructor
    public PanelDesc_Der() {
        this.initComp();
    }

    //Funciones
    private void initComp() {

        FlowLayout distrib = new FlowLayout();

        //Panel
        this.setLayout(distrib);
        this.setBorder(new TitledBorder("Descripcion"));

        //TextArea
        this.taDesc = new TextArea(25,25); //h,w

        //Add
        this.add(this.taDesc);
    }

}
