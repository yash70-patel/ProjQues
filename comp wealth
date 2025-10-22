class Solution {
    public static void main(String rgs[]){
        int[][] accounts={{1,2,3},{4,5,6}};
        int res=maximumWealth(accounts);
        System.out.println(res);
    }
    static int maximumWealth(int[][] accounts) {
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                    sum+=accounts[i][j];
                    if(ans<sum){
                        ans=sum;
                    }
            }
            
        }
        return ans;
    }
}
