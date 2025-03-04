package com.java.oops.Day7_8_11;

import java.util.Scanner;
class LibraryBook
{
	private String bookTitle;
	private String authorName;
	private double bookPrice;

	public void setBookTitle(String bookTitle)
		{
			this.bookTitle= bookTitle;
		}
	public void setAutherName(String authorName)
	{
		this.authorName= authorName;
	}
	public void setBookPrice(double bookPrice)
	{
		this.bookPrice= bookPrice;
	}

	public String getBookTitle()
	{
			return bookTitle;
	}

	public String getAuthorName()
	{
		return authorName;
	}

	public double getBookPrice()
	{
		return bookPrice;
	}

	public void displayBookInfo()
	{
		System.out.println("Displaying book Info: ");
		System.out.println("Book Title : "+ getBookTitle());
		System.out.println("Book Auther: "+ getAuthorName());
		System.out.println("Book Price: " + getBookPrice());
	}

}


public class LibraryUser
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		LibraryBook book = new LibraryBook();

		System.out.print("Enter book title: ");
		String bookTitle = sc.nextLine();

		System.out.print("Enter book auther: ");
		String authorName = sc.nextLine();

		System.out.print("Enter book price: ");
		double bookPrice = sc.nextDouble();
		
	    book.setBookTitle(bookTitle);
        book.setAutherName(authorName);
        book.setBookPrice(bookPrice);

		book.displayBookInfo();
		
		sc.close();

	}
}
