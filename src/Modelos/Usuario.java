
package Modelos;


public class Usuario 
{
    private int IDuser;
    private String nameuser;
    private String claveuser;
    private String indicador;

    //Getter and Setter
    public int getIDuser() {return IDuser;}
    public void setIDuser(int IDuser) {this.IDuser = IDuser;}
    public String getNameuser() {return nameuser;}
    public void setNameuser(String nameuser) {this.nameuser = nameuser;}
    public String getClaveuser() {return claveuser;}
    public void setClaveuser(String claveuser) {this.claveuser = claveuser;}
    public String getIndicador() { return indicador;}
    public void setIndicador(String indicador) {this.indicador = indicador;}
    
    
    public Object[]RegistroUser(int n)
    {
        Object[] line={n,IDuser,nameuser,claveuser};
        return line;
    }
   
   
}
