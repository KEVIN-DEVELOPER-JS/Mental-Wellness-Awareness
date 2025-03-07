//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// FormaGeometrica.java
public abstract class FormaGeometrica {
    // Propiedad privada para almacenar el color
    private String color;

    // Método público para establecer el color
    public void setColor(String color) {
        this.color = color;
    }

    // Método público para obtener el color
    public String getColor() {
        return color;
    }

    // Método abstracto para calcular el área
    public abstract double calcularArea();
}