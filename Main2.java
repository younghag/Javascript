import java.util.*;
class Main {
  // static Scanner stdIn = new Scanner(System.in)
  // static int readPlusInt()
  public static void main(String[] args) {
  //   Scanner sc = new Scanner(System.in);
  //   System.out.print("정수 x: ");
  //   int x = sc.nextInt();
  //   int s = signOf(x);
  //   System.out.println("signOf(x)는"+s+"입니다.");
  // }
  // static int signOf(int n){
  //   if (n > 0)
  //     return 1;
  //   else if (n < 0)
  //     return -1;
  //   else
  //     return 0;
  //     Scanner sc = new Scanner(System.in);
  //     System.out.println("정수 a: "); int a = sc.nextInt();
  //     System.out.println("정수 b: "); int b = sc.nextInt();
  //     System.out.println("정수 c: "); int c = sc.nextInt();
  //     System.out.println("최소값은"+min(a,b,c)+"입니다. ");
  // }
  //     static int min(int a, int b, int c){
  //       int min = a;
  //       if (b<min) min = b;
  //       if (c<min) min = c;
  //       return min;
  //     Scanner sc = new Scanner(System.in);
  //     System.out.println("정수 a: "); int a = sc.nextInt();
  //     System.out.println("정수 b: "); int b = sc.nextInt();
  //     System.out.println("정수 c: "); int c = sc.nextInt();
  //     System.out.println("중간값은"+mid(a,b,c)+"입니다. ");
  // }
  //     static int mid(int a, int b, int c){
  //       int mid = a;
  //       if (a<mid<c || c<mid<a) mid = b;
  //       if (b<mid<a || a<mid<b) mid = c;
  //       return mid;
      // Scanner sc = new Scanner(System.in);
      // System.out.println("1부터 x까지의 합을 구하시오.");
      // System.out.println("x의 값: ");
      // int x = sc.nextInt();
      // System.out.print("1부터 "+x+"의 합은"+sumUp(x));
      // static int sumUp(int k){
      //   int sum = 0;
      // for (int i=1; i<=k; i++)
      //   sum+=i;
      //   return sum;
  //   static void printSeason(int m){
  //     switch(m)
  //     case 12:
  //     case 1:
  //     case 2: System.out.println("겨울입니다. ");
  //     break;
  //     case 3;
  //     case 4;
  //     case 5; System.out.println("봄입니다. ");
  //     break;
  //     case 6:
  //     case 7:
  //     case 8: System.out.println("여름입니다. ");
  //     break;
  //     case 9:
  //     case 10:
  //     case 11: System.out.println("겨울입니다. ");
  //   }
    
  // }
  // public static void main(String[] args){
  //   Scanner sc = new Scanner(System.in);
  //   System.out.println("몇월 입니까(1~12): ");
  //   int n = sc.nextInt();
  //   printSeason(n);
// Scanner sc = new Scanner(System.in);
// System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다. "); 
// System.out.print("단수는:"); int n = sc.nextInt();

// for (int i = 1;i <= n ; i++) {
//     putStart(i);
//     System.out.println();
//   }
// }// main 
  
// static void putStart(int n){
//   putChars('*',n);
// }

// static void putChars(char c, int n) {
//   while(n-- > 0)
//     System.out.print(c);
// }
// }
// static int random(int a, int b){
//     if (b <= a) {
//       return a;
//     }else{
//       Random rand = new Random();
//       return a + rand.nextInt(b-a+1);
//     }

//   }
// Scanner sc = new Scanner(System.in);
// int x;
// do{
//   int n = readPlusInt();

//   System.out.print("반대로 읽으면 ");
//   while(n>0){
//     System.out.print(n%10);
//     n = n / 10;
//   }
//   System.out.println("입니다");

//   do {
//     System.out.print("다시 한 번?<Yes...1/No...0>");
//     x=sc.nextInt();
//   }while (x!=0 && x!=1);
// }while(x==1);

// } // main  닫기

// static int readPlusInt() {
//   Scanner sc = new Scanner(System.in);
//   int x;
//   do {
//     System.out.print("양의 정수값:");
//     x = sc.nextInt();
//   } while(x <=0);
//   return x;
// Scanner sc = new Scanner(System.in);
// Random rand = new Random();

// System.out.println("암산 훈련!!");

// do {

//   //난수 발생
//   int x = rand.nextInt(900) + 100;//3자리수
//   int y = rand.nextInt(900) + 100;
//   int z = rand.nextInt(900) + 100;
//   int p = rand.nextInt(4);        //문제 유형

//   int answer = 0;
//   switch (p){
//     case 0: answer = x + y + z; break;
//     case 1: answer = x + y - z; break;
//     case 2: answer = x - y + z; break;
//     case 3: answer = x - y - z; break;

// }while(true){
//   System.out.print(x + ((p<2) ? "+":"-")+y+((p%2==0) ? "+":"-")+z+"=");
//   int k = sc.nextInt();
//   if (k==answer)
//     break;
//   System.out.println("틀렸습니다.");
// }

// }while(retry());
//   } // main end

// static boolean retry() {
//   Scanner sc = new Scanner(System.in);
//   int cond;
//   do {
//     System.out.print("다시 한 번?<Yes...1/No...0> :");
//     cond = sc.nextInt();
//   }while (cond != 0 && cond != 1);
//   return cond == 1;
Scanner sc = new Scanner(System.in);

System.out.println("요소수");
int n = sc.nextInt();
int[] a = new int[n];

for (int i = 0; i <n; i++){
  System.out.print("a["+i+"] : ");
  a[i] = sc.nextInt();
}

System.out.print("삭제를 시작할 인덱스 : ");
int d = sc.nextInt();
System.out.print("삭제할 요소의 개수 : ");
int e = sc.nextInt();

aryRmv(a, d, e);

for (int i = 0; i < n; i++){
  System.out.println("a["+i+"] = "+a[i]);
} 

}//main 닫기

static void aryRmv(int[] a, int d, int e){
  if (e > 0 && d >= 0 && d+e < a.length){
    int d2 = d + e - 1;
    if (d2 > a.length - e - 1)
    d2 = a.length-e-1;
    for(int i = d; i <= d2; i++){
      a[i] = a[i+e];
    }}}
  
}