package com.fitness;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"Member_ID", "First_Name", "Last_Name", "Gender", "Age", "Height", "Weight", "Hours_Sleep", "Calories_Consumed", "Exercise_Calories_Burned", "Date"})
public class MemberFitnessHistory {

	private String Member_ID;
	private String First_Name;
	private String Last_Name;
	private String Gender;
	private Integer Age;
	private Integer Height;
	private Integer Weight;
	private Integer Hours_Sleep;
	private Integer Calories_Consumed;
	private Integer Exercise_Calories_Burned;
	private String Date;
	
	@JsonProperty("Member_ID")
	public String getMember_ID() {
		return Member_ID;
	}
	public void setMember_ID(String member_ID) {
		Member_ID = member_ID;
	}
	
	@JsonProperty("First_Name")
	public String getFirst_Name() {
		return First_Name;
	}
	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}
	
	@JsonProperty("Last_Name")
	public String getLast_Name() {
		return Last_Name;
	}
	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}
	
	@JsonProperty("Gender")
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	
	@JsonProperty("Age")
	public Integer getAge() {
		return Age;
	}
	public void setAge(Integer age) {
		Age = age;
	}
	
	@JsonProperty("Height")
	public Integer getHeight() {
		return Height;
	}
	public void setHeight(Integer height) {
		Height = height;
	}
	
	@JsonProperty("Weight")
	public Integer getWeight() {
		return Weight;
	}
	public void setWeight(Integer weight) {
		Weight = weight;
	}
	
	@JsonProperty("Hours_Sleep")
	public Integer getHours_Sleep() {
		return Hours_Sleep;
	}
	public void setHours_Sleep(Integer hours_Sleep) {
		Hours_Sleep = hours_Sleep;
	}
	
	@JsonProperty("Calories_Consumed")
	public Integer getCalories_Consumed() {
		return Calories_Consumed;
	}
	public void setCalories_Consumed(Integer calories_Consumed) {
		Calories_Consumed = calories_Consumed;
	}
	
	@JsonProperty("Exercise_Calories_Burned")
	public Integer getExercise_Calories_Burned() {
		return Exercise_Calories_Burned;
	}
	public void setExercise_Calories_Burned(Integer exercise_Calories_Burned) {
		Exercise_Calories_Burned = exercise_Calories_Burned;
	}
	
	@JsonProperty("Date")
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	

}
