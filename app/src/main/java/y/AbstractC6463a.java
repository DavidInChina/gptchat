package y;

import Df.AbstractC0408g;
import G0.C0581j;
import I9.a1;
import L.C0860m;
import Z.AbstractC1710f0;
import Z.L0;
import h0.C3288a;
import id.AbstractC3557B;
import j$.time.Clock;
import j$.time.Instant;
import java.util.Locale;
import java.util.Map;
import nf.AbstractC4828h;
import z.AbstractC6670J0;
import z.AbstractC6696f;
import z.C6697f0;

/* renamed from: y.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC6463a {
    public static int a(int i10, int i11, int i12, int i13) {
        return i10 | i11 | i12 | 128 | i13;
    }

    public static int b(int i10) {
        return i10 & 384;
    }

    public static int c(int i10) {
        return i10 & 64;
    }

    public static float d(float f6, float f10, float f11, float f12) {
        return ((f6 - f10) * f11) + f12;
    }

    public static int e(float f6, int i10, int i11) {
        return (Float.floatToIntBits(f6) + i10) * i11;
    }

    public static int f(Map map, int i10, int i11) {
        return (map.hashCode() + i10) * i11;
    }

    public static a1 g(AbstractC0408g abstractC0408g, int i10, Z.r rVar) {
        a1 a1Var = new a1(abstractC0408g, i10);
        rVar.h0(a1Var);
        return a1Var;
    }

    public static C0860m h(AbstractC1710f0 abstractC1710f0, int i10, Z.r rVar) {
        C0860m c0860m = new C0860m(abstractC1710f0, i10);
        rVar.h0(c0860m);
        return c0860m;
    }

    public static Object i(Z.r rVar, int i10, int i11) {
        rVar.W(i10);
        rVar.W(i11);
        return rVar.K();
    }

    public static String j(String str, Locale locale, String str2, Locale locale2, String str3) {
        AbstractC3557B.b0(str, locale);
        String lowerCase = str2.toLowerCase(locale2);
        AbstractC3557B.b0(str3, lowerCase);
        return lowerCase;
    }

    public static String k(StringBuilder sb2, float f6, char c10) {
        sb2.append(f6);
        sb2.append(c10);
        return sb2.toString();
    }

    public static String l(StringBuilder sb2, boolean z10, char c10) {
        sb2.append(z10);
        sb2.append(c10);
        return sb2.toString();
    }

    public static String m(kotlin.jvm.internal.D d10, Class cls, StringBuilder sb2) {
        sb2.append(d10.b(cls));
        return sb2.toString();
    }

    public static Instant n(String str) {
        Instant instant = Clock.systemUTC().instant();
        AbstractC3557B.b0(str, instant);
        return instant;
    }

    public static ub.h o(int i10, wf.k kVar, Z.r rVar) {
        ub.h hVar = new ub.h(i10, kVar);
        rVar.h0(hVar);
        return hVar;
    }

    public static void p(int i10, int i11, int i12, int i13, int i14) {
        androidx.compose.ui.input.key.a.a(i10);
        androidx.compose.ui.input.key.a.a(i11);
        androidx.compose.ui.input.key.a.a(i12);
        androidx.compose.ui.input.key.a.a(i13);
        androidx.compose.ui.input.key.a.a(i14);
    }

    public static void q(int i10, Z.r rVar, int i11, C0581j c0581j) {
        rVar.h0(Integer.valueOf(i10));
        rVar.c(Integer.valueOf(i11), c0581j);
    }

    public static void r(int i10, C3288a c3288a, L0 l02, Z.r rVar, int i11) {
        c3288a.invoke(l02, rVar, Integer.valueOf(i10));
        rVar.W(i11);
    }

    public static void s(int i10, wf.n nVar, Z.r rVar, boolean z10, boolean z11) {
        nVar.invoke(rVar, Integer.valueOf(i10));
        rVar.t(z10);
        rVar.t(z11);
    }

    public static void t(Z.r rVar, C3288a c3288a, Z.r rVar2, Integer num, int i10) {
        c3288a.invoke(new L0(rVar), rVar2, num);
        rVar.W(i10);
    }

    public static void u(Z.r rVar, boolean z10, boolean z11, boolean z12) {
        rVar.t(z10);
        rVar.t(z11);
        rVar.t(z12);
    }

    public static void v(Z.r rVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        rVar.t(z10);
        rVar.t(z11);
        rVar.t(z12);
        rVar.t(z13);
    }

    public static d0 w(AbstractC6482u abstractC6482u, int i10) {
        int i11 = Z0.i.f22798c;
        Map map = AbstractC6670J0.f51158a;
        C6697f0 u10 = AbstractC6696f.u(0.0f, 0.0f, new Z0.i(kotlin.jvm.internal.m.c(1, 1)), 3);
        C6481t c6481t = C6481t.f50283Z;
        C6460A c6460a = (C6460A) abstractC6482u;
        if (c6460a.e(i10)) {
            return androidx.compose.animation.b.i(u10, new Y(4, new C6487z(c6481t, c6460a, 0)));
        }
        if (c6460a.f(i10)) {
            return androidx.compose.animation.b.i(u10, new Y(4, new C6487z(c6481t, c6460a, 1)));
        }
        if (AbstractC4828h.H(i10, 2)) {
            return androidx.compose.animation.b.i(u10, new Y(5, new C6487z(c6481t, c6460a, 2)));
        }
        if (AbstractC4828h.H(i10, 3)) {
            return androidx.compose.animation.b.i(u10, new Y(5, new C6487z(c6481t, c6460a, 3)));
        }
        return d0.f50196b;
    }

    public static e0 x(AbstractC6482u abstractC6482u, int i10) {
        int i11 = Z0.i.f22798c;
        Map map = AbstractC6670J0.f51158a;
        C6697f0 u10 = AbstractC6696f.u(0.0f, 0.0f, new Z0.i(kotlin.jvm.internal.m.c(1, 1)), 3);
        C6481t c6481t = C6481t.f50284h0;
        C6460A c6460a = (C6460A) abstractC6482u;
        if (c6460a.e(i10)) {
            return androidx.compose.animation.b.k(u10, new Y(6, new C6487z(c6460a, c6481t, 4)));
        }
        if (c6460a.f(i10)) {
            return androidx.compose.animation.b.k(u10, new Y(6, new C6487z(c6460a, c6481t, 5)));
        }
        if (AbstractC4828h.H(i10, 2)) {
            return androidx.compose.animation.b.k(u10, new Y(7, new C6487z(c6460a, c6481t, 6)));
        }
        if (AbstractC4828h.H(i10, 3)) {
            return androidx.compose.animation.b.k(u10, new Y(7, new C6487z(c6460a, c6481t, 7)));
        }
        return e0.f50199b;
    }
}
