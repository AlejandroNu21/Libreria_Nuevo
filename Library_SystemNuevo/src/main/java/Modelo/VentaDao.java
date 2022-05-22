package Modelo;

import com.Library.BD.ConexionAMYSQL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class VentaDao {

    ConexionAMYSQL con = new ConexionAMYSQL();
    Connection conexion = con.getConecction();


    public ArrayList<Venta> ListaVenta() {
        ArrayList<Venta> lista = null;
        try {
            lista = new ArrayList<Venta>();

            CallableStatement cb = conexion.prepareCall("{call SP_S_VENTAS()}");
            ResultSet resultado = cb.executeQuery();

            while (resultado.next()) {
                Venta cl = new Venta();
                cl.setIdVentas(resultado.getInt("idVentas"));
                cl.setIdCliente(resultado.getInt("idCliente"));
                cl.setFecha_Venta(resultado.getString("Fecha_Venta"));
                cl.setTotal(resultado.getDouble("Total"));

                lista.add(cl);
            }

        } catch (Exception e) {
            System.out.println("Error " + e);
        }

        return lista;
    }

    public void AddVentas(Venta cl) {

        try {
            CallableStatement cb = conexion.prepareCall("{call SP_I_VENTAS(?,?,?,?,?)}");
            cb.setInt("PidVentas", cl.getIdVentas());
            cb.setInt("PidCliente", cl.getIdCliente());
            cb.setString("PFecha_Venta", cl.getFecha_Venta());
            cb.setString("PFecha_Venta", cl.getFecha_Venta());

            cb.execute();

            JOptionPane.showMessageDialog(null, "Venta Agregada");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error" + ex);
        }
       
    }
}
