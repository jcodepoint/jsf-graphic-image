
import javax.faces.bean.ManagedBean;


@ManagedBean(name = "exampleBean", eager = true)
public class ExampleBean {

	public void doSomething() {
		System.out.println("-> Hola!");
		//do something here...
	}
	
}

