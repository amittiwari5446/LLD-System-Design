import command.*;
import devices.Device;
import devices.Stereo;
import devices.TV;
import invoker.RemoteControl;

public class Main {
    public static void main(String[] args) {
        TV tv=new TV();
        Stereo stereo=new Stereo();

        Command turnOnCommand=new TurnOnCommand(tv);
        Command turnOffCommand=new TurnOffCommand(stereo);
        Command adjustVolumeCommand=new AdjustVolumeCommand(stereo);
        Command changeChannelCommand=new ChangeChannelCommand(tv);

        RemoteControl remoteControl=new RemoteControl();

        remoteControl.setCommand(turnOnCommand);
        remoteControl.pressButton();

        remoteControl.setCommand(turnOffCommand);
        remoteControl.pressButton();

        remoteControl.setCommand(adjustVolumeCommand);
        remoteControl.pressButton();

        remoteControl.setCommand(changeChannelCommand);
        remoteControl.pressButton();

    }
}