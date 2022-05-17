package fr.or.ProjetBank;

public class BanqueException extends Exception{
    static final long serialVersionUID=1L;

    public BanqueException() {
    }

    public BanqueException(String message) {
        super(message);
    }

    public BanqueException(String message, Throwable cause) {
        super(message, cause);
    }

    public BanqueException(Throwable cause) {
        super(cause);
    }

}
