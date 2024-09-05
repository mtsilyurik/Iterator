public class Main {
    public static void main(String[] args) {

        String[] names = {"Trezor", "Polkan", "Juchka"};
        IterableArray iNames = new IterableArray(names);
        Iterator itr = iNames.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}