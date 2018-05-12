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

import modelo.Calculadora;

/**
 *
 * @author rdt
 */
public class PanelEntrada_Sup extends JPanel {

    //Attr
    private TextField tfValor;
    private TextField tfEnvio;
    private JLabel jlValor;
    private JLabel jlEnvio;

    private int fil, col;

    //Constructor
    public PanelEntrada_Sup(int x, int y) {
        this.fil = x;
        this.col = y;
        this.initComp();
    }

    //Funciones
    private void initComp() {

        GridLayout distrib = new GridLayout(this.fil, this.col); //fil, col

        //Panel
        this.setLayout(distrib);
        this.setBorder(new TitledBorder("Entrada"));

        //TextField
        this.tfValor = new TextField();
        this.tfEnvio = new TextField();

        //JLabel
        this.jlValor = new JLabel("Valor: ");
        this.jlEnvio = new JLabel("Envio: ");

        //Add
        this.add(this.jlValor);
        this.add(this.tfValor);
        this.add(this.jlEnvio);
        this.add(this.tfEnvio);
    }
    
    Calculadora setData() {
        Calculadora c = new Calculadora(); 
        int tempValorProd = Integer.parseInt(this.tfValor.getText().trim());  
        c.setValorProducto(tempValorProd);
        
        System.out.println("Valor temp " + tempValorProd + "valor set " + c.getValorProducto());
        
        return c;
    }

}
