/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaCalculo;

import java.awt.GridLayout;
import java.awt.TextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 *
 * @author rdt
 */
public class PanelSalida_Cen extends JPanel {

    //Attr
    private TextField tfAduanazo;
    private TextField tfTotal;
    private JLabel jlAduanazo;
    private JLabel jlTotal;
    
    private int fil, col;

    //Constructor
    public PanelSalida_Cen(int x, int y) {
        this.fil = x;
        this.col = y;
        
        this.initComp();
    }

    //Funciones
    private void initComp() {
        
        GridLayout distrib = new GridLayout(this.fil, this.col); //fil, col

        //Panel
        this.setLayout(distrib);
        this.setBorder(new TitledBorder("Resultado"));

        //TextField
        this.tfAduanazo = new TextField();
        this.tfAduanazo.setEditable(false);
        this.tfTotal = new TextField();
        this.tfTotal.setEditable(false);

        //JLabel
        this.jlAduanazo = new JLabel("Aduanazo: ");
        this.jlTotal = new JLabel("Total a Pagar: ");

        //Add
        this.add(this.jlAduanazo);
        this.add(this.tfAduanazo);
        this.add(this.jlTotal);
        this.add(this.tfTotal);
    }

}
