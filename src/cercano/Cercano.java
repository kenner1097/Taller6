package cercano;

/**
 *
 * @author Kenner QM
 */
public class Cercano {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int medio=2;
     int mayor=3;
     int menor=1;
     int cercano=0;
     if (((medio-mayor)==(-1))&&((medio-menor)==(1)))
                    { 
                     System.out.print("el mayor y el menor estan a la maisma distancia que el del medio  ");
                    }  else {      
     if ((medio/mayor)<=1.0)
     {
      cercano=mayor;
     } else
         {
          if ((medio/menor)<=1.0) 
           { 
            cercano=menor;
           } 
         }
    System.out.println(cercano);
    
    // add estoy listo 
    }
  }
}
