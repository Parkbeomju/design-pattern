package management;

public class Manager {

    private static Manager manager;    //싱글턴 패턴

    private Manager(){
        System.out.println("감독이 임명되었습니다.");
    }

    public static synchronized Manager getInstance(){
        if(manager == null){
            manager = new Manager();
        }
        return manager;
    }

}