package book.chapters.singleton.concrete;

// enum으로 싱글톤 패턴을 대체하여 사용할 수 있다.
// getInstance를 안해도 되는 간편함
public enum ChocolateBoilerEnum {
    INSTANCE;

    //private final boolean empty,boiled;

    private boolean empty;
    private boolean boiled;

    private ChocolateBoilerEnum(){
        this.empty = true;
        this.boiled = false;
    };


    public void fill(){
        System.out.println("fill....");
        if(isEmpty()){
            empty = false;
            boiled = false;
            System.out.println("보일러에 우유와 초콜릿을 혼합한 재료를 넣습니다.");
        }else
            System.out.println("보일러가 가득차서 재료를 넣을 수 없습니다.");
    }

    public void drain(){
        System.out.println("drain...");
        if(!isEmpty() && isBoiled()){
            empty = true;
            System.out.println("끓인 재료를 다음 단계로 넘김");
        }else
            System.out.println("끓인 재료가 존재하지 않습니다.");
    }

    public void boil(){
        System.out.println("boil...");
        if(!isEmpty() && !isBoiled()){
            boiled = true;
            System.out.println("재료를 끓입니다.");
        }else
            System.out.println("끓일 재료가 존재하지 않습니다.");
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
