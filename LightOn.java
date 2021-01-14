package sample;

public class LightOn implements Command {
    Light light;

    public LightOn(Light light) {

        this.light = light;
    }


    @Override
    public void execute() {

        light.on();
    }

    @Override
    public void undo() {

        light.off();
    }
}
