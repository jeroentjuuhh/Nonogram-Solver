import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class NumbersTest {

    @Test
    public void test1(){
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(2);
        Numbers numbers = new Numbers(nums);

        assertThat(numbers.getMagicNumber()).isEqualTo(4);
    }

}
