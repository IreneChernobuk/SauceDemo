package serializationdemo.json;

public class GetRegistrationObject {
    public static RegistrationJsonModel getModelForJson(){
        return RegistrationJsonModel
                .builder()
                .zipCode("12345")
                .firstName("Mike")
                .lastName("Strax")
                .email("iiiri@mail.ru")
                .password("13566")
                .confirmPassword("13566")
                .build();
    }
}
