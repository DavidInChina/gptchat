package dg;

import Bg.C0213f;
import android.gov.nist.javax.sip.parser.TokenNames;
import fg.Q;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import sg.EnumC5626c;

/* loaded from: classes.dex */
public final class q implements xg.t, AbstractC2657F, AbstractC2659H {

    /* renamed from: b  reason: collision with root package name */
    public static final q f28353b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static final q f28354c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final q f28355d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public static final q f28356e = new Object();

    public static String[] b(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static v c(String str) {
        EnumC5626c enumC5626c;
        v tVar;
        AbstractC3557B.c0("representation", str);
        char charAt = str.charAt(0);
        EnumC5626c[] values = EnumC5626c.values();
        int length = values.length;
        int i10 = 0;
        while (true) {
            if (i10 < length) {
                enumC5626c = values[i10];
                if (enumC5626c.c().charAt(0) == charAt) {
                    break;
                }
                i10++;
            } else {
                enumC5626c = null;
                break;
            }
        }
        if (enumC5626c != null) {
            return new u(enumC5626c);
        }
        if (charAt == 'V') {
            return new u(null);
        }
        if (charAt == '[') {
            String substring = str.substring(1);
            AbstractC3557B.b0("substring(...)", substring);
            tVar = new s(c(substring));
        } else {
            if (charAt == 'L') {
                Lg.n.d2(str, ';');
            }
            String substring2 = str.substring(1, str.length() - 1);
            AbstractC3557B.b0("substring(...)", substring2);
            tVar = new t(substring2);
        }
        return tVar;
    }

    public static t d(String str) {
        AbstractC3557B.c0("internalName", str);
        return new t(str);
    }

    public static LinkedHashSet e(String str, String... strArr) {
        AbstractC3557B.c0("internalName", str);
        AbstractC3557B.c0("signatures", strArr);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : strArr) {
            linkedHashSet.add(str + '.' + str2);
        }
        return linkedHashSet;
    }

    public static LinkedHashSet f(String str, String... strArr) {
        AbstractC3557B.c0("signatures", strArr);
        return e("java/lang/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static LinkedHashSet g(String str, String... strArr) {
        return e("java/util/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static String h(v vVar) {
        String c10;
        AbstractC3557B.c0("type", vVar);
        if (vVar instanceof s) {
            return "[" + h(((s) vVar).f28360i);
        } else if (vVar instanceof u) {
            EnumC5626c enumC5626c = ((u) vVar).f28362i;
            if (enumC5626c == null || (c10 = enumC5626c.c()) == null) {
                return TokenNames.f24320V;
            }
            return c10;
        } else if (vVar instanceof t) {
            return android.gov.nist.core.a.n(new StringBuilder(TokenNames.f24315L), ((t) vVar).f28361i, ';');
        } else {
            throw new RuntimeException();
        }
    }

    @Override // xg.t
    public Bg.A a(Q q10, String str, Bg.D d10, Bg.D d11) {
        AbstractC3557B.c0("proto", q10);
        AbstractC3557B.c0("flexibleId", str);
        AbstractC3557B.c0("lowerBound", d10);
        AbstractC3557B.c0("upperBound", d11);
        if (!AbstractC3557B.K(str, "kotlin.jvm.PlatformType")) {
            return Dg.m.c(Dg.l.f3698r0, str, d10.toString(), d11.toString());
        }
        if (q10.j(ig.k.f33238g)) {
            return new Zf.f(d10, d11);
        }
        return C0213f.f(d10, d11);
    }
}
