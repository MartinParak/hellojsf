package sk.mapa.hello;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="helloWorld")
public class HelloWorldBean {

	private static final long serialVersionUID = 1L;
	
	private String name = "Jozko Mrkvicka";
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}
