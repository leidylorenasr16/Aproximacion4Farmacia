
/**
 * Write a description of class Farmacia here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Farmacia
{
    private final String nit;
    private String nombreFarmacia;
    private String direccion;
    private Cliente[] cliente;
    private int numClientes;
    
    public Farmacia(String nit,String nombreFarmacia,String direccion){
        if(nit != null) this.nit = nit;
        else this.nit = ""; 
        setNombreFarmacia(nombreFarmacia);
        setDireccion(direccion);        
        cliente = new Cliente[50];
        numClientes = 0;
    }
    
    public String getNit(){
        return nit;
    }
    
    public String getNombreFarmacia(){
        return nombreFarmacia;
    }
    public void setNombreFarmacia(String nombreFarmacia){
        if(nombreFarmacia != null){
            this.nombreFarmacia = nombreFarmacia;
        }else{
            this.nombreFarmacia = "";
        }        
    }
    
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        if(direccion != null){
            this.direccion = direccion;
        }else{
            this.direccion = "";
        }        
    }
    
    public int getNumClientes(){
        return numClientes;
    }
    
    public double calcularPromedioCompras(){
        double promedio = 0;
        for(int i = 0; i < numClientes; i++){
            promedio = promedio + cliente[i].calcularPromedio() / numClientes;
        }
        return promedio;
    }
    
    public void adicionarCliente(String identificacion, String nombre, String sucursal, double compra1, double compra2, double compra3){
        Cliente e = new Cliente(identificacion, nombre, sucursal, compra1, compra2, compra3);
        cliente[numClientes] = e;
        numClientes++;
    }
}
