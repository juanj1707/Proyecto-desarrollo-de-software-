
/**
 * Recopilar la informacíon del cliente.
 * @author (Juan Jose Muñeton) 
 * @version (2/04/2023)
 */
import java.util.*;

public class Usuario
{
    public void Identificación () {
        System.out.println( "Ingresar Número de Identificación" );
        
        
        
    }
    
    public void Telefono () {
        System.out.println( "Ingresar Número de Telefono" );
    
        
        
    }
    
    public void Dirección () {
        System.out.println( "Ingresar Dirección" );
        
        
        
    }
    
    public void Ciudad () {
        System.out.println( "Ingresar Ciudad" );
        
        
        
    }
    
    public void Departamento () {
        System.out.println( "Ingresar Departamento" );
       
        
        
    }
    
    public void main() {
        Scanner input1 = new Scanner(System.in);
        Identificación();
        int num = input1.nextInt();
        Scanner input2 = new Scanner(System.in);
        Telefono();
        int tel = input2.nextInt();
        Scanner input3 = new Scanner(System.in);
        Dirección();
        String dir = input3.nextLine();
        Scanner input4 = new Scanner(System.in);
        Ciudad();
        String ciu = input4.nextLine();
        Scanner input5 = new Scanner(System.in);
        Departamento();
        String dep = input5.nextLine();
    }
    
}
