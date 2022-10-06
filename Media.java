public class Media {
	public static int graf(int[] nums){
		for(int i = 0; i < nums.length; i++){
			System.out.print("Aluno 0" + (i+1));
			for(int j = 0; j < nums[i]; j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
		double n = 0;
    for(int i = 0; i < nums.length; i++ ){
      n += nums[i];
    }
    return (int)(n/nums.length);
	}
  public static void main(String[] args){
		int[] nums = new int[args.length];
    for(int i = 0; i < args.length; i++){// pra transforma os string em ints
      nums[i] = Integer.parseInt(args[i]);
    }
    System.out.println(graf(nums));
  }
}
