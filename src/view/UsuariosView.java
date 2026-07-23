package view;

import connection.Conexion;
import controller.UsuariosController;
import model.Usuarios;

import java.util.ArrayList;

public class UsuariosView
{
    UsuariosController usuariosController = new UsuariosController();
    Conexion conexion = new Conexion();

    public void mostrar ()
    {
        ArrayList<Usuarios> listaUsuarios = new ArrayList<>();
        listaUsuarios = usuariosController.mostrar();

        for (Usuarios usuarios : listaUsuarios)
        {
            System.out.println(usuarios.getNombre());
            System.out.println(usuarios.getDocumento());
        }
    }
}
