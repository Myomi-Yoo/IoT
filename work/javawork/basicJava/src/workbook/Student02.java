package workbook;
// ��ũ�� page58. ����4 
public class Student02 {
	private String name;
	private int age;
	private int height;
	private int weight;
	
	public Student02() {
		
	}
	public Student02(String name,int age,int height,int weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void print() {
		System.out.println(getName()+"\t"+getAge()+"\t"+getHeight()+"\t"+getWeight());
	}
	
	
}
