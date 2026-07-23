import javax.swing.*;

//Clase Calculadora
public class Calculadora
{
    //Metodo Sumar
    public int sumar(int num1, int num2)
    {
        return num1 + num2;
    }

    //metodo restar
    public int restar(int num1, int num2)
    {
        return num1 - num2;
    }

    //metodo multiplicar
    public int multiplicar(int num1, int num2)
    {
        return num1 * num2;
    }

    //metodo dividir
    public double dividir(double num1, double num2)
    {
        return num1 / num2;
    }

    //metodo mayor
    public void esMayor(int num1, int num2)
    {
        if (num1 == num2)
        {
            JOptionPane.showMessageDialog(null,"Los numeros son iguales");
        }
        else if(num1 > num2)
        {
            JOptionPane.showMessageDialog(null,"Num1 es el mayor");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Num2 es el mayor");
        }
    }


    //metodo numero primo
    public void primo(int num1)
    {

    }
    //psvm
    static void main()
    {
        //NombreClase nombreObjeto = new NombreClase();
        Calculadora calculadora = new Calculadora();
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del numero 1"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del numero 2"));
        //se muestra el resultado por consola
        System.out.println("El resultado de la suma es: "+calculadora.sumar(num1,num2));
        //Se muestra el resultado por pantalla
       /*
       JOptionPane.showMessageDialog(null,"El resultado de la suma es: "+calculadora.sumar(num1,num2));
       JOptionPane.showMessageDialog(null,"El resultado de la resta es: "+calculadora.restar(num1,num2));
       JOptionPane.showMessageDialog(null,"El resultado de la multiplicacion es: "+calculadora.multiplicar(num1,num2));
       JOptionPane.showMessageDialog(null,"El resultado de la division es: "+calculadora.dividir(num1,num2));

        */
        calculadora.esMayor(num1,num2);
    }
}
