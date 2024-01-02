public class Student {
    private String name;
    private String course;
    private int year;
    private int age;

    Student(String name, String course, int year, int age){
        this.setName(name);
        this.setCourse(course);
        this.setYear(year);
        this.setAge(age);
    }
    //Getters method
    public String getName(){
        return name;
    }
    public String getCourse(){
        return course;
    }
    public int getYear(){
        return year;
    }
    public int getAge(){
        return age;
    }
    //Setter methods
    public void setName(String name){
        this.name = name;
    }
    public void setCourse(String course){
        this.course = course;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setAge(int age){
        this.age = age;
    }
}
