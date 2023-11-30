package ie.atu.mettingtest;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "meetings")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Meeting {
    private String meetingId;
    private String title;
    private String image;
    private String address;
    private String description;
}
