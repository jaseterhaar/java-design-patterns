package nl.jase.patterns.creational.abstractfactory.cloud;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CloudApplicationTest {

    @Test
    void shouldUploadAndNotify() {
        List<String> events = new ArrayList<>();
        CloudApplication application = new CloudApplication(new TestCloudFactory(events));

        application.uploadFile("report.pdf");

        assertEquals(
            List.of(
                "upload: report.pdf",
                "notify: report.pdf"
            ),
            events
        );
    }


    @Test
    void shouldNotNotifyWhenUploadFails() {
        List<String> events = new ArrayList<>();
        CloudApplication application = getApplication(events);

        IllegalStateException exception = assertThrows(
            IllegalStateException.class,
            () -> application.uploadFile("report.pdf")
        );

        assertEquals("Upload failed", exception.getMessage());
        assertEquals(List.of("upload:report.pdf"), events);
    }

    private CloudApplication getApplication(List<String> events) {
        CloudFactory factory = new CloudFactory() {

            @Override
            public Storage createStorage() {
                return filename -> {
                    events.add("upload:" + filename);
                    throw new IllegalStateException("Upload failed");
                };
            }

            @Override
            public Notification createNotification() {
                return message -> events.add("notify:" + message);
            }
        };

        return new CloudApplication(factory);
    }

}
