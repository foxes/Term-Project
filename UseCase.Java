
public class UseCase {
	// Just a basic Idea so far.
	private String Name;
	private String ID;
	private String Description;
	private String Actors; // we could split this up into two different things
							// primary and supporting?
	private String Triggers;
	private String Preconditions;
	private String Primaryflow;
	private String Alternativeflow;
	private String MinimalGuaruntees;
	private String SuccessGuaruntees;

	public void setName(String n) {
		Name = n;
	}

	public void setID(String n) {
		ID = n;
	}

	public void setDescription(String n) {
		Description = n;
	}

	public void setActors(String n) {
		Actors = n;
	}

	public void setTriggers(String n) {
		Triggers = n;
	}

	public void setPreconditions(String n) {
		Preconditions = n;
	}

	public void setPrimaryflow(String n) {
		Primaryflow = n;
	}

	public void setAlternativeflow(String n) {
		Alternativeflow = n;
	}

	public void setMinimalGuaruntees(String n) {
		MinimalGuaruntees = n;
	}

	public void setSuccessGuaruntees(String n) {
		SuccessGuaruntees = n;
	}
	public String getName() {
		return Name;
	}

	public String getID(String n) {
		return ID;
	}

	public String getDescription() {
		return Description;
	}

	public String getActors() {
		return Actors;
	}

	public String getTriggers() {
		return Triggers;
	}

	public String getPreconditions() {
		return Preconditions;
	}

	public String getPrimaryflow() {
		return Primaryflow;
	}

	public String getAlternativeflow() {
		return Alternativeflow;
	}

	public String getMinimalGuaruntees() {
		return MinimalGuaruntees;
	}

	public String getSuccessGuaruntees() {
		return SuccessGuaruntees;
	}

}
