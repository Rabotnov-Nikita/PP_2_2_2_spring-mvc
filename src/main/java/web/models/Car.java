package web.models;

public class Car {
    private String Model;
    private int Series;
    private String Color;

    public Car() {
    }

    public Car(String model, int series, String color) {
        this.Model = model;
        this.Series = series;
        this.Color = color;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public int getSeries() {
        return Series;
    }

    public void setSeries(int series) {
        Series = series;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }
}
