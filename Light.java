package sample;

public class Light implements OnAndOff {
    @Override
    public void on() {

        System.out.println("Свет включен");
    }

    @Override
    public void off() {

        System.out.println("Свет выключен");
    }
}