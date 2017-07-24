import java.util.ArrayList;
import java.util.List;

/**
 * Either a row or a column
 *
 */
public class Numbers {

    private List<Integer> numbers;

    Numbers(List<Integer> nums){
        this.numbers = nums;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        for (Integer number : numbers) {
            result.append(number).append(", ");
        }
        result.deleteCharAt(result.length()-2);

        return result.toString();
    }

    int getAtIndex(int index){
        return numbers.get(index);
    }

    int getSize(){
        return numbers.size();
    }

    int getMagicNumber(){
        int sum = 0;
        int amount = 0;
        for(int i = 0; i < numbers.size(); i++){
            sum += numbers.get(i);
            amount++;
        }
        return sum + amount-1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Numbers numbers1 = (Numbers) o;

        return numbers != null ? numbers.equals(numbers1.numbers) : numbers1.numbers == null;
    }

    @Override
    public int hashCode() {
        return numbers != null ? numbers.hashCode() : 0;
    }

    Numbers(int[] nums){
        numbers = new ArrayList<Integer>();
        for (int num : nums) {
            numbers.add(num);
        }
    }

}
