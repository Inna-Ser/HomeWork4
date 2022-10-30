public class Main {
    public static void main(String[] args) {
        int age = 30;
        if (age >= 18) {
            System.out.println("Поздраавляем с совершеннолетием!");
        } else {
            System.out.println("Тебе надо немного подождать, пока тебе не исполнится 18. Тогда наступит твое совершеннолетие!");
        }
        System.out.println("Exercise2");
        int age1 = 10;
        if (age1 >= 7 && age1 < 18) {
            System.out.println("Ребенок ходит в школу.");
        }
        else if (age1 >= 18 && age1 < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет.");
        } else {
            System.out.println("Человек окончил университет и ему пора искать первую работу.");
        }
        System.out.println("Exercise3");
        int trafficWagon = 120;
        int sitTrWagon = 60;
        int saleSitPlace = 20;
        int saleStayPlace = 15;
        if (saleSitPlace < 60 && saleStayPlace < trafficWagon - sitTrWagon) {
            System.out.println("В вагоне есть " + (sitTrWagon - saleSitPlace) + " сидячих мест, " + ((trafficWagon - sitTrWagon) - saleStayPlace) + " стоячих мест.");
        }
        else if (saleSitPlace >= 60 && saleStayPlace < trafficWagon - sitTrWagon) {
            System.out.println("В вагоне есть " + (sitTrWagon - saleSitPlace) + " сидячих мест, " + ((trafficWagon - sitTrWagon) - saleStayPlace) + " стоячих мест.");
        }
        else if (saleSitPlace < 60 && saleStayPlace >= trafficWagon - sitTrWagon) {
            System.out.println("В вагоне есть " + (sitTrWagon - saleSitPlace) + " сидячих мест, " + ((trafficWagon - sitTrWagon) - saleStayPlace) + " стоячих мест.");
        } else {
            System.out.println("В вагоне нет сободных мест.");
        }
        // Возраст учиться
        int age2 = 19;
        if (age2 >= 2 && age2 <= 6) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в детский сад.");
        }
        else if (age2 >= 7 && age2 <= 18) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в школу.");
        }
        else if (age2 > 18 && age2 <= 24) {
            System.out.println("Если возраст человека равен " + age2 + ", то его мместо в университете.");
        }
        else if (age2 > 24 && age2 < 65) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему пора ходить на работу.");
        }
        else {
            System.out.println("Если человеку меньше 2 лет и больше 65, ему не нужно ходить на работу или в школу.");
        }
        // Аттракционы
        int ageAttr = 30;
        if (ageAttr > 0 && ageAttr < 5) {
            System.out.println("Кататься на аттракционах запрещено!");
        }
        else if (ageAttr >= 5 && ageAttr < 14) {
            System.out.println("Кататься на аттракционах можно только в сопровождении взрослого.");
        }
        else {
            System.out.println("Кататься на аттракционах можно самостоятельно.");
        }
        // условный оператор 8.Задание 3
        int one = 1;
        int two = 3;
        int tree = 2;
        if ((two > one && tree > two) || (one > two && tree > one)) {
            System.out.println("Большее число tree.");
        }
        // Какое число больше
        else if ((tree > one && two > tree) || (one > tree && two > one)) {
            System.out.println("Большее число two.");
        }
        else {
            System.out.println("Большее число one.");
        }
        }
    }
