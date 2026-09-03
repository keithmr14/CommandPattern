public class TurnOnFanCommand implements Command {

    private final Fan fan;

    public TurnOnFanCommand(Fan fan) {

        this.fan = fan;
    }

    @Override
    public void execute() {

        fan.turnOn();
    }
}