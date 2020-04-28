package com.pluralsight.model;

public class GoalReport {
	
	private int goals_minutes;
	private int exercise_minutes;
	private String exercise_activity;
	
	public GoalReport(int goal_minutes, int exercise_minutes, String exercise_activity) {
		this.goals_minutes = goal_minutes;
		this.exercise_minutes = exercise_minutes;
		this.exercise_activity = exercise_activity;
	}
	
	public String getExercise_activity() {
		return exercise_activity;
	}
	public int getExercise_minutes() {
		return exercise_minutes;
	}
	public int getGoals_minutes() {
		return goals_minutes;
	}
	public void setExercise_activity(String exercise_activity) {
		this.exercise_activity = exercise_activity;
	}
	public void setExercise_minutes(int exercise_minutes) {
		this.exercise_minutes = exercise_minutes;
	}
	public void setGoals_minutes(int goals_minutes) {
		this.goals_minutes = goals_minutes;
	}
	
	

}
