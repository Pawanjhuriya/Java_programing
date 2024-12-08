import java.util.*;
public class trapwater {
    public static int trapwaters(int height[]){
        int n = height.length;
        //calculate left max boundary
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for(int i=1; i<n; i++){
            leftmax[i] = Math.max(height[i], leftmax[i-1]);
        }

        //calculate right max boundary
        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];
        for(int i= n-2; i>=0; i--){
            rightmax[i] = Math.max(height[i], rightmax[i+1]);
        }
    }
    
}
