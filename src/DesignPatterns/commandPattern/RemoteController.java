package DesignPatterns.commandPattern;

public class RemoteController {
    Command command;
    public RemoteController(Command command) {
        this.command = command;
    }
    public void setCommand(Command command) {
        this.command = command;
    }
    public void pressButton(){
        command.execute();
    }
}
