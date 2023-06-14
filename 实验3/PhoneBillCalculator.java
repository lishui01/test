public class PhoneBillCalculator {
    private static final double RATE_UNDER_20_MINUTES = 0.05;  // 超过20分钟前每分钟的费率
    private static final double RATE_OVER_20_MINUTES = 0.10;   // 超过20分钟后每分钟的费率
    private static final double BASE_COST_OVER_20_MINUTES = 1.00; // 超过20分钟的基础费用

    public static double calculateCallCost(int callDurationSeconds) {
        // 将通话时间向上进位到分钟
        int callDurationMinutes = (int) Math.ceil(callDurationSeconds / 60.0);

        if (callDurationMinutes <= 0) {
            return 0.00;  // 通话时间为0或负数，费用为0
        } else if (callDurationMinutes <= 20) {
            return callDurationMinutes * RATE_UNDER_20_MINUTES;  // 通话时间不超过20分钟，按每分钟0.05美元计费
        } else {
            double cost = BASE_COST_OVER_20_MINUTES;  // 超过20分钟的基础费用
            int additionalMinutes = callDurationMinutes - 20;  // 超过20分钟的额外分钟数
            cost += additionalMinutes * RATE_OVER_20_MINUTES;  // 按每分钟0.10美元计费
            return cost;
        }
    }
}
