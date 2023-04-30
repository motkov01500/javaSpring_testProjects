package com.XMLParserJaxB.JaxBTest;

import com.XMLParserJaxB.JaxBTest.xmlmodels.Parser;
import com.XMLParserJaxB.JaxBTest.xmlmodels.RoomsXML;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

//@SpringBootApplication
public class JaxBTestApplication {

    public static void main(String[] args) throws JAXBException {
        //SpringApplication.run(JaxBTestApplication.class, args);
        Parser parser = new Parser();
        System.out.println(parser.test().getRoomList());
    }
}
