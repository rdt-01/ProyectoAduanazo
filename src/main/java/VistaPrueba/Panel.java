/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistaPrueba;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Javier
 */
public class Panel extends JPanel implements ActionListener {

    private JButton btnAtras;
    private JButton btnSiguiente;
    private JLabel lblTitulo;
    private JButton btnGnral;
    private JButton btnEspcf;
    private JButton btnPirotec;
    private JButton btnTbc;
    private JButton btnAlcohol;
    private JButton btnVehiculos;
    private JButton btnLibros;
    private JButton btnJoyeria;
    private JButton btnProhibidos;
    private JLabel lblDescripcion;
    private JTextField txtValor;
    private JLabel lblValor;
    private JTextField txtEnvio;
    private JLabel lblEnvio;
    private JTextField txtAduanazo;
    private JTextField txtTotal;
    private JLabel lblAduanazo;
    private JLabel lblTotal;
    private JButton btnCalcular;
    private JButton btnLimpiar;
    private JLabel lblIcono;

    public Panel() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {

        this.setLayout(null);
        this.setBackground(new Color(51, 204, 204));

        this.btnAtras = new JButton("Atrás");
        this.btnAtras.addActionListener(this);
        this.btnAtras.setForeground(Color.WHITE);
        this.btnAtras.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 33));
        this.btnAtras.setBorderPainted(false);
        this.btnAtras.setBackground(new Color(255, 51, 102));
        this.btnAtras.setBounds(0, 0, 191, 80);
        this.btnAtras.setEnabled(false);
        this.add(btnAtras);

        this.btnSiguiente = new JButton("Siguiente");
        this.btnSiguiente.addActionListener(this);
        this.btnSiguiente.setForeground(Color.WHITE);
        this.btnSiguiente.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 33));
        this.btnSiguiente.setBackground(new Color(255, 51, 102));
        this.btnSiguiente.setBounds(613, 0, 191, 80);
        this.btnSiguiente.setBorderPainted(false);
        this.add(btnSiguiente);

        this.lblTitulo = new JLabel("              Categorías");
        this.lblTitulo.setBackground(new Color(0, 102, 204));
        this.lblTitulo.setForeground(Color.WHITE);
        this.lblTitulo.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 51));
        this.lblTitulo.setBounds(189, 0, 428, 80);
        this.lblTitulo.setOpaque(true);
        this.add(lblTitulo);

        this.lblDescripcion = new JLabel("Descripción");
        this.lblDescripcion.setForeground(Color.WHITE);
        this.lblDescripcion.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 30));
        this.lblDescripcion.setBounds(27, 375, 730, 153);
        this.add(lblDescripcion);

        //Botones categoria.
        this.btnGnral = new JButton("General");
        this.btnGnral.setForeground(Color.WHITE);
        this.btnGnral.setIcon(new ImageIcon("icons\\general.png"));
        this.btnGnral.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 31));
        this.btnGnral.addActionListener(this);
        this.btnGnral.setBounds(17, 96, 210, 80);
        this.btnGnral.setOpaque(false);
        this.btnGnral.setContentAreaFilled(false);
        this.btnGnral.setBorderPainted(false);
        this.add(btnGnral);

        this.btnEspcf = new JButton("Específico");
        this.btnEspcf.setIcon(new ImageIcon("icons\\lupa.png"));
        this.btnEspcf.addActionListener(this);
        this.btnEspcf.setForeground(Color.WHITE);
        this.btnEspcf.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 31));
        this.btnEspcf.setBounds(525, 96, 210, 80);
        this.btnEspcf.setOpaque(false);
        this.btnEspcf.setContentAreaFilled(false);
        this.btnEspcf.setBorderPainted(false);
        this.add(btnEspcf);

        this.btnPirotec = new JButton("Pirotecnia");
        this.btnPirotec.setIcon(new ImageIcon("icons\\petardos.png"));
        this.btnPirotec.setForeground(Color.WHITE);
        this.btnPirotec.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 31));
        this.btnPirotec.setBounds(245, 96, 210, 80);
        this.btnPirotec.setOpaque(false);
        this.btnPirotec.setContentAreaFilled(false);
        this.btnPirotec.setBorderPainted(false);
        this.add(btnPirotec);

        this.btnTbc = new JButton("Tabaco");
        this.btnTbc.setIcon(new ImageIcon("icons\\tabaco.png"));
        this.btnTbc.setForeground(Color.WHITE);
        this.btnTbc.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 31));
        this.btnTbc.setBounds(245, 189, 210, 80);
        this.btnTbc.setOpaque(false);
        this.btnTbc.setContentAreaFilled(false);
        this.btnTbc.setBorderPainted(false);
        this.add(btnTbc);

        this.btnAlcohol = new JButton("Alcohol");
        this.btnAlcohol.setIcon(new ImageIcon("icons\\alcohol.png"));
        this.btnAlcohol.setForeground(Color.WHITE);
        this.btnAlcohol.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 31));
        this.btnAlcohol.setBounds(17, 189, 210, 80);
        this.btnAlcohol.setOpaque(false);
        this.btnAlcohol.setContentAreaFilled(false);
        this.btnAlcohol.setBorderPainted(false);
        this.add(btnAlcohol);

        this.btnVehiculos = new JButton("Vehículos");
        this.btnVehiculos.setIcon(new ImageIcon("icons\\auto.png"));
        this.btnVehiculos.setForeground(Color.WHITE);
        this.btnVehiculos.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 31));
        this.btnVehiculos.setBounds(245, 282, 210, 80);
        this.btnVehiculos.setOpaque(false);
        this.btnVehiculos.setContentAreaFilled(false);
        this.btnVehiculos.setBorderPainted(false);
        this.add(btnVehiculos);

        this.btnLibros = new JButton("Libros");
        this.btnLibros.setIcon(new ImageIcon("icons\\libros.png"));
        this.btnLibros.setForeground(Color.WHITE);
        this.btnLibros.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 31));
        this.btnLibros.setBounds(17, 282, 210, 80);
        this.btnLibros.setOpaque(false);
        this.btnLibros.setContentAreaFilled(false);
        this.btnLibros.setBorderPainted(false);
        this.add(btnLibros);

        this.btnJoyeria = new JButton("Joyeria y pieles");
        this.btnJoyeria.addActionListener(this);
        this.btnJoyeria.setIcon(new ImageIcon("icons\\joyas.png"));
        this.btnJoyeria.setForeground(Color.WHITE);
        this.btnJoyeria.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 31));
        this.btnJoyeria.setBounds(525, 189, 210, 80);
        this.btnJoyeria.setOpaque(false);
        this.btnJoyeria.setContentAreaFilled(false);
        this.btnJoyeria.setBorderPainted(false);
        this.add(btnJoyeria);

        this.btnProhibidos = new JButton("Prohibidos");
        this.btnProhibidos.setIcon(new ImageIcon("icons\\no.png"));
        this.btnProhibidos.setForeground(Color.WHITE);
        this.btnProhibidos.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 31));
        this.btnProhibidos.setBounds(525, 282, 210, 80);
        this.btnProhibidos.setOpaque(false);
        this.btnProhibidos.setContentAreaFilled(false);
        this.btnProhibidos.setBorderPainted(false);
        this.add(btnProhibidos);

        this.txtValor = new JTextField();
        this.txtValor.setBounds(155, 183, 267, 41);
        this.txtValor.setVisible(false);
        this.add(txtValor);

        this.txtEnvio = new JTextField();
        this.txtEnvio.setBounds(155, 129, 267, 41);
        this.txtEnvio.setVisible(false);
        this.add(txtEnvio);

        this.txtAduanazo = new JTextField();
        this.txtAduanazo.setEditable(false);
        this.txtAduanazo.setBounds(155, 299, 267, 41);
        this.txtAduanazo.setVisible(false);
        this.add(txtAduanazo);

        this.txtTotal = new JTextField();
        this.txtTotal.setEditable(false);
        this.txtTotal.setBounds(155, 363, 267, 41);
        this.txtTotal.setVisible(false);
        this.add(txtTotal);

        this.lblEnvio = new JLabel("Envío:");
        this.lblEnvio.setForeground(Color.WHITE);
        this.lblEnvio.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 32));
        this.lblEnvio.setBounds(32, 183, 111, 41);
        this.lblEnvio.setVisible(false);
        this.add(lblEnvio);

        this.lblAduanazo = new JLabel("Aduanazo:");
        this.lblAduanazo.setForeground(Color.WHITE);
        this.lblAduanazo.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 32));
        this.lblAduanazo.setBounds(32, 299, 111, 41);
        this.lblAduanazo.setVisible(false);
        this.add(lblAduanazo);

        this.lblTotal = new JLabel("Total:");
        this.lblTotal.setForeground(Color.WHITE);
        this.lblTotal.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 32));
        this.lblTotal.setBounds(32, 358, 111, 41);
        this.lblTotal.setVisible(false);
        this.add(lblTotal);

        this.lblValor = new JLabel("Valor:");
        this.lblValor.setForeground(Color.WHITE);
        this.lblValor.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 32));
        this.lblValor.setBounds(32, 129, 111, 41);
        this.lblValor.setVisible(false);
        this.add(lblValor);

        this.btnCalcular = new JButton("Calcular");
        this.btnCalcular.setForeground(Color.WHITE);
        this.btnCalcular.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 36));
        this.btnCalcular.setBackground(new Color(255, 0, 102));
        this.btnCalcular.setBounds(536, 469, 212, 70);
        this.btnCalcular.setBorderPainted(false);
        this.btnCalcular.setVisible(false);
        this.add(btnCalcular);

        this.btnLimpiar = new JButton("Limpiar");
        this.btnLimpiar.setBackground(new Color(0, 102, 204));
        this.btnLimpiar.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 36));
        this.btnLimpiar.setForeground(Color.WHITE);
        this.btnLimpiar.setBounds(325, 469, 212, 70);
        this.btnLimpiar.setBorderPainted(false);
        this.btnLimpiar.setVisible(false);
        this.add(btnLimpiar);

        this.lblIcono = new JLabel("");
        this.lblIcono.setIcon(new ImageIcon("icons\\barco_icon.png"));
        this.lblIcono.setBounds(495, 129, 237, 250);
        this.lblIcono.setVisible(false);
        this.add(lblIcono);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (btnSiguiente == e.getSource()) {
            
            //Se oculta la ventana categorias.
            btnSiguiente.setEnabled(false);
            lblTitulo.setText("              Calculadora");
            btnAtras.setEnabled(true);
            btnAlcohol.setVisible(false);
            btnEspcf.setVisible(false);
            btnGnral.setVisible(false);
            btnJoyeria.setVisible(false);
            btnLibros.setVisible(false);
            btnPirotec.setVisible(false);
            btnProhibidos.setVisible(false);
            btnTbc.setVisible(false);
            btnVehiculos.setVisible(false);
            lblDescripcion.setVisible(false);

            //Se visualiza la segunda ventana calcular.
            txtEnvio.setVisible(true);
            txtAduanazo.setVisible(true);
            txtTotal.setVisible(true);
            txtValor.setVisible(true);
            lblAduanazo.setVisible(true);
            lblEnvio.setVisible(true);
            lblIcono.setVisible(true);
            lblTotal.setVisible(true);
            lblValor.setVisible(true);
            btnCalcular.setVisible(true);
            btnLimpiar.setVisible(true);

        }

        if (btnAtras == e.getSource()) {
            
            //Se releva la ventana categorias
            btnAtras.setEnabled(false);
            lblTitulo.setText("              Categorias");
            btnSiguiente.setEnabled(true);
            btnAlcohol.setVisible(true);
            btnEspcf.setVisible(true);
            btnGnral.setVisible(true);
            btnJoyeria.setVisible(true);
            btnLibros.setVisible(true);
            btnPirotec.setVisible(true);
            btnProhibidos.setVisible(true);
            btnTbc.setVisible(true);
            btnVehiculos.setVisible(true);
            lblDescripcion.setVisible(true);

            //Se oculta la ventana de calcular
            txtEnvio.setVisible(false);
            txtAduanazo.setVisible(false);
            txtTotal.setVisible(false);
            txtValor.setVisible(false);

            lblAduanazo.setVisible(false);
            lblEnvio.setVisible(false);
            lblIcono.setVisible(false);
            lblTotal.setVisible(false);
            lblValor.setVisible(false);

            btnCalcular.setVisible(false);
            btnLimpiar.setVisible(false);

        }
    }

}