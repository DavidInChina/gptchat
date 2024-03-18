package I8;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public abstract class h extends Enum implements i {

    /* renamed from: Y  reason: collision with root package name */
    public static final C0739a f8099Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ h[] f8100Z;

    static {
        C0739a c0739a = new C0739a();
        f8099Y = c0739a;
        f8100Z = new h[]{c0739a, new h() { // from class: I8.b
            @Override // I8.i
            public final String a(Field field) {
                return h.c(field.getName());
            }
        }, new h() { // from class: I8.c
            @Override // I8.i
            public final String a(Field field) {
                return h.c(h.b(field.getName(), ' '));
            }
        }, new h() { // from class: I8.d
            @Override // I8.i
            public final String a(Field field) {
                return h.b(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        }, new h() { // from class: I8.e
            @Override // I8.i
            public final String a(Field field) {
                return h.b(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        }, new h() { // from class: I8.f
            @Override // I8.i
            public final String a(Field field) {
                return h.b(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        }, new h() { // from class: I8.g
            @Override // I8.i
            public final String a(Field field) {
                return h.b(field.getName(), '.').toLowerCase(Locale.ENGLISH);
            }
        }};
    }

    public static String b(String str, char c10) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (Character.isUpperCase(charAt) && sb2.length() != 0) {
                sb2.append(c10);
            }
            sb2.append(charAt);
        }
        return sb2.toString();
    }

    public static String c(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (Character.isLetter(charAt)) {
                if (Character.isUpperCase(charAt)) {
                    return str;
                }
                char upperCase = Character.toUpperCase(charAt);
                if (i10 == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i10) + upperCase + str.substring(i10 + 1);
            }
        }
        return str;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f8100Z.clone();
    }
}
