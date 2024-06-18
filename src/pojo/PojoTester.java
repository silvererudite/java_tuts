package pojo;

public class PojoTester {
    public static void main(String[] args) {
        String[] names = {"Jim", "Tom","Harry", "Ron", "Kelly"};
        String[] dob = {"1/12/1995", "3/3/2004","5/6/1999", "6/11/1998", "12/12/1995"};
        String[] classes = {"Java", "Python","Dart", "Javascript", "C++"};

//        for(int i=0;i<5;i++){
//            Student s  = new Student("S123"+i, names[i], dob[i], classes[i]);
//            System.out.println(s);
//        }

        for(int i=0;i<5;i++){
            DummyStudent s  = new DummyStudent("S123"+i, names[i], dob[i], classes[i]);
            System.out.println(s);
        }

        // accessing properties in records
        DummyStudent s1  = new DummyStudent("S123", names[0], dob[1], classes[2]);
        System.out.println(s1.id());

    }
}
