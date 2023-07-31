package academy.devdojo.maratonajava.javacore.Ycolecoes.dominio;

public class Smartphone {
    private String serialNumber;
    private String modelo;

    public Smartphone(String serialNumber, String modelo) {
        this.serialNumber = serialNumber;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "serialNumber='" + serialNumber + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    // Reflexivo: x.equals(x) tem que ser true para tudo que for diferente de null.
    // Simétrico: para x e y diferentes de null, se x.equals(y) == true, logo y.equals(x) == true.
    // Transitividade: para x, y, z diferentes de null, se x.equals(y) == true, e x.equals(z) == true, logo y.equals(z) == true.
    // Consistente; x.quals(x) sempre retorna true se x for diferente de null.
    // para x diferente de null, x.equals(null) tem que retornar false.
    @Override
    public boolean equals(Object obj) {
        if(obj == null)
            return false;
        if(this == obj)
            return true;
        if(this.getClass() != obj.getClass())
            return false;
        Smartphone smartphone = (Smartphone) obj;
        return smartphone.serialNumber != null && serialNumber.equals(((Smartphone) obj).getSerialNumber());
    }

    // se x.equals(y) == true, y.hashCode() == x.hasCode()
    // y.hashCode() == x.hashCode() não necessariamente o equals de y.equals(x) tem que ser true
    // se x.equals(y) == false, hashCode() são diferentes
    // y.hashCode() != x.hashCode(), x.equals(y) deverá se false
    @Override
    public int hashCode() {
        return serialNumber == null ? 0 : this.serialNumber.hashCode();
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
