package bkap.entity;

import java.util.Scanner;

public class Book {
	private String bookId;
	private String bookName;
	private float importPrice;
	private float price;
	private float profit;
	private String title;
	private String author;
	private String content;
	private boolean bookStatus;

	public Book() {
		super();
	}

	public Book(String bookId, String bookName, float importPrice, float price, float profit, String title,
			String author, String content, boolean bookStatus) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.importPrice = importPrice;
		this.price = price;
		this.profit = profit;
		this.title = title;
		this.author = author;
		this.content = content;
		this.bookStatus = bookStatus;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public float getImportPrice() {
		return importPrice;
	}

	public void setImportPrice(float importPrice) {
		this.importPrice = importPrice;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getProfit() {
		return profit;
	}

	public void setProfit(float profit) {
		this.profit = profit;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public boolean isBookStatus() {
		return bookStatus;
	}

	public void setBookStatus(boolean bookStatus) {
		this.bookStatus = bookStatus;
	}

	public void inputData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao ma sach: ");
		bookId = sc.nextLine();
		System.out.println("Nhap vao ten sach: ");
		bookName = sc.nextLine();
		System.out.println("Nhap vao gia nhap: ");
		importPrice = Float.parseFloat(sc.nextLine());
		System.out.println("Nhap vao gia ban: ");
		price = Float.parseFloat(sc.nextLine());
		System.out.println("Nhap vao tieu de sach: ");
		title = sc.nextLine();
		System.out.println("Nhap vao tac gia: ");
		author = sc.nextLine();
		System.out.println("Nhap vao noi dung sach: ");
		content = sc.nextLine();
		System.out.println("Nhap vao trang thai sach (true/false): ");
		bookStatus = Boolean.parseBoolean(sc.nextLine());
	}

	public void displayData() {
		System.out.printf("Ma sach: %s - Ten sach: %s - Gia nhap: %.1f - Gia ban: %.1f - Loi nhuan: %.1f\n", bookId,
				bookName, importPrice, price, profit);
		System.out.printf("Tieu de sach: %s - Tac gia: %s - Noi dung sach: %s - Trang thai: %b\n", title, author,
				content, bookStatus);
	}

	public void calProfit() {
		this.profit = this.price - this.importPrice;
	}
}
