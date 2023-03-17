package com.buster.blockbuster.repository.impl;

import com.buster.blockbuster.model.Client;
import com.buster.blockbuster.repository.IDao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClientDaoH2 implements IDao<Client> {

    private final static String DB_JDBC_DRIVER = "org.h2.Driver";
    private final static String DB_URL="jdbc:h2:~/blockbuster;INIT=RUNSCRIPT FROM 'create.sql'";
    private final static String DB_USER="sa";
    private final static String DB_PASSWORD = "";




    @Override
    public Client save(Client client){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);

            preparedStatement = connection.prepareStatement("INSERT INTO client(name,email) VALUES(?,?)", Statement.RETURN_GENERATED_KEYS);

            preparedStatement.setString(1, client.getName());
            preparedStatement.setString(2, client.getEmail());
            //updatea la linea 30 y 31 cargando la data
            preparedStatement.executeUpdate();
            ResultSet keys = preparedStatement.getGeneratedKeys();
            if(keys.next()) client.setId(keys.getInt(1));

            preparedStatement.close();
        } catch(SQLException | ClassNotFoundException throwables){
            throwables.printStackTrace();
        }
        return client;
    }

    @Override
    public Client searchByName(String name) {
        return null;
    }

    @Override
    public Client searchById(Integer id) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public List<Client> searchAll() {
        return null;
    }

    @Override
    public Client update(Client client) {
        return null;
    }
}
