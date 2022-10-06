public class Numero {
  public static double max(double[] nums){
    double n = nums[0];
    for(int i = 0; i < nums.length; i++ ){
      if(n < nums[i]){
        n = nums[i];
      }
    }
    return n;
  }
  public static double min(double[] nums){
    double n = nums[0];
    for(int i = 0; i < nums.length; i++ ){
      if(n > nums[i]){
        n = nums[i];
      }
    }
    return n;
  }
  public static double avg(double[] nums){
    double n = 0;
    for(int i = 0; i < nums.length; i++ ){
      n += nums[i];
    }
    return n/nums.length;
  }
  public static void main(String[] args){
    double[] nums = new double[args.length];
    for(int i = 0; i < args.length; i++){
      nums[i] = Double.parseDouble(args[i]);
    }
    System.out.println("Maior num:" + max(nums) + "\nMenor num: " + min(nums) + "\nMédia dos nums: " + avg(nums));
  }
}
