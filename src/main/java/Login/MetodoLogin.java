package Login;

public class MetodoLogin {

    boolean validacaoLogin(String user, String email, String senha) {

        if( !user.equals("adm") ||
                !senha.equals("adm123") ||
                !email.equals("adm@sptech.school") ||
                email.indexOf('!') >= 0 ||
                email.indexOf('#') >= 0 ||
                email.indexOf('$') >= 0 ||
                email.indexOf('%') >= 0 ||
                email.indexOf('&') >= 0 ||
                email.indexOf('*') >= 0 ||
                email.indexOf('(') >= 0 ||
                email.indexOf(')') >= 0 ||
                email.indexOf('^') >= 0 ||
                email.indexOf('=') >= 0 ||
                email.indexOf('+') >= 0 ||
                email.indexOf('{') >= 0 ||
                email.indexOf('}') >= 0 ||
                email.indexOf('[') >= 0 ||
                email.indexOf(']') >= 0 ||
                email.indexOf('"') >= 0 ||
                email.indexOf(';') >= 0 ||
                email.indexOf('/') >= 0 ||
                email.indexOf('>') >= 0 ||
                email.indexOf('<') >= 0 ||
                email.indexOf(',') >= 0 ||
                email.indexOf(':') >= 0) {
            return false;
        } else {
            return true;
        }
    }
}
