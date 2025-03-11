import java.util.ArrayList;

public class exerciciosRec {
   public static void main(String[] args) {
    //--teste fatorial
    //int x = fatorial(3);
    //System.out.println(x);

    //--teste somatorio
    // int x = sum(4);
    // int y = sum(-4);
    // System.out.println(x);
    // System.out.println(y);

    //--teste fibonacci
    // int x = fib(8);
    // System.out.println(x);

    // //--teste somatorio intervalo
    // int x = somaInter(2,5);
    // System.out.println(x);
    // int y = somaInter(-2,2);
    // System.out.println(y);

    //--teste palindrome
    // String s = "ovo";
    // Boolean b = isPal(s);
    // System.out.println(b);

    // String z = "palidrome";
    // Boolean d = isPal(z);
    // System.out.println(d);

    //--teste coversao binario
    // int n = 256;
    // String s = convBase2(n);
    // System.out.println(s);

    //--teste somatorio ArrayList
    // ArrayList<Integer> a = new ArrayList<>();
    // a.add(0);
    // a.add(4);
    // a.add(6);
    // int n = sumArray(a);
    // System.out.println(n);

    //--teste findBiggest
    ArrayList<Integer> a = new ArrayList<>();
    a.add(0);
    a.add(4);
    a.add(-2);
    int n = findBiggest(a);
    System.out.println(n);    
   }
   
   static public int fatorial (int n){
    if(n < 0){
        return -1;
    }

    if(n == 0 || n == 1){
        return 1;
    }

    return (n * fatorial(n-1)); 
   }

   static public int sum(int n){
    if (n==0) {
        return n;
    }
    if (n>0){
        return n + sum(n-1);
    }
    else{
        return n + sum(n+1);
    }
   }

   static public int fib(int x){
    if(x < 0){
        return -1;
    }
    if(x == 0){
        return 0;
    }

    if(x <= 2){
        return 1;
    }

    return (fib(x-1)+fib(x-2));
   }

   static public int somaInter(int k, int j){
    if(k==j){
        return k;
    }
    if(k>j){
        return somaInter(j,k);
    }
    else{
        return (k + somaInter(k+1,j));
    }
   }

   static public boolean isPal(String s){
    if(s == ""){
        return false;
    }

    if(s.length()==1){
        return true;
    }
    
    return palRec(s, 0, s.length()-1);
    }

   
   static public boolean palRec(String s, int k, int j){

    if(k == j || k>j){
        return true;
    }
    if(s.charAt(k) != s.charAt(j)){
        return false;
    }
    return palRec(s,k+1,j-1);
   }
   
   static public String convBase2(int n){
    if(n < 0){
        return null;
    }

    if(n==0){
        return "0";
    }
    return binRec(n);
   }

   static public String binRec(int n){
    if(n==0){
        return "";
    }
    else{
        char c;
        if(n%2==0){
            c = '0';
        }
        else{
            c = '1';
        }
        return binRec(n/2) + c;
    }
   }

   static public int sumArray(ArrayList<Integer> a){
    if(a.isEmpty() == true){
        return 0;
    }
    else{
        int p = a.get(0);
        a.remove(0);
        return p + sumArray(a);
    }
   }

   static public int findBiggest(ArrayList<Integer> ar){
    if(ar.isEmpty() == true){
        return -999;
    }
    else{
        return bigRec(ar);
    }
   } 
   static public int bigRec(ArrayList<Integer> ar){
    if(ar.size() == 1){
        return ar.get(0);
    }
    int n = ar.get(0);
    ar.remove(0); 
    return Math.max(n, bigRec(ar)); 
   }
}    

