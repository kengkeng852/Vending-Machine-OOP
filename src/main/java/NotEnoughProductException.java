public class NotEnoughProductException extends RuntimeException{
    private String message;

    public NotEnoughProductException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage(){
        return message;
    }
}
