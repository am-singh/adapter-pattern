public class DuckSimulator {

    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.fly();
        duck.quack();

        Turkey turkey = new WildTurkey();
        Duck adapter = new TurkeyAdapter(turkey);
        adapter.fly();
        adapter.quack();
    }
}


