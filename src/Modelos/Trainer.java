
package Modelos;

import java.text.DateFormat;
import java.util.Date;


public class Trainer 
{
   //Trainer --> T
    
    private String IDT;
    private String nameT;
    private int edadT;
    private int añosExp;
    private String espc;
    private Date horario;
    private String indicador;

    //Getter and Setter
    public String getIDT() {return IDT;}
    public void setIDT(String IDT) {this.IDT = IDT;}
    public String getNameT() {return nameT;}
    public void setNameT(String nameT) {this.nameT = nameT;}
    public int getEdadT() {return edadT;}
    public void setEdadT(int edadT) {this.edadT = edadT;}
    public int getAñosExp() {return añosExp;}
    public void setAñosExp(int añosExp) {this.añosExp = añosExp;}
    public String getEspc() {return espc;}
    public void setEspc(String espc) {this.espc = espc;}
    public Date getHorario() { return horario;}
    public void setHorario(Date horario) {this.horario = horario;}
    public String getIndicador() {return indicador;}
    public void setIndicador(String indicador) {this.indicador = indicador;}
    
    
    public Object[]RegistroTrainer(int n)
    {
        Object[] line={n,IDT,nameT,edadT,añosExp,espc,horario};
        return line;
    }    
    
   
   
}
