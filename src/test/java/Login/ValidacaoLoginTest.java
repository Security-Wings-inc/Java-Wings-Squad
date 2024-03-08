package Login;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Cenários de possiveis logins")
class MetodoLoginTest {



    @Test
    @DisplayName("Cenário 1 - Login invalido com caractere especial")
    void cenario1() throws ReflectiveOperationException {
        MetodoLogin metodoLogin = new MetodoLogin();

        Boolean resposta = metodoLogin.validacaoLogin("adm", "!", "adm123");

        Assertions.assertTrue(resposta);
    }

    @Test
    @DisplayName("Cenário 2 - Login invalido com caractere especial")
    void cenario2() throws ReflectiveOperationException {
        MetodoLogin metodoLogin = new MetodoLogin();

        Boolean resposta = metodoLogin.validacaoLogin("adm", "#","adm123");

        Assertions.assertTrue(resposta);
    }

    @Test
    @DisplayName("Cenário 3 - Login invalido com caractere especial")
    void cenario3() throws ReflectiveOperationException {
        MetodoLogin metodoLogin = new MetodoLogin();

        Boolean resposta = metodoLogin.validacaoLogin("adm", "$","adm123");

        Assertions.assertTrue(resposta);
    }

    @Test
    @DisplayName("Cenário 4 - Login invalido com caractere especial")
    void cenario4() throws ReflectiveOperationException {
        MetodoLogin metodoLogin = new MetodoLogin();

        Boolean resposta = metodoLogin.validacaoLogin("adm", "%","adm123");

        Assertions.assertTrue(resposta);
    }

    @Test
    @DisplayName("Cenário 5 - Login invalido com caractere especial")
    void cenario5() throws ReflectiveOperationException {
        MetodoLogin metodoLogin = new MetodoLogin();

        Boolean resposta = metodoLogin.validacaoLogin("adm", "&","adm123");

        Assertions.assertTrue(resposta);
    }

    @Test
    @DisplayName("Cenário 6 - Login invalido com caractere especial")
    void cenario6() throws ReflectiveOperationException {
        MetodoLogin metodoLogin = new MetodoLogin();

        Boolean resposta = metodoLogin.validacaoLogin("adm", "*","adm123");

        Assertions.assertTrue(resposta);
    }

    @Test
    @DisplayName("Cenário 7 - Login invalido com caractere especial")
    void cenario7() throws ReflectiveOperationException {
        MetodoLogin metodoLogin = new MetodoLogin();

        Boolean resposta = metodoLogin.validacaoLogin("adm", "(","adm123");

        Assertions.assertTrue(resposta);
    }

    @Test
    @DisplayName("Cenário 8 - Login invalido com caractere especial")
    void cenario8() throws ReflectiveOperationException {
        MetodoLogin metodoLogin = new MetodoLogin();

        Boolean resposta = metodoLogin.validacaoLogin("adm", ")","adm123");

        Assertions.assertTrue(resposta);
    }

    @Test
    @DisplayName("Cenário 9 - Login invalido com caractere especial")
    void cenario9() throws ReflectiveOperationException {
        MetodoLogin metodoLogin = new MetodoLogin();

        Boolean resposta = metodoLogin.validacaoLogin("adm", ")","adm123");

        Assertions.assertTrue(resposta);
    }

    @Test
    @DisplayName("Cenário 10 - Login invalido com caractere especial")
    void cenario10() throws ReflectiveOperationException {
        MetodoLogin metodoLogin = new MetodoLogin();

        Boolean resposta = metodoLogin.validacaoLogin("adm", "^","adm123");

        Assertions.assertTrue(resposta);
    }

    @Test
    @DisplayName("Cenário 11 - Login invalido com caractere especial")
    void cenario11() throws ReflectiveOperationException {
        MetodoLogin metodoLogin = new MetodoLogin();

        Boolean resposta = metodoLogin.validacaoLogin("adm", "+","adm123");

        Assertions.assertTrue(resposta);
    }

    @Test
    @DisplayName("Cenário 12 - Login invalido com caractere especial")
    void cenario12() throws ReflectiveOperationException {
        MetodoLogin metodoLogin = new MetodoLogin();

        Boolean resposta = metodoLogin.validacaoLogin("adm", "=","adm123");

        Assertions.assertTrue(resposta);
    }

    @Test
    @DisplayName("Cenário 13 - Login invalido com caractere especial")
    void cenario13() throws ReflectiveOperationException {
        MetodoLogin metodoLogin = new MetodoLogin();

        Boolean resposta = metodoLogin.validacaoLogin("adm", "{","adm123");

        Assertions.assertTrue(resposta);
    }

    @Test
    @DisplayName("Cenário 14 - Login invalido com caractere especial")
    void cenario14() throws ReflectiveOperationException {
        MetodoLogin metodoLogin = new MetodoLogin();

        Boolean resposta = metodoLogin.validacaoLogin("adm", "}","adm123");

        Assertions.assertTrue(resposta);
    }

    @Test
    @DisplayName("Cenário 16 - Login invalido com caractere especial")
    void cenario16() throws ReflectiveOperationException {
        MetodoLogin metodoLogin = new MetodoLogin();

        Boolean resposta = metodoLogin.validacaoLogin("adm", "[","adm123");

        Assertions.assertTrue(resposta);
    }

    @Test
    @DisplayName("Cenário 17 - Login invalido com caractere especial")
    void cenario17() throws ReflectiveOperationException {
        MetodoLogin metodoLogin = new MetodoLogin();

        Boolean resposta = metodoLogin.validacaoLogin("adm", "]","adm123");

        Assertions.assertTrue(resposta);
    }

    @Test
    @DisplayName("Cenário 18 - Login invalido com caractere especial")
    void cenario18() throws ReflectiveOperationException {
        MetodoLogin metodoLogin = new MetodoLogin();

        Boolean resposta = metodoLogin.validacaoLogin("adm", "'","adm123");

        Assertions.assertTrue(resposta);
    }

    @Test
    @DisplayName("Cenário 19 - Login invalido com caractere especial")
    void cenario19() throws ReflectiveOperationException {
        MetodoLogin metodoLogin = new MetodoLogin();

        Boolean resposta = metodoLogin.validacaoLogin("adm", "=","adm123");

        Assertions.assertTrue(resposta);
    }

    @Test
    @DisplayName("Cenário 20 - Login invalido com caractere especial")
    void cenario20() throws ReflectiveOperationException {
        MetodoLogin metodoLogin = new MetodoLogin();

        Boolean resposta = metodoLogin.validacaoLogin("adm", ";","adm123");

        Assertions.assertTrue(resposta);
    }

    @Test
    @DisplayName("Cenário 21 - Login invalido com caractere especial")
    void cenario21() throws ReflectiveOperationException {
        MetodoLogin metodoLogin = new MetodoLogin();

        Boolean resposta = metodoLogin.validacaoLogin("adm", "/","adm123");

        Assertions.assertTrue(resposta);
    }

    @Test
    @DisplayName("Cenário 22 - Login invalido com caractere especial")
    void cenario22() throws ReflectiveOperationException {
        MetodoLogin metodoLogin = new MetodoLogin();

        Boolean resposta = metodoLogin.validacaoLogin("adm", ">","adm123");

        Assertions.assertTrue(resposta);
    }

    @Test
    @DisplayName("Cenário 23 - Login invalido com caractere especial")
    void cenario23() throws ReflectiveOperationException {
        MetodoLogin metodoLogin = new MetodoLogin();

        Boolean resposta = metodoLogin.validacaoLogin("adm", "<","adm123");

        Assertions.assertTrue(resposta);
    }

    @Test
    @DisplayName("Cenário 24 - Login invalido com caractere especial")
    void cenario24() throws ReflectiveOperationException {
        MetodoLogin metodoLogin = new MetodoLogin();

        Boolean resposta = metodoLogin.validacaoLogin("adm", ",","adm123");

        Assertions.assertTrue(resposta);
    }

    @Test
    @DisplayName("Cenário 25 - Login invalido com caractere especial")
    void cenario25() throws ReflectiveOperationException {
        MetodoLogin metodoLogin = new MetodoLogin();

        Boolean resposta = metodoLogin.validacaoLogin("adm", ":","adm123");

        Assertions.assertTrue(resposta);
    }
}