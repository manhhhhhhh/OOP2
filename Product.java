import java.io.*;
import java.io.FileOutputStream;

public class Product implements Serializable {
    public int ma;
    public String tenSanPham;
    public int giaSanPham;
    public String hangSanXuat;

    public Product(int ma, String tenSanPham, int giaSanPham, String hangSanXuat) {
        this.ma = ma;
        this.tenSanPham = tenSanPham;
        this.giaSanPham = giaSanPham;
        this.hangSanXuat = hangSanXuat;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public int getGiaSanPham() {
        return giaSanPham;
    }

    public void setGiaSanPham(int giaSanPham) {
        this.giaSanPham = giaSanPham;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    @Override
    public String toString() {
        return "Mã hàng : " + ma + " ; Tên Sản Phẩm : " + tenSanPham + " ; Giá Sản Phẩm : " + giaSanPham + " ; Hãng Sản Xuất : " + hangSanXuat + " ;";
    }
}

class ProductProcess {
    public static boolean writeProduct(Product[] products){
        File file = new File("QuanLySanPham.dat");

        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(products);
            objectOutputStream.close();
            return true;
        } catch (IOException e) {
            return false;
        }
    }
  public static Product[] readProduct() {
      File file = new File("QuanLySanPham.dat");
      try {
          ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
          Product[] products = (Product[]) objectInputStream.readObject();
          for (Product product : products) {
              System.out.println(product.toString());
          }
          objectInputStream.close();
          return new Product[]{};
      } catch (IOException | ClassNotFoundException e) {
          return null;
      }
  }
}
class ProductApp {
    public static void main(String[] args) {
        File file = new File("QuanLySanPham.dat");

        Product[] products = new Product[5];

        products[0] = new Product(1, "A",5,"Táo");
        products[1] = new Product(2, "B",10,"Chuối");
        products[2] = new Product(3, "C",15,"Nho");
        products[3] = new Product(4, "D",20,"Cam");
        products[4] = new Product(5, "E",25,"Quýt");

        ProductProcess.writeProduct(products);
        ProductProcess.readProduct();
    }
}