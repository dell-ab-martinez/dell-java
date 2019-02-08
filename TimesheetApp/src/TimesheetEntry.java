import java.time.LocalDateTime;

public class TimesheetEntry {
	// Member Variables
	private String projectName;
	private String task;
	private int id;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	
	// Static Var
	private static int NEXTID = 1;
	
	// Constructor
	public TimesheetEntry(String myProject, String myTask) {
		projectName = myProject;
		task = myTask;
		startTime = LocalDateTime.now();
		id = NEXTID;
		
		NEXTID++;
	}
	
	// Methods
	public String getProjectName() {
		return projectName;
	}
	
	public String getTask() {
		return task;
	}
	
	public int getId() {
		return id;
	}
	
	public LocalDateTime getStartTime() {
		return startTime;
	}
	
	public LocalDateTime getEndTime() {
		return endTime;
	}
	
	public void updateEndTime() {
		try {
			if (endTime == null) {
				endTime = LocalDateTime.now();
			} else {
				throw new IllegalArgumentException("This entry has already been completed");
			}
		} catch(IllegalArgumentException e) {
			System.out.println(e.toString());
		}
	}
}
