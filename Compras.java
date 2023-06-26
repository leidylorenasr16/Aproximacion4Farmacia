import java.util.Scanner;

public class Compras
{
public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        int numClientes;
        Farmacia miFarmacia = new Farmacia("123456","Farmacia Balmoral","Fusa");
        String identificacion, nombre, sucursal;
        double compra1, compra2, compra3;
        double promedio = 0;
        
        System.out.println("Digite el numero de clientes: ");
        numClientes = sc.nextInt();
        
        for(int i = 0; i < numClientes; i++){
            System.out.println("Digite la Identificacion del cliente: ");
            identificacion = sc.next();
            System.out.println("Digite el nombre del cliente: ");
            nombre = sc.next();
            System.out.println("Digite la sucursal del cliente: ");
            sucursal = sc.next();
            System.out.println("Digite primera compra del cliente: ");
            compra1 = sc.nextDouble();
            System.out.println("Digite segunda compra del cliente: ");
            compra2 = sc.nextDouble();            
            System.out.println("Digite tercera compra del cliente: ");
            compra3 = sc.nextDouble();
            miFarmacia.adicionarCliente(identificacion, nombre, sucursal, compra1, compra2, compra3);
        }
        
        promedio = miFarmacia.calcularPromedioCompras();        
        System.out.println("\n El promedio de compras es: " + promedio); 
    }
}
