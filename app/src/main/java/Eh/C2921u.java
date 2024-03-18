package eh;

import id.AbstractC3557B;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: eh.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2921u implements AbstractC2923w {
    public final String a(String str, SerialDescriptor serialDescriptor) {
        AbstractC3557B.c0("descriptor", serialDescriptor);
        AbstractC3557B.c0("serialName", str);
        StringBuilder sb2 = new StringBuilder(str.length() * 2);
        Character ch2 = null;
        int i10 = 0;
        for (int i11 = 0; i11 < str.length(); i11++) {
            char charAt = str.charAt(i11);
            if (Character.isUpperCase(charAt)) {
                if (i10 == 0 && sb2.length() > 0 && Lg.o.Y2(sb2) != '_') {
                    sb2.append('_');
                }
                if (ch2 != null) {
                    sb2.append(ch2.charValue());
                }
                i10++;
                ch2 = Character.valueOf(Character.toLowerCase(charAt));
            } else {
                if (ch2 != null) {
                    if (i10 > 1 && Character.isLetter(charAt)) {
                        sb2.append('_');
                    }
                    sb2.append(ch2);
                    ch2 = null;
                    i10 = 0;
                }
                sb2.append(charAt);
            }
        }
        if (ch2 != null) {
            sb2.append(ch2);
        }
        String sb3 = sb2.toString();
        AbstractC3557B.b0("toString(...)", sb3);
        return sb3;
    }

    public final String toString() {
        return "kotlinx.serialization.json.JsonNamingStrategy.SnakeCase";
    }
}
