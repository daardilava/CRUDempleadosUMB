package modeloDAO;

import config.Conexion;
import interfaces.CRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Empleado;
import org.apache.openejb.util.Connect;

/**
 *
 * @author diego
 */
public class EmpleadoDAO implements CRUD{
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Empleado e = new Empleado();

    @Override
    public List listar() {
        ArrayList<Empleado>list=new ArrayList<>();
        String sql="select * from empleados";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Empleado emp = new Empleado();
                emp.setId(rs.getInt("Id"));
                emp.setName(rs.getString("name"));
                emp.setArea(rs.getString("area"));
                list.add(emp);
            }
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public Empleado list(int id) {
        String sql="select * from empleados where Id="+id;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                e.setId(rs.getInt("Id"));
                e.setName(rs.getString("name"));
                e.setArea(rs.getString("area"));
            }
        } catch (Exception e) {
        }
        return e;
    }

    @Override
    public boolean add(Empleado emp) {
        String sql="insert into empleados(Name, Area)values('"+emp.getName()+"','"+emp.getArea()+"')";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean edit(Empleado emp) {
        String sql="update empleados set name='"+emp.getName()+"',area='"+emp.getArea()+"'where Id="+emp.getId();
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        
        return false;
    }
    
    @Override
    public boolean eliminar(int id){
        String sql="delete from empleados where Id="+id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }  
}
