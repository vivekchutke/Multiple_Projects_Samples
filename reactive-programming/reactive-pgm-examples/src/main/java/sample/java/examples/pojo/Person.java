package sample.java.examples.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Data
@AllArgsConstructor
@ToString
public class Person {

    private String firstName;
    private String lastName;

    public String sayMyName() {
        return "My Name is: "+firstName+" "+lastName;
    }

}
