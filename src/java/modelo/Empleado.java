package modelo;

import javax.persistence.metamodel.SingularAttribute;
import org.apache.cxf.rs.security.oauth2.common.UserSubject;

/**
 *
 * @author diego
 */
public class Empleado {

    private int id;
    private String name;
    private String area;

    public Empleado() {
    }

    public Empleado(String name, String area) {
        this.name = name;
        this.area = area;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }    
    
}
