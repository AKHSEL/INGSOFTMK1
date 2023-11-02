
package Controlador;
import Procesos.Procesos_Cliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelos.Cliente;
import Vista.Registro_Cliente;
import DAO.*;
import Formatos.*;
import java.util.Date;
public class Controlador_Cliente  implements ActionListener 
{
        Registro_Cliente vista;
        DAO_Clientes crud; // c: create r:read  u:update   d=delete    
        Cliente cli;
        
        public Controlador_Cliente(Registro_Cliente f2)
            { 
                vista=f2;
                vista.btnR.addActionListener(this);
                vista.btnA.addActionListener(this);
                vista.btnC.addActionListener(this);
                vista.btnE.addActionListener(this);
                Procesos_Cliente.Presentacion(f2);
                ActualizarForma();
            }//fin constructor
        
        void ActualizarForma()
            {
                crud = new DAO_Clientes();
                crud.MostrarCliente(vista.tblclient,"select * from Clientes");
                Procesos_Cliente.LimpiarEntradas(vista);
            }

    @Override
    public void actionPerformed(ActionEvent e) 
            {
               if(e.getSource()== vista.btnR)
                    {
                        cli=Procesos_Cliente.LeerDatos(vista);
                        crud=new DAO_Clientes();
                        crud.InsertarCliente(cli);
                        ActualizarForma();
                    } 
               if(e.getSource()== vista.btnC)
                    {
                        int IDcli = Mensajes.M2("Ingrese el ID del Cliente a buscar!!!!");
                        crud = new DAO_Clientes();
                        cli=crud.ConsultarRegistro(IDcli);
                        if(cli==null)
                            {
                                Mensajes.M1("El ID "+IDcli+" no existe en la tabla categorias...");
                            }
                        else
                            {
                                vista.txtIDCliente.setText(cli.getIDcli());
                                vista.txtEdad.setText(Integer.toString(cli.getEdadcli()));
                                vista.txtNameCliente.setText(cli.getNombrecli());
                                vista.cbxEstadia.setSelectedItem(cli.getEstadia());
                                vista.Fecha.setDate(cli.getHorario());
                                vista.cbxPago.setSelectedItem(cli.getTipopago());
                                vista.cbxPlan.setSelectedItem(cli.getTipoplan());
                                Procesos_Cliente.Estado2(vista);
                            }
                        
                         if(e.getSource()== vista.btnA)
                            {
                                cli = Procesos_Cliente.LeerDatos(vista);
                                cli.setIDcli(vista.txtIDCliente.getText());
                                crud = new DAO_Clientes();
                                crud.ActualizarRegistro(cli);
                                ActualizarForma();
                            }
                         if(e.getSource()== vista.btnE)
                    {
                        int respuesta = Mensajes.M3("Confirmar!!!!","¿Desea eliminar el registro?");
                        if(respuesta==0)
                            {
                                int idcli = Integer.parseInt(vista.txtIDCliente.getText());
                                crud = new DAO_Clientes();
                                crud.EliminarRegistro(idcli);
                                ActualizarForma();
                            }
                    }
                
            }
            }
        
}
