package com.bsuir.max.archive.server.dao.writer;

import com.bsuir.max.archive.server.bean.Student;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.File;
import java.io.IOException;

public interface Writer {
    void append(File dbFile, File schemaFile, Student appliance) throws ParserConfigurationException, IOException, SAXException, TransformerException, XMLWriterException;

    void replace(File dbFile, File schemaFile, Student student) throws ParserConfigurationException, IOException, SAXException, TransformerException, XMLWriterException;
}
