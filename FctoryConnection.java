packeage br.com.agenda.factory;


public class ConectionFactory {

    private static final String USERNAME = "root"

    private static final String PASSWOR = ""

    //Aqui colocar o caminho do banco de dados
    private static final Strinng DATABASE_URL =

    //Sincronização com o banco de dados
    public static Connection createConnectionToMySQL () {
    Class.forName(" url do banco de dados ");
    
    Conection connection = DriveManager.getConnection(DATABASE_URL, U, PASSWORD);
         return connection; 
    
     
    public static void main (String [] args) {
     
     Connection con = createConnectionToMySQL();

     if (con!=null) {
          System.out.pintln("Conexão obetida com sucesso");
          con.close();
     }
   }
} 
