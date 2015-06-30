package model;

import java.util.Date;

public class Event {

	private int id;
	private String name;
	private int maxParticipants;
	private Date startDate;
	private Date endDate;
	private double budget;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMaxParticipants() {
		return this.maxParticipants;
	}

	public void setMaxParticipants(int maxParticipants) {
		this.maxParticipants = maxParticipants;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	/**
	 * 
	 * @param name
	 * @param maxParticipants
	 * @param startDate
	 * @param endDate
	 * @param budget
	 */
	public Event(String name, int maxParticipants, Date startDate, Date endDate, double budget) {
		// TODO - implement Event.Event
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param declaration
	 */
	public void addDeclaration(Declaration declaration) {
		// TODO - implement Event.addDeclaration
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param declaration
	 */
	public void removeDeclaration(Declaration declaration) {
		// TODO - implement Event.removeDeclaration
		throw new UnsupportedOperationException();
	}

	public double getTotalAmountOfDeclarations() {
		// TODO - implement Event.getTotalAmountOfDeclarations
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param member
	 */
	public void addParticipant(Member member) {
		// TODO - implement Event.addParticipant
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param member
	 */
	public void removeParticipant(Member member) {
		// TODO - implement Event.removeParticipant
		throw new UnsupportedOperationException();
	}

}