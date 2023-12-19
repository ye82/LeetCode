package Sort;

public class KuaiPaisort {
    public static void main(String[] args) {
        int[] nums = {9,-1,-5,0,8,5,7,3,4};
        Kuaipsort(0,nums.length - 1,nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    static int partiction(int[] nums,int l,int r){
        int pivot =  nums[l];
        int ll = l + 1,rr = r;
        while (ll <= rr){
            while (ll <= rr && pivot >= nums[ll]){
                ll++;
            }
            while (ll <= rr && pivot <= nums[rr]){
                rr--;
            }
            if (ll <= rr){
                swap(nums,ll,rr);
                ll++;
                rr--;
            }
        }
        swap(nums,l,rr);
        return rr;
    }

    static void swap(int[] nums,int a,int b){
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }
    static void Kuaipsort(int l,int r,int[] nums){
        if (l < r) {
            int index = partiction(nums,l,r);
            Kuaipsort(l,index - 1,nums);
            Kuaipsort(index + 1,r,nums);
        }
    }
}
