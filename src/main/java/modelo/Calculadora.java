/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

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
    
    
    
}
