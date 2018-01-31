package com;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ApachePOIExcelWrite {


	  private static final String FILE_NAME = "";

	    public static void main(String[] args) {

	        try {
	        	//getUrlContents("");
	        	String dirName = "C:\\FileDownload\\status.xlsx";
	        	saveFileFromUrlWithJavaIO(dirName,"https://unify.impetus.co.in/kronosdev/_layouts/15/WopiFrame2.aspx?sourcedoc={6BEFEEDC-65DC-4E05-B054-1E2E976047FC}&file=Team6DailyStatus.xlsx&action=default");
	            /*FileInputStream excelFile = new FileInputStream(new File(FILE_NAME));
	            Workbook workbook = new XSSFWorkbook(excelFile);
	            Sheet datatypeSheet = workbook.getSheetAt(0);
	            Iterator<Row> iterator = datatypeSheet.iterator();

	            while (iterator.hasNext()) {

	                Row currentRow = iterator.next();
	                Iterator<Cell> cellIterator = currentRow.iterator();

	                while (cellIterator.hasNext()) {

	                    Cell currentCell = cellIterator.next();
	                    //getCellTypeEnum shown as deprecated for version 3.15
	                    //getCellTypeEnum ill be renamed to getCellType starting from version 4.0
	                    if (currentCell.getCellType() == .STRING) {
	                        System.out.print(currentCell.getStringCellValue() + "--");
	                    } else if (currentCell.getCellType() == CellType.NUMERIC) {
	                        System.out.print(currentCell.getNumericCellValue() + "--");
	                    }

	                }
	                System.out.println();

	            }**/
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

    }
	    
	    private static String getUrlContents(String theUrl)
	    {
	      StringBuilder content = new StringBuilder();

	      // many of these calls can throw exceptions, so i've just
	      // wrapped them all in one try/catch statement.
	      try
	      {
	    	  
	       
	        // create a url object
	        URL url = new URL("https://unify.impetus.co.in/kronosdev/_layouts/15/WopiFrame.aspx?sourcedoc={6BEFEEDC-65DC-4E05-B054-1E2E976047FC}&file=Team6DailyStatus.xlsx&action=default");

	        // create a urlconnection object
	        URLConnection urlConnection = url.openConnection();

	        // wrap the urlconnection in a bufferedreader
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

	        String line;

	        // read from the urlconnection via the bufferedreader
	        while ((line = bufferedReader.readLine()) != null)
	        {
	          content.append(line + "\n");
	        }
	        bufferedReader.close();
	      }
	      catch(Exception e)
	      {
	        e.printStackTrace();
	      }
	      return content.toString();
	    }
	    
	    public static void saveFileFromUrlWithJavaIO(String fileName, String fileUrl)
	    		 throws MalformedURLException, IOException {
	    		 BufferedInputStream in = null;
	    		 FileOutputStream fout = null;
	    		 try {
	    		 in = new BufferedInputStream(new URL(fileUrl).openStream());
	    		 fout = new FileOutputStream(fileName);

	    		byte data[] = new byte[1024];
	    		 int count;
	    		 while ((count = in.read(data, 0, 1024)) != -1) {
	    		 fout.write(data, 0, count);
	    		 }
	    		 } catch(IOException ex){
	    			 ex.printStackTrace();
	    		 }finally {
	    		 if (in != null)
	    		 in.close();
	    		 if (fout != null)
	    		 fout.close();
	    		 }
	    		 }
}
