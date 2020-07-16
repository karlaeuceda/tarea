
package helpers;

/**
 * @author KARLA
 */
public class Ciudadano {
    
    public String nombre;
    public String edad;
    public String año_de_experiencia;
    
    private final String Pais1,Pais2,Pais3;
    
    public Ciudadano(String nombre, String edad, String año_de_experiencia, String Pais)
    {
        this.nombre=nombre;
        this.edad=edad;
        this.año_de_experiencia=año_de_experiencia;
        this.Pais1=Pais;
        this.Pais2=Pais;
        this.Pais3=Pais;
    }
    
    public void imprimirnombre()
    {
        System.out.println(nombre);
    }
    
    public void imprimiredad()
    {
        System.out.println(edad);
    }
    
    public void imprimiraño_de_experiencia()
    {
        System.out.println(año_de_experiencia);
    }
    
    public void imprimirPais1()
    {
        System.out.println("\nHONDURAS");
    }
    
    public void imprimirPais2()
    {
        System.out.println("GUATEMALA");
    }
    
    public void imprimirPais3()
    {
        System.out.println("EL SALVADOR");
    }

}
