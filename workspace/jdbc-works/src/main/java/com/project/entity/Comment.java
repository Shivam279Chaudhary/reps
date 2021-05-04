package com.project.entity;

public class Comment {
	private int commentID;
	private String text;
	private String modifiedAt;
	private int answerID;
	private int userID;
	private int reliability;

	public Comment() {

	}

	public Comment(int commentID, String text, String modifiedAt, int answerID, int userID, int reliability) {
		super();
		this.commentID = commentID;
		this.text = text;
		this.modifiedAt = modifiedAt;
		this.answerID = answerID;
		this.userID = userID;
		this.reliability = reliability;
	}

	public int getCommentID() {
		return commentID;
	}

	public void setCommentID(int commentID) {
		this.commentID = commentID;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getModifiedAt() {
		return modifiedAt;
	}

	public void setModifiedAt(String modifiedAt) {
		this.modifiedAt = modifiedAt;
	}

	public int getAnswerID() {
		return answerID;
	}

	public void setAnswerID(int answerID) {
		this.answerID = answerID;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public int getReliability() {
		return reliability;
	}

	public void setReliability(int reliability) {
		this.reliability = reliability;
	}

	@Override
	public String toString() {
		return "Comment [commentID=" + commentID + ", text=" + text + ", modifiedAt=" + modifiedAt + ", answerID="
				+ answerID + ", userID=" + userID + ", reliability=" + reliability + "]";
	}

}
