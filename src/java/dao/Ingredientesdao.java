/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Ingredientes;

/**
 *
 * @author Usuario
 */
public class Ingredientesdao {
    public int ingresarIngredientes(Ingredientes ingredientes) throws ClassNotFoundException {
        String INSERT_INGREDIENTES_SQL = "INSERT INTO INGREDIENTES" + " (id_ingrediente, nombre_ingrediente, cantidad, unidad_de_medida) VALUES " + "(? , ?, ?, ?);";
        
        int result= 0;
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        try 
            (Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/recetario_luzdelicias","root","Azabache1#");
                // create a statement using connection object           
                PreparedStatement preparedStatement = conexion.prepareStatement(INSERT_INGREDIENTES_SQL)) {
                preparedStatement.setString(1, ingredientes.getId());
                preparedStatement.setString(2, ingredientes.getNombre());
                preparedStatement.setString(3, ingredientes.getCantidad());
                preparedStatement.setString(4, ingredientes.getUnidad());
                
                System.out.println(preparedStatement);
                // execute the query or update the query 
                result= preparedStatement.executeUpdate();
            } catch (SQLException e) {
                // process sql exception
                e.printStackTrace();
            }
        return result;
        
        
    }
}
