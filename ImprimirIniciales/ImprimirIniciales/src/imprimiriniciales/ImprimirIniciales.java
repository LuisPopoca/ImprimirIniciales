package imprimiriniciales;
import java.util.Scanner;

/**
 *
 * @author maryse
 *
 * Scanner Este programa imprime las iniciales del nombre introducido por el
 * usuario.
 *
 */
public class ImprimirIniciales {
    Scanner stdIn = new Scanner(System.in);


    public static void main(String[] args) {
                String nombre=""; // nombre
                String apellido=""; // apellido
        
            ImprimirIniciales in = new ImprimirIniciales();
            in . In(nombre, apellido);
        


    }
    
    public void In(String nombre, String apellido){
        System.out.print("Introduzca su nombre y primer apellido separados por un espacio: ");
        nombre = stdIn.next();
        apellido = stdIn.next();
        System.out.println("Sus iniciales son " + nombre.charAt(0) + apellido.charAt(0) + ".");
    }

}
