package mr.iscae.modeles;

public class Crenaux {
	private String id;
private String cren;

public Crenaux(){}
public Crenaux(String cren,String id) {
	
	this.cren = cren;
	this.id=id;
}

public String getCren() {
	return cren;
}

public void setCren(String cren) {
	this.cren = cren;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}
}
