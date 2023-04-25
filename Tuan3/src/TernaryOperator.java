public class TernaryOperator {
    public static void main (String[] args) {

        String str = null;    // in ra kết quả rỗng vì str dể dạng null
        String message = (str == null) ? "" :
                str.substring(0,5);
        System.out.println(message);

        str = "Geeksforgeeks";
        message = (str == null) ? "" : str.substring(0,5);
        System.out.println(message); // sau khi chạy chưng trình cho ra kết quả vị trí thứ 0 đến 5 trong chuỗi kí tự str bởi vì str để dạng chuỗi kí tự và đảm bảo điều kiện
    }
}

//biến = Biểu thức logic ? Câu lệnh khi biểu thức trả về true : Câu lệnh khi biếu thức trả về false;