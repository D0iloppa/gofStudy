package book.chapters.command.concrete.receiver;

public class Light {
    private String name;
    public Light(String name) {
        this.name = name;
    }

    public void on() {
        System.out.printf("%s 조명이 켜졌습니다.\n",this.name);
    }

    public void off() {
        System.out.printf("%s 조명이 꺼졌습니다.\n",this.name);
    }
}
