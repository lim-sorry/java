import java.util.Comparator;

public class Member implements Comparable<Member> {

	String id;
	int age;
	String name;
	
	public Member(String id, int age, String name) {
		this.id = id;
		this.age = age;
		this.name = name;
	}
	
	public String toString() {
		return id+" : "+age+" : "+name; 
	}
	/*
	public boolean equals(Object obj) {
		Member t = (Member)obj;
		return id == t.id && age == t.age && name.equals(t.name);
	}
	
	public int hashCode() {
		return (id+age+name).hashCode();
	}
	*/
	public int compareTo(Member other) {
		if(Integer.parseInt(id) > Integer.parseInt(other.id)) {
			return 1;
		} else if(Integer.parseInt(id) < Integer.parseInt(other.id)) {
			return -1;
		}
		return 0;
	}
}
