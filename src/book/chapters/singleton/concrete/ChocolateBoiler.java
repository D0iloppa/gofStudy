package book.chapters.singleton.concrete;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    // 싱글톤 패턴의 유일한 인스턴스
    private static ChocolateBoiler uniqueInstance;//  = new ChocolateBoiler() ;

    private ChocolateBoiler(){
        this.empty = true;
        this.boiled = false;
    }

    // synchronized를 사용하여 멀티스레딩과 관련된 문제 해결가능
    // 하지만 메소드를 동기화 하면 성능이 100배정도 저하된다.
    public static synchronized ChocolateBoiler getInstance(){
        //인스턴스가 생성되지 않은 경우에 인스턴스 생성
        if(uniqueInstance == null)
            uniqueInstance = new ChocolateBoiler();

        return uniqueInstance;
    }

    public void fill(){
        if(isEmpty()){
            empty = false;
            boiled = false;
            // 보일러에 우유와 초콜릿을 혼합한 재료를 넣음
        }
    }
    
    public void drain(){
        if(!isEmpty() && isBoiled()){
            // 끓인 재료를 다음 단계로 넘김
            empty = true;
        }
    }
    
    public void boil(){
        if(!isEmpty() && !isBoiled()){
            // 재료를 끓임
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
