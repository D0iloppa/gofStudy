package main;


import chapters.decorator.DecoratorMain;
import chapters.observer.ObserverMain;
import chapters.strategy.StrategyMain;

import java.util.*;

public class App {
    // Gof 패턴 학습데이터 단원별 실행객체를 담는 VO
    static GoFVO gofVo = new GoFVO();

    public static void main(String[] args) {

        // gofVo.iterateExecute();
        gofVo.singleExecute("decorator");
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
        }

        public MainTest getTarget(String key){
            return targetApps.get(key);
        }

        public void singleExecute(String key){
            // 메인 실행함수
            MainTest targetApp = this.getTarget(key);

            String description = targetApp.description();
            System.out.printf("[%s]\n",description);
            targetApp.execute();
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
