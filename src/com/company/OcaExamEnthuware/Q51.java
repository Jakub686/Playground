package com.company.OcaExamEnthuware;

public class Q51 {
}
class TestCla578576ss{
    public static void main(String args[]){
        B2 c2 = new C2();
        System.out.println(c2.max(10, 20));
    }
}
class A2{
    int max(int x, int y)  { if (x>y) return x; else return y; }
}
class B2 extends A2{
    int max(int x, int y)  {  return 2 * super.max(x, y) ; }
}
class C2 extends B2{
    int max(int x, int y)  {  return super.max( 2*x, 2*y); }
}