package FirstStepsInCoding;
import java.util.Scanner;

public class ProjectsCreation_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String architect = scanner.nextLine();
        int projectCount = Integer.parseInt(scanner.nextLine());
        int projectTime = 3;
        int workHours = projectTime * projectCount;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", architect, workHours, projectCount);

    }
}
