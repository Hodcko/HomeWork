public class BoxObjectMain3 {
    public static void main(String[] args) {
        Box box = new Box();
        box.setItem("Ру");
        box.setItem(123);
        box.setItem(123d);

        NumberBox<Integer> boxInt = new NumberBox<>();
        boxInt.setItem(123);

        NumberBox<Double> boxDouble = new NumberBox<>();
        boxDouble.setItem(123d);

        NumberBox<Long> boxLong = new NumberBox<>();
        boxLong.setItem(123l);

        NumberBox.print(boxInt);
        NumberBox.printInt(boxInt);
//        NumberBox.printDouble(boxInt);

        NumberBox.print(boxDouble);
//        NumberBox.printInt(boxDouble);
        NumberBox.printDouble(boxDouble);

        NumberBox.print(boxLong);
//        NumberBox.printInt(boxLong);
//        NumberBox.printDouble(boxLong);
    }
}
