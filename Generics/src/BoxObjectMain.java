public class BoxObjectMain {
    public static void main(String[] args) {
        NumberBox<Integer> boxInt = new NumberBox<>();
        boxInt.setItem(123);

        Integer item = boxInt.getItem();
        long l = boxInt.incrementAndGet();

        print(boxInt);

        Box<String> boxStr = new Box<>();
        boxStr.setItem("Test");

        String item2 = boxStr.getItem();

        print(boxStr);
    }


    public static void print(Box box){
        System.out.println(box.getItem());
    }
}
