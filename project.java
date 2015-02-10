import java.util.*;

public class project {
	private HashMap<String,UseCase> Usecases;
	private String ProjectName = "Project";
	public project() {
		Usecases = new HashMap<String,UseCase>();
	}

	public void addUsecase(UseCase uc) {
		Usecases.put(uc.getID(),uc);
	}
	
	public UseCase GetUsecase(String id) {
		return Usecases.get(id);
	}
	public void setProjectName(String name) {
		ProjectName = name;
	}
	
	public String GetProjectName() {
		return ProjectName;
	}
}
