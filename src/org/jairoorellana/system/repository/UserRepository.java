package org.jairoorellana.system.repository;

import org.jairoorellana.system.model.User;
import java.sql.CallableStatement;
import org.jairoorellana.system.config.ConexionDB;

public class UserRepository implements UserInterface {

//Atributos
    private CallableStatement callSP;
    private ConexionDB conexionDB = ConexionDB.getInstanciaConexionDB();
    
    @Override
    public void create(User user) {
        try {
            callSP = conexionDB.getConnection().prepareCall("{call sp_crear_users(?, ?, ?, ?, ?)}");
            callSP.setString(1, string1);
            callSP.setString(2, string1);
            callSP.setString(3, string1);
            callSP.setString(4, string1);
            callSP.setString(5, string1);
            
            
        } catch (Exception e) {
        }
    }
}
