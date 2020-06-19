package treeset;

import com.fasterxml.jackson.databind.ObjectMapper;

public class MyClass {

    public static void main(String[] args) throws Exception{
        ObjectMapper objectMapper = new ObjectMapper();
        A a  = objectMapper.readValue("{\"a\":\"1\"}", A.class);
        System.out.println(a);

    }

}
