package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

        try{
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/pizzas", "nestor", "nestor");

            Statement sentencia = connection.createStatement();
            String sql="CREATE TABLE if not exists pizza  (\n" +
                    "                                      id SERIAL PRIMARY KEY,\n" +
                    "                                      nombre VARCHAR(20),\n" +
                    "                                      salsa varchar(20),\n" +
                    "                                      ingrediente1 varchar(20),\n" +
                    "                                      ingrediente2 varchar(20),\n" +
                    "                                      ingrediente3 varchar(20),\n" +
                    "                                      precio numeric(4,2),\n" +
                    "                                      urlimagen varchar(100)\n" +
                    ");";
             sentencia.executeUpdate(sql);

            String insert = "INSERT INTO pizza (nombre, salsa, ingrediente1, ingrediente2, ingrediente3, precio, urlimagen) VALUES ('Pizza Margarita', 'Tomate', 'Mozzarella', 'Albahaca', 'Cherris', 8.99, 'https://i.imgur.com/5rDq2QK.jpeg') ;\n" +
                    "\n" +
                    "INSERT INTO pizza (nombre, salsa, ingrediente1, ingrediente2, ingrediente3, precio, urlimagen) VALUES ('Pizza Pepperoni', 'Tomate', 'Mozzarella', 'Pepperoni', 'Aceite', 9.99, 'https://i.imgur.com/uYxR9fO.jpeg') ;\n" +
                    "\n" +
                    "INSERT INTO pizza (nombre, salsa, ingrediente1, ingrediente2, ingrediente3, precio, urlimagen) VALUES ('Pizza Hawaiana', 'Tomate', 'Mozzarella', 'Jamón', 'Piña', 10.99, 'https://i.imgur.com/5IyEn9g.jpeg');" +
                    "INSERT INTO pizza (nombre, salsa, ingrediente1, ingrediente2, ingrediente3, precio, urlimagen) VALUES ('Pizza Vegetariana', 'Tomate', 'Pimiento', 'Cebolla', 'Champiñones', 10.49, 'https://i.imgur.com/3Tpbx3F.jpeg') ;\n" +
                    "\n" +
                    "INSERT INTO pizza (nombre, salsa, ingrediente1, ingrediente2, ingrediente3, precio, urlimagen) VALUES ('Pizza Caprichosa', 'Tomate', 'Jamón', 'Champiñones', 'Aceitunas', 10.99, 'https://i.imgur.com/DFm3SrC.jpeg') ;\n" +
                    "\n" +
                    "INSERT INTO pizza (nombre, salsa, ingrediente1, ingrediente2, ingrediente3, precio, urlimagen) VALUES ('Pizza Napolitana', 'Tomate', 'Anchoas', 'Aceitunas', 'Orégano', 9.49, 'https://i.imgur.com/2z0CESF.jpeg'); \n" +
                    "\n" +
                    "INSERT INTO pizza (nombre, salsa, ingrediente1, ingrediente2, ingrediente3, precio, urlimagen) VALUES ('Pizza Mexicana', 'Tomate', 'Carne picada', 'Chile', 'Maíz', 11.49, 'https://i.imgur.com/0euXaxZ.jpeg') ;\n" +
                    "\n" +
                    "INSERT INTO pizza (nombre, salsa, ingrediente1, ingrediente2, ingrediente3, precio, urlimagen) VALUES ('Pizza Carbonara', 'Blanca', 'Bacon', 'Salsa carbonara', 'Queso parmesano', 12.49, 'https://i.imgur.com/UvLBWak.jpeg') ;\n" +
                    "\n" +
                    "INSERT INTO pizza (nombre, salsa, ingrediente1, ingrediente2, ingrediente3, precio, urlimagen) VALUES ('Pizza Marinera', 'Tomate', 'Mariscos variados', 'Ajo', 'Perejil', 13.99, 'https://i.imgur.com/BAyRnap.jpeg') ;";

            sentencia.executeUpdate(insert);

            String empleado = "CREATE TABLE if NOT EXISTS empleado(\n" +
                    "id_empleado SERIAL PRIMARY KEY,\n" +
                    "  nombre varchar(20),\n" +
                    "  contrasena varchar(20)\n" +
                    ")";
            sentencia.executeUpdate(empleado);

            String empleadoInsert = "INSERT INTO empleado (nombre, contrasena) VALUES ('nestor', 'nestor123');\n" +
                    "\n" +
                    "INSERT INTO empleado (nombre, contrasena) VALUES ('adrian', 'adrian123');\n" +
                    "\n" +
                    "INSERT INTO empleado (nombre, contrasena) VALUES ('carles', 'carles123');\n";

            sentencia.executeUpdate(empleadoInsert);


            String direccion = "CREATE TABLE if not EXISTS direccion(\n" +
                    "id_direccion integer PRIMARY key,\n" +
                    "  localidad varchar(20),\n" +
                    "  calle varchar(20),\n" +
                    "  numPortal integer,\n" +
                    "  piso varchar(3)\n" +
                    ");\n";

            sentencia.executeUpdate(direccion);

//            String direccionInsert = "INSERT INTO direccion (id_direccion,localidad, calle, numPortal, piso) VALUES (1,'Moncofa', 'Calle Principal', 123, '1A');\n" +
//                    "\n" +
//                    "INSERT INTO direccion (id_direccion,localidad, calle, numPortal, piso) VALUES (2,'Nules', 'Avenida Central', 456, '2B');\n" +
//                    "\n" +
//                    "INSERT INTO direccion (id_direccion,localidad, calle, numPortal, piso) VALUES (3,'Xilxes', 'Plaza Mayor', 789, '3C');\n" +
//                    "\n" +
//                    "INSERT INTO direccion (id_direccion,localidad, calle, numPortal, piso) VALUES (4,'La Vall', 'Travesía 8', 789, '3C');\n" +
//                    "\n" +
//                    "\n" +
//                    "\n" +
//                    "INSERT INTO direccion (id_direccion,localidad, calle, numPortal, piso) VALUES (5,'La Vall', 'Calle 1', 789, '3C');\n" +
//                    "\n" +
//                    "\n" +
//                    "INSERT INTO direccion (id_direccion,localidad, calle, numPortal, piso) VALUES (6,'La Vall', 'Pedro Viruela', 789, '3C');\n" +
//                    "\n" +
//                    "\n" +
//                    "INSERT INTO direccion (id_direccion,localidad, calle, numPortal, piso) VALUES (7,'La Vall', 'Valencia', 789, '3C');\n" +
//                    "\n" +
//                    "INSERT INTO direccion (id_direccion,localidad, calle, numPortal, piso) VALUES (8,'La Vall ', 'Octavi Ten', 789, '3C');\n" +
//                    "\n";
//
//            sentencia.executeUpdate(direccionInsert);

            String cliente = "CREATE TABLE IF NOT EXISTS cliente (\n" +
                    "    id_cliente SERIAL PRIMARY KEY,\n" +
                    "    telefono INTEGER,\n" +
                    "    id_direccion INTEGER REFERENCES direccion(id_direccion)\n" +
                    ");";

            sentencia.executeUpdate(cliente);


            sentencia.close();
            connection.close();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }


    }
}