package book.chapters.command.concrete.receiver;

public class GarageDoor {
    private String name;
    public GarageDoor(String name) {
        this.name = name;
    }

    public void up(){
        System.out.println("차고 문이 열렸습니다.");
    }

    public void down(){

    }

    public void stop(){

    }

    public void lightOn(){

    }

    public void lightOff(){

    }



}
