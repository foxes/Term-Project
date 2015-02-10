import java.util.*;

public class project {
	private HashMap<String,UseCase> Usecases;

	public project() {
		Usecases = new HashMap<String,UseCase>();
	}

	public void addUsecase(UseCase uc) {
		Usecases.put(uc.getID(),uc);
	}
	
	public UseCase GetUsecase(String id) {
		return Usecases.get(id);
	}
}
