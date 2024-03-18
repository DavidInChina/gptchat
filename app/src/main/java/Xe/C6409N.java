package xe;

import id.AbstractC3557B;
import wf.AbstractC6216a;

/* renamed from: xe.N  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6409N extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f49856Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C6410O f49857Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6409N(C6410O c6410o, int i10) {
        super(0);
        this.f49856Y = i10;
        this.f49857Z = c6410o;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final String mo122invoke() {
        String str;
        int k22;
        int i10 = this.f49856Y;
        C6410O c6410o = this.f49857Z;
        switch (i10) {
            case 0:
                int k23 = Lg.n.k2(c6410o.f49865h, '#', 0, false, 6) + 1;
                if (k23 == 0) {
                    return "";
                }
                String substring = c6410o.f49865h.substring(k23);
                AbstractC3557B.b0("this as java.lang.String).substring(startIndex)", substring);
                return substring;
            case 1:
                String str2 = c6410o.f49863f;
                if (str2 == null) {
                    return null;
                }
                if (str2.length() == 0) {
                    return "";
                }
                String str3 = c6410o.f49865h;
                String substring2 = str3.substring(Lg.n.k2(str3, ':', c6410o.f49858a.f49854a.length() + 3, false, 4) + 1, Lg.n.k2(str3, '@', 0, false, 6));
                AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", substring2);
                return substring2;
            case 2:
                if (c6410o.f49861d.isEmpty() || (k22 = Lg.n.k2((str = c6410o.f49865h), '/', c6410o.f49858a.f49854a.length() + 3, false, 4)) == -1) {
                    return "";
                }
                int m22 = Lg.n.m2(k22, str, false, new char[]{'?', '#'});
                if (m22 == -1) {
                    String substring3 = str.substring(k22);
                    AbstractC3557B.b0("this as java.lang.String).substring(startIndex)", substring3);
                    return substring3;
                }
                String substring4 = str.substring(k22, m22);
                AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", substring4);
                return substring4;
            case 3:
                int k24 = Lg.n.k2(c6410o.f49865h, '/', c6410o.f49858a.f49854a.length() + 3, false, 4);
                if (k24 == -1) {
                    return "";
                }
                String str4 = c6410o.f49865h;
                int k25 = Lg.n.k2(str4, '#', k24, false, 4);
                if (k25 == -1) {
                    String substring5 = str4.substring(k24);
                    AbstractC3557B.b0("this as java.lang.String).substring(startIndex)", substring5);
                    return substring5;
                }
                String substring6 = str4.substring(k24, k25);
                AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", substring6);
                return substring6;
            case 4:
                int k26 = Lg.n.k2(c6410o.f49865h, '?', 0, false, 6) + 1;
                if (k26 == 0) {
                    return "";
                }
                String str5 = c6410o.f49865h;
                int k27 = Lg.n.k2(str5, '#', k26, false, 4);
                if (k27 == -1) {
                    String substring7 = str5.substring(k26);
                    AbstractC3557B.b0("this as java.lang.String).substring(startIndex)", substring7);
                    return substring7;
                }
                String substring8 = str5.substring(k26, k27);
                AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", substring8);
                return substring8;
            default:
                String str6 = c6410o.f49862e;
                if (str6 == null) {
                    return null;
                }
                if (str6.length() == 0) {
                    return "";
                }
                int length = c6410o.f49858a.f49854a.length() + 3;
                String str7 = c6410o.f49865h;
                String substring9 = str7.substring(length, Lg.n.m2(length, str7, false, new char[]{':', '@'}));
                AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", substring9);
                return substring9;
        }
    }
}
