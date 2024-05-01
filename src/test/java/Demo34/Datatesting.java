package Demo34;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datatesting {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook Wb=null;
		XSSFSheet Ws;
		XSSFRow Wr;
		XSSFCell Wc;
		File f1=new File("C:\\Users\\admin\\OneDrive\\Documents\\Book112.xlsx");
		FileInputStream fn=new FileInputStream(f1);
		Wb=new XSSFWorkbook(fn);
		Ws=Wb.getSheetAt(0);
		int Row=Ws.getLastRowNum()+1;
		int Col=Ws.getRow(0).getLastCellNum();
		for(int i=0;i<Row;i++)
		{
			for(int j=0;j<Col;j++)
			{
				System.out.print(Ws.getRow(i).getCell(j).toString());
				System.out.print("\t");
			}
			System.out.println("\n");
		}
	}

}
