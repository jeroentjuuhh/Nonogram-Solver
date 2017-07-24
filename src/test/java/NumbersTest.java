import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumbersTest {

    /**
     * Test the magic number just one number
     */
    @Test
    void magicNumberSimple(){
        List<Integer> nums = new ArrayList<>();
        nums.add(5);
        Numbers numbers = new Numbers(nums);
        // 5 + 0= 5
        assertThat(numbers.getMagicNumber()).isEqualTo(5);
    }

    @Test
    void magicNumberMultiple(){
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        Numbers numbers = new Numbers(nums);
        //1 + 2 + 1 = 4
        assertThat(numbers.getMagicNumber()).isEqualTo(4);
    }

    @Test
    void magicNumberEmpty(){
        List<Integer> nums = new ArrayList<>();
        nums.add(0);
        Numbers numbers = new Numbers(nums);
        //0 + 0 = 0
        assertThat(numbers.getMagicNumber()).isEqualTo(0);
    }

    @Test
    void magicNumberComplex(){
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(1);
        nums.add(1);
        nums.add(1);
        Numbers numbers = new Numbers(nums);
        //1 + 1 + 1 + 1 + 3 = 7
        assertThat(numbers.getMagicNumber()).isEqualTo(7);
    }

}
