package fp.spring.shell.component;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class StringCommands {

    @ShellMethod(value= "Echo input message", key="echo")
    public String echoMethod(@ShellOption(value = "-i", defaultValue = "Some Text" , help = "Text input") String input){
        return input;
    }

}
