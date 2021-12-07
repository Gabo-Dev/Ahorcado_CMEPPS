/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author jhony
 */
public class Ahorcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JugadorCreador jC = new JugadorCreador();
        JugadorAdivinador jA = new JugadorAdivinador();
        int intentos= 0; //por cada parte del cuerpo
        String palabra = jC.crearPalabra();
        String letra;
        boolean finJuego=false;
        JOptionPane.showMessageDialog(null, "EL JUEGO DEL AHORCADO VA A COMENZAR: ");
        do{
            letra = JOptionPane.showInputDialog("Introduzca la letra para tratar de adivinar la palabra: ");
            if (jC.comprobarResultado(letra)) {//Acertamos
                if (palabra.equals(jC.generarSolucion())) {
                    finJuego = true;
                    JOptionPane.showMessageDialog(null, jC.generarSolucion() + " Haz ganado!!!");
                }
                else{
                    JOptionPane.showMessageDialog(null, jC.generarSolucion());
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "La palabra no contiene la letra: " + letra);
            }
            intentos++;
        }while (intentos < 6 && !finJuego);
    }
    
}
