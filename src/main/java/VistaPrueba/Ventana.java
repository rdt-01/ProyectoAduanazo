 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistaPrueba;

import javax.swing.JFrame;

/**
 *
 * @author Javier
 */
public class Ventana extends JFrame {

    private Panel pnl;

    public Ventana() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {

        
        this.pnl = new Panel();
        this.add(pnl);
        

        
        
        this.setTitle("Aduanazo");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 822, 599);
        this.setVisible(true);

    }

}

