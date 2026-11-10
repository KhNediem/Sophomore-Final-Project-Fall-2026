public class Probe {
    public static void main(String[] args) {
        MysteryBox box = new MysteryBox();
        box.put("A");
        box.put("B");
        box.put("C");
        while (!box.isEmpty()) {
            System.out.print(box.take() + " ");
        }
        System.out.println();
    }
}
