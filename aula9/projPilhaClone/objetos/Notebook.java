package objetos;

public class Notebook extends Eletronico {
  private int quantidadeUSB;

  public Notebook(String serial, int usb) {
    super(serial);
    this.quantidadeUSB = usb;
  }

  @Override
  public String toString() {
    return super.toString() + "-" + quantidadeUSB;
  }
}
