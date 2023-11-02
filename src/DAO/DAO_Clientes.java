
package DAO;
import Modelos.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class DAO_Clientes extends ConectarBD
{
     public DAO_Clientes(){}
        //Metdo para mostrar los datos en la Tabla con respecto a los Productos
        public void MostrarCliente(JTable tblclient,String consulta)
            {
    
                String titulos[]={"Nro","ID Cliente","Nombre Cliente","Edad","Tipo Plan",
                               "Tipo Pago","Estadia","Horario"};

                DefaultTableModel modelo =  new DefaultTableModel(null,titulos);
                tblclient.setModel(modelo);
                int cantreg=0;
                try{
                     rs = st.executeQuery(consulta);
                     while(rs.next())
                        {
                            cantreg++;
                            Cliente cli = new Cliente();
                            cli.setIDcli(rs.getString(1));
                            cli.setNombrecli(rs.getString(2));
                            cli.setEdadcli(rs.getInt(3));
                            cli.setTipoplan(rs.getString(4));
                            cli.setTipopago(rs.getString(5));
                            cli.setEstadia(rs.getString(6));
                            cli.setHorario(rs.getDate(7));
                            modelo.addRow(cli.RegistroCliente(cantreg));
                        }//Fin While
                    conexion.close();
                }catch(Exception e)
                    {    JOptionPane.showMessageDialog(null,"ERROR NO SE PUEDE MOSTRAR LA TABLA-PRODUCTO..."+e);   }    
            }//Fin Metodo
        public void InsertarCliente(Cliente client)
            {
                try{
                    ps = conexion.prepareStatement("insert into" +
                   " Clientes(IDCli, NombreCli, EdadCli, TipoPlan, TipoPago, Estadia," +
                   " Horario, indicador) values (?,?,?,?,?,?,?,'S');");
                    ps.setString(1,client.getIDcli());
                    ps.setString(2,client.getNombrecli());
                    ps.setInt(3,client.getEdadcli());
                    ps.setString(4, client.getTipopago());
                    ps.setString(5,client.getTipopago() );
                    ps.setString(6,client.getEstadia());
                    SimpleDateFormat sf =  new SimpleDateFormat("yyyy-MM-dd");
                    ps.setString(7,sf.format(client.getHorario()));
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Cliente registrado correctamente...");

                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null,"ERROR NO SE PUEDE REGISTRAR EL CLIENTE..."+ex);
                }
        }//Fin Metodo   
        
        //Metodo Buscar mediante ID-Productos
        public Cliente ConsultarRegistro(int idcli)
            {
                Cliente cli = null;
                try{
                    rs = st.executeQuery("Nro,IDCli,NombreCli ,EdadCli ,Tipo Plan," +
                                     "Tipo Pago,Estadia,Horario" +  "from Clientes where indicador='S' and idproduct="+idcli+";");
                    if(rs.next())
                        {
                            cli = new Cliente();
                            
                            cli.setIDcli((rs.getString(1)));
                            //cli.setIDtrain((rs.getString(2)));
                           // cli.setIDnutr((rs.getString(3)));
                            cli.setNombrecli((rs.getString(2)));
                            cli.setEdadcli((rs.getInt(3)));
                            cli.setTipoplan((rs.getString(4)));
                            cli.setTipopago((rs.getString(5)));
                            cli.setEstadia((rs.getString(6)));
                            cli.setHorario((rs.getDate(7)));
                        }
                    rs.close();
                }catch(Exception e)
                    {  JOptionPane.showMessageDialog(null,"ERROR no se puede consultar el registro ..."+e);   }
                return cli;
            }
        
        //Metodo Actualizar Registro de la Tabla-Categoria mediante el ID-Proveedor
        public void ActualizarRegistro(Cliente cli)
            {
                try{
                    ps = conexion.prepareStatement("update Clientes set  NombreCli=?,EdadCli==?,"
                            + "TipoPlan=?, Tipo Pago=?, Estadia=?,Horario=? where IDCli=?;");
                   // ps.setString(1, cli.getIDtrain());
                    //ps.setString(2, cli.getIDnutr());
                    ps.setString(1, cli.getNombrecli());
                    ps.setInt(2, cli.getEdadcli());
                    ps.setString(3, cli.getTipoplan());
                    ps.setString(4, cli.getTipopago());
                    ps.setString(5, cli.getEstadia());
                    SimpleDateFormat sf =  new SimpleDateFormat("yyyy-MM-dd");
                    ps.setString(6,sf.format(cli.getHorario()));
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Registro actualizado correctamente...");
                    ps.close();
                }catch(Exception  ex)
                    {   JOptionPane.showMessageDialog(null,"ERROR NO SE PUEDE ACTUALIZAR EL REGISTRO..."+ex);  }
            }
        
        //Metodo que Elimina un Registro mediante su ID-Categoria
        public void EliminarRegistro(int IDCli)
            {
                try{
                    ps = conexion.prepareStatement("update Clientes set indicador='N' where IDcli=?;");
                    ps.setInt(1,IDCli);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Registro eliminado de la tabla Clientes");
                    ps.close();
                }catch(Exception ex)
                    {   JOptionPane.showMessageDialog(null,"ERROR NO SE PUEDE ELIMINAR EL REGISTRO..."+ex); }
            }
}
