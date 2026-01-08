package core.domain.Base;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data                   // Genera getters, setters, toString, equals, hashCode
@NoArgsConstructor      // Constructor vacío
@AllArgsConstructor     // Constructor con todos los campos
public class ObjectResponse {
    private int code;
    private String message;
    private Object item;
}