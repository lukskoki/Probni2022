package hr.fer.oop.task3;

public class InstagramPost<A extends Post> extends WebEntry<A>{

	public InstagramPost(String author, String date, A entry) {
		super(author, date, entry);
		// TODO Auto-generated constructor stub
	}
	
	public double calculatePostImpact(int likes) {
		return 1.0*(entry.getNumberOfLikes())/(likes*1.f);
	}
}
