/*
 * Author:wistn
 * since:2022-11-19
 * LastEditors:Do not edit
 * LastEditTime:2022-11-19
 * Descrip0tion:
 */
import java.util.Date;


public class java {
    public static void main(String[] args) {
        long now = new Date().getTime();
        while (new Date().getTime() - now < 1000 * 60 * 3) {
            // with XiXi
            now = new Date().getTime();
        }
    }
}
// javac -encoding utf8 java.java && java -Dfile.encoding=UTF-8 java