import javax.swing.*;
//Clase registro del empleado
public class Empleado {
    //informacion del empleado-atributos
    String nombre;
    double salario;
    int experiencia_años;
}
//psvm
        void main() {
    String nombre = JOptionPane.showInputDialog("Ingresar Nombre del Empleado") ;
    double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingresar salario en número")) ;
    int experiencia_años = Integer.parseInt(JOptionPane.showInputDialog("Ingresar años de experiencia en número")) ;
    double bono = experiencia_años * 200.000 ;
    double suma = salario + bono;
    JOptionPane.showMessageDialog(null, bono + "Bono por años de experiencia ");
    JOptionPane. showMessageDialog(null, suma + "Salario aplicado con bono para " + nombre);

    if (experiencia_años > 3) {
        bono = bono + 300.000 ;
    }

    if (experiencia_años > 6) {
        bono = bono + 400.000 ;
    }
}
