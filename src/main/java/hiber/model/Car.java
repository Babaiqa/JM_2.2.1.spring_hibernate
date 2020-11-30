package hiber.model;


import javax.persistence.*;


@Entity
@Table
public class Car {

//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;

    @Id
    private String model;

    @Column
    private int series;

    public Car() {

    }

    public Car(String model, int series) {
        this.series = series;
        this.model = model;
    }

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Model/Series: " + this.model + "/" + this.series;
    }
}
