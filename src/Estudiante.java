import javax.swing.*;

//Clase Registro estudiantes
public class Estudiante
{
    //informacion estudiante
    String nombre;
    int edad;
    double nota1;
    double nota2;
    double nota3;
}
//psvm
void main() {
    String nombre = JOptionPane.showInputDialog("Ingresar nombre del estudiante") ;
    int edad = Integer.parseInt(JOptionPane.showInputDialog("Escriba su edad")) ;
    double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Escribir nota1 del estudiante")) ;
    double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Escribir nota2 del estudiante")) ;
    double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Escribir nota3 del estudiante")) ;
    double promedio = (nota1 + nota2 + nota3) / 3 ;
    }