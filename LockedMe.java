import java.io.*;
import java.lang.*;
import java.util.*;

public class LockedMe
{
	public static void file_display_all()
	{
		File file = new File("~/Documents/ClientApp");
		String[] fileList = file.list();
		for(String name:fileList)
		{
			System.out.println(name);
		}
	}
	public static void file_delete(String str)
	{
		File f = new File(str);
		try
		{
			if(f.delete())
			{
				System.out.println("File found: "+f.getName());
			}
			else
			{
				System.out.println("File not found or deleted.");
			}
			
		}
		catch(Exception e)
		{
			System.out.println("An error Occured.");
			e.getStackTrace();
		}
	}
	public static void file_search(String str)
	{
		File f = new File(str);
		try
		{
			if(f.exists())
			{
				System.out.println("File found: "+f.getName());
			}
			else
			{
				System.out.println("File not found.");
			}
		}
		catch(Exception e)
		{
			System.out.println("An error Occured.");
			e.getStackTrace();
		}
	}
	public void file_write(String str)
	{
		File f = new File(str);
		try{
			if(f.createNewFile())
			{
				System.out.println("File created: "+f.getName());
			}
			else
			{
				System.out.println("File can't be written.");
			}
		}catch(Exception e)
		{
			System.out.println("An error Occured.");
			e.getStackTrace();
		}
	}
	public static void file_display(String str)
	{
		try{
			File f = new File(str);
			Scanner sc = new Scanner(f);
			if(f.exists())
			{
				while(sc.hasNextLine())
				{
					String data = sc.nextLine();
        				System.out.println(data);
				}
			}
			else
			{
				System.out.println("File already exists.");
			}
		}catch(Exception e)
		{
			System.out.println("An error Occured.");
			e.getStackTrace();
		}
	}
}
