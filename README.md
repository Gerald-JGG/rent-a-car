
Components in the Presentation Layer:

User Interface (UI)
User registration forms
Vehicle management forms
Data display tables (user and vehicle data)
Input validation components (email, date, etc.)

3.2 Business Logic Layer (Backend)
The business logic layer processes the core functionalities and business rules of the system. It includes services and controllers that manage the logic for user and vehicle management.
Components in the Business Logic Layer:

Controllers:

CtrlUsuario: Manages user-related business logic (e.g., create, update, delete users).
CtrlVehiculo: Manages vehicle-related business logic (e.g., create, update, delete vehicles).
Abstract Classes and Interfaces:
IUsuario: Interface defining user-related operations.
IVehiculo: Interface defining vehicle-related operations.
AbstractUsuario: Abstract class for user operations.
AbstractVehiculo: Abstract class for vehicle operations.

3.3 Data Access Layer (DAO)
The DAO layer handles interactions with the database, ensuring data persistence and retrieval through optimized queries. This layer ensures that data operations are abstracted and efficiently managed.

Components in the Data Access Layer:

Database Connection: The connection to the database is managed using DatabaseConnection class, which ensures a secure and reusable database connection.
DAOs:
DAOUsuario: Manages database operations related to users (insert, update, delete, select).
DAOVehiculo: Manages database operations related to vehicles (insert, update, delete, select).
java
public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/vehicle_system";
    private static final String USER = "root";
    private static final String PASSWORD = "password";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}

3.4 Programming

3.4.1 Database Connection Implementation
The database connection is established using the DatabaseConnection class, which uses JDBC to connect to the MySQL database.

3.4.2 Connection Test
To test the database connection, the following code was used:

java
Copiar código
public class ConnectionTest {
    public static void main(String[] args) {
        try (Connection con = DatabaseConnection.getConnection()) {
            if (con != null) {
                System.out.println("Database connection successful!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
This code establishes a connection to the database and prints a success message if the connection is successful.
