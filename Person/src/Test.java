
public class Test {
public static void main(String[] args){
	Person taro=new Person();
	taro.name="山田太郎";
	taro.age=20;

	System.out.println(taro.name);
	System.out.println(taro.age);

	Person jiro=new Person();
	jiro.name="木村次郎";
	jiro.age=18;

	System.out.println(jiro.name);
	System.out.println(jiro.age);

	Person hanako=new Person();
	hanako.name="鈴木花子";
	hanako.age=16;

	System.out.println(hanako.name);
	System.out.println(hanako.age);

	Person yuka=new Person();
	yuka.name="鈴木優花";
	yuka.age=24;
	yuka.phoneNumber="080-12134-5678";
	yuka.address="yuuuuu@gmail.com;";

	System.out.println(yuka.name);
	System.out.println(yuka.age);
	System.out.println(yuka.phoneNumber);
	System.out.println(yuka.address);

	taro.talk();
	taro.walk();
	taro.run();

	Robot a=new Robot();
	a.name="aibo";
	Robot b=new Robot();
	b.name="asimo";
	Robot c=new Robot();
	c.name="pepper";

	a.talk();
	a.walk();
	a.run();

	b.talk();
	b.walk();
	b.run();

	c.talk();
	c.walk();
	c.run();
}

}
