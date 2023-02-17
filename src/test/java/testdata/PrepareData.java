package testdata;

import model.RegistrationModel;

public class PrepareData {

    public static RegistrationModel getStandardRegistration() {
        return RegistrationModel
                .builder()
                .username("standard_user")
                .password("secret_sauce")
                .build();
    }

    public static RegistrationModel getLockRegistration() {
        return RegistrationModel
                .builder()
                .username("locked_out_user")
                .password("secret_sauce")
                .build();
    }

    public static RegistrationModel getProblemUserRegistration() {
        return RegistrationModel
                .builder()
                .username("problem_user")
                .password("secret_sauce")
                .build();
    }

    public static RegistrationModel getPerformanceRegistration() {
        return RegistrationModel
                .builder()
                .username("performance_glitch_user")
                .password("secret_sauce")
                .build();
    }

    public static RegistrationModel getStandardRegistrationWithoutUsername() {
        return RegistrationModel
                .builder()
                .password("secret_sauce")
                .build();
    }

    public static RegistrationModel getStandardRegistrationWithoutPassword() {
        return RegistrationModel
                .builder()
                .username("standard_user")
                .build();
    }
}
