package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.*;
import Principal.Main;
import DAO.*;
import javax.swing.JFrame;


public class Controlador_Menu  implements ActionListener 
    {
        Menu_Main vista1;

        public Controlador_Menu(Menu_Main forma)
            {
                
                vista1 = forma;
                Logeo(vista1);
                vista1.ItemCliente.addActionListener(this);
                forma.setExtendedState(JFrame.MAXIMIZED_BOTH);
                forma.setDefaultCloseOperation(forma.EXIT_ON_CLOSE);
                forma.setVisible(true);
                forma.setTitle("ATOMICA GYM");
                
            }
        
        public static void Logeo(Menu_Main vista1)
            {
                Main.f1 = new LoginMK1();
                vista1.desk.add(Main.f1);
                Main.controlf1 = new Controlador_Login(Main.f1);
               
               
                /*
                Main.login = new JFrmLogin();
                vista.escritorio.add(Main.login);
                Main.ControladorLogin = new ControladorJFrmLogin(Main.login);
                CentrarForma.CPanel(vista.escritorio,Main.login); 
               */
            }
        
        @Override
        public void actionPerformed(ActionEvent e) 
            {  
                
                if(e.getSource()== vista1.ItemCliente)
                    {
                        Main.f2 = new Registro_Cliente();
                        vista1.desk.add(Main.f2);
                        Main.controlf2 = new Controlador_Cliente(Main.f2);
                                 
                    }
                
            }
    
}
