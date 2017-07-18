import java.util.ArrayList;
import java.util.List;

/**
 * Either a row or a column
 *
 */
public class Numbers {

    private List<Integer> numbers;

    /**
     *
     * @param nums
     */
    public Numbers(List<Integer> nums){
        this.numbers = nums;
    }

    public Numbers(int[] nums){
        for(int i = 0; i < nums.length;i++){
            numbers.add(i, nums[i]);
        }
    }

}
