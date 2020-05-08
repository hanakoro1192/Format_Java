package findEmpolyee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class findEmpolyee  {
    public static void main(String[] args) throws IOException {
        int i = 0;
        int x = 0;
        int y = 0;
        int w = 0;

        int[] employee = new int[10];
        String[] name = new String[10];
        String[] department = new String[10];
        int[] extension_number = new int[10];
        int[] num = new int[10];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("****EmployeeInformation****");

        for(i = 0; x == 0 && i < 10; i++){

            int input = Integer.parseInt(br.readLine());
            num[i] = input;

            if(input != 0){
                System.out.println((i + 1) + "/10" + "EmployeeNumber" + (input));
                employee[i] = input;

                //名前
                System.out.print((i + 1) + "/10" + "PersonName:");
                name[i] = br.readLine();

                System.out.print((i + 1) + "DeploymentName:");
                department[i] = br.readLine();

                System.out.println((i + 1) + "ExtensionNumber");
                extension_number[i] = Integer.parseInt(br.readLine());
            }else{
                    x++;
            }
            if(i == 10 || x == 1){
                System.out.println("****EmployeeSerach****");
            }else{
                System.out.println("----------------------");
            }
        }

        for(i = 0; w == 0 && i < 10; i++){
            y = Integer.parseInt(br.readLine());

            if(y == 0){
                w++;
            }else{
                if(y == employee[i]){
                    System.out.println("EmployeeNumber?:" + employee[i]);
                    System.out.println("DeploymentName?:" + department[i]);
                    System.out.println("PesonName?:" + name[i]);
                    System.out.println("ExtensionNumber?:" + extension_number[i]);
                }else{
                    System.out.println("error" + "Employee");
                }
            }
        }
    }
}