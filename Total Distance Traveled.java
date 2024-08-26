class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int val=mainTank*10;
        for(int i=1;i<=mainTank;i++){
            if(i%5==0 && additionalTank>0){
             val+=10;
             additionalTank-=1;
             mainTank+=1;
            }
        }
        return val;
    }
}
