public class SortAndFilterTestClass implements Comparable<SortAndFilterTestClass>{
    private int id;

    public SortAndFilterTestClass(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "SortAndFilterTestClass{" +
                "id=" + id +
                '}';
    }

    @Override
    public int compareTo(SortAndFilterTestClass o) {
        return this.id - o.getId();
    }
}
