package com.exercise.database.addressbook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DataBaseConnection {

    
    private int id;
    private int acctualId;
    private List<String> ids;
    private List<String> firstNames;
    private List<String> lastNames;
    private List<String> numbers;
    
    public DataBaseConnection() {
        
    }
    
    public void addContact(int id, String firstName, String lastName, String number) {

        String sqlQuery = "INSERT INTO address_book "  
                                +"(id, first_name, last_name, number) " 
                                +"values ('" + id + "', '" + firstName + "', '" + lastName + "', '" + number + "' )";
        
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/address_book", "postgres", "admin");
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.executeQuery();

        }catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void getAllContatcs() { 
        
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/address_book", "postgres", "admin");
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM address_book ORDER BY id");
            ResultSet resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1) + "                   " + resultSet.getString(2) + "                    " + resultSet.getString(3) + "                     " + resultSet.getString(4));
            }
        }catch (Exception e) {
            
        }
    }
        
    public List<String> getFirstNames() {
        
        try {
            firstNames = new ArrayList<String>();
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/address_book", "postgres", "admin");
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT first_name FROM address_book");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                firstNames.add(resultSet.getString(1));
            }
            return firstNames;

        }catch (Exception e) {

        }
        return firstNames;
    }

    public int getFirstFreeIdNumber () {
            
            try {
                Class.forName("org.postgresql.Driver");
                Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/address_book", "postgres", "admin");
                PreparedStatement preparedStatement = connection.prepareStatement("SELECT id FROM address_book ORDER BY id");
                ResultSet resultSet = preparedStatement.executeQuery();
                
            while (resultSet.next()) {
                acctualId = Integer.parseInt(resultSet.getString(1));
                if (id + 1 != acctualId) {
                    return id+1;
                }
                id++;
            }
            return acctualId+1;
        }catch (Exception e) { 
            System.out.println(e);
            }
            return 0;
        }
}
