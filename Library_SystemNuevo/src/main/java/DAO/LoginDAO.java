/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entidades.Enums.rolType;
import Entidades.user;
import com.Library.BD.ConexionAMYSQL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author COREI5 10TH GEN
 */
public class LoginDAO {
    
     ConexionAMYSQL con = new ConexionAMYSQL();
     
     public Boolean Logu(user usu){
         
         Connection conexion = con.getConecction();
         
         Boolean valid = false;
         try{
         CallableStatement cb = conexion.prepareCall("{call sp_s_login(?,?)}");
         cb.setString("p_usuario", usu.getNombreUsuario());
         cb.setString("p_contrasenia", usu.getContrasenia());
         
            ResultSet resultado = cb.executeQuery();

         int x = 0;
         while (resultado.next()){
         x+=1;
         }
         switch(x){
         
             case 1 : JOptionPane.showMessageDialog(null, "Bienvenido "+usu.getNombreUsuario());
             valid = true;
             break;
             
             case 0 : JOptionPane.showMessageDialog(null, "Lo sentimos, no se ha encontrado el Usuario");
             break;
         }
         
         }catch(SQLException ex){
             JOptionPane.showMessageDialog(null, "error"+ex);
         }
         return valid;
     }
     
         public ArrayList<user> listaUser() {
        ArrayList<user> lista = null;
        try {
            lista = new ArrayList<>();
            Connection conexion = con.getConecction();

            CallableStatement cb = conexion.prepareCall("{call sp_s_usuarios}");
            ResultSet resultado = cb.executeQuery();

            while (resultado.next()) {
                user us = new user();
                us.setIdUsuario(resultado.getInt("id_usuario"));
                us.setNombreUsuario(resultado.getString("nombre_usuario"));
                us.setContrasenia(resultado.getString("contraseña_usuario"));
                us.setRol(rolType.values()[resultado.getInt("rol_usuario")-1]);


                lista.add(us);
            }

        } catch (Exception e) {
            System.out.println("Error al mostrar usuarios" + e);
        }

        return lista;
    }
     
         
         public rolType rolUsuario(String user ){
         rolType rol = rolType.USUARIO;
         user us = new user();
                 try {
            
            Connection conexion = con.getConecction();

            CallableStatement cb = conexion.prepareCall("call sp_s_rol_user(?)");
            cb.setString(1, user);
            ResultSet resultado = cb.executeQuery();
            
            if (resultado.next()) {
                //user us = new user();
                int index = resultado.getInt("rol_usuario");
                if(index==2){
                rol= rolType.ADMINISTRADOR;
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
         
         return rol;
         }
         
         
     
                  public ArrayList<user> listaUsuarios() {
        ArrayList<user> lista = null;
        try {
            lista = new ArrayList<>();
            Connection conexion = con.getConecction();

            CallableStatement cb = conexion.prepareCall("call sp_s_usuarios()");
            ResultSet resultado = cb.executeQuery();
            
            while (resultado.next()) {
                user us = new user();
                us.setIdUsuario(resultado.getInt("id_usuario"));
                us.setNombreUsuario(resultado.getString("nombre_usuario"));
                us.setContrasenia(resultado.getString("contraseña_usuario"));
                us.setRol(rolType.values()[resultado.getInt("rol_usuario")-1]);
                lista.add(us);
            }

        } catch (Exception e) {
            System.out.println("Error al mostrar usuarios: " + e);
        }

        return lista;
    }
     
     
         public void AddUsuario(user usr) {
             
             Connection conexion = con.getConecction();
        try {
            CallableStatement cb = conexion.prepareCall("{call sp_i_usuarios(?,?,?)}");
            cb.setString("p_usuario", usr.getNombreUsuario());
            cb.setString("p_contraseña", usr.getContrasenia());
            cb.setInt("p_rol", usr.getRol().ordinal()+1);
            cb.execute();

            JOptionPane.showMessageDialog(null, "Usuario Agregado correctamente");

            conexion.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error" + ex);
        }
        
        
    }
         
              public void DeleteUser(user usuario) {

        try {
             Connection conexion = con.getConecction();
            CallableStatement cb = conexion.prepareCall("delete from usuarios as a where a.id_usuario=?");
            cb.setInt(1, usuario.getIdUsuario());
            cb.execute();

            JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente");
            

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error" + ex);
        }
    }
}
