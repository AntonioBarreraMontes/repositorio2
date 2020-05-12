
package ud8_proyecto;

import java.time.LocalDate;
import java.util.Objects;

public class Futbolista {
    private String dorsal;
    private String nombre;
    private String demarcacion;

    
    public Futbolista(String dorsal, String nombre, String demarcacion) {
        this.dorsal = dorsal;
        this.nombre = nombre;
        this.demarcacion = demarcacion;
    }

    
    
    public String getDorsal() {
        return dorsal;
    }
    public void setDorsal(String dorsal) {
        this.dorsal = dorsal;
    }
    
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public String getDemarcacion() {
        return demarcacion;
    }
    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Futbolista other = (Futbolista) obj;
        if (!Objects.equals(this.dorsal, other.dorsal)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.demarcacion, other.demarcacion)) {
            return false;
        }
        return true;
    }

    

    @Override
    public String toString() {
        return  "dorsal: " + dorsal + ", nombre: " + nombre + ", demarcacion: " + demarcacion;
    }
    
    
       
    
    
}
