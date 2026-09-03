void main() {

    // Create devices
    Light light = new Light();
    Fan fan = new Fan();

    // Create commands
    Command turnOnLight = new TurnOnLightCommand(light);
    Command turnOffLight = new TurnOffLightCommand(light);

    Command turnOnFan = new TurnOnFanCommand(fan);
    Command turnOffFan = new TurnOffFanCommand(fan);

    // Create central hub
    CentralHub hub = new CentralHub();

    // Turn light on
    hub.setCommand(turnOnLight);
    hub.pressButton();

    // Turn light off
    hub.setCommand(turnOffLight);
    hub.pressButton();

    // Turn fan on
    hub.setCommand(turnOnFan);
    hub.pressButton();

    // Turn fan off
    hub.setCommand(turnOffFan);
    hub.pressButton();
}