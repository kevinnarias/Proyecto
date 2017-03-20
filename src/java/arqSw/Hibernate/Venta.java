package arqSw.Hibernate;
// Generated 19/03/2017 10:22:30 PM by Hibernate Tools 3.6.0



/**
 * Venta generated by hbm2java
 */
public class Venta  implements java.io.Serializable {


     private Integer idVenta;
     private Cliente cliente;
     private String fecha;
     private int camisetaIdCamiseta;
     private Camiseta camiseta;

    public Venta() {
    }

	
    public Venta(Cliente cliente, int camisetaIdCamiseta) {
        this.cliente = cliente;
        this.camisetaIdCamiseta = camisetaIdCamiseta;
    }
    public Venta(Cliente cliente, String fecha, int camisetaIdCamiseta, Camiseta camiseta) {
       this.cliente = cliente;
       this.fecha = fecha;
       this.camisetaIdCamiseta = camisetaIdCamiseta;
       this.camiseta = camiseta;
    }
   
    public Integer getIdVenta() {
        return this.idVenta;
    }
    
    public void setIdVenta(Integer idVenta) {
        this.idVenta = idVenta;
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public String getFecha() {
        return this.fecha;
    }
    
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public int getCamisetaIdCamiseta() {
        return this.camisetaIdCamiseta;
    }
    
    public void setCamisetaIdCamiseta(int camisetaIdCamiseta) {
        this.camisetaIdCamiseta = camisetaIdCamiseta;
    }
    public Camiseta getCamiseta() {
        return this.camiseta;
    }
    
    public void setCamiseta(Camiseta camiseta) {
        this.camiseta = camiseta;
    }




}


