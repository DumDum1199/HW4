//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Задача 1//
        short age = 19;
        if  (age < 18) {
            System.out.println("Если возраст человека равен "+age+" то он не достиг совершеннолетия, нужно немного подождать");
        }
        else {
            System.out.println("Если возраст человек равен "+age+" то он совершеннолетний");
        }

        //Задача 2//
        short temperature = 12;
        if  (temperature < 5) {
            System.out.println("На улице "+temperature+" градусов нужно надеть шапку");
        }
        else {
            System.out.println("На улице "+temperature+" градусов можно идти без шапки");
        }

        //Задача 3//
        short speed = 60;
        if  (speed < 60) {
            System.out.println("Если скорость "+speed+" то можно ездить спокойно");
        }
        else {
            System.out.println("Если скорость "+speed+" то придется заплатить штраф");
        }

        //Задача 4//
        short age4 = 21;
        if (age4 >=2&&age4<=6) {
            System.out.println("Если возраст человека равен "+age4+" то ему нужно ходить в детский сад");
        }
        else {
            if (age4>=7&&age4<=17) {
                System.out.println("Если возраст человека равен "+age4+" то ему нужно ходить в школу");
            }
            else {
                if (age4>=18&&age4<=24) {
                    System.out.println("Если возраст человека равен "+age4+" то ему нужно ходить в университет");
                }
                else {
                    if (age4>24) {
                        System.out.println("Если возраст человека равен "+age4+" то ему нужно ходить на работу");
                    }
                }
            }
        }
        //Задача 5//
        short kidAge = 17;
        if (kidAge<5){
            System.out.println("Если возраст ребенка равен "+kidAge+", то ему нельзя кататься на аттракционе");
        }
        else {
            if (kidAge<=14&&kidAge>=5) {
                System.out.println("Если возраст ребенка равен "+kidAge+", то ему можно кататься на аттракционе в сопровождении");
            }
            else {
                if (kidAge>14){
                    System.out.println("Если возраст ребенка равен "+kidAge+", то ему можно кататься без сопровождения взрослого");
                }
            }
        }

        //Задача 6//
        int allPlaces = 106;
        int sitPlaces = 60;
        int stayPlaces = allPlaces-sitPlaces;
        int closeSitPlaces = 58;
        int closeStayPlaces = 42;
        int freeAllPlaces = allPlaces-(closeSitPlaces+closeStayPlaces);
        int freeSitPlaces = sitPlaces-closeSitPlaces;
        int freeStayPlaces = stayPlaces-closeStayPlaces;
        if (freeAllPlaces>0) {
            if (sitPlaces-closeSitPlaces>0) {
                if  (stayPlaces-closeStayPlaces>0) {
                    System.out.println("В вагоне есть "+freeSitPlaces+" сидячих мест и "+freeStayPlaces+" стоячих мест");
                }
                else {
                    System.out.println ("В вагоне есть "+freeSitPlaces+" сидячих мест и нет стоячих");
                }
            }
            else {
                System.out.println("В вогоне нет сидячих мест и есть "+freeStayPlaces+" стоячих мест");
            }


        }
        else {
            System.out.println("Нет свободных мест");
        }

        //Задача 7//
        int one = 16;
        int two = 11;
        int three = 17;
       if (one<two&&one<three) {
           if (two<three){
              System.out.println("Число "+three+" самое большое");
           }
           else {
               System.out.println ("Число "+two+" самое большое");
           }
       }
       else {
           if (one>two&&one>three) {
               System.out.println("Число "+one+" самое большое");
           }
           else {
               if (one<two) {
                   System.out.println("Число "+two+" самое большое");
               }
               else {
                   System.out.println("Число "+three+" самое большое");
               }
           }
       }

    }
}

