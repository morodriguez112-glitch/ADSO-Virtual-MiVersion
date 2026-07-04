import javax.swing.*;

public class DonAndres
{
    int lapiz = 1200;
    int borrador = 500;
    int cuaderno = 4500;
    int lapicero = 2500;
    int corrector = 5000;

    double total = 0;

    public void vender()
    {
        String producto = JOptionPane.showInputDialog("Ingrese el producto que desea");
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad"));
        double descuento = 0;
        switch (producto)
        {
            case "lapiz":
                total = lapiz * cantidad;
                if (cantidad > 3)
                {
                    descuento = total * 0.33;
                }
                //total = total - descuento;
                total -= descuento;
                JOptionPane.showMessageDialog(null,"El total a pagar es: "+total);
                break;

            case "borrador":
                total = borrador * cantidad;
                if (cantidad >= 2)
                {
                    descuento = total * 0.1;
                }
                //total = total - descuento;
                total -= descuento;
                JOptionPane.showMessageDialog(null,"El total a pagar es: "+total);
                break;

            case "cuaderno":
                total = cuaderno * cantidad;
                if (cantidad > 6)
                {
                    descuento = total * 0.45;
                }
                //total = total - descuento;
                total -= descuento;
                JOptionPane.showMessageDialog(null,"El total a pagar es: "+total);
                break;

            case "lapicero":
                total = lapicero * cantidad;
                if (cantidad > 2 && cantidad < 6)
                {
                    descuento = total * 0.145;
                }
                //total = total - descuento;
                total -= descuento;
                JOptionPane.showMessageDialog(null,"El total a pagar es: "+total);
                break;

            case "corrector":
                total = corrector * cantidad;
                if (cantidad >= 5 && cantidad <= 7)
                {
                    descuento = total * 0.76;
                }
                //total = total - descuento;
                total -= descuento;
                JOptionPane.showMessageDialog(null,"El total a pagar es: "+total);
                break;

            default:
                JOptionPane.showMessageDialog(null,"Producto no encontrado");
                break;
        }

    }

    static void main() {
        DonAndres tienda = new DonAndres();
        tienda.vender();
    }

}
