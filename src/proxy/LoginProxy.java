package proxy;

/**
 *
 * @author Usuario
 */
public class LoginProxy implements Login {

    protected String usuario, senha;

    public LoginProxy(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    @Override
    public void acessoLogin() {
        if (permisaoAcesso()) {
            System.out.println("Acesso liberado");
        } else {
            System.out.println("Acesso negado");
        }
    }

    private boolean permisaoAcesso() {
        return usuario == "aaa" && senha == "123";
    }

}
