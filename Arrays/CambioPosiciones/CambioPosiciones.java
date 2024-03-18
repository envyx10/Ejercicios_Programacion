/**
 * @author Antonio J.Sánchez 
 * @author José David Quero
 */
public class CambioPosiciones {
    
    private static final int SIZE =  10 ;

    public static void main(String[] args) {
        
        //{ 1, 28, 32, 112, 300, 1, 7, 0, 22, 24 } 
        int[] vector = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 } ;
        int pos = 0;

        // MUESTRA EL VECTOR
        System.out.print("VECTOR: ");
        escribirVector(vector) ;

        // HACE QUE SE DESPLAZA EL VECTOR 1 POSICION A LA DERECHA
        desplazarDerecha(vector) ;

        // MUESTRA EL DESPLAZAMIENTO
        System.out.print("VECTOR DESPLAZADO: ");
        escribirVector(vector) ;
 
        //DES. TANTAS POSICIONES COMO QUERAMOS
        System.out.println("Cuantas posiciones quieres desplazar: ");
        pos = Integer.parseInt(System.console().readLine());

        System.out.println("VECTOR DESPLAZADO: ");
        desplazarPosicion(vector, pos);
        escribirVector(vector);

    }

    /**     
     * @param vector
     */
    private static void escribirVector(int[] vector) {

        for(int i=0; i < SIZE; i++) {
            System.out.printf("%d  ", vector[i]);
        }

        System.out.println();
    }

    /** 
     * Funcion desplaza a la derecha.
     * @param vector
     * @param pos
     */
    private static void desplazarDerecha(int[] vector) { 

        // COGE LA LONGUITUD DEL ARRAY Y LE RESTA 1 ya que el intervalo es de 0 a 9 ( que son 10 )
        int temp = vector[SIZE-1] ;

        // DE FINAL A PRINCIPIO
        for(int i=SIZE-1; i > 0; i--) {
            vector[i] = vector[i-1] ;   
        }
      
        // CON ESTO LLEVO EL ULTIMO VALOR A LA PRIMERA POSICIÓN
        vector[0] = temp ;

    }

    /** 
     * Funcion desplaza a la derecha.
     * @param vector
     * @param pos
     */
    private static void desplazarPosicion(int[] vector, int pos) { 

        int temp;
    
        // ESTE FOR REPITE EL CAMBIO DE POSICION TANTAS VECES COMO EL POS QUIERA
        for( int x = 0; x < pos-1 ; x++){

            temp = vector[SIZE-1] ;

            // DE FINAL A PRINCIPIO
            for(int i=SIZE-1; i > 0; i--) {
                vector[i] = vector[i-1];  
            }
         
            vector[0] = temp ;
    
        }
    
    }





}