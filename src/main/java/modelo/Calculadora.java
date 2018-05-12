/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author rdt
 */
public class Calculadora {

    private int valorProducto;
    private int valorEnvio;

    public Calculadora() {
    }

    public void setValorProducto(int valorProducto) {
        this.valorProducto = valorProducto;
    }

    public void setValorEnvio(int valorEnvio) {
        this.valorEnvio = valorEnvio;
    }

    public int getValorProducto() {
        return valorProducto;
    }

    public int getValorEnvio() {
        return valorEnvio;
    }

    public void printTest() {
        System.out.println(this.getValorProducto());
    }

    public static void arrojarValor() throws Exception {
        String url = "https://mindicador.cl/api/dolar";
        URL obj = new URL(url);

        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        StringBuffer response;
        try (BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()))) {
            String inputLine;
            response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
        }

        System.out.println(response.toString());

    }

}
