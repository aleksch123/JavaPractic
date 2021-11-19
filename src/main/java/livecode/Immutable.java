package livecode;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

public class Immutable {

    public static void main(String[] args) throws Exception {
        AddressExtractor addressExtractor = new AddressExtractor();
        Class<? extends AddressExtractor> clazz = addressExtractor.getClass();
        Field field = clazz.getDeclaredField("pointerValue");
        Field type = Field.class.getDeclaredField("type");
        AccessibleObject.setAccessible(new AccessibleObject[]{field, type}, true);
        type.set(field, Object.class);

        String s = "test";
        field.set(addressExtractor, s);
        System.out.println(Long.toHexString(addressExtractor.pointerValue));

        s = s+ "test";
        field.set(addressExtractor, s);
        System.out.println(Long.toHexString(addressExtractor.pointerValue));
    }

    static class A{
        int i=10;
    }

     static class AddressExtractor {
        public long pointerValue;
    }
}
