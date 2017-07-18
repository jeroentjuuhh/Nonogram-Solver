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

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < numbers.size(); i++){
            result.append(numbers.get(i)).append(", ");
        }
        result.deleteCharAt(result.length()-2);

        return result.toString();
    }

    Numbers(int[] nums){
        numbers = new ArrayList<Integer>();
        for (int num : nums) {
            numbers.add(num);
        }
    }

}
