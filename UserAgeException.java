
public class UserAgeException extends Exception{ //例外クラスを定義する

    private int age;

    public UserAgeException(int age, String message){
        super(message);
        this.age = age;
    }

    public int getAge(){
        return age;
    }
}
