public class AloMundo2 {
  public static void main(String[] args){
    if(args.length < 2){
      System.out.println("não colocastes tudo o que era pra te colocardo \n corno");
      return;
    }
    else if(args.length > 2){
      System.out.println("colocartes coisa demais\n corno");
      return;
    }
    System.out.println("eu odeio " + args[0] + " que tem em anos vividos: " + args[1] );
  }
}
