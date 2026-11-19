package nl.jase.patterns.creational.abstractfactory.cloud;

public class Application {
    static void main() {
        String fileName = "report.pdf";

        CloudApplication aws = new CloudApplication(new AwsCloudFactory());
        CloudApplication azure = new CloudApplication(new AzureCloudFactory());

        aws.uploadFile(fileName);
        azure.uploadFile(fileName);

    }
}
