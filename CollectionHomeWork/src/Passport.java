import java.util.Date;
import java.util.Objects;

public class Passport implements Comparable<Passport> {

    private String id;
    private Date effectiveAt;
    private String fio;
    private int idNumber;

    public Passport(String id, Date effectiveAt, String fio) {
        this.id = id;
        this.effectiveAt = effectiveAt;
        this.fio = fio;
    }
    public Passport(int idNumber){
        this.idNumber = idNumber;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getEffectiveAt() {
        return effectiveAt;
    }

    public void setEffectiveAt(Date effectiveAt) {
        this.effectiveAt = effectiveAt;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return Objects.equals(id, passport.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Passport{" +
                "id='" + id + '\'' +
                ", effectiveAt=" + effectiveAt +
                ", fio='" + fio + '\'' + idNumber +
                '}';
    }

    @Override
    public int compareTo(Passport o) {
        return this.idNumber - o.getIdNumber();
    }
}