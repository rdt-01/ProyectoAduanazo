/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaCategoria;

import java.awt.GridLayout;
import java.awt.TextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 *
 * @author rdt
 */
public class PanelCat_Izq extends JPanel {

    //Attr
    public JButton btnCat1;
    public JButton btnCat2;
    public JButton btnCat3;
    public JButton btnCat4;
    public JButton btnCat5;

    private JLabel jlCat1;
    private JLabel jlCat2;
    private JLabel jlCat3;
    private JLabel jlCat4;
    private JLabel jlCat5;

    private int fil, col;

    //Constructor
    public PanelCat_Izq(int x, int y) {
        this.fil = x;
        this.col = y;
        this.initComp();
    }

    //Funciones
    private void initComp() {

        GridLayout distrib = new GridLayout(this.fil, this.col); //fil, col

        //Panel
        this.setLayout(distrib);
        this.setBorder(new TitledBorder("Categorias de Productos"));

        //JButton
        this.btnCat1 = new JButton("1");
        this.btnCat2 = new JButton("2");
        this.btnCat3 = new JButton("3");
        this.btnCat4 = new JButton("4");
        this.btnCat5 = new JButton("5");

        //JLabel
        this.jlCat1 = new JLabel("  " + "CATEGORIA 1" + "  ");
        this.jlCat2 = new JLabel("  " + "CATEGORIA 2" + "  ");
        this.jlCat3 = new JLabel("  " + "CATEGORIA 3" + "  ");
        this.jlCat4 = new JLabel("  " + "CATEGORIA 4" + "  ");
        this.jlCat5 = new JLabel("  " + "CATEGORIA 5" + "  ");

        //Add
        this.add(this.btnCat1);
        this.add(this.jlCat1);
        this.add(this.btnCat2);
        this.add(this.jlCat2);
        this.add(this.btnCat3);
        this.add(this.jlCat3);
        this.add(this.btnCat4);
        this.add(this.jlCat4);
        this.add(this.btnCat5);
        this.add(this.jlCat5);
    }

}
