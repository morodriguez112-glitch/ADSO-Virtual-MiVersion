import javax.swing.*;
public class Reserva {
    //informacion
    String nombre_cliente;
    String fecha_reserva;
    int numero_personas;
}

void main() {
    String nombre_cliente = JOptionPane.showInputDialog("Escribir nombre cliente ");
    String fecha_reserva = JOptionPane.showInputDialog("Escribir fecha de reserva dd/mm/aa ");
    int numero_personas = Integer.parseInt(JOptionPane.showInputDialog("Escribir el número de personas de la reserva "));
    double costo_base = numero_personas * 200000;
    String pregunta_vino = JOptionPane.showInputDialog("¿Desea vino? si/no");
    boolean vino = pregunta_vino.equalsIgnoreCase("si");
    String pregunta_champaña = JOptionPane.showInputDialog(" ¿Desea champaña? si/no");
    boolean champaña = pregunta_champaña.equalsIgnoreCase("si");
    String pregunta_charcuteria = JOptionPane.showInputDialog(" ¿Desea charcuteria? si/no");
    boolean charcuteria = pregunta_charcuteria.equalsIgnoreCase("si");

    if (vino) {
        costo_base = costo_base + 20000;
    }
    if (champaña) {
        costo_base = costo_base + 60000;
    }
    if (charcuteria) {
        costo_base = costo_base + 40000;
    }

    JOptionPane.showMessageDialog(null, nombre_cliente + fecha_reserva + numero_personas);
    JOptionPane.showMessageDialog(null, "El valor a pagar es " +costo_base );
}