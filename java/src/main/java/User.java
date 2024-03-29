import lombok.Getter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
public class User {
    private final String firstName;
    private final String lastName;
    private final LocalDate birthdate;


    public User(String firstName, String lastName, LocalDate birthdate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
    }

}

