package africa.semicolon.phoneBook.data.models;


import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode
@ToString
public class Contact {
    @NonNull
    private String firstName;
    private String lastName;
    private String middleName;
    @NonNull
    private String mobile;
    private String office;
}
