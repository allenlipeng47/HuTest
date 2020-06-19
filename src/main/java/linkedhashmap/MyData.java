package linkedhashmap;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode
@AllArgsConstructor
@ToString
public class MyData {

    public int userId;

    @EqualsAndHashCode.Exclude
    public int createdAt;

}
