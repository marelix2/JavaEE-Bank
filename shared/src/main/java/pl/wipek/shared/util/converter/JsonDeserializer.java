package pl.wipek.shared.util.converter;

import org.eclipse.persistence.jaxb.UnmarshallerProperties;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Set;

public class JsonDeserializer {

//    private static Unmarshaller unmarshaller;
//
//    private static <E> void createUnmarshmaller(Class<E> clazz) throws JAXBException {
//        JAXBContext jaxbContext = JAXBContext.newInstance(clazz);
//        unmarshaller = jaxbContext.createUnmarshaller();
//        unmarshaller.setProperty(UnmarshallerProperties.MEDIA_TYPE, "application/json");
//        unmarshaller.setProperty(UnmarshallerProperties.JSON_INCLUDE_ROOT, true);
//    }
//
//    public static <E> Set<E> convertToSet(String json, Class<E> clazz) throws JAXBException {
//        StreamSource streamSource = new StreamSource();
//        createUnmarshmaller(clazz);
//        return unmarshaller.unmarshal(new StringReader(json), clazz);
//    }
//
//    public static <E> E convertToObject(String json, Class<E> clazz) throws JAXBException {
//        StreamSource streamSource = new StreamSource();
//        createUnmarshmaller(clazz);
//        return unmarshaller.unmarshal(new StringReader(json), clazz);
//    }
}
