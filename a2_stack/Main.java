package algorithm_and_data_structure.a2_stack;

/**
 * @author: raintor
 * @Date: 2019/1/11 21:32
 * @Description:
 */
public class Main {
    public static void main(String[] args){
        MyStack<Student> stustak = new MyStack<>();
        stustak.Push(new Student(12,"lisi"));
        stustak.Push(new Student(14,"wawu"));
        System.out.println(stustak);
    }
}

class Student{
    private int age;
    private String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString(){
        return name+"..."+age;
    }
}
