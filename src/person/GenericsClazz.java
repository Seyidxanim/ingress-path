package person;

public class  GenericsClazz <T> {

   private T type;

   public void  foo(T type){
       System.out.println(type);
       System.out.println(this.type.getClass().getName());
   }

    public void setType(T type) {
        this.type = type;
    }

    //generic type field
//    void foo(generic type)
//        sout: obj
}
