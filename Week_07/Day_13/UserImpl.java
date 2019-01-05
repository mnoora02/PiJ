package Day_13;

public class UserImpl implements User{

	private String name = null;
	private int id = -1;
	private Library library = null;

	public UserImpl(String name) { // constructor
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

	public int getId(){
		return this.id;
	}
	// public void setId(int id){
	// 	this.id = id;
	// }

	public String getLibrary() {
		return this.library.getName();
	}

	public void register(Library library) {
		this.library = library;
		this.id = library.getID();
	}

}