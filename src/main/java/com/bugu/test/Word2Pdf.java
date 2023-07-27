package com.bugu.test;

import com.itextpdf.text.*;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.HWPFDocumentCore;
import org.apache.poi.hwpf.converter.WordToHtmlConverter;
import org.apache.poi.util.XMLHelper;
import org.apache.poi.xwpf.usermodel.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

/**
 * Word转换为PDF
 *
 * @author zhangwenhao
 * @date 2023-06-07 16:17
 */
public class Word2Pdf {
    public static void main(String[] args) {
        try {
            String inputPath = "/opt/test/统一技术门户首页和门户管理接口设计.docx";
            String outPath = "/opt/test/统一技术门户首页和门户管理接口设计.pdf";
            // 读取Word文件
            XWPFDocument doc = new XWPFDocument(new FileInputStream(inputPath));

            // 创建PDF文档
            Document pdfDoc = new Document(PageSize.A4);

            // 创建PDF输出流
            PdfWriter.getInstance(pdfDoc, new FileOutputStream(new File(outPath)));

            // 打开PDF文档
            pdfDoc.open();

            // 遍历Word文档中的段落
            for (XWPFParagraph para : doc.getParagraphs()) {

                // 创建PDF段落
                com.itextpdf.text.Paragraph pdfPara = new com.itextpdf.text.Paragraph();

                // 遍历Word段落中的Run并将其转换为PDF格式
                for (XWPFRun run : para.getRuns()) {
                    // 创建PDF Run，并设置属性
                    com.itextpdf.text.Font font = new com.itextpdf.text.Font();
//                    font.setFamily(run.getFontName());
                    font.setStyle(run.isBold() ? com.itextpdf.text.Font.BOLD : com.itextpdf.text.Font.NORMAL);
//                    font.setColor(new java.awt.Color(run.getColor()));

                    // 添加文本
                    pdfPara.add(new com.itextpdf.text.Chunk(run.text(), font));
                }

                // 添加段落到PDF文档中
                pdfDoc.add(pdfPara);
            }

            // 关闭PDF文档和输出流
            pdfDoc.close();

            System.out.println("转换成功");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}
