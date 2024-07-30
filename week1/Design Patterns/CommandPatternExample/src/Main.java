public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Command command = new LightOnCommand(light);
        command.execute();
        command = new LightOffCommand(light);
        command.execute();
    }
}