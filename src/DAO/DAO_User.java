
package DAO;
import Modelos.*;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Principal.*;
import javax.swing.JOptionPane;

public class DAO_User extends ConectarBD
{
    public DAO_User(){}
    
     public boolean IniciarSesion(String usuario, String pass)
    {
       boolean inicio=false;
       Usuario user= new Usuario();

        try{
             rs = st.executeQuery("select IDUser,NombreUser,ClaveUser from Usuario;");
             while(rs.next())
                {  if(rs.getString(2).equals(usuario) && rs.getString(3).equals(pass))
                    {
                        user.setIDuser(rs.getInt(1));
                        user.setNameuser(rs.getString(2));
                        user.setClaveuser(rs.getString(3));  
                        inicio=true;
                        System.out.println(user.getNameuser() + " " + user.getClaveuser() );
                        conexion.close();
                        break;
                    }

                }//Fin While   

        }catch(Exception e)
            {   
                JOptionPane.showMessageDialog(null,"ERROR NO SE PUEDE CARGAR EL LOGEO..."+e);   
            }    
                 return inicio;
    }
}
