package generator;

import java.util.Random;

public class Dog implements Comparable<Dog>{
	private String dogName;
	private int dogAge;
	private DogSize dogSize;
	
	//constructors
	public Dog(){
		Random random = new Random();
		this.dogAge = this.setRandomAge(random);
		this.dogName = this.setRandomName(random);
		this.dogSize = this.setRandomSize(random);
	}
	
	public Dog(int age){
		this.setAge(age);
		
		Random random = new Random();
		this.dogName = this.setRandomName(random);
		this.dogSize = this.setRandomSize(random);
	}
	
	public Dog(DogSize size){
		this.setSize(size);
		
		Random random = new Random();
		this.dogAge = this.setRandomAge(random);
		this.dogName = this.setRandomName(random);
	}
	
	public Dog(String name){
		this.setName(name);
		
		Random random = new Random();
		this.dogAge = this.setRandomAge(random);
		this.dogSize = this.setRandomSize(random);
	}
	
	public Dog(int age, DogSize size){
		this.setAge(age);
		this.setSize(size);
		
		Random random = new Random();
		this.dogName = this.setRandomName(random);
	}
	
	public Dog(int age, String name){
		this.setAge(age);
		this.setName(name);
		
		Random random = new Random();
		this.dogSize = this.setRandomSize(random);
	}
	
	public Dog(String name, DogSize size){
		this.setName(name);
		this.setSize(size);
		
		Random random = new Random();
		this.dogName = this.setRandomName(random);
	}
	
	public Dog(int age, String name, DogSize size){
		this.setAge(age);
		this.setName(name);
		this.setSize(size);
	}
	
	//random generators
	private String setRandomName(Random random){
		return DogName.randomName(random);
	}
	
	private DogSize setRandomSize(Random random){
		return DogSize.values()[random.nextInt(DogSize.values().length)];
	}
	
	private int setRandomAge(Random random){
		return random.nextInt(21)+1;
	}
	
	//setters etc.
	private void setName(String name){
		this.dogName = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
	}
	
	private void setAge(int age){
		if (age <= 0){
			System.out.println(this.dogName + " can't be that young. The value is defaulted to 1.");
			this.dogAge = 1;
		}
		if (age > 0 && age <= 20){
			this.dogAge = age;
		}
		if (age > 20){
			System.out.println("There is no way " + this.dogName + " could live that much. Defaulted to 20");
			this.dogAge = 1;
		}
	}
	
	private void setSize(DogSize size){
		this.dogSize = size;
	}
	
	public String getName(){
		return this.dogName;
	}
	
	public DogSize getSize(){
		return this.dogSize;
	}
	
	public int getAge(){
		return this.dogAge;
	}
	
	@Override
	public String toString(){
		return "Name: " + this.getName() + " age: " + this.getAge() + " size: " + this.getSize().toString();
	}

	@Override
	public int compareTo(Dog o) {
		String dogName1 = this.getName();
		String dogName2 = o.getName();
		return dogName1.compareTo(dogName2);
    }
		
}
