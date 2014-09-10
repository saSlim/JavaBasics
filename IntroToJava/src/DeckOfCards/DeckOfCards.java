package DeckOfCards;

import java.io.FileOutputStream;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;

import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class DeckOfCards {

	public static void main(String[] args) {

		String resultFile = "DeckOfCards.pdf";

		char[] suits = {'\u2660', '\u2665', '\u2666', '\u2663'};
		String[] faces = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J",
				"Q", "K", "A" };

		Document document = new Document();
		try{
	
		PdfWriter.getInstance(document, new FileOutputStream(resultFile));
		document.open();
		BaseFont base = BaseFont.createFont("lib/FreeSerif.ttf",
				BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
		Font font = new Font(base, 35f, Font.BOLD);
		Paragraph title = new Paragraph(new Phrase("Deck of Cards", font));
		title.setAlignment(Element.ALIGN_CENTER);
		document.add(title);
		document.add(Chunk.NEWLINE);
		PdfPTable tableContainer = new PdfPTable(4);
		tableContainer.getDefaultCell().setBorder(0);
		for (int i = 0; i < faces.length; i++) {
			for (int j = 0; j < suits.length; j++) {
				String card = faces[i] + "" + suits[j];
				if (j == 0 || j == 3) {
					font = new Font(base, 40f, Font.NORMAL, BaseColor.BLACK);
				} else {
					font = new Font(base, 40f, Font.NORMAL, BaseColor.RED);
				}
				PdfPTable table = new PdfPTable(1);
				PdfPCell cell;
				cell = new PdfPCell(new Phrase(card, font));
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
				cell.setFixedHeight(150f);
				cell.setBorderColor(BaseColor.BLACK);
				table.addCell(cell);
				tableContainer.addCell(table);
			}
		}
		document.add(tableContainer);
		document.close();
		}
		catch(Exception e)
		{}
	}

}
