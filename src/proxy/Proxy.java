package proxy;

/**
 *
 * @author Usuario
 */
public class Proxy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Login login1 = new LoginProxy("aaa", "123");
        login1.acessoLogin();
    }
    
}
