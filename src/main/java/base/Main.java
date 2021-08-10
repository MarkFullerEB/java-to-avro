package base;

import base.schema.Parent;
import org.apache.avro.reflect.ReflectData;
import org.apache.avro.Schema;

public class Main {
    public static void main(String args[]) {
        Schema schema = ReflectData.get().getSchema(Parent.class);

        System.out.println(schema.toString());
    }
}
