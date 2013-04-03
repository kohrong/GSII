package metricsgsii;

import java.util.Scanner;

public class MetricsGSII {

    private static String projectName;
    private static String path;
    
    public static void main(String[] args) {
        introducePath();
        path = "/Users/Josue/NetBeansProjects/" + projectName;
        
        PackageMetrics packageMetrics = new PackageMetrics(path);
        packageMetrics.execute();
    }

    private static void introducePath() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el nombre del proyecto");
        projectName = scanner.nextLine();
    }
}
