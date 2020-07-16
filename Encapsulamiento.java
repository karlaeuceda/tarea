
package encapsulamiento;

import helpers.Ciudadano;

/**
 * @author KARLA
 */
public class Encapsulamiento {

    public static void main(String[] args) {
        
        
        Ciudadano ciudadano = new Ciudadano("Karla", "23", "5", "PAIS");
        
        ciudadano.imprimirnombre();
        ciudadano.imprimiredad();
        ciudadano.imprimiraño_de_experiencia();
        ciudadano.imprimirPais1();
        ciudadano.imprimirPais2();
        ciudadano.imprimirPais3();
        
       System.out.println("\n\nNOMBRE DE LOS PAISES Y SUS PRESIDENTES\n");
       System.out.println("HONDURAS----------JUAN ORLANDO HERNANDEZ");
       System.out.println("GUATEMALA---------ALEJANDRO GIAMMATTEI");
       System.out.println("EL SALVADOR-------NAYIB BUKELE");
    }
    
}
