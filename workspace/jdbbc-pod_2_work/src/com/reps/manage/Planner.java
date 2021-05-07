package com.reps.manage;

public class Planner {
	private int user_id;
	private String timimg;
	private String exercise;
	private String target;
	private String diet_goal;
	private String date;

	public String getTimimg() {
		return timimg;
	}

	public void setTimimg(String timimg) {
		this.timimg = timimg;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getExercise() {
		return exercise;
	}

	public void setExercise(String exercise) {
		this.exercise = exercise;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getDiet_goal() {
		return diet_goal;
	}

	public void setDiet_goal(String diet_goal) {
		this.diet_goal = diet_goal;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Planner() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Planner(int user_id, String timimg, String exercise, String target, String diet_goal, String date) {
		super();
		this.user_id = user_id;
		this.timimg = timimg;
		this.exercise = exercise;
		this.target = target;
		this.diet_goal = diet_goal;
		this.date = date;
	}

	@Override
	public String toString() {
		return "user [user_id=" + user_id + ", timimg=" + timimg + ", exercise=" + exercise + ", target=" + target
				+ ", diet_goal=" + diet_goal + ", date=" + date + "]";
	}

}
