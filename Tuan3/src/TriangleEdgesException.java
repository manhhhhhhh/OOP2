import java.util.Scanner;
    public class TriangleEdgesException extends Exception {
        // Ham khoi tao
        public TriangleEdgesException(String str) {
            super(str);
        }
    }

    class TriangleEdgesCheck {
        public void checkTriangleEdges(int a, int b, int c) throws TriangleEdgesException {
            if (a + b <= c || a + c <= b || b + c <= a) {
                throw new TriangleEdgesException("Lỗi : Không hợp lệ");
            } else {
                System.out.println("Tam giác hợp lệ");

            }
        }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         TriangleEdgesCheck check = new TriangleEdgesCheck();
        System.out.println(" tiến hành nhập vào 3 cạnh của hình tam giác");
        System.out.println("Nhập A : ");
        int a = sc.nextInt();
        System.out.println("Nhập B : ");
        int b = sc.nextInt();
        System.out.println("Nhập C : ");
        int c = sc.nextInt();
        try {
           check.checkTriangleEdges(a, b, c);
        } catch (TriangleEdgesException ex) {
            System.out.println(ex.getMessage());
        }catch (Exception e) {
            System.out.println("Sai: Không dính dáng!");
        }
        sc.close();

}
}