package loginRegisterSystem.dao.model;

public class Main {
    public static void main(String[] args) {
        User u=new User("Lale","Abdullayeva",22,"Aze","Baki","llls",
                "hgh@7uh","7755n","+9945");
        int age = u.getAge();
//        System.out.println(age);
        u.setAge(67);
        System.out.println(u.getAge());
        System.out.println(u.getEmail());
    }
}
