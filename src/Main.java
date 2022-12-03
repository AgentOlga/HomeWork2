public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1 () {
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("Собаки " +  dog);
        System.out.println("Кошки " +  cat);
        System.out.println("Бумага " +  paper);
    }
    public static void task2 () {
        var dog = 8;
        var result1 = dog + 4;
        var cat = 3.6;
        var result2 = cat + 4;
        var paper = 763789;
        var result3 = paper + 4;

        System.out.println("Собаки " +  result1);
        System.out.println("Кошки " +  result2);
        System.out.println("Бумага " +  result3);
    }
    public static void task3 () {
        var dog = 8;
        var result4 = dog - 3.5 ;
        var cat = 3.6;
        var result5 = cat - 1.6;
        var paper = 763789;
        var result6 = paper - 7639;

        System.out.println("Собаки " + result4);
        System.out.println("Кошки " + result5);
        System.out.println("Бумага " + result6);
    }
    public static void task4 () {
        var friend = 19;
        var result = friend + 2;
        var result1 = result / 7;

        System.out.println("Друзья " + friend);
        System.out.println("Друзья " + result);
        System.out.println("Друзья " + result1);
    }
    public static void task5 () {
        var frog = 3.5;
        var result = frog * 10;
        var result1 = result / 3.5;
        var result2 = result1 + 4;

        System.out.println("Лягушки " + frog);
        System.out.println("Лягушки " + result);
        System.out.println("Лягушки " + result1);
        System.out.println("Лягушки " + result2);
    }
    public static void task6 () {
        var weightBoxerOne = 78.2;
        var weightBoxerSecond = 82.7;
        var totalWeightFighters = weightBoxerOne + weightBoxerSecond;
        var differenceWeightsFighters = weightBoxerSecond - weightBoxerOne;

        System.out.println("Oбщий вес двух бойцов " +  totalWeightFighters +  " кг ");
        System.out.println("Разница между весами бойцов " +  differenceWeightsFighters +  " кг "  );
    }
    public static void task7 () {
        var weightBoxerOne = 78.2;
        var weightBoxerSecond = 82.7;
        var differenceWeightsFighters = weightBoxerSecond - weightBoxerOne;
        var differenceWeightsFighters1 = weightBoxerSecond % weightBoxerOne;

        System.out.println("Разница между весами бойцов " +  differenceWeightsFighters +  " кг "  );
        System.out.println("Разница между весами бойцов " +  differenceWeightsFighters1 +  " кг "  );
    }

    public static void task8 () {
        var hours = 640;
        var hoursOneEmployee = 8;
        var totalEmlpoyees = hours / hoursOneEmployee;
        var employees = totalEmlpoyees + 94;
        var hoursWork = hours / employees;

        System.out.println("Всего работников в компании "  + "— " + totalEmlpoyees  + " человек");
        System.out.println("Если в компании работает " + employees +  " человек, то всего " + hoursWork + " часа работы");
    }
}