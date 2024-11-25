package co.edu.ue.DataCredito.domain;

import jakarta.persistence.*; 
import java.sql.Date;

@Entity 
@Table(name = "datacredito")
public class DataCredito {
    @Id 
    @Column 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private int id_datacredito; 
     
    @Column 
    private String nombre; 
     
    @Column 
    private int puntaje;
    
    ///////////////////////////////////////////////

    public int getId_datacredito() {
        return id_datacredito;
    }

    public void setId_datacredito(int id_datacredito) {
        this.id_datacredito = id_datacredito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    
}
