public class R18_FriendsPair {
    public static int countFriendPair(int n) {
        // base case
        if (n == 1 || n == 2) {
            return n;
        }

        // pair bnao
        int pair = countFriendPair(n - 2);
        int pairWays = (n - 1) * pair;

        // single
        int single = countFriendPair(n - 1);
        return pairWays + single;
    }

    public static void main(String[] args) {
        int friends = 3;
        System.out.println(countFriendPair(friends));

    }

}
