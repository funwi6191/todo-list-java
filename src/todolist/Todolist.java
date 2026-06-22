
package todolist;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collections; 


public class Todolist {
    //static Scanner s = new Scanner(System.in);

    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
            ArrayList<String> task = new ArrayList<>();
            LocalDate currentDate = LocalDate.now();
            DateTimeFormatter longDateFormatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy");
            String headerDate = currentDate.format(longDateFormatter);
            
            boolean loop = true;
            
            while(loop){
                
                System.out.println("===== To-Do List =====");
                System.out.println("1. Add Task");
                System.out.println("2. View All Task");
                System.out.println("3. Mark Task as Completed");
                System.out.println("4. Delete Task");
                System.out.println("5. Exit");
                System.out.print("Enter an option(1-5): ");
                int option = s.nextInt();
                switch(option){
                    case 1:
                        s.nextLine();
                        System.out.print("Enter Task: ");
                        String tasks = s.nextLine().toUpperCase();
                        task.add(tasks);
                        System.out.println("Task Added!");
                        System.out.println("Created on: " + headerDate);
                        System.out.println("Enter Task Duration: " + currentDate + 30);
                        break;
                    case 2:
                        Collections.sort(task);
                        for(int i = 0; i < task.size(); i++ ){
                            System.out.println(i + " Task: "   +  task.get(i) + " | " + " Date Created: " + headerDate + "Due Date: " + currentDate + 30 );
                        }
                    break;   
                    case 3:
                         s.nextLine();
                        System.out.print("Enter Task You Have Completed: ");
                        String taskc = s.nextLine().toUpperCase();
                        if (task.contains(taskc)) {
                            System.out.println("Task: " +  taskc + " Completed");
                            task.remove(taskc);
                        }else{
                            System.out.println(taskc + "Not Found!");
                        }
                    break;
                    case 4:
                        s.nextLine();
                        System.out.print("Enter Task You Want to Delete: ");
                        String taskd = s.nextLine().toUpperCase();
                        if (task.contains(taskd)) {
                            System.out.println("Task: " +  taskd + " Deleted");
                            task.remove(taskd);
                        }else{
                            System.out.println(taskd + "Not Found!");
                        }
                    break;
                    case 5:
                        System.out.println("GoodBye!");
                        loop = false;
                    break;                       
                }
                
            }
        s.close();   
            
            
    }
    
}
