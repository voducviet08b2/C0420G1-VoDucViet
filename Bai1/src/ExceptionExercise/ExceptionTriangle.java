package ExceptionExercise;

public class ExceptionTriangle extends Exception {
    public ExceptionTriangle(String message){
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
