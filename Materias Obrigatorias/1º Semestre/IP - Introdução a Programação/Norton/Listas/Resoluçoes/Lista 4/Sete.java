class Sete {
  public static boolean Inverso (int [] num) {
  boolean teste = true;
    for (int i = 0; i<num.length /2; i++) {
      if (num [i] != num[num.length - 1 - i]) {
      teste = false;
      }
    }
    return teste;
  }
  public static void main (String [] args) {
    int [] num1 = {2,4,1,4,2};
    System.out.println (Inverso (num1));
  }
}
