
package Procesos;
import Modelos.Cliente;
import Vista.Registro_Cliente;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Procesos_Cliente 
{
        public static void Presentacion(Registro_Cliente f2)
        {
            f2.setTitle("Registro de Cliente");    
            f2.txtIDCliente.setEnabled(true);
            f2.setVisible(true);
        }
        
        public static void Estado1(Registro_Cliente f2)
                {
                    f2.btnR.setEnabled(true);
                    f2.btnC.setEnabled(true);
                    f2.btnA.setEnabled(false);
                    f2.btnE.setEnabled(false);
                }   
            public static void Estado2(Registro_Cliente f2)
                {
                    f2.btnR.setEnabled(false);
                    f2.btnC.setEnabled(true);
                    f2.btnA.setEnabled(true);
                    f2.btnE.setEnabled(true);
                }
        
         public static void LimpiarEntradas(Registro_Cliente f2)
                {
                    f2.txtIDCliente.setText("");
                    f2.txtEdad.setText("");
                    f2.txtNameCliente.setText("");
                    Calendar cal = new GregorianCalendar();
                    f2.Fecha.setCalendar(cal);
                    f2.cbxEstadia.setSelectedIndex(0);
                    f2.cbxPago.setSelectedIndex(0);
                    f2.cbxPlan.setSelectedIndex(0);
                }
        
        public static Cliente LeerDatos(Registro_Cliente f2)
                {
                    Cliente cli =  new Cliente();
                    cli.setEdadcli(Integer.parseInt(f2.txtEdad.getText()));
                    cli.setEstadia(f2.cbxEstadia.getSelectedItem().toString());
                    cli.setHorario(f2.Fecha.getDate());
                    cli.setIDcli(f2.txtIDCliente.getText());
                    cli.setNombrecli(f2.txtNameCliente.getText());
                    cli.setTipopago(f2.cbxPago.getSelectedItem().toString());
                    cli.setTipoplan(f2.cbxPlan.getSelectedItem().toString());
                    return cli;
                }
}
