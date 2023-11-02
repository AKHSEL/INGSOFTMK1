
package Modelos;


public class Nutricionista 
{
    private String IDnut;
    private String nombrenut;
    private int edadnut;
    private String GradoAcademico;
    private String indicador;

    //Getter and Setter
    public String getIDnut() {return IDnut;}
    public void setIDnut(String IDnut) {this.IDnut = IDnut;}
    public String getNombrenut() {return nombrenut;}
    public void setNombrenut(String nombrenut) {this.nombrenut = nombrenut;}
    public int getEdadnut() {return edadnut;}
    public void setEdadnut(int edadnut) {this.edadnut = edadnut;}
    public String getGradoAcademico() {return GradoAcademico;}
    public void setGradoAcademico(String GradoAcademico) {this.GradoAcademico = GradoAcademico;}
    public String getIndicador() {return indicador;}
    public void setIndicador(String indicador) {this.indicador = indicador;}
    
   
    public Object[]RegistroUser(int n)
    {
        Object[] line={n,IDnut,nombrenut,edadnut,GradoAcademico};
        return line;
    }
}
