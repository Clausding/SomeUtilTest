package apache.poi;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;

import java.io.FileOutputStream;

public class PoiTest {
    public static void main(String args[]) throws Exception {
        String template = "坐标（行数，列数）";
        String[][] data = new String[10][10];
        // 生成10*10的表格，表格内容为“坐标（行数，列数）”
        for (int i = 0; i < 10; i++) {
            String[] rowData = new String[10];
            for (int j = 0; j < 10; j++) {
                String cellData = template.replace("行数",String.valueOf(i));
                cellData = cellData.replace("列数", String.valueOf(j));
                rowData[j] = cellData;
            }
            data[i] = rowData;
        }
        makeExcel(data);
    }

    public static void makeExcel(String[][] data) throws Exception{
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet();
        // 写入数据
        for (int i = 0; i < data.length; i++) {
            HSSFRow row = sheet.createRow(i);
            String[] rowData = data[i];
            for (int j = 0; j < rowData.length; j++) {
                String cellData = rowData[j];
                HSSFCell cell = row.createCell(j);
                cell.setCellType(CellType.STRING);
                cell.setCellValue(cellData);
            }
        }
        // 输出文件
        FileOutputStream fOut = new FileOutputStream("d:\\test.xls");
        workbook.write(fOut);
        fOut.flush();
        fOut.close();
        System.out.println("文件已生成，请检查");
    }

}
