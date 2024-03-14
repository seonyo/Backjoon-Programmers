class Solution {
    public int solution(int a, int b) {
        int calc = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int multi = 2 * a * b;
        return calc > multi ? calc : multi;
    }
}