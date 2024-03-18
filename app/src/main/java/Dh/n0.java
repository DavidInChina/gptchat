package dh;

import Df.AbstractC0405d;
import id.AbstractC3557B;
import java.util.Locale;
import java.util.Map;
import jf.C3959i;
import jf.C3966p;
import jf.C3967q;
import jf.C3968r;
import jf.C3969s;
import jf.C3970t;
import jf.C3971u;
import kf.AbstractC4268D;

/* loaded from: classes.dex */
public abstract class n0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Map f28470a;

    static {
        kotlin.jvm.internal.D d10 = kotlin.jvm.internal.C.f37623a;
        C3959i c3959i = new C3959i(d10.b(String.class), u0.f28491a);
        C3959i c3959i2 = new C3959i(d10.b(Character.TYPE), C2714p.f28474a);
        C3959i c3959i3 = new C3959i(d10.b(char[].class), C2713o.f28471c);
        C3959i c3959i4 = new C3959i(d10.b(Double.TYPE), C2721x.f28501a);
        C3959i c3959i5 = new C3959i(d10.b(double[].class), C2720w.f28499c);
        C3959i c3959i6 = new C3959i(d10.b(Float.TYPE), C2679E.f28388a);
        C3959i c3959i7 = new C3959i(d10.b(float[].class), C2678D.f28385c);
        C3959i c3959i8 = new C3959i(d10.b(Long.TYPE), S.f28417a);
        C3959i c3959i9 = new C3959i(d10.b(long[].class), Q.f28416c);
        C3959i c3959i10 = new C3959i(d10.b(C3970t.class), F0.f28391a);
        C3959i c3959i11 = new C3959i(d10.b(C3971u.class), E0.f28390c);
        C3959i c3959i12 = new C3959i(d10.b(Integer.TYPE), C2686L.f28406a);
        C3959i c3959i13 = new C3959i(d10.b(int[].class), C2685K.f28405c);
        C3959i c3959i14 = new C3959i(d10.b(C3968r.class), C0.f28383a);
        C3959i c3959i15 = new C3959i(d10.b(C3969s.class), B0.f28380c);
        C3959i c3959i16 = new C3959i(d10.b(Short.TYPE), t0.f28489a);
        C3959i c3959i17 = new C3959i(d10.b(short[].class), s0.f28487c);
        C3959i c3959i18 = new C3959i(d10.b(jf.w.class), I0.f28399a);
        C3959i c3959i19 = new C3959i(d10.b(jf.x.class), H0.f28397c);
        C3959i c3959i20 = new C3959i(d10.b(Byte.TYPE), C2707j.f28460a);
        C3959i c3959i21 = new C3959i(d10.b(byte[].class), C2705i.f28457c);
        C3959i c3959i22 = new C3959i(d10.b(C3966p.class), z0.f28513a);
        C3959i c3959i23 = new C3959i(d10.b(C3967q.class), y0.f28507c);
        C3959i c3959i24 = new C3959i(d10.b(Boolean.TYPE), C2701g.f28450a);
        C3959i c3959i25 = new C3959i(d10.b(boolean[].class), C2699f.f28446c);
        C3959i c3959i26 = new C3959i(d10.b(jf.y.class), J0.f28403b);
        C3959i c3959i27 = new C3959i(d10.b(Void.class), C2696d0.f28440a);
        AbstractC0405d b10 = d10.b(Mg.b.class);
        Mg.a aVar = Mg.b.f12127Z;
        f28470a = AbstractC4268D.a1(c3959i, c3959i2, c3959i3, c3959i4, c3959i5, c3959i6, c3959i7, c3959i8, c3959i9, c3959i10, c3959i11, c3959i12, c3959i13, c3959i14, c3959i15, c3959i16, c3959i17, c3959i18, c3959i19, c3959i20, c3959i21, c3959i22, c3959i23, c3959i24, c3959i25, c3959i26, c3959i27, new C3959i(b10, C2722y.f28505a));
    }

    public static final String a(String str) {
        String str2;
        if (str.length() > 0) {
            StringBuilder sb2 = new StringBuilder();
            char charAt = str.charAt(0);
            if (Character.isLowerCase(charAt)) {
                String valueOf = String.valueOf(charAt);
                AbstractC3557B.a0("null cannot be cast to non-null type java.lang.String", valueOf);
                Locale locale = Locale.ROOT;
                str2 = valueOf.toUpperCase(locale);
                AbstractC3557B.b0("toUpperCase(...)", str2);
                if (str2.length() > 1) {
                    if (charAt != '\u0149') {
                        char charAt2 = str2.charAt(0);
                        String substring = str2.substring(1);
                        AbstractC3557B.b0("substring(...)", substring);
                        String lowerCase = substring.toLowerCase(locale);
                        AbstractC3557B.b0("toLowerCase(...)", lowerCase);
                        str2 = charAt2 + lowerCase;
                    }
                } else {
                    str2 = String.valueOf(Character.toTitleCase(charAt));
                }
            } else {
                str2 = String.valueOf(charAt);
            }
            sb2.append((Object) str2);
            String substring2 = str.substring(1);
            AbstractC3557B.b0("substring(...)", substring2);
            sb2.append(substring2);
            return sb2.toString();
        }
        return str;
    }
}
