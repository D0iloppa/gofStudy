package book.chapters.singleton.concrete;

public class Singleton {

    /*
    * 다음 코드를 사용한 경우 멀티스레딩 사용 시, 인스턴스가 여러번 생성 될 수 있는 문제가 존재한다.
     private static Singleton uniqueInstance;

     @ 1. getInstance() 메소드에 synchronized 키워드 이용
     @ 2. 처음부터 instance를 만들어서 멀티스레딩 동기화 문제를 해결
          private static Singleton uniqueInstance = new Singleton();
     @ 3.DCL(Double-Checked Locking) 이용 : volatile(휘발성) 키워드 사용
     * 다만, DCL은 자바 1.4 이전 버전에서는 사용 불가
    */
    private volatile static Singleton uniqueInstance;


    private Singleton() {} // 생성자를 private으로 선언하여 인스턴스화 할 수 없도록 한다.

    // synchronized를 사용하여 멀티스레딩과 관련된 문제 해결가능
    // 하지만 메소드를 동기화 하면 성능이 100배정도 저하된다.
    public static Singleton getInstance(){
        /*
         * 생성되지 않은 경우에 인스턴스화 해준다.
        if(uniqueInstance == null)
            uniqueInstance = new Singleton();
        */

        // DCL 사용
        if(uniqueInstance == null)
            synchronized (Singleton.class){
                if(uniqueInstance == null){
                    uniqueInstance = new Singleton();
                }
            }

        return uniqueInstance;
    }
}
