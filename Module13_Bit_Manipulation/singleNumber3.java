public class singleNumber3 {
    public int[] singleNumber(int[] nums) {
        int setArr[] = new int[nums.length];
        int setIndex = 0, lssbp = 0, xorResult = 0, temp = 0;
        int n1, n2;
        int answer[] = new int[2];
        for(int i=0; i<nums.length; i++) {
            xorResult = xorResult ^ nums[i];
        }
        temp = xorResult;
        lssbp = Integer.numberOfTrailingZeros(xorResult);
        for(int i=0; i<nums.length; i++) {
            if ((nums[i] & (1 << lssbp)) != 0) {
                setArr[setIndex] = nums[i];
                setIndex++;
            }
        }
        for(int i=0; i<setArr.length; i++) {
            temp = temp ^ setArr[i];
        }
        n1 = temp;
        n2 = n1 ^ xorResult;

        answer[0] = n1;
        answer[1] = n2;

        return answer;
    }
}
