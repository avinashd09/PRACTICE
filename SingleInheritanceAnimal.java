//SINGLE INHERITANCE AND MULTILEVEL INHERITANCE

public class SingleInheritanceAnimal {
void eat(){System.out.println("EATING");}    
}
class Dog extends SingleInheritanceAnimal
{
void bark(){System.out.println("DOG IS BARKING");}
}
class BabyDog extends Dog
{
void weep(){System.out.println("WEEPING");}
}
class TestInheritence
{
public static void main(String args[])
{
BabyDog d=new BabyDog();
d.bark();
d.eat();
d.weep();

}
}