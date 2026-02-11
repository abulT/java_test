public class Person{
    private  String name;
    private int age;
    private String gender;

    public Person(int age, String gender, String name) {
        this.age = age;
        this.gender = gender;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println(name);
    }

    public void setAge(int age) {
        if(age > 0 && age <= 110){
            this.age = age;
            System.out.println(age); 
        }else{
            System.out.println("Invalid age");
        }
        
    }

    
    public void setGender(String gender) {
        this.gender = gender;
        System.out.println(gender);
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
    }

    

}