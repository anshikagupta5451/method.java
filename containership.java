/this code explain about the containership which means one class object declare as an attribute in other class .
public class Stu1 {
  int rollno;
  int marks;
  String name ;
  String cname;
  String coursename;
}
class Test45
{
  int num;
  // container ship
  Stu1 obj;  // member attribute   instance variable
  Test45()
  {
    num = 90;
    obj = new Stu1();
    obj.rollno= 100;
  }
}
class Test45Main
{
  public static void main(String[] args) {
    Test45 abcd = new Test45();
    System.out.println(abcd.num);
    System.out.println(abcd.obj.rollno); // nestin
  }
}
