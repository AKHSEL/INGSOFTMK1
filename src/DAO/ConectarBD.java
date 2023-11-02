package DAO;
import java.sql.*;
import javax.swing.JOptionPane;

public class ConectarBD implements Parametros

{
    public Connection conexion;
        Statement st;
        ResultSet rs;
        PreparedStatement ps;
        ResultSetMetaData mdata;
        public ConectarBD()
            {
                try{
                        Class.forName(DRIVER);
                        conexion = DriverManager.getConnection(RUTA,USUARIO,CLAVE);
                        st = conexion.createStatement();
                }catch(Exception ex)
                    {
                        JOptionPane.showMessageDialog(null,"ERROR no se puede conectar a la BD..."+ex);
                    }
            }

}
