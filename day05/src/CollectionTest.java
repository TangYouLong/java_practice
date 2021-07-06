import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 * @Author TYL
 * @Date 2021/6/28 9:52
 * @Version V1.0
 * @ClassName CollectionTest
 * @Description TODO:
 */
public class CollectionTest {

    @Test
    public void test1(){
        Collection coll = new ArrayList();

        //add(Object e)
        coll.add("AA");
        coll.add(123);//自动装箱
        coll.add(new Date());

        //size():获取添加的元素的个数
        System.out.println(coll.size());

        //addAll():将另一个集合中的元素添加到当前集合中
        Collection coll1 = new ArrayList();
        coll1.add(2);
        coll1.add("CC");
        coll.addAll(coll1);

        System.out.println(coll.size());
        System.out.println(coll);

        //clear():清空集合元素
        coll.clear();

        //isEmpty()
        System.out.println(coll.isEmpty());
    }


}
