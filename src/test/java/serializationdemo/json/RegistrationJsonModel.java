package serializationdemo.json;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.extern.jackson.Jacksonized;

@Data
    @Builder
    @Jacksonized
    @EqualsAndHashCode
    @ToString
    public class RegistrationJsonModel {

        private String zipCode;

        private String firstName;

        private String lastName;

        private String email;

        private String password;

        private String confirmPassword;
    }