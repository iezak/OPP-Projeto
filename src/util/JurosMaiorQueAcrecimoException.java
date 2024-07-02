package util;

// Exceção personalizada para casos em que o valor dos juros é maior que o acréscimo esperado
public class JurosMaiorQueAcrecimoException extends Exception {
    public JurosMaiorQueAcrecimoException(String msg) {
        super(msg);
    }
}
