package quiz;

import java.time.LocalDateTime;


public class TodoDTO {
	private int no;
	private String title;
	private LocalDateTime createdAt;
	private LocalDateTime modifiedAt;
	private boolean completed;
	private boolean important;
	
	// getter,setter,toString 메소드 작성
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
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	public LocalDateTime getModifiedAt() {
		return modifiedAt;
	}
	public void setModifiedAt(LocalDateTime modifiedAt) {
		this.modifiedAt = modifiedAt;
	}
	public boolean isCompleted() {
		return completed;
	}
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	public boolean isImportant() {
		return important;
	}
	public void setImportant(boolean important) {
		this.important = important;
	}
	@Override
	public String toString() {
		return "TodoDTO [no=" + no + ", title=" + title + ", createdAt=" + createdAt + ", modifiedAt=" + modifiedAt
				+ ", completed=" + completed + ", important=" + important + "]";
	}	
}
