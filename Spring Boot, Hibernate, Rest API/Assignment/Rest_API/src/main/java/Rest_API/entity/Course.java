package Rest_API.entity;

public class Course {
	private int id;
	private String title;
	private String duration;

	public Course(int id, String title, String duration) {
		super();
		this.id = id;
		this.title = title;
		this.duration = duration;
	}

	public Course() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", duration=" + duration + "]";
	}

}
