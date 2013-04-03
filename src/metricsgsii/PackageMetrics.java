package metricsgsii;

import java.io.File;


public class PackageMetrics {

    private String path;
    
    public PackageMetrics(String path) {
        this.path = path;
    }

    public void execute() {
        File projectFolder = new File(path);
        for(File file : projectFolder.listFiles()){
            System.out.println(file.getName());
        }
        
        getNumberOfPackage();
    }

    private void getNumberOfPackage() {
        File codeProjectFolder = new File(path+"src");
    }

}
