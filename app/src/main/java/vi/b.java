package vi;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap f47557a;

    static {
        HashMap hashMap = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(b.class.getResourceAsStream("/org/commonmark/internal/util/entities.properties"), StandardCharsets.UTF_8));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    if (readLine.length() != 0) {
                        int indexOf = readLine.indexOf(Separators.EQUALS);
                        hashMap.put(readLine.substring(0, indexOf), readLine.substring(indexOf + 1));
                    }
                } else {
                    bufferedReader.close();
                    hashMap.put("NewLine", Separators.RETURN);
                    f47557a = hashMap;
                    return;
                }
            }
        } catch (IOException e10) {
            throw new IllegalStateException("Failed reading data for HTML named character references", e10);
        }
    }

    public static String a(String str) {
        int i10;
        if (str.startsWith(Separators.AND) && str.endsWith(Separators.SEMICOLON)) {
            String substring = str.substring(1, str.length() - 1);
            if (substring.startsWith(Separators.POUND)) {
                String substring2 = substring.substring(1);
                if (!substring2.startsWith("x") && !substring2.startsWith(TokenNames.f24321X)) {
                    i10 = 10;
                } else {
                    substring2 = substring2.substring(1);
                    i10 = 16;
                }
                try {
                    int parseInt = Integer.parseInt(substring2, i10);
                    if (parseInt == 0) {
                        return "\ufffd";
                    }
                    return new String(Character.toChars(parseInt));
                } catch (IllegalArgumentException unused) {
                    return "\ufffd";
                }
            }
            String str2 = (String) f47557a.get(substring);
            if (str2 != null) {
                return str2;
            }
        }
        return str;
    }
}
