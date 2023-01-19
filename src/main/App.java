package main;


import book.chapters.decorator.DecoratorMain;
import book.chapters.factory.FactoryMain;
import book.chapters.observer.ObserverMain;
import book.chapters.singleton.SingletonMain;
import book.chapters.strategy.StrategyMain;

import java.util.*;

public class App {
    // Gof 패턴 학습데이터 단원별 실행객체를 담는 VO
    static GoFVO gofVo = new GoFVO();

    public static void main(String[] args) {


        // gofVo.iterateExecute();

        gofVo.singleExecute("singleton");
    }


    /**
     * Gof 패턴 학습용 VO
     * 단원별 Main함수 생성 및 실행
     */
    private static class GoFVO {
        // 실행 대상의 리스트
        // Linked를 쓴 이유는 단원별로 순서에 의미를 주기 위함
        private Map<String,MainTest> targetApps;

        // targetAppsSetting
        public GoFVO() {
            targetApps = new LinkedHashMap<>();

            this.targetApps.put("strategy"  , new StrategyMain());
            this.targetApps.put("observer"  , new ObserverMain());
            this.targetApps.put("decorator" , new DecoratorMain());
            this.targetApps.put("factory" , new FactoryMain());
            this.targetApps.put("singleton" , new SingletonMain());
        }


        public void inputApp(String key , MainTest app){
            try{
                if("".equals(key) || key == null) throw new Exception("key는 반드시 입력");
                else if(targetApps.containsKey(key)) throw new Exception("key 중복 삽입 불가");
                else if(!(app instanceof MainTest) || app == null) throw new Exception("잘못된 app 삽입 불가.");

                this.targetApps.put(key , app);

            }catch (Exception e){
                System.out.println(e.getMessage());
            }

        }

        public MainTest getTarget(String key){
            return targetApps.get(key);
        }

        public void singleExecute(String key){
            // 메인 실행함수
            try{
                MainTest targetApp = this.getTarget(key);

                if(targetApp == null) throw new Exception("존재하지 않는 app");

                String description = targetApp.description();
                System.out.printf("[%s]\n",description);
                targetApp.execute();

            }catch(Exception e){
                System.out.println(e.getMessage());
            }


        }

        public void iterateExecute(){
            for(String key : targetApps.keySet()){
                MainTest targetApp = targetApps.get(key);
                System.out.println("=========================================");
                String description = targetApp.description();
                System.out.printf("[%s]\n\n",description);
                targetApp.execute();
            }
            System.out.println("\n=================[END]====================");
        }
    }
}
