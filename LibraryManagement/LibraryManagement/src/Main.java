
/**********************************************
Workshop #Course: <APD545> - Semester
Last Name: <Roldan>
First Name: <Ronald>
ID: <121813224>
Section: <NBBe>

This assignment represents my own work in accordance with Seneca Academic Policy.

Signature:
Date: <01/25/2024>
**********************************************/

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Library Library = new Library();
		Member Members = new Member();
		Member Guest = new GuestMember();
		Member RegGuest = new RegisteredMember();
		Library.createBookList();
		Members.listMembers();
		boolean choice = false;

		while (choice != true) {
			List<String> books = Library.displayAll();
			Scanner scanner = new Scanner(System.in);
			System.out.print("What do you want to do? \n" + "1. Display All Available Books\n" + "2. Add A Book\n"
					+ "3. Remove a Book\n" + "4. Member Option\n" + "0. Exit \n");

			int number = scanner.nextInt();

			if (number == 1) {

				for (int i = 0; i < books.size(); i++) {
					System.out.println("Title " + (i + 1) + ": " + books.get(i));

				}
				System.out.println("\n");
			} else if (number == 2) {

				Scanner Title = new Scanner(System.in);
				Scanner author = new Scanner(System.in);
				Scanner genre = new Scanner(System.in);

				System.out.println("Enter book title:");

				String title = Title.nextLine();
				System.out.println("Enter book author:");
				String Author = author.nextLine();
				System.out.println("Enter book genre:");
				String Genre = genre.nextLine();

				Book newBook = new Book(books.size() + 1, title, Author, Genre, true);
				Library.addBook(newBook);
				System.out.print("Book Added Successfully");

			} else if (number == 3) {
				Scanner titletoRemove = new Scanner(System.in);

				System.out.println("Enter book title:");

				String TitletoRemove = titletoRemove.nextLine();

				Library.removeBook(TitletoRemove);
				System.out.println("Book Removed Successfully");
			} else if (number == 4) {

				while (true) {

					List<String> members = Members.displayAll(); // to see if everything works properly
					for (int i = 0; i < members.size(); i++) {
						System.out.println("\n Name " + (i + 1) + ": " + members.get(i));
					}
					System.out.println(
							" \n Are you a \n 1. Registered? \n 2. Guest?\n 3. Go Back to Main Menu \n 0. Do you want to stop?");
					Scanner status = new Scanner(System.in);
					int Status = status.nextInt();

					if (Status == 1) {

						System.out.println("Please Enter Id Number");
						Scanner idNum = new Scanner(System.in);
						int idnumber = idNum.nextInt();
						boolean isAMember = Members.hasMemberID(idnumber);
						Member currentMem = Members.getMember(idnumber);
						if (isAMember == true) {

							Scanner Rstatus = new Scanner(System.in);

							System.out.println("What do you want to do?");
							System.out.println("1. Burrow a book");
							System.out.println("2. Return a book");
							System.out.println("3. Renew a membership");
							System.out.println("4. List Burrowed Books.");
							int RStatus = Rstatus.nextInt();
							if (RStatus == 1) {
								Scanner titletoBurrow = new Scanner(System.in);

								System.out.println("Enter book title:");

								String titletoBurrows = titletoBurrow.nextLine();

								currentMem.borrowBook(titletoBurrows, Library);
								if (Library.availability(titletoBurrows)) {
									Library.burrowingBook(titletoBurrows);
								}
							} else if (RStatus == 2) {

								System.out.println("Enter book title: ");
								Scanner titletoReturn = new Scanner(System.in);
								String titletoReturns = titletoReturn.nextLine();

								currentMem.returnBook(titletoReturns);

								if (!Library.availability(titletoReturns)) {
									Library.returningBook(titletoReturns);
								}

							} else if (RStatus == 3) {

								currentMem.renewMemberships(Members.getMember(idnumber));

							} else if (RStatus == 4) {

								currentMem.listofBooks();

							} else if (RStatus == 0) {
								break;
							} else {
								System.out.println("Invalid Option , Please re-enter choice");
							}
						}
					} else if (Status == 2) {
						Scanner Gstatus = new Scanner(System.in);
						int idnumber = 0;
						Member currentMem = Members.getMember(idnumber);
						System.out.println("What do you want to do?");
						System.out.println("1. Burrow a book");
						System.out.println("2. List Burrowed Books");
						System.out.println("3. Go back");
						int gstatus = Gstatus.nextInt();
						if (gstatus == 1) {
							Scanner titletoBurrow = new Scanner(System.in);

							System.out.println("Enter book title:");

							String titletoBurrows = titletoBurrow.nextLine();

							currentMem.borrowBook(titletoBurrows, Library);
							if (Library.availability(titletoBurrows)) {
								Library.burrowingBook(titletoBurrows);
							}

						}
						if (gstatus == 2) {
							currentMem.listofBooks();
						} else if (gstatus == 3) {
							break;
						}
					} else if (Status == 0) {
						break;
					}

				}

			} else if (number == 0) {
				choice = true;
			} else {
				System.out.println("Invalid Option , Please re-enter choice");
			}

		}
	}
}

/*
 * Main Application: Write a main application class that showcases the
 * functionality of the library management system. Create instances of books,
 * members (both registered and guest), borrow and return books, and display the
 * library's status
 */