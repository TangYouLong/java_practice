import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author TYL
 * @Date 2021/5/18 15:50
 * @Version V1.0
 * @ClassName DateTimeTest
 * @Description TODO:
 */
public class DateTimeTest {
    /**
     SimpleDateFormat的使用：SimpleDateFormat对日期Date类的格式化和解析

     1.两个操作：
     1.1 格式化：日期 --->字符串
     1.2 解析：格式化的逆过程，字符串 ---> 日期

     2.SimpleDateFormat的实例化

     */
    @Test
    public void testSimpleDateFormat(){
        //实例化SimpleDateFormat
        SimpleDateFormat sdf = new SimpleDateFormat();

        //格式化：日期--->字符串
        Date date = new Date();
        System.out.println(date);

        String format = sdf.format(date);
        System.out.println(format);


    }

}
