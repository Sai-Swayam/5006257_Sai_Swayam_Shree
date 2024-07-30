public class RemoteControl {
    Command command;

    public void setCommand(Command cmd) {
        this.command = cmd;
    }

    public void activate() {
        command.execute();
    }
}
