public class Student {
	private String name;
	private String id;
	public Student (String id, String name) {
		this.name = name;
		this.id = id;
	}
	public String getName () {
		return this.name;
	}
	public String getId () {
		return this.id;
	}
}