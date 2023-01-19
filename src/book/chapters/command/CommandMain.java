package book.chapters.command;

import book.chapters.command.concrete.RemoteControl;
import book.chapters.command.concrete.command.*;
import book.chapters.command.concrete.receiver.CeilingFan;
import book.chapters.command.concrete.receiver.GarageDoor;
import book.chapters.command.concrete.receiver.Light;
import book.chapters.command.concrete.receiver.Stereo;
import main.MainTest;

public class CommandMain implements MainTest {
    @Override
    public void execute() {
        // 이 영역은 클라이언트에 해당된다.


        /*
        // remote : 인보커
        SimpleRemoteControl remote = new SimpleRemoteControl();
        // light : 리시버
        Light light = new Light("거실");
        // lightOn : 커맨드 객체
        LightOnCommand lightOn = new LightOnCommand(light);

        // 커맨드 객체를 인보커에 전달
        remote.setCommand(lightOn);
        // 실행
        remote.buttonWasPressed();


        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
        remote.setCommand(garageDoorOpen);
        remote.buttonWasPressed();
        */

        // 인보커
        RemoteControl remoteControl = new RemoteControl(7);
        
        // 리시버
        Light livingRoomLight = new Light("거실");
        Light kitchenLight = new Light("주방");
        CeilingFan ceilingFan = new CeilingFan("거실");
        GarageDoor garageDoor = new GarageDoor("차고");
        Stereo stereo = new Stereo("거실");

        
        // 커맨드 객체 생성

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorClose = new GarageDoorCloseCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffWithCDCommand stereoOffWithCD = new StereoOffWithCDCommand(stereo);


        /*
        int slotIdx = 0;

        remoteControl.setCommand(slotIdx++,livingRoomLightOn,livingRoomLightOff);
        remoteControl.setCommand(slotIdx++,kitchenLightOn,kitchenLightOff);
        remoteControl.setCommand(slotIdx++,ceilingFanOn,ceilingFanOff);
        remoteControl.setCommand(slotIdx++,stereoOnWithCD,stereoOffWithCD);
        */
        
        // 커맨드 객체를 인보커에 전달
        remoteControl.pushCommand(livingRoomLightOn,livingRoomLightOff);
        remoteControl.pushCommand(kitchenLightOn , kitchenLightOff);
        remoteControl.pushCommand(ceilingFanOn , ceilingFanOff);
        remoteControl.pushCommand(stereoOnWithCD , stereoOffWithCD);
        /*
        remoteControl.pushCommand(
                () -> { // 인터페이스 내에 추상 메소드가 하나일 때 사용할 수 있는 람다식
                    // Command 인터페이스에는 execute()라는 추상메소드 한개만 존재한다면 이 함수객체를 이용할 수 있다.
                    livingRoomLight.on();
                } ,
                ()->{
                    livingRoomLight.off();
                });
        */

        // 리모컨 슬롯정보 출력
        System.out.println(remoteControl);

        for(int i = 0 ; i < remoteControl.getTopSlotIndex() ; i++){
            System.out.printf("------[%d번 슬롯]------\n",i);
            System.out.print("* ON > ");
            remoteControl.onButtonWasPushed(i);
            System.out.print("* OFF > ");
            remoteControl.offButtonWasPushed(i);
            System.out.println("---------------------");
        }


        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();


    }

    @Override
    public String description() {
        String description = "커맨드 패턴";
        return description;
    }
}
