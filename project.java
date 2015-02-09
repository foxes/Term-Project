import java.util.*;

public class project {
	private ArrayList<UseCase> Usecases;
	public project(){
	Usecases = new ArrayList<UseCase>();
	}
	public void addUsecase(UseCase uc) {
		Usecases.add(uc);
	}
	public UseCase GetUsecase(int i) {
		return Usecases.get(i);
	}
}
