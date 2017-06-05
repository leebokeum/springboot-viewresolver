package com.example.viewresolver.resolver;

import com.example.viewresolver.dao.Person;
import com.lowagie.text.Document;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Created by 이복음 on 2017-06-05.
 */
public class PdfView extends AbstractPdfView {

   protected void buildPdfDocument(Map model, Document document, PdfWriter writer, HttpServletRequest req,
                                   HttpServletResponse resp) throws Exception {

        Person person = (Person) model.get("person");

        PdfPTable table = new PdfPTable(4);

        table.addCell("Person Id");
        table.addCell("First Name");
        table.addCell("Last Name");
        table.addCell("Age");

        table.addCell(String.valueOf(person.getPersonId()));
        table.addCell(person.getFirstName());
        table.addCell(person.getLastName());
        table.addCell(String.valueOf(person.getAge()));

        document.add(table);

    }

}
