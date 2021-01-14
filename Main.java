package sample;

public class Main {
    public static void main(String[] args) {

        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light();
        LightOn lightOn = new LightOn(light);
        LightOff lightOff = new LightOff(light);

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpen  garageDoorOpen = new GarageDoorOpen(garageDoor);
        GarageDoorClose garageDoorClose = new GarageDoorClose(garageDoor);

        remoteControl.setCommand(0, lightOn, lightOff);
        System.out.println(remoteControl);
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed( );


        remoteControl.setCommand(1, garageDoorOpen, garageDoorClose);
        System.out.println(remoteControl);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.undoButtonWasPushed( );
    }
}
