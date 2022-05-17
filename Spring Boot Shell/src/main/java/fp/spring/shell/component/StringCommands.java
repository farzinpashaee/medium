package fp.spring.shell.component;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class StringCommands {

    @ShellMethod("Add two integers together")
    public String echo(@ShellOption(value = "-i") String input){
        return input;
    }

}
