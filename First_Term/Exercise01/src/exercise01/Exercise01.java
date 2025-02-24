/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise01;

import edu.usta.forms.FormPrincipal;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author cpaez
 */
public class Exercise01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Asegurar que la GUI se cree en el hilo de eventos de Swing
        SwingUtilities.invokeLater(() -> {
            // Creación y configuración de frame base
            JFrame frame = new JFrame("Exercise 01");
            
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);
            
            frame.setLocationRelativeTo(null);
            
            // Asociar el formulario tipo panel creado
            frame.add(new FormPrincipal());
            frame.setVisible(true);
        });
    }

}
