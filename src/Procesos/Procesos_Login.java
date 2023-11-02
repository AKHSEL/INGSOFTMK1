
package Procesos;
import Modelos.Usuario;
import Vista.LoginMK1;
import Vista.Menu_Main;

public class Procesos_Login
{
       public static void Presentacion(LoginMK1 f1)
        {
            f1.setTitle("Logeos de los Usuarios");    
            f1.setVisible(true);
        }
            
            public static void Estado1(Menu_Main fmenu)
                {
                    fmenu.ItemCliente.setEnabled(false);
                    fmenu.Item_Trainer.setEnabled(false);
                    fmenu.ItemNutricionista.setEnabled(false);
                    fmenu.jMenu1.setEnabled(false);
                    fmenu.jMenuBar1.setEnabled(false);                            
                  
                }   
           public static void Estado2(Menu_Main fmenu)
                {
                    fmenu.ItemCliente.setEnabled(true);
                    fmenu.Item_Trainer.setEnabled(true);
                    fmenu.ItemNutricionista.setEnabled(true);
                    fmenu.jMenu1.setEnabled(true);
                    fmenu.jMenuBar1.setEnabled(true);                            
                  
                }
       
            public static void LimpiarEntradas(LoginMK1 f1)
                {
                    f1.txtEmail.setText("");
                    f1.jpClave.setText("");;
                    f1.txtEmail.requestFocus();
                }
            public static Usuario LeerDatos(LoginMK1 f1)
                {
                    Usuario user =  new Usuario();
                    user.setNameuser(f1.txtEmail.getText());
                    user.setClaveuser(f1.jpClave.getText());
                    return user;
                }
}
