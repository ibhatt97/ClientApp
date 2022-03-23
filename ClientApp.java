import java.io.*;
import java.lang.*;
import java.util.*;

public class ClientApp
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		LockedMe lm = new LockedMe();
		String file_name;
		System.out.println("Menu:");
		System.out.println("");
		System.out.println("1.View files");
		System.out.println("2.Delete files");
		System.out.println("3.Check files existence");
		System.out.println("4.Write and create files");
		System.out.println("5.Display files");
		System.out.println("6.Exit");
		System.out.println("");
		int cho;
		do{
			System.out.print("Enter choice: ");
			cho = sc.nextInt();
			switch(cho)
			{
				case 1:
					lm.file_display_all();
				break;
			
				case 2:
					System.out.print("Enter the file name you want to delete: ");
					file_name = sc.nextLine();
					lm.file_delete(file_name);
				break;
			
				case 3:
					System.out.print("Enter the file name you want to search: ");
					file_name = sc.nextLine();
					lm.file_search(file_name);
				break;
			
				case 4:
					System.out.print("Enter the file name you want to write and create: ");
					file_name = sc.nextLine();
					lm.file_write(file_name);
				break;
			
				case 5:
					System.out.print("Enter the file name you want to display: ");
					file_name = sc.nextLine();
					lm.file_display(file_name);
				break;
			
				case 6:
					System.exit(0);
				break;
			
				default:
					System.out.println("Invalid Input");
				break;
			}
		}while(cho != 6);
	}
}
