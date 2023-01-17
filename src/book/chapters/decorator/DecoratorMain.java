package book.chapters.decorator;

import book.chapters.decorator.concrete.beverage.DarkRoast;
import book.chapters.decorator.concrete.beverage.Espresso;
import book.chapters.decorator.concrete.beverage.HouseBlend;
import book.chapters.decorator.concrete.condiment.Mocha;
import book.chapters.decorator.concrete.condiment.Soy;
import book.chapters.decorator.concrete.condiment.Whip;
import book.chapters.decorator.concrete.io.LowerCaseInputStream;
import book.chapters.decorator.idea.Beverage;
import book.chapters.decorator.idea.*;
import main.MainTest;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class DecoratorMain implements MainTest {

    @Override
    public String description() {
        String description = "데코레이터 패턴";
        return description;
    }
    
    public void execute(){

        beverageTest();

        ioTest();

    }



    private void beverageTest() {
        // 첫번째 음료
        Beverage beverage = new Espresso(Beverage.Size.GRANDE);
        sysout(beverage);

        // 두번째 음료
        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);

        sysout(beverage2);

        // 세번째 음료
        Beverage beverage3 = new HouseBlend(Beverage.Size.VENTI);
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);

        sysout(beverage3);

    }

    /**
     * 입력받은 음료의 description과 가격을 parsing하여
     * sysout으로 출력
     * @param beverage
     */
    private void sysout(Beverage beverage) {
        List<String> descriptions = beverage.getDescription();
        String beverageNm = "";
        String condimentList = "";
        if(descriptions.size() > 0){
            int iterIdx = 0;
            for(String desc : descriptions){
                if((iterIdx++)==0) beverageNm = desc;
                else{
                    condimentList += (desc + ",");
                }
            }
            if(condimentList.contains(",")){
                int lastIndex = condimentList.lastIndexOf(",");
                condimentList = condimentList.substring(0,lastIndex);
            }

        }

        String parsing = String.format("%s(%s size)" , beverageNm, beverage.getSize().toString());
        if(condimentList.length()>0) parsing += (" : " + condimentList);

        System.out.printf("%s | $%.2f\n" , parsing ,beverage.cost());
    }


    private void ioTest() {
        int c;
        System.out.println("-------------------------------------");

        try{
            System.out.println("action > test.txt 파일을 읽습니다...");
            // test.txt 파일을 읽음
            InputStream in =
                new LowerCaseInputStream(
                        new BufferedInputStream(
                                new FileInputStream("data/decorator/test.txt")));

            while((c=in.read()) >= 0){
                System.out.print((char)c);
            }
            in.close();
        }catch (IOException e){
            System.out.println("FAILED!");
            e.printStackTrace();
        }
        System.out.println("\n-------------------------------------");

    }

}
