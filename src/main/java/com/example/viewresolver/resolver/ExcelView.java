package com.example.viewresolver.resolver;

import com.example.viewresolver.dao.Person;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Created by 이복음 on 2017-06-05.
 */
public class ExcelView extends AbstractExcelView {

    @Override
    protected void buildExcelDocument(Map<String, Object> model,
                                      HSSFWorkbook workbook, HttpServletRequest request,
                                      HttpServletResponse response) throws Exception {

        Person person = (Person) model.get("person");

        Sheet sheet = workbook.createSheet("sheet 1");
        CellStyle style = workbook.createCellStyle();
        style.setFillForegroundColor(IndexedColors.GREY_40_PERCENT.index);
        style.setFillPattern(CellStyle.SOLID_FOREGROUND);
        style.setAlignment(CellStyle.ALIGN_CENTER);
        Row row = null;
        Cell cell = null;
        int rowCount = 0;
        int colCount = 0;

        // Create header cells
        row = sheet.createRow(rowCount++);

        cell = row.createCell(colCount++);
        cell.setCellStyle(style);
        cell.setCellValue("PersonId");

        cell = row.createCell(colCount++);
        cell.setCellStyle(style);
        cell.setCellValue("FirstName");

        cell = row.createCell(colCount++);
        cell.setCellStyle(style);
        cell.setCellValue("LastName");

        cell = row.createCell(colCount++);
        cell.setCellStyle(style);
        cell.setCellValue("Age");

        // Create data cells
        row = sheet.createRow(rowCount++);
        colCount = 0;
        row.createCell(colCount++).setCellValue(person.getPersonId());
        row.createCell(colCount++).setCellValue(person.getFirstName());
        row.createCell(colCount++).setCellValue(person.getLastName());
        row.createCell(colCount++).setCellValue(person.getAge());

        for (int i = 0; i < 4; i++)
            sheet.autoSizeColumn(i, true);

    }
}
