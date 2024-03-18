package android.gov.nist.javax.sip.header;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class SIPHeaderNamesCache {
    private static final Map lowercaseMap = new ConcurrentHashMap();

    static {
        Field[] fields;
        for (Field field : SIPHeaderNames.class.getFields()) {
            if (field.getType().equals(String.class) && Modifier.isStatic(field.getModifiers())) {
                try {
                    String str = (String) field.get(null);
                    String lowerCase = str.toLowerCase();
                    Map map = lowercaseMap;
                    map.put(str, lowerCase);
                    map.put(lowerCase, lowerCase);
                } catch (IllegalAccessException unused) {
                }
            }
        }
    }

    public static String toLowerCase(String str) {
        Map map = lowercaseMap;
        String str2 = (String) map.get(str);
        if (str2 == null) {
            String intern = str.toLowerCase().intern();
            map.put(str, intern);
            map.put(intern, intern);
            return intern;
        }
        return str2;
    }
}
