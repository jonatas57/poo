package objetos;

public class Eletronico implements Cloneable {
  private String serial;
  private String tipo;

  public Eletronico(String serial) {
    setSerial(serial);
  }

  public void setSerial(String serial) {
    this.serial = serial;
  }

  @Override
  public String toString() {
    return this.getClass().getSimpleName() + "-" + serial;
  }

  @Override
  public Eletronico clone() throws CloneNotSupportedException {
    return (Eletronico) super.clone();
  }
}
