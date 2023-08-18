class GlobalVar
{
static int a;
static int b;
int c;
int d;
	public static void main(String []args)
	{
//global static variables
a=1;
b=2;
int add=a+b;
int sub=a-b;
int mul=a*b;
int div=a/b;

System.out.println("addition->"+add+" multiplaction->"+mul+" substraction->"+sub+"  division->"+div);

GlobalVar g=new GlobalVar();
g.c=1;
g.d=2;
int add1=add1(g.c,g.d);
int sub1=sub1(g.c,g.d);
int mul1=mul1(g.c,g.d);
int div1=div1(g.c,g.d);

System.out.println("addition->"+add1+" multiplaction->"+mul1+" substraction->"+sub1+"  division->"+div1);

	}
static int add1(int a,int b){
return a+b;
}

static int sub1(int a,int b){
return a-b;
}

static int mul1(int a,int b){
return a*b;
}

static int div1(int a,int b){
return a/b;
}


static void add(int a,int b){
System.out.println(a+b);
}

static void sub(int a,int b){
System.out.println(a-b);
}

static void mul(int a,int b){
System.out.println(a*b);
}

static void div(int a,int b){
System.out.println(a/b);
}

}