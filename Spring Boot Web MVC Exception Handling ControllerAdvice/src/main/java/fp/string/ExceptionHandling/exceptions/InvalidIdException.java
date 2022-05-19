package fp.string.ExceptionHandling.exceptions;

public class InvalidIdException extends Exception {

    public InvalidIdException(){
        super();
    }

    public InvalidIdException(String message){
        super(message);
    }

}
