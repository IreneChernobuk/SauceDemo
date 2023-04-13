package serializationdemo.xml;

public class GetRegistrationObject {
    public static RegistrationXMLModel getModelForXML(){
        return RegistrationXMLModel
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
