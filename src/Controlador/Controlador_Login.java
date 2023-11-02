
package Controlador;
import Procesos.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelos.Usuario;
import Vista.*;
import DAO.*;
import Principal.*;
import javax.swing.JOptionPane;

public class Controlador_Login implements ActionListener
{
        LoginMK1 vista;
        DAO_User crud=new DAO_User();    
        Usuario user;
        
        public Controlador_Login(LoginMK1 f1)
            { 
                vista=f1;
                vista.btnIniciar.addActionListener(this);
                Procesos_Login.Presentacion(f1);
               
            }//fin constructor

    @Override
    public void actionPerformed(ActionEvent e) 
    {


       if(e.getSource()==vista.btnIniciar)
         {
             user=Procesos_Login.LeerDatos(vista);   
             String nombre = user.getNameuser();
             String clave = user.getClaveuser();
             boolean access=crud.IniciarSesion(nombre,clave);
             if(access)
                {
                    Procesos.Procesos_Login.Estado2(Main.fmenu);
                    vista.dispose();
                }
             else
                {
                 JOptionPane.showMessageDialog(null,
                 "El Usuario y/o Contraseña son incorrectos","Message Error",JOptionPane.ERROR_MESSAGE);
                }
         }

    }
}
