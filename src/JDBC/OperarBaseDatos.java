package JDBC;

import java.sql.*;

public class OperarBaseDatos {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver"); //Cargamos driver
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


        String cadena= "jdbc:mysql://localhost:3306/prueba";
        String user = "admin";
        String pwd = "123";
        try (Connection con = DriverManager.getConnection(cadena,  user,  pwd)){ //Creamos la conexión  (con la url, usuario y contraseña)
            // con un Try con recursos, para que se cierre automáticamente, si no habría que poner el bloque finally

            //Ejecución consulta con Statement
            String sql = "insert into tabla(col1,col2) values(40,'wwww')";
            Statement st =con.createStatement();
            st.execute(sql);

            //Ejecución consulta con prepared Statement
            String sql2 = "insert into tabla(col1,col2) values(?,?)";
            PreparedStatement st2 = con.prepareStatement(sql2);
            st2.setInt(1,40);//Posición 1 no 0, se añade número 40
            st2.setString(2,"wwwww");//Posición 2 , se añade número String
            st2.execute();

            //Al realizar un Select obtenemos el objeto ResultSet para acceder a los registros
            String sql3 = "select * from data";
            Statement st3 =con.createStatement();
            st.execute(sql);
            ResultSet rs = st.getResultSet();
            rs.next();//se deplaza al siguiente registro
            rs.getString(1);//Obtener el valor de la columna indicada, puede ser getInt ...
            rs.getString("Columna 1");//Obtener el valor de la columna indicada, puede ser getInt ...

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
