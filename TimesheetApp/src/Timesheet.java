import java.util.ArrayList;
import java.util.List;

public class Timesheet {
	// Member variable
	private List<TimesheetEntry> database;
	
	public Timesheet() {
		database = new ArrayList<>();
	}
	
	// Create new entry and add to database
	public void add(String project, String task) {
		TimesheetEntry newEntry = new TimesheetEntry(project, task);
		database.add(newEntry);
	}
	
	// Return list of entries
	public List<TimesheetEntry> list(boolean activeOnly, String name) {
		
		if (name != null && !activeOnly) {
			List<TimesheetEntry> singleProjectList = new ArrayList<>();
			
			for (int i = 0; i < database.size(); i++) {
				TimesheetEntry currEntry = database.get(i);
				if (currEntry.getProjectName().equals(name)) {
					singleProjectList.add(currEntry);
				}
			}
			
			return singleProjectList;
		} else if (name != null && activeOnly) {
			List<TimesheetEntry> singleProjectActiveList = new ArrayList<>();
			
			for (int i = 0; i < database.size(); i++) {
				TimesheetEntry currEntry = database.get(i);
				if (currEntry.getProjectName().equals(name) && currEntry.getEndTime() == null) {
					singleProjectActiveList.add(currEntry);
				}
			}
			
			return singleProjectActiveList;
		} else if (name == null && activeOnly) {
			List<TimesheetEntry> activeList = new ArrayList<>();
			
			for(int i = 0; i < database.size(); i++) {
				TimesheetEntry currEntry = database.get(i);
				if(currEntry.getEndTime() == null) {
					activeList.add(currEntry);
				}
			}
			
			return activeList;
		}
		
		return database;
	}
	
	// Return entry with specified id
	public TimesheetEntry get(int id) {
		for (int i = 0; i < database.size(); i++) {
			TimesheetEntry currEntry = database.get(i);
			if (currEntry.getId() == id) {
				return currEntry;
			}
		}
		
		return null;
	}
	
	// Delete specified entry
	public void delete(TimesheetEntry entry) {
		database.remove(entry);
	}
	
	// Set end time
	public void stop(TimesheetEntry entry) {
		entry.updateEndTime();
	}
}
