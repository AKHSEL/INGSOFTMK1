
package Modelos;

import java.util.Date;


public class Cliente 
{
    // Cliente --> cli
    private String IDcli;
    private String IDtrain;
    private String IDnutr;
    private String nombrecli;
    private int edadcli;
    private String tipoplan;
    private String tipopago;
    private String estadia;
    private Date inicio; //Comienzo de la membresia
    private String indicador;
    
    //Getter and Setter
    public String getIDcli() {return IDcli;}
    public void setIDcli(String IDcli) {this.IDcli = IDcli;}
    public String getIDtrain() {return IDtrain;}
    public void setIDtrain(String IDtrain) {this.IDtrain = IDtrain;}
    public String getIDnutr() {return IDnutr;}
    public void setIDnutr(String IDnutr) {this.IDnutr = IDnutr;}
    public String getNombrecli() {return nombrecli;}
    public void setNombrecli(String nombrecli) {this.nombrecli = nombrecli;}
    public int getEdadcli() {return edadcli;}
    public void setEdadcli(int edadcli) {this.edadcli = edadcli;}
    public String getTipoplan() {return tipoplan;}
    public void setTipoplan(String tipoplan) {this.tipoplan = tipoplan;}
    public String getTipopago() {return tipopago;}
    public void setTipopago(String tipopago) {this.tipopago = tipopago;}
    public String getEstadia() {return estadia;}
    public void setEstadia(String estadia) {this.estadia = estadia;}
    public Date getHorario() {return inicio;}
    public void setHorario(Date horario) {this.inicio = horario;}
    public String getIndicador() {return indicador;}
    public void setIndicador(String indicador) {this.indicador = indicador;}
    
    
    public Object[]RegistroCliente(int n)
    {
        Object[] line={n,IDcli,IDtrain,IDnutr,nombrecli,edadcli,tipoplan,tipopago,estadia,inicio};
        return line;
    }
   
}
