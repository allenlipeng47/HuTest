package treeset;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Required;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class A {

    @JsonProperty
    @NonNull
    String a;

    @JsonProperty
    @NonNull
    String b;
}
