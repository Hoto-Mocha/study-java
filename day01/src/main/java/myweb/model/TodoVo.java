package myweb.model;

public class TodoVo {
	private int no;
	private String title;
	private boolean done;
	// 빈의 조건: 생성자, setter, getter, toString();
	public TodoVo() {
		// Default 생성자 - 디폴트 생성자는 매개변수가 없다.
	}
	// 생성자 오버로딩: 페이지에서 우클릭 > Sourse > Generate Constructor using Fields...
	// 현재 클래스에 있는 변수의 초기값을 설정해 주는 생성자를 만들어 낸다.
	public TodoVo(int no, String title, boolean done) {
		this.no = no;
		this.title = title;
		this.done = done;
	}
	// getter & setter
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
	@Override
	public String toString() {
		return String.format("{\"no\":%d, \"title\":%s, \"done\":%s}", no, title, done);
	}
	
}
