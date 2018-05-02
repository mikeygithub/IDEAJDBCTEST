import java.sql.Connection;
import java.sql.DriverManager;

public class Main02 {
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String url="jdbc:mysql://localhost:3306/imooc?useUnicode=true&characterEncoding=UTF-8";

    private static final String username="root";
    private static final  String password="********";
    private static Connection conn=null;
    static{
        try{
            Class.forName(driver);
        }catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
    public static Connection getConnection() throws Exception{
        if(conn==null){
            conn=DriverManager.getConnection(url, username, password);
            return conn;
        }
        return conn;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try{
            Connection conn=Main02.getConnection();
            if(conn!=null){
                System.out.println("数据库连接正常");
            }
            else{
                System.out.println("数据库连接失败");
            }
        }catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}