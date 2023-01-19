package book.chapters.command.concrete.receiver;

public class CeilingFan {
    private String name;
    private Speed speed;

    public enum Speed {
            LOW,MEDIUM,HIGH;
    };

    public CeilingFan(String name) {
        this.name = name;
    }

    public void setSpeed(Speed speed) {
        this.speed = speed;
        System.out.printf("%s 선풍기 속도가 %s로 설정되었습니다.\n" +
                "", this.name ,speed.name());
    }

    public void on(){
        System.out.printf("%s 선풍기가 켜졌습니다.\n", this.name);
    }
    public void off(){
        System.out.printf("%s 선풍기가 꺼졌습니다.\n", this.name);
    }
}
