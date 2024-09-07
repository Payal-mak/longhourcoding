class Employee{
    String name;
    String address;
    int salary;
    String title;
}
class Manager extends Employee{
    void Name(String n){
        name=n;
        System.out.println("Manager name is: "+name);
    }
    void Address(String a){
        address=a;
        System.out.println("Manager Address is: "+address);
    }
    void Salary(int s){
    salary=s;
    System.out.println("Manager salary is: "+salary);
    }
    void Bonus(){
        System.out.println("Manager Bonous is: "+(salary*20/100));
    }
    void Title(){
        System.out.println("Manager");
    }
}
class Developer extends Employee{
    void Name(String n){
        name=n;
        System.out.println("Developer name is "+name);
    }
    void Address(String a){
        address=a;
        System.out.println("Developer Address: "+address);
    }
    void Salary(int s){
    salary=s;
    System.out.println("Developer salary: "+salary);
    }
    void Bonus(){
        System.out.println("Developer Bonous: "+(salary*12/100));
    }
    void Title(){
        System.out.println("Developer");
    }
}
class Progremmer extends Employee{
    void Name(String n){
        String name = n;
        System.out.println("Progremmer name: "+name);
    }
    void Address(String a){
        String address = a;
        System.out.println("Progremmer Address: "+address);
    }
    void Salary(int s){
    int salary = s;
    System.out.println("Progremmer salary is "+salary);
    }
    void Bonus(){
        System.out.println("Progremmer Bonous is "+(salary*10/100));
    }
    void Title(){
        System.out.println("Progremmer");
    }
}

class Display {
    public static void main(String[] args) {
        Manager m=new Manager();
        Developer d=new Developer();
        Progremmer p=new Progremmer();
        m.Name("Payal");
        m.Address("Rajkot");
        m.Salary(100000);
        m.Bonus();
        m.Title();
        d.Name("Shivani");
        d.Address("Katchh");
        d.Salary(15000);
        d.Bonus();
        d.Title();
        p.Name("Tanvi");
        p.Address("Botad");
        p.Salary(1000);
        p.Bonus();
        p.Title();
    }
}