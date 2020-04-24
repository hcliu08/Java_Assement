package Tasks;

public class Solution2 {
    public int[] solution(int[] A, int N, int K){
        int[] B = new int[N];
        if (N == 0 || N==1){
            return A;
        }
        else{
            for(int i = 0; i < N; i++){
                if(N-K+i < N){
                    B[i] = A[N-K+i];
                }
                else{
                    B[i] = A[i-K];
                }
            }
            return B;
        }
    }
}
