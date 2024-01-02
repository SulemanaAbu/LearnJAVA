public class School {
    public static void main (String [] args){
        Student student = new Student("Derrick","Actuarial Science",2022,20);
        //Setters
        student.setName("Isak");
        student.setCourse("Mathematics and Statistics");
        student.setYear(2021);
        student.setAge(22);

        //Getters
        System.out.println(student.getName());
        System.out.println(student.getCourse());
        System.out.println(student.getYear());
        System.out.println(student.getAge());

    }
}
