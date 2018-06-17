package collections;

public class BooksClass {
	int bookid;
	String booknm;
	@Override
	public String toString() {
		return "BooksClass [bookid=" + bookid + ", booknm=" + booknm + "]";
	}
	public BooksClass(int bookid, String booknm) {
		super();
		this.bookid = bookid;
		this.booknm = booknm;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bookid;
	//	result = prime * result + ((booknm == null) ? 0 : booknm.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BooksClass other = (BooksClass) obj;
		if (bookid != other.bookid)
			return false;
	/*	if (booknm == null) {
			if (other.booknm != null)
				return false;
		} else if (!booknm.equals(other.booknm))
			return false;*/
		return true;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBooknm() {
		return booknm;
	}
	public void setBooknm(String booknm) {
		this.booknm = booknm;
	}
	
	

}
