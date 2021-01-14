package sample;

import sample.UpAndDown;

public class GarageDoor implements UpAndDown {

    public void up() {
        System.out.println("Гаражная дверь открыта");
    }


    public void down() {
        System.out.println("Гаражная дверь закрыта");
    }
}
