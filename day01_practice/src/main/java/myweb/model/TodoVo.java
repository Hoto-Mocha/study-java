package myweb.model;

public class TodoVo {
	private int no;
	private String title;
	private boolean done;
	public TodoVo() {
		
	}
	public TodoVo(int no, String title, boolean done) {
		super();
		this.no = no;
		this.title = title;
		this.done = done;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public boolean isDone() {
		return done;
	}
	public void setDone(boolean done) {
		this.done = done;
	}
	
	
}
