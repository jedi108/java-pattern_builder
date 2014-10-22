package gdordje.pattern.builder;

public class builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Director director = new Director();
	    ComputerBuilder cheapComputerBuilder = new CheapComputerBuilder();

	    director.setComputerBuilder(cheapComputerBuilder);
	    director.constructComputer();

	    Computer computer = director.getComputer();
		System.out.println("sex");
	}

}
