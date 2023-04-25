public class ThrowExcep {
        static void fun ()
        {
            try {
                throw new NullPointerException("demo");
            } catch (NullPointerException e) {
                System.out.println("Caught inside fun().");
                throw e;
            }
        }

        public static void main (String args[]){
            try {
                fun();
            } catch (NullPointerException e) {
                System.out.println("Caught in main.");
            }
        }
}

// thorw dùng để ném ra ngoại lệ
// throw e dùng để rút ra ngoại lệ
// throw new NullPointerException dùng để tung ra một cái ngoại lệ mới là (demo)
// in ra :
//   Caught inside fun().
//   Caught in main.