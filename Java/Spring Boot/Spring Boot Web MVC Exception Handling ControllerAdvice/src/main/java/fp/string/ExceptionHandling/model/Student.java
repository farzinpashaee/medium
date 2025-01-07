package fp.string.ExceptionHandling.model;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Student {

    private Long id;
    private String Name;

}
