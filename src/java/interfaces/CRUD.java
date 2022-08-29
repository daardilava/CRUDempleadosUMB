package interfaces;

import java.util.List;
import modelo.Empleado;

/**
 *
 * @author diego
 */
public interface CRUD {
    public List listar();
    public Empleado list(int id);
    public boolean add(Empleado emp);
    public boolean edit(Empleado emp);
    public boolean eliminar(int id);
}
