package Day14;

public class rainWaterTrapped {
    public static void main(String[] args) {

        // int height[] = { 4, 2, 0, 6, 3, 2, 5 }; // l=7 ->>height[l-1] ->>height[6]
        // ->5
        int height[] = { 7, 0, 4, 2, 5, 0, 6, 4, 0, 5 };

        // length of array
        int l = height.length;

        int leftMax[] = new int[l];
        // int leftMax[] = { 4,0,0,0,0,0,0 };

        leftMax[0] = height[0];
        // 1.Calculte the left Max of Array
        for (int i = 1; i < l; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        int rightMax[] = new int[l];
        // int leftMax[] = { 0,0,0,0,0,0,5 };
        // 2. Calculte the right Max of Array
        rightMax[l - 1] = height[l - 1];
        for (int i = l - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int trappedWater = 0;
        for (int i = 0; i < l; i++) {
            // 3. Water Level =min(LMA, RMA)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            // tw = wt - hb;
            // 4. trapped Water =(Water Level -Hight of Bar)*width
            trappedWater += (waterLevel - height[i]);

        }

        System.out.print("Trapped Water : " + trappedWater);

    }

}
