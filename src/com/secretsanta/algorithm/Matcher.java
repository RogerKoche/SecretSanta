package com.secretsanta.algorithm;

public class Matcher {
	
	private String[] participants;
	private String[] assignments;
	
	public Matcher(){
		setParticipants(new String[0]);
		setAssignments(new String[0]);
	}
	public Matcher(String[] participants){
		setParticipants(participants);
		setAssignments(generateAssignments(participants));
	}
	
	/**
	 * @param participants list of individuals participating in the draw.
	 * @return the list of individuals paired with the participants where participants[0] is matched
	 * with assignments[0], participants[1] is matched with assignments[1], and so on.
	 */
	
	public String[] generateAssignments(final String[] participants) {
		ArrayListWrapper<String> participantsList = new ArrayListWrapper<String>(participants);
		return (String[]) participantsList.derange().toArray(new String[participantsList.size()]);
	}
	
	public void printMatches() {
		if (participants.length != assignments.length){
			System.out.println("Number of participants does not equal number of assignments");
		} else if (participants.length < 1){
			System.out.println("No participants");
		} else {
			if (participants.length == 1){
				System.out.println("Only one participant");
			}
			for (int i=0; i<participants.length; i++){
				System.out.println(participants[i]+":"+assignments[i]);
			}
		}
	}
	
	public void setParticipants(String[] participants){
		this.participants = participants;
	}
	public String[] getParticipants(){
		return participants;
	}
	
	public void setAssignments(String[] assignments){
		this.assignments = assignments;
	}
	public String[] getAssignments(){
		return assignments;
	}
}
