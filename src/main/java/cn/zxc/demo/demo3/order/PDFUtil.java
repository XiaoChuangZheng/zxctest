package cn.zxc.demo.demo3.order;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfAction;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfOutline;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPageEvent;
import com.itextpdf.text.pdf.PdfWriter;

public class PDFUtil {
	private static BaseFont titleBaseFont;
	private static BaseFont smallTitleBase;
	private static BaseFont wordBase;
	public static final SimpleDateFormat ymdhmDateForm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	static {
		// 设置标题字体，和编码
		try {
			titleBaseFont = BaseFont.createFont("C:/WINDOWS/Fonts/SIMYOU.TTF", BaseFont.IDENTITY_H,
					BaseFont.NOT_EMBEDDED);
			// 设置小标题字体，和编码
			smallTitleBase = BaseFont.createFont("C:/WINDOWS/Fonts/SIMYOU.TTF", BaseFont.IDENTITY_H,
					BaseFont.NOT_EMBEDDED);
			// 设置文本字体，和编码
			wordBase = BaseFont.createFont("C:/WINDOWS/Fonts/SIMYOU.TTF", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	// 设置标题字体大小,样式,颜色
	public static final Font titleFont = new Font(titleBaseFont, 12, Font.NORMAL, new BaseColor(0, 0, 0));
	// 设置小标题字体大小,样式,颜色
	public static final Font declareFont = new Font(smallTitleBase, 10, Font.NORMAL, new BaseColor(0, 0, 0));
	// 设置文字字体大小,样式,颜色
	public static final Font wordFont = new Font(wordBase, 10, Font.NORMAL, new BaseColor(0, 0, 0));

	
//	/**
//	 * 注意 ：最后一定要调用doc.close();否则无法将数据写入pdf
//	 * 
//	 * @param path 文件存放的具体路径
//	 * @return document
//	 */
//	public static Document createDoc(String path){
//		Rectangle rec = new Rectangle(PageSize.A4);// 设置大小为A4
//		rec.setBackgroundColor(new BaseColor(220, 220, 220));// 设置背景色
//		Document doc = new Document(rec);
//		try {
//			PdfWriter pdfWriter = PdfWriter.getInstance(doc, new FileOutputStream(path));
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (DocumentException e) {
//			e.printStackTrace();
//		}
//		doc.open();
//		return doc;
//		
//	}
	
	
//	/**
//	 * 将字符串设为标题或者普通文本内容
//	 * @param firstTitle 内容
//	 * @param titleGrade 等级，1为一级标题，2为二级标题，其他则默认文本
//	 * @return Paragraph
//	 */
//	public static Paragraph setContent(String firstTitle, int titleGrade) {
//		Paragraph title = null;
//		switch (titleGrade) {
//		case 1:
//			title = new Paragraph(firstTitle + "\r\n", titleFont);
//			title.setSpacingBefore(10);
//			title.setAlignment(Paragraph.ALIGN_CENTER);
//			break;
//		case 2:
//			title = new Paragraph(firstTitle + "\r\n", declareFont);
//			title.setAlignment(Paragraph.ALIGN_CENTER);
//			title.setSpacingBefore(10);
//			break;
//		default:
//			title = new Paragraph("    "+firstTitle + "\r\n", wordFont);
//			title.setSpacingBefore(10);
//			title.setAlignment(Paragraph.ALIGN_LEFT);
//			break;
//		}
//		return title;
//
//	}

	/**
	 * 创建表格
	 * @param colnum
	 *            表格列数
	 * @param list
	 *            表格的所有数据
	 * @return table
	 */
//	public static PdfPTable createTable(int colnum, ArrayList<String> list) {
//		PdfPTable table = new PdfPTable(colnum);
////		table.normalizeHeadersFooters();
//		table.setSpacingAfter(20);//段后距
//		table.setSpacingBefore(100);//段前距
//		table.setTotalWidth(PageSize.A4.getWidth());// 设置宽度
//		table.setLockedWidth(true);// 锁住宽度
//		
//		for (int i = 0; i < list.size(); i++) {
//			table.addCell(new Phrase(list.get(i), wordFont));
//		}
//		return table;
//
//	}

//	/**
//	 * 对图片进行处理，设置图片的信息
//	 * 
//	 * @param image
//	 * @return image
//	 */
//	public static Image setImage(Image image) {
//		image.setPaddingTop(20f);
//		image.setBorder(Image.ALIGN_CENTER);
//		image.scaleAbsolute(PageSize.A4.getWidth(), image.getHeight());
//		return image;
//	}
//	/**
//	 * 将文件转化为pdf中的段落
//	 * @param file
//	 * @return paragraph
//	 */
//	public static String File2String(File file){
//		byte[] b = new byte[1024];
//		FileInputStream in =null;
//		try {
//			 in = new FileInputStream(file);
//			StringBuffer sb = new StringBuffer();
//			int len=0;
//			while ((len=in.read(b)) != -1) {
//				sb.append(new String(b, 0, len));
//			}
//			return sb.toString();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}finally{
//			if(in!=null){
//				try {
//					in.close();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//		}
//		return null;
//		
//	}


	public static byte[] createPDf(List<Doc> docList) throws Exception {
		Document doc=new Document(PageSize.A4);
		ByteArrayOutputStream os=new ByteArrayOutputStream();
		PdfWriter pWriter=PdfWriter.getInstance(doc, os);
		doc.open();
		pWriter.setPageEvent(new PdfPageEvent() {
			
			public void onStartPage(PdfWriter writer, Document document) {
				
			}
			
			public void onSectionEnd(PdfWriter writer, Document document, float paragraphPosition) {
				
			}
			//节名
			public void onSection(PdfWriter writer, Document document, float paragraphPosition, int depth, Paragraph title) {
				
			}
			
			public void onParagraphEnd(PdfWriter writer, Document document, float paragraphPosition) {
				
			}
			
			public void onParagraph(PdfWriter writer, Document document, float paragraphPosition) {
				
			}
			
			public void onOpenDocument(PdfWriter writer, Document document) {
				
			}
			
			public void onGenericTag(PdfWriter writer, Document document, Rectangle rect, String text) {
				
			}
			
			public void onEndPage(PdfWriter writer, Document document) {
				//插入业脚
				PdfContentByte dc = writer.getDirectContent();
				dc.saveState();
				dc.beginText();
			
				dc.setFontAndSize(wordBase, 12);
				//header
//				float x=document.top(-20);
//				dc.showTextAligned(PdfContentByte.ALIGN_CENTER,  
//	                    writer.getPageNumber()+ " page",  
//	                   (document.right() + document.left())/2,  
//	                   x, 0); 
				float y=document.bottom(-20);
				dc.showTextAligned(PdfContentByte.ALIGN_CENTER, "第"+writer.getPageNumber()+"页", (document.right() + document.left())/2, y, 0);
				dc.endText();
				dc.restoreState();
			
			}
			
			public void onCloseDocument(PdfWriter writer, Document document) {
				
			}
			
			public void onChapterEnd(PdfWriter writer, Document document, float paragraphPosition) {
				
			}
			//章名
			public void onChapter(PdfWriter writer, Document document, float paragraphPosition, Paragraph title) {
				
			}
		});
		 PdfContentByte cb = pWriter.getDirectContent();  
	       PdfOutline root = cb.getRootOutline();  
		for (int i=0;i<docList.size();i++) {
			Doc doc2=docList.get(i);
			doc.add(createTitleParagraph((i+1)+" "+doc2.getTitle(),i));
			doc.add(createContentParagraph(doc2.getContent()+"..."));
			doc.add(createDeclareParagraph("网站来源:"+doc2.getOrginal()+"  媒体类型:"+doc2.getType()+"  发布时间："+doc2.getDate()));
			doc.add(createDeclareParagraph("原文链接:"+doc2.getUrl()));
			PdfOutline outline = new PdfOutline(root, PdfAction.gotoLocalPage(""+i, false), (i+1)+" "+doc2.getTitle());
		}
		 
	      
		doc.close();
		return os.toByteArray();
	}
	private static Paragraph createTitleParagraph(String title, int i){
		Paragraph ph=new Paragraph(new Chunk(title,titleFont).setLocalDestination(""+i));
		ph.setSpacingBefore(10);
		ph.setAlignment(Paragraph.ALIGN_LEFT);
		return ph;
	}
	private static Paragraph createDeclareParagraph(String declare){
	 	Paragraph ph=new Paragraph(declare,declareFont);
		ph.setSpacingBefore(2);
		ph.setAlignment(Paragraph.ALIGN_LEFT);
		return ph;
	}
	private static Paragraph createContentParagraph(String content){
		Paragraph ph = new Paragraph("    "+content + "\r\n", wordFont);
		ph.setSpacingBefore(2);
		ph.setAlignment(Paragraph.ALIGN_LEFT);
		return ph;
	}
}
