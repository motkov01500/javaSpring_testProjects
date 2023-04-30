package com.example.XMLParseTest;

import com.example.XMLParseTest.entity.Room;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.List;

@SpringBootApplication
@EnableScheduling
public class XmlParseTestApplication {

	public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
		SpringApplication.run(XmlParseTestApplication.class, args);
		//ParseRoom parseRoom = new ParseRoom();
		//System.out.println(parseRoom.parse());
	}
}
