package org.tvd.thptty.management.util;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;

import org.tvd.thptty.management.temporary.WebKeys;
import org.tvd.thptty.model.TYClass;
import org.tvd.thptty.model.TYStudent;
import org.tvd.thptty.model.TYStudentPoint;
import org.tvd.thptty.model.TYSubject;

import com.itextpdf.text.Anchor;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.liferay.portal.model.User;

public class Report {
	private static Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 18,
			Font.BOLD);
	private static Font redFont = new Font(Font.FontFamily.TIMES_ROMAN, 12,
			Font.NORMAL, BaseColor.RED);
	private static Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 16,
			Font.BOLD);
	private static Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12,
			Font.BOLD);
  
	private String filePath = null;
	private String fileName = null;
  
	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	
	public String getFileName() {
		return fileName;
	}
	
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public String getFullPathFile() {
		return filePath + "/" + fileName;
	}

	public void createFile() {
		Document document = new Document();
		try {
			File file = new File(getFullPathFile());
			PdfWriter.getInstance(document, new FileOutputStream(file));
			document.open();
			addMetaData(document);
			addTitlePage(document);
			addContent(document);	      
		} catch (Exception e) {
			e.printStackTrace();
	    } finally {
	    	document.close();
	    }
	}

  // iText allows to add metadata to the PDF which can be viewed in your Adobe
  // Reader
  // under File -> Properties
	
	private String title = "Title" ;
	private String subject = "Subject";
	private String keywords = "Keywords";
	private String author = "TVD";
	private String creator = "TVD";
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	private void addMetaData(Document document) {
		document.addTitle(title);
		document.addSubject(subject);
		document.addKeywords(keywords);
		document.addAuthor(author);
		document.addCreator(creator);
	}

	private void addTitlePage(Document document)
			throws DocumentException {
		Paragraph preface = new Paragraph();
		preface.setFont(smallBold);
		
		// We add one empty line
		addEmptyLine(preface, 1);
		
		// Lets write a big header
		preface.add(new Paragraph("Title of Dũng the document", catFont));
		addEmptyLine(preface, 1);
		
		// Will create: Report generated by: _name, _date
		preface.add(new Paragraph("Report generated by: " + 
		System.getProperty("user.name") + ", " + new Date(), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			smallBold));
		
		addEmptyLine(preface, 3);
		preface.add(new Paragraph("This document describes something which is very important ",
				smallBold));
		
		addEmptyLine(preface, 8);
		
		preface.add(new Paragraph("This document is a preliminary " +
			"version and not subject to your license agreement or any other agreement with vogella.com ;-).",
				redFont));
		
		document.add(preface);
		
		// Start a new page
		document.newPage();
	}
	
	private void addContent(Document document) throws DocumentException {
		Anchor anchor = new Anchor("First Chapter", catFont);
		anchor.setName("First Chapter");

		// Second parameter is the number of the chapter
		Chapter catPart = new Chapter(new Paragraph(anchor), 1);

		Paragraph subPara = new Paragraph("Subcategory 1", subFont);
		Section subCatPart = catPart.addSection(subPara);
		subCatPart.add(new Paragraph("Hello"));

		subPara = new Paragraph("Subcategory 2", subFont);
		subCatPart = catPart.addSection(subPara);
		subCatPart.add(new Paragraph("Paragraph 1"));
		subCatPart.add(new Paragraph("Paragraph 2"));
		subCatPart.add(new Paragraph("Paragraph 3"));

		// Add a list
		createList(subCatPart);
		Paragraph paragraph = new Paragraph();
		addEmptyLine(paragraph, 5);
		
		paragraph.setFont(smallBold);
		// Add a table
		paragraph.add(createTable(subCatPart));
		subCatPart.add(paragraph);

		// Now add all this to the document
		document.add(catPart);

		// Next section
		anchor = new Anchor("Second Chapter", catFont);
		anchor.setName("Second Chapter");

		// Second parameter is the number of the chapter
		catPart = new Chapter(new Paragraph(anchor), 1);

		subPara = new Paragraph("Subcategory", subFont);
		subCatPart = catPart.addSection(subPara);
		subCatPart.add(new Paragraph("This is a very important message"));
		
		// Now add all this to the document
		document.add(catPart);

	}
	
	private String cellTitles[];
	private User teacher;
	private TYClass tyClass;
	private TYSubject tySubject;
	private int courses;
	private int semester;

	public int getCourses() {
		return courses;
	}

	public void setCourses(int courses) {
		this.courses = courses;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public TYSubject getTySubject() {
		return tySubject;
	}

	public void setTySubject(TYSubject tySubject) {
		this.tySubject = tySubject;
	}

	public String[] getCellTitles() {
		return cellTitles;
	}

	public void setCellTitles(String[] cellTitles) {
		this.cellTitles = cellTitles;
	}

	public User getTeacher() {
		return teacher;
	}

	public void setTeacher(User teacher) {
		this.teacher = teacher;
	}

	public TYClass getTyClass() {
		return tyClass;
	}

	public void setTyClass(TYClass tyClass) {
		this.tyClass = tyClass;
	}

	private PdfPTable createTable(Section subCatPart)
			throws BadElementException {
		int countCell = cellTitles.length;
		PdfPTable table = new PdfPTable(countCell);
		
		for(int i = 0 ; i < countCell ; i++) {
			PdfPCell cx = new PdfPCell(new Phrase(cellTitles[i]));
			cx.setHorizontalAlignment(Element.ALIGN_CENTER);
			table.addCell(cx);
		}
		
		table.setHeaderRows(1);
		
		java.util.List<TYStudent> students = ActionUtil.getStudentsInClass(courses, tyClass.getClassId());
		for(int i = 0 ; i < students.size() ; i++) {
			TYStudent student = students.get(i);
			student.setFullName(student.getStudentFirstName() + " " + student.getStudentLastName());
			table.addCell(student.getFullName());
			
			System.out.println("\n" + student.getFullName() + "\n");
			
			float points[] = TYServiceUtil.getPointStudentByPTPF(courses, 
					semester, student.getStudentId(), tySubject.getSubjectId(), 
					WebKeys.SPEAK_POINT, 1);
			String pointString = TYServiceUtil.floatsToPointString(points);
			table.addCell(pointString);
			
			points = TYServiceUtil.getPointStudentByPTPF(courses, 
					semester, student.getStudentId(), tySubject.getSubjectId(), 
					WebKeys.WRITE_POINT, 1);
			pointString = TYServiceUtil.floatsToPointString(points);
			table.addCell(pointString);
			
			points = TYServiceUtil.getPointStudentByPTPF(courses, 
					semester, student.getStudentId(), tySubject.getSubjectId(), 
					WebKeys.WRITE_POINT, 2);
			pointString = TYServiceUtil.floatsToPointString(points);
			table.addCell(pointString);
			
			points = TYServiceUtil.getPointStudentByPTPF(courses, 
					semester, student.getStudentId(), tySubject.getSubjectId(), 
					WebKeys.WRITE_POINT, 3);
			pointString = TYServiceUtil.floatsToPointString(points);
			table.addCell(pointString);
			
			java.util.List<TYStudentPoint> studentPointSubjects = TYServiceUtil.getStudentAVGPointBySubject(
					courses, semester, student.getStudentId(), tySubject.getSubjectId());
			float avgPointSubject = 0;
			if(studentPointSubjects.size() > 0)
				avgPointSubject = TYServiceUtil.getCutFloat(studentPointSubjects.get(0).getPoint(), 2);
			
			pointString = "" + avgPointSubject;
			table.addCell(pointString);
			
		}
		
		subCatPart.add(table);
		return table;
		
	}

	private void createList(Section subCatPart) {
		List list = new List(true, false, 10);
		list.add(new ListItem("First point"));
		list.add(new ListItem("Second point"));
		list.add(new ListItem("Third point"));
		subCatPart.add(list);
	}

	private void addEmptyLine(Paragraph paragraph, int number) {
		for (int i = 0; i < number; i++) {
			paragraph.add(new Paragraph(" "));
		}
	}
}
