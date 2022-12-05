import java.util.ArrayList;

public class Bookshelf {
	private ArrayList<Book> arraylist = new ArrayList<Book> ();
	public Bookshelf () {
	}
	public void add (Book book) {
		this.arraylist.add (book);
	}
	public Book get (String isbn) {
		int size = this.arraylist.size ();
		for (int i = 0; i < size; i++) {
			Book book = this.arraylist.get (i);
			String isbn2 = book.getIsbn ();
			if (isbn.equals(isbn2)) {
				return this.arraylist.remove (i);
			}
		}
		return null;
	}
	public int size () {
		return this.arraylist.size ();
	}
}