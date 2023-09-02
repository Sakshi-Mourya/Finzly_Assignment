package Project;

import java.util.HashSet;
import java.util.Set;

public class prodetails {

	private String projectName;
	private String projectInfo;
	private Set<String> teamMembers;
	
	public prodetails() {
		
	}
	
	public prodetails(String projectName, String projectInfo) {
		super();
		this.projectName = projectName;
		this.projectInfo = projectInfo;
		this.teamMembers = new HashSet<>();
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectInfo() {
		return projectInfo;
	}

	public void setProjectInfo(String projectInfo) {
		this.projectInfo = projectInfo;
	}

	public Set<String> getTeamMembers() {
		return teamMembers;
	}

	public void setTeamMembers(Set<String> teamMembers) {
		this.teamMembers = teamMembers;
	}
	
	 public void addTeamMember(String memberName) {
	        teamMembers.add(memberName);
	    }

	@Override
	public String toString() {
		return "prodetails [projectName=" + projectName + ", projectInfo=" + projectInfo + ", teamMembers="
				+ teamMembers + "]";
	}
	

}
