public class Main {
    public static void main(String[] args) {
        int age = 10;
        if (age >= 18) {
            System.out.println("Поздраавляем с совершеннолетием!");
        }
        else {
            System.out.println("Тебе надо немного подождать, пока тебе не исполнится 18. Тогда наступит твое совершеннолетие!");
        }
        System.out.println("Exercise2");
        int age1 = 30;
        if (age1 >= 7 && age1 < 18) {
            System.out.println("Ребенок ходит в школу.");
        }
        if (age1 >= 18 && age1 < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет.");
        }
        else {
            System.out.println("Человек окончил университет и ему пора искать первую работу.");
        }
        System.out.println("Exercise3");
        int trafficWagon = 120;
        int sitTrWagon = 60;
        int saleSitPlace = 80;
        int saleStayPlace = 65;
        if (saleSitPlace < 60 && saleStayPlace < trafficWagon - sitTrWagon) {
            System.out.println("В вагоне есть " + (sitTrWagon - saleSitPlace) + " сидячих мест, " + ((trafficWagon - sitTrWagon) - saleStayPlace) + " стоячих мест.");
        }
        if (saleSitPlace >= 60 && saleStayPlace < trafficWagon - sitTrWagon) {
            System.out.println("В вагоне есть " + (sitTrWagon - saleSitPlace) + " сидячих мест, " + ((trafficWagon - sitTrWagon) - saleStayPlace) + " стоячих мест.");
        }
        if (saleSitPlace < 60 && saleStayPlace >= trafficWagon - sitTrWagon) {
                System.out.println("В вагоне есть " + (sitTrWagon - saleSitPlace) + " сидячих мест, " + ((trafficWagon - sitTrWagon) - saleStayPlace) + " стоячих мест.");
        }
        else {
            System.out.println("В вагоне нет сободных мест.");
        }
        }
    }
