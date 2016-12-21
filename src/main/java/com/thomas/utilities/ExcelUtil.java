/**
 * Created by Thomas on 12/19/2016.
 * Note: This library works with xls files, but not xlsx
 */

package com.thomas.utilities;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.File;
import java.io.IOException;
import java.util.Hashtable;

public class ExcelUtil {
    private static Sheet worksheet;
    private static Workbook workbook   = null;
    private static Hashtable headerMap = new Hashtable();

    // =============================================================================================
    // Construtors overloading
    // =============================================================================================

    public ExcelUtil(String excelFilename) throws BiffException, IOException {
        this(excelFilename, 0);
    }
    public ExcelUtil(String excelFilename, int index) throws BiffException, IOException {
        //Initialize
        workbook = Workbook.getWorkbook(new File(excelFilename));

        // Open worksheet (usually named: "Sheet1") using either the name or the index
        worksheet = workbook.getSheet(index);

        //Call the Column Dictionary to store column Names
        initHeaderMap();
    }
    public ExcelUtil(String excelFilename, String title) throws BiffException, IOException {
        //Initialize
        workbook = Workbook.getWorkbook(new File(excelFilename));

        // Open worksheet (usually named: "Sheet1") using either the name or the index
        worksheet = workbook.getSheet(title);

        //Call the Column Dictionary to store column Names
        initHeaderMap();
    }

    // =============================================================================================
    // Private methods for headers
    // =============================================================================================

    //The dictionary holds all the column positions for each header
    private static void initHeaderMap()
    {
        //Iterate through all the columns in the Excel sheet and store the value in Hashtable
        for(int col=0; col<colCount(); col++) {
            System.out.println("col="+col + "/" + getCell(col,0));
            headerMap.put(getCell(col,0), col);
        }
    }
    //Get the column ID from the header string
    private static int getCellID(String colName) {
        try {
            int value;
            value = ((Integer) headerMap.get(colName)).intValue();
            return value;
        } catch (NullPointerException e) {
            System.out.println("ExcelUtil/getCellID: colName " + colName + " was not found");
            return -1;
        }
    }

    // =============================================================================================
    // Public methods
    // =============================================================================================

    //Returns the number of (vertical) rows
    public static int rowCount() {
        return worksheet.getRows();
    }
    //Returns the number of (horizontal) columns
    public static int colCount() {
        return worksheet.getColumns();
    }

    //Returns the Cell value by taking row and Column values as argument
    private static String getCell(int column,int row) {
        return worksheet.getCell(column,row).getContents();
    }
    // rowNumber=0 => return the string at row=0 = return the "header" string
    public static String getCell(String columnName, int rowNumber) {
        int id = getCellID(columnName);
        return (id>=0 && rowNumber>=0)? getCell(id, rowNumber) : "";
    }
}
