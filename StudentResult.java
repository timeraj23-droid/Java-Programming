class StudentResult1
{

String name;
int rollno,mark1,mark2,mark3;
int total;
double average;

void getdata(String name,int rollno)
{
this.name=name;
this.rollno=rollno;
System.out.println(" Name:"+name);

System.out.println("Rollno:"+rollno);
}

int calculateTotal(int a,int b,int c)
{
mark1=a;
mark2=b;
mark3=c;
total=a+b+c;
System.out.println("Total:"+total);

return total;
}

double calculateAverage(int total)
{
average=total/3.0;
System.out.println("Average:"+average);
return average;
}

char calculateGrade(double average)
{
char grade;
if(average>=90)
{
grade='A';
}
else if(average>=80)
{
grade='B';

}

else if(average>=70)
{
grade='C';
}

else
{
grade='D';
}
System.out.println("Grade"+grade);
return grade;
}
}
public class StudentResult{
public static void main(String[]args)
{
StudentResult1 r=new StudentResult1();
r.getdata("Time",05);
int total=r.calculateTotal(20,30,50);
double average=r.calculateAverage(total);
r.calculateGrade(average);

}}