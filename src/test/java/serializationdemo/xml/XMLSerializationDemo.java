package serializationdemo.xml;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.testng.annotations.Test;

import java.io.*;

public class XMLSerializationDemo {
    @Test
    public void serializeObjectToXmlString() throws JsonProcessingException {
        // Создаем экземпляр класса XmlMapper
        XmlMapper xmlMapper = new XmlMapper();
        // Создаем экземпляр объекта сериализации
        RegistrationXMLModel registration = GetRegistrationObject.getModelForXML();
        // Получаем XML-строку представление объекта
        String xml = xmlMapper.writeValueAsString(registration);
        System.out.println(xml);
    }
    @Test
    public void serializeObjectToXmlFile() throws IOException {
        // Создаем экземпляр класса XmlMapper
        XmlMapper xmlMapper = new XmlMapper();
        // Создаем экземпляр объекта сериализации
        RegistrationXMLModel registration = GetRegistrationObject.getModelForXML();
        // Записываем объект в XML файл
        xmlMapper.writeValue(new File("src/test/resources/registration.xml"), registration);
    }

    @Test
    public void deserializeObjectFromString() throws IOException {
        // Создаем экземпляр класса XmlMapper
        XmlMapper xmlMapper = new XmlMapper();
        // XML строка
        String registration = "<RegistrationModel>" +
                "<zipCode>23509</zipCode>" +
                "<firstName>Sammie</firstName>" +
                "<lastName>Cassin</lastName" +
                "><email>tammara.schaden@yahoo.com</email>" +
                "<password>string@35</password>" +
                "<confirmPassword>string@35</confirmPassword>" +
                "</RegistrationModel>";
        // Десериализация строки в объект
        RegistrationXMLModel value
                = xmlMapper.readValue(registration, RegistrationXMLModel.class);
        System.out.println(value.toString());
    }
    @Test
    public void deserializeObjectFromFile() throws IOException {
        File file = new File("src/test/resources/registration.xml");
        XmlMapper xmlMapper = new XmlMapper();
        String xml = inputStreamToString(new FileInputStream(file));
        RegistrationXMLModel value = xmlMapper.readValue(xml, RegistrationXMLModel.class);
        System.out.println(value.toString());
    }

    public String inputStreamToString(InputStream is) throws IOException {
        StringBuilder sb = new StringBuilder();
        String line;
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }
        br.close();
        return sb.toString();
    }
}