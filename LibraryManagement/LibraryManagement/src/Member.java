import java.util.ArrayList;
import java.util.List;

public class Member {
	private int memberId;
	private String memberName;
	private boolean memberShip;
	public List<Member> MembersList;
	private List<String> borrowedBook = new ArrayList<>();

	public Member() {
		this.MembersList = new ArrayList<>();
	}

	public Member(int memberId, String names, boolean membership) {
		this.memberId = memberId;
		this.memberName = names;
		this.memberShip = membership;
	}

	public void listMembers() {
		addMember(new Member(1, "John Doe", false));
		addMember(new Member(2, "Jane Doe", true));
		addMember(new Member(3, "Arya Dutinger", true));
		addMember(new Member(4, "Brom Stronghammer", true));
	}

	public void addMember(Member members) {
		MembersList.add(members);
	}

//Getters
	public int getMemberID() {
		return memberId;
	}

	public boolean hasMemberID(int id) {
		for (Member member : MembersList) {
			if (member.getMemberID() == id) {
				return true;
			}
		}
		return false;
	}

	public String getMemberName() {
		return memberName;
	}

	public Member getMember(int number) {
		if (number != 0) {
			for (Member member : MembersList) {
				if (member.getMemberID() == number) {
					return member;
				}
			}
		}
		if (number == 0) {
			addMember(new Member(0, "Guest member", false));
			for (Member member : MembersList) {
				if (member.getMemberID() == number) {
					return member;
				}
			}
		}
		return null;
	}

	public boolean getmembership() {
		return memberShip;
	}

	public List<String> getBooks() {
		return borrowedBook;
	}

	public void borrowBook(String bookTitle, Library library) {
		borrowedBook.add(bookTitle);
		System.out.println(memberName + " borrowed " + bookTitle);
	}

	public void returnBook(String bookTitle) {
		borrowedBook.remove(bookTitle);
		System.out.println(memberName + " returned " + bookTitle);
	}

	public List<String> displayAll() {
		List<String> titles = new ArrayList<>();
		for (Member Members : MembersList) {
			titles.add(Members.getMemberName() + " | Membership Expired: " + Members.memberShip);
		}
		return titles;
	}

	public void listofBooks() {
		if (borrowedBook.size() > 0) {
			System.out.println(memberName + "Burrowed" + borrowedBook);
		} else {
			System.out.println(" No Books Burrowed");
		}
	}

// Setters

	public void renewMemberships(Member member) {
		if (member.memberShip == true) {
			member.memberShip = false;
			System.out.println("Renewal Successful \n");

		} else {
			System.out.println("Not a Registered member please register");
		}
	}

// add a new member
	public Member(String memberName) {
		this.memberName = memberName;
		addMember(new Member(MembersList.size() + 1, memberName, true));
		this.borrowedBook = new ArrayList<>();
	}
}

class GuestMember extends Member {
	public GuestMember() {
		super();
	}

	public void GuestborrowBook(String bookTitle, Library library) {
		borrowBook(bookTitle, library);

	}
}

class RegisteredMember extends Member {
	public RegisteredMember() {
		super();
	}

	public void RegBurroweBook(String bookTitle, Library library) {
		borrowBook(bookTitle, library);

	}

	public void renewMembership(Member member) {
		List<Member> memberShips = new ArrayList<>();
		boolean memberShipss = false;
		if (memberShipss == false) {
			memberShipss = true;
			System.out.println("Renewal Successful \n");

		} else {
			System.out.println("Not a Registered member please register");
		}
	}
}
//ask about this

/*
 * Member Class: Implement a Member class to represent library members.Members
 * should have attributes like member ID, name, and a list of
 * borrowedbooks.Guest Member Class:
 * 
 * Create a GuestMember class that extends the Memberclass. Guest members can
 * borrow books without having a formal librarymembership.
 * 
 * Registered Member Class: Develop a RegisteredMember class that extends
 * theMember class. Registered members can borrow books, renew their
 * memberships, and return books.
 */