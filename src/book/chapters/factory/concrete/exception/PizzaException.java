package book.chapters.factory.concrete.exception;

public class PizzaException extends Exception {

    private String type;

    public PizzaException(String message, String type) {
        super(message);
        this.type = type;
    }

    public void printErr(){
        String msg = this.getMessage();
        System.err.printf("에러발생 : [pizza type='%s'] %s\n" , this.type ,msg);
    }

    /*
    @Override
    public void printStackTrace() {
        String msg = this.getMessage();
        System.err.printf("에러발생 : [pizza type='%s'] %s\n" , this.type ,msg);
    }
    */

}
