package fp.string.ExceptionHandling.exceptions;

public class ServiceDownTimeException  extends Exception {

    public ServiceDownTimeException(){
        super();
    }

    public ServiceDownTimeException(String message){
        super(message);
    }

}