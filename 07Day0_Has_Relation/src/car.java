
public class car {

	Engine engine;
	String modelName;
	public car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public car(Engine engine, String modelName) {
		super();
		this.engine = engine;
		this.modelName = modelName;
	}
	public Engine getEngine() {
		return this.engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	@Override
	public String toString() {
		return "car [engine=" + engine + ", modelName=" + modelName + "]";
	}
	
}
