/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

import javax.swing.JOptionPane;

/**
 *
 * @author jhony
 */
public class JugadorCreador {
    private String adivinar;
    private String solucion;
    public boolean comprobarResultado(String letra)
    {
        boolean encontrado = false;
          for(int i=0; i<adivinar.length();i++){
            if(adivinar.charAt(i)==letra.charAt(0)){
                encontrado=true;        
                añadirAciertos(i,letra);
            }
        }
          return encontrado;
    }

    public String crearPalabra() {
        this.adivinar = JOptionPane.showInputDialog("Introduzca la palabra que el otro personaje debera adivinar: ");
        this.solucion = adivinar.replaceAll("([a-z])", "?");
        return this.adivinar;
    }

    public void añadirAciertos(int i, String letra) {
        StringBuffer adivinados = new StringBuffer(solucion);
        adivinados.setCharAt(i, letra.charAt(0));
        this.solucion=adivinados.toString();
    }   
    public String generarSolucion()
    {
        return solucion;
    }
    
    
}
