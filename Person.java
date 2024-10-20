public class Person{
    private String name ;
    private char sex;//M r F 
    private int age; 
Person(String name,char sex,int age){
    this.name=name;
    this.sex=sex;
    this.age=age;
}
    public String getName(){
        return name;
    }
    public char getSex(){
        return sex;
    }
    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setSex(char sex){
        this.sex=sex;
    }
    public void setAge(int age){
        this.age=age;
    }

    public void displayePerson(){
        System.out.println("name : "+name);
        System.out.println("sex : "+sex);
        System.out.println("age : "+age);
    }


}