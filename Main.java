public class Main {
    public static void main(String[] args) {

        ToyStore store = new ToyStore();

        Toy toy1 = new Toy(1, "Машинка", 54, 20);
        Toy toy2 = new Toy(2, "Солдатик", 20, 90);
        Toy toy3 = new Toy(3, "Мячик", 45, 55);
        Toy toy4 = new Toy(3, "Мягка игрушка", 31, 54);
        Toy toy5 = new Toy(3, "Камера", 43, 60);

        store.addToy(toy1);
        store.addToy(toy2);
        store.addToy(toy3);
        store.addToy(toy4);
        store.addToy(toy5);


        store.changeToyFrequency(1, 30);

        store.organizeRaffle();

        Toy prizeToy = store.getPrizeToy();
        if (prizeToy != null) {
            System.out.println("Выигрышная игрушка: " + prizeToy.getNameToy());
        }
    }
}