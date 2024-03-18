package Uf;

import id.AbstractC3557B;
import kg.C4290b;
import kg.C4291c;

/* loaded from: classes.dex */
public abstract class C {

    /* renamed from: a  reason: collision with root package name */
    public static final C4291c f17724a;

    /* renamed from: b  reason: collision with root package name */
    public static final C4290b f17725b = C4290b.e("kotlin/jvm/internal/RepeatableContainer", false);

    static {
        C4291c c4291c = new C4291c("kotlin.jvm.JvmField");
        f17724a = c4291c;
        C4290b.j(c4291c);
        C4290b.j(new C4291c("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
    }

    public static final String a(String str) {
        AbstractC3557B.c0("propertyName", str);
        if (!c(str)) {
            return "get" + Df.H.r(str);
        }
        return str;
    }

    public static final String b(String str) {
        String str2;
        StringBuilder sb2 = new StringBuilder("set");
        if (c(str)) {
            str2 = str.substring(2);
            AbstractC3557B.b0("substring(...)", str2);
        } else {
            str2 = Df.H.r(str);
        }
        sb2.append(str2);
        return sb2.toString();
    }

    public static final boolean c(String str) {
        AbstractC3557B.c0("name", str);
        if (!Lg.n.I2(str, "is", false) || str.length() == 2) {
            return false;
        }
        char charAt = str.charAt(2);
        if (AbstractC3557B.e0(97, charAt) <= 0 && AbstractC3557B.e0(charAt, 122) <= 0) {
            return false;
        }
        return true;
    }
}
