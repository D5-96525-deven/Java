

import java.util.*;

class Student {
    int rollNo;
    String name;
    double marks;

    public Student() {
        
    }
    
    public Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;
        Student s = (Student) obj;
        return this.rollNo == s.rollNo;
    }

    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
    }
}

class SortByRollNo implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getRollNo()- o2.getRollNo();
	}
	
}

class SortByName implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
}

class SortByMarks implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return Double.compare(o1.getMarks(), o2.getMarks());
	}
	
}

public class Program {
	
	static List<Student> stud = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);
    
    public static Student[] getStudent() 
    {
    	
	    Student [] arr = new Student[4];
	    
	    arr[0] = new Student(101, "Deven", 88.5);
	    arr[1] = new Student(102, "IDK", 98.5);
	    arr[2] = new Student(130, "Random", 78.5);
	    arr[3] = new Student(196, "Unknown", 85);
	    
	    return arr;
    
    }
    
    public static void PrintStudents()
    {
    	for(var s: stud)
    	{
    		System.out.println(s.toString());
    	}
    }
    
    public static void addStudent(Student [] arr)
    {
    	for ( var arr_stud:arr)
    	{
    		stud.add(arr_stud);
    	}
    }
    
    public static void acceptStud(int [] rollno)
    {
    	System.out.println("Enter the Roll no: ");
    	rollno[0] = sc.nextInt();
    }
    
    public static Student findStud(int rollno)
    {
    	Student temp = new Student();
    	temp.setRollNo(rollno);
    	int pos = stud.indexOf(temp);
    	if(pos!=-1)
    	{
    		return stud.get(pos);
    	}
    	return null;
    }
    
    public static boolean delStud(int rollno)
    {
    	Student temp = new Student();
    	temp.setRollNo(rollno);
    	int pos = stud.indexOf(temp);
    	if(stud.contains(temp))
    	{
    		stud.remove(pos);
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    }
    
    public static boolean updateStud(int rollno)
    {
    	Student temp = new Student();
    	temp.setRollNo(rollno);
    	int pos = stud.indexOf(temp);
    	if(stud.contains(temp))
    	{
    		
    		Student student = stud.get(pos);
    		System.out.println("Enter Which Part You wanna Modify: ");
    		
    		System.out.println();
    		
    		System.out.println("0.Exit");
    		System.out.println("1.Modify name");
    		System.out.println("2.Modidy Marks");
    		int choice = sc.nextInt();
    		
    		
    	       {
    	    	   switch (choice)
    	    	   {
    	    	   case 0:
    	    		   System.out.println("Thankuuuu");
    	    
    	    		   break;
    	    	   case 1:
    	    		   System.out.print("Enter the Name: ");
    	    		   String name = sc.next();
    	    		   student.setName(name);
    	    		   break;
    	    	   case 2:
    	    		   System.out.print("Enter The Marks: ");
    	    		   double marks = sc.nextDouble();
    	    		   student.setMarks(marks);
    	    		   break;

    	    	   }
    	    	   System.out.println();
    	       }
    		return true;
    		
    	}
    	else
    	{
    		return false;
    	}
    }
    
    public static int menuList( ) {
		System.out.println("0.Exit");
		System.out.println("1.Add Students");
		System.out.println("2.Find Student");
		System.out.println("3.Remove Student");
		System.out.println("4.Update Student");
		System.out.println("5.Sort Student");
		System.out.println("Enter the choice : ");
		return sc.nextInt(); 
	}

    public static int menuList2( ) {
		System.out.println("0.Exit");
		System.out.println("1. Sort the students on rollno");
		System.out.println("2. Sort the students on name");
		System.out.println("3. Sort the students on marks");
		System.out.println("Enter the choice : ");
		return sc.nextInt(); 
	}
    
    
	
    public static void main(String[] args) {
       int [] rollno = new int[1];
       int choice;
       
       while((choice=menuList())!=0)
       {
    	   switch (choice)
    	   {
    	   case 1:
    		   Student [] arr = Program.getStudent();
    		   Program.addStudent(arr);
    		   break;
    		   
    	   case 2:
    		   Program.acceptStud(rollno);
    		   Student s1 = Program.findStud(rollno[0]);
    		   if(s1 != null)
	    		   {
	    			   System.out.println("LOCATED....!!!!");
	    			   System.out.println(s1.toString());
	    		   }
    		   else
	    		   {
	    			   System.out.println("Not Found");
	    		   }
    		   break;
    		   
    	   case 3:
    		   Program.acceptStud(rollno);
    		   
    		   if(Program.delStud(rollno[0]))
	    		   {
	    			   System.out.println("Student is Remove from List");
	    		   }
    		   else
	    		   {
	    			   System.out.println("Student Not Found");
	    		   }
    		   
    		   break;
    	   case 4:
    		   Program.acceptStud(rollno);
    		   if(Program.updateStud(rollno[0]))
	    		   {
	    			   System.out.println("Student is Updated");
	    		   }
    		   else
	    		   {
	    			   System.out.println("Student Not Found");
	    		   }
    		   break;
    	   case 5:
    		   
    		   Comparator<Student> comparator = null;
    		   int choice2;
    		   while((choice2 = menuList2())!=0)
    		   {
	    		   switch (choice2) 
	    		   {
	    		   
	    		   		case 0:
	    		   		{
	    		   			System.out.println("Thankuu for sorting...");
	    		   		}
	    		   		break;
	    		   		
	    		   		case 1:
	    		   		{
	    		   			System.out.println("Sorting by Roll No...");
	    		   			comparator = new SortByRollNo();
	    		   		}
	    		   		break;
	    		   		
	    		   		case 2:
	    		   		{
	    		   			System.out.println("Sorting by Name...");
	    		   			comparator = new SortByName();
	    		   		}
	    		   		break;
	    		   		
	    		   		case 3:
	    		   		{
	    		   			System.out.println("Sorting by Marks...");
	    		   			comparator = new SortByMarks();
	    		   		}
	    		   		break;
	    		   
	    		   }
	    		   stud.sort(comparator);
	    		   Program.PrintStudents();
	    		   
    		   }
			
    		   break;
    	   case 0:
    		   System.out.println("Thankuuuuu");
    		   break;
    		   
    	   }
       }
   
        
        
        
        

        
    }
}
