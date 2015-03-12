package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main18 {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        Activity[] staff = new Activity[5];
        int i=0;
        String str, s1=null, s2=null , s3=null, s4=null;
        Scanner in = new Scanner(new File("d://java/src/com/company/многоогентная_система/file.txt"));
        while (in.hasNext()) {
            //s = in.next();
            if (i%4==0)
            {
                s1 = in.next();
                i++;
                continue;
            }
            if (i%4==1)
            {
                s2 = in.next();
                i++;
                continue;
            }
            if (i%4==2)
            {
                s3 = in.next();
                i++;
                continue;
            }
            if (i%4==3)
            {
                s4 = in.next();
                staff[i/4] = new Activity(s1, s2, s3, s4);
                i++;
                continue;
            }
          //
        }
        in.close();
       /** for(Activity e:staff)
        {
            System.out.println("Фамилия"+'\t'+'\t'+'\t'+e.getLastName()+'\n'+"Имя"+'\t'+'\t'+'\t'+'\t'+e.getFirstName()+'\n'+"Отчество"+'\t'+'\t'+e.getPatronymic()+'\n'+"Дата рождения"+'\t'+e.getBirthday()+'\n');
        }
*/

        Scanner in2 = new Scanner(new File("d://java/src/com/company/многоогентная_система/file1.txt"));
        str = in2.nextLine();

        in2.close();


        //Scanner in1 = new Scanner (System.in);
        StringBuilder strA = new StringBuilder();
        //String str = in1.nextLine();
        char[] str1 = str.toCharArray();
        int a;
        if(str1[0]=='$' && str1[1]=='S')
        {
            if (str1[2]=='F' && str1[3]=='A' && str1[4]=='M')
            {
                for (a=7; a<str1.length-2; a++) {strA.append(str1[a]);}
                str = strA.toString();
                System.out.println(str);
                for (int i1=0; i1<staff.length; i1++)
                {
                    if (staff[i1].getLastName().equalsIgnoreCase(str))
                    {
                        System.out.println("Имя"+'\t'+'\t'+'\t'+'\t'+staff[i1].getFirstName()+'\n'+"Фамилия"+'\t'+'\t'+'\t'+staff[i1].getLastName()+'\n'+"Отчество"+'\t'+'\t'+staff[i1].getPatronymic()+'\n'+"Дата рождения"+'\t'+staff[i1].getBirthday());
                        //break;
                    }
                }
            }
            if (str1[2]=='N' && str1[3]=='A' && str1[4]=='M')
            {
                for (a=7; a<str1.length-2; a++) {strA.append(str1[a]);}
                str = strA.toString();
                System.out.println(str);
                for (int i1=0; i1<staff.length; i1++)
                {
                    if (staff[i1].getFirstName().equalsIgnoreCase(str))
                    {
                        System.out.println("Имя"+'\t'+'\t'+'\t'+'\t'+staff[i1].getFirstName()+'\n'+"Фамилия"+'\t'+'\t'+'\t'+staff[i1].getLastName()+'\n'+"Отчество"+'\t'+'\t'+staff[i1].getPatronymic()+'\n'+"Дата рождения"+'\t'+staff[i1].getBirthday());
                        //break;
                    }
                }
            }
            if (str1[2]=='O' && str1[3]=='T' && str1[4]=='H')
            {
                for (a=7; a<str1.length-2; a++) {strA.append(str1[a]);}
                str = strA.toString();
                System.out.println(str);
                for (int i1=0; i1<staff.length; i1++)
                {
                    if (staff[i1].getPatronymic().equalsIgnoreCase(str))
                    {
                        System.out.println("Имя"+'\t'+'\t'+'\t'+'\t'+staff[i1].getFirstName()+'\n'+"Фамилия"+'\t'+'\t'+'\t'+staff[i1].getLastName()+'\n'+"Отчество"+'\t'+'\t'+staff[i1].getPatronymic()+'\n'+"Дата рождения"+'\t'+staff[i1].getBirthday());
                        //break;
                    }
                }
            }
            if (str1[2]=='D' && str1[3]=='A' && str1[4]=='T')
            {
                for (a=7; a<str1.length-2; a++) {strA.append(str1[a]);}
                str = strA.toString();
                System.out.println(str);
                for (int i1=0; i1<staff.length; i1++)
                {
                    if (staff[i1].getBirthday().equalsIgnoreCase(str))
                    {
                        System.out.println("Имя"+'\t'+'\t'+'\t'+'\t'+staff[i1].getFirstName()+'\n'+"Фамилия"+'\t'+'\t'+'\t'+staff[i1].getLastName()+'\n'+"Отчество"+'\t'+'\t'+staff[i1].getPatronymic()+'\n'+"Дата рождения"+'\t'+staff[i1].getBirthday());
                        //break;
                    }
                }
            }
        }



    }
}
class Activity
{
    private String first_name;//ИМЯ
    private String last_name;//ФАМИЛИЯ
    private String patronymic;//ОТЧЕСТВО
    private String birthday;//ДАТА РОЖДЕНИЯ

    public Activity(String last_name1, String first_name1, String patronymic1, String birthday1)
    {
        this.last_name = last_name1;
        this.first_name = first_name1;
        this.patronymic = patronymic1;
        this.birthday = birthday1;
    }
    public String getFirstName()
    {
        return this.first_name;
    }
    public String getLastName()
    {
        return this.last_name;
    }
    public String getPatronymic()
    {
        return this.patronymic;
    }
    public String getBirthday()
    {
        return this.birthday;
    }
}