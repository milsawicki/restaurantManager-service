package MainPackage.TransferObjects;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class WaiterTO {
    private Long id;
    private String name;
    private String surname;
}
