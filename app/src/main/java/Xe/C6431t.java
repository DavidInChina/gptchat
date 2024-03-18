package xe;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import io.sentry.AbstractC3693x0;
import io.sentry.C3636c1;
import io.sentry.C3637d;
import io.sentry.C3653i0;
import io.sentry.EnumC3642e1;
import io.sentry.EnumC3652i;
import io.sentry.O0;
import io.sentry.T0;
import io.sentry.V;
import io.sentry.X0;
import io.sentry.protocol.C3677d;
import io.sentry.r1;
import java.util.List;
import java.util.Map;
import oe.C4992a;

/* renamed from: xe.t  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6431t implements io.sentry.hints.h, V, io.sentry.clientreport.f {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ C6431t f49953a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ C6431t f49954b = new Object();

    public static void f(int i10, int i11, int i12) {
        if (i10 >= 0 && i11 <= i12) {
            if (i10 <= i11) {
                return;
            }
            throw new IllegalArgumentException(AbstractC2469q0.i("startIndex: ", i10, " > endIndex: ", i11));
        }
        StringBuilder A10 = E9.f.A("startIndex: ", i10, ", endIndex: ", i11, ", size: ");
        A10.append(i12);
        throw new IndexOutOfBoundsException(A10.toString());
    }

    public static void g(String str, String str2, Object obj) {
        if (obj != null) {
            return;
        }
        throw new C6399D(str, "Could not find ".concat(str2));
    }

    public static void h(int i10, int i11, int i12) {
        if (i10 >= 0 && i11 <= i12) {
            if (i10 <= i11) {
                return;
            }
            throw new IllegalArgumentException(AbstractC2469q0.i("fromIndex: ", i10, " > toIndex: ", i11));
        }
        StringBuilder A10 = E9.f.A("fromIndex: ", i10, ", toIndex: ", i11, ", size: ");
        A10.append(i12);
        throw new IndexOutOfBoundsException(A10.toString());
    }

    public static void i(String str, boolean z10, C6422k c6422k) {
        if (z10) {
            return;
        }
        throw new C6399D(str, (String) c6422k.mo122invoke());
    }

    public static C6408M j(String str) {
        String A02 = Df.H.A0(str);
        C6408M c6408m = (C6408M) C6408M.f49853f.get(A02);
        if (c6408m == null) {
            return new C6408M(A02, 0);
        }
        return c6408m;
    }

    public static boolean k(O0 o02, String str, C3653i0 c3653i0, io.sentry.H h10) {
        char c10 = '\uffff';
        switch (str.hashCode()) {
            case -1840434063:
                if (str.equals("debug_meta")) {
                    c10 = 0;
                    break;
                }
                break;
            case -758770169:
                if (str.equals("server_name")) {
                    c10 = 1;
                    break;
                }
                break;
            case -567312220:
                if (str.equals("contexts")) {
                    c10 = 2;
                    break;
                }
                break;
            case -85904877:
                if (str.equals("environment")) {
                    c10 = 3;
                    break;
                }
                break;
            case -51457840:
                if (str.equals("breadcrumbs")) {
                    c10 = 4;
                    break;
                }
                break;
            case 113722:
                if (str.equals("sdk")) {
                    c10 = 5;
                    break;
                }
                break;
            case 3083686:
                if (str.equals("dist")) {
                    c10 = 6;
                    break;
                }
                break;
            case 3552281:
                if (str.equals("tags")) {
                    c10 = 7;
                    break;
                }
                break;
            case 3599307:
                if (str.equals("user")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 96965648:
                if (str.equals("extra")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 278118624:
                if (str.equals("event_id")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 1090594823:
                if (str.equals("release")) {
                    c10 = 11;
                    break;
                }
                break;
            case 1095692943:
                if (str.equals("request")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 1874684019:
                if (str.equals("platform")) {
                    c10 = '\r';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                o02.f33849s0 = (C3677d) c3653i0.U0(h10, new C3637d(25));
                return true;
            case 1:
                o02.f33846p0 = c3653i0.X0();
                return true;
            case 2:
                o02.f33837Z.putAll(C3637d.e(c3653i0, h10));
                return true;
            case 3:
                o02.f33842l0 = c3653i0.X0();
                return true;
            case 4:
                o02.f33848r0 = c3653i0.w0(h10, new C3637d(0));
                return true;
            case 5:
                o02.f33838h0 = (io.sentry.protocol.q) c3653i0.U0(h10, new io.sentry.protocol.i(7));
                return true;
            case 6:
                o02.f33847q0 = c3653i0.X0();
                return true;
            case 7:
                o02.f33840j0 = P4.a.p0((Map) c3653i0.T0());
                return true;
            case '\b':
                o02.f33844n0 = (io.sentry.protocol.C) c3653i0.U0(h10, new io.sentry.protocol.i(18));
                return true;
            case '\t':
                o02.f33850t0 = P4.a.p0((Map) c3653i0.T0());
                return true;
            case '\n':
                o02.f33836Y = (io.sentry.protocol.s) c3653i0.U0(h10, new io.sentry.protocol.i(9));
                return true;
            case 11:
                o02.f33841k0 = c3653i0.X0();
                return true;
            case '\f':
                o02.f33839i0 = (io.sentry.protocol.n) c3653i0.U0(h10, new io.sentry.protocol.i(4));
                return true;
            case '\r':
                o02.f33843m0 = c3653i0.X0();
                return true;
            default:
                return false;
        }
    }

    public static boolean l(r1 r1Var, String str) {
        io.sentry.H h10;
        if (r1Var != null) {
            h10 = r1Var.getLogger();
        } else {
            h10 = null;
        }
        if (m(str, h10) != null) {
            return true;
        }
        return false;
    }

    public static Class m(String str, io.sentry.H h10) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e10) {
            if (h10 != null) {
                h10.d(EnumC3642e1.DEBUG, "Class not available:".concat(str), e10);
                return null;
            }
            return null;
        } catch (UnsatisfiedLinkError e11) {
            if (h10 != null) {
                h10.d(EnumC3642e1.ERROR, "Failed to load (UnsatisfiedLinkError) ".concat(str), e11);
                return null;
            }
            return null;
        } catch (Throwable th2) {
            if (h10 != null) {
                h10.d(EnumC3642e1.ERROR, "Failed to initialize ".concat(str), th2);
                return null;
            }
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [Cf.g, Cf.e] */
    /* JADX WARN: Type inference failed for: r3v15, types: [Cf.g, Cf.e] */
    /* JADX WARN: Type inference failed for: r3v2, types: [Cf.g, Cf.e] */
    public static He.b n(String str) {
        He.e eVar;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        He.e eVar2;
        He.e[] values;
        AbstractC3557B.c0("source", str);
        r2.d dVar = new r2.d(str);
        boolean z14 = false;
        C6420i c6420i = new C6420i(0);
        dVar.b(C6421j.f49910Z);
        while (true) {
            int i10 = dVar.f44376a;
            int length = dVar.f44377b.length();
            int i11 = c6420i.f49898a;
            if (i10 < length) {
                if (dVar.d(C6421j.f49911h0)) {
                    int i12 = dVar.f44376a;
                    dVar.b(C6421j.f49913j0);
                    String substring = dVar.f44377b.substring(i12, dVar.f44376a);
                    AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", substring);
                    if (c6420i.f49901d == null || c6420i.f49900c == null || c6420i.f49899b == null) {
                        r2.d dVar2 = new r2.d(substring);
                        int i13 = dVar2.f44376a;
                        if (dVar2.a(C6421j.f49924u0)) {
                            dVar2.a(C6421j.f49925v0);
                            String substring2 = dVar2.f44377b.substring(i13, dVar2.f44376a);
                            AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", substring2);
                            int parseInt = Integer.parseInt(substring2);
                            if (dVar2.a(C6421j.f49920q0)) {
                                int i14 = dVar2.f44376a;
                                if (dVar2.a(C6421j.f49926w0)) {
                                    dVar2.a(C6421j.f49927x0);
                                    String substring3 = dVar2.f44377b.substring(i14, dVar2.f44376a);
                                    AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", substring3);
                                    int parseInt2 = Integer.parseInt(substring3);
                                    if (dVar2.a(C6421j.f49921r0)) {
                                        int i15 = dVar2.f44376a;
                                        if (dVar2.a(C6421j.f49928y0)) {
                                            dVar2.a(C6421j.f49929z0);
                                            String substring4 = dVar2.f44377b.substring(i15, dVar2.f44376a);
                                            AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", substring4);
                                            int parseInt3 = Integer.parseInt(substring4);
                                            if (dVar2.a(C6421j.f49922s0)) {
                                                dVar2.b(C6421j.f49923t0);
                                            }
                                            Integer valueOf = Integer.valueOf(parseInt);
                                            switch (i11) {
                                                case 0:
                                                    c6420i.f49901d = valueOf;
                                                    break;
                                                default:
                                                    c6420i.f49901d = valueOf;
                                                    break;
                                            }
                                            Integer valueOf2 = Integer.valueOf(parseInt2);
                                            switch (i11) {
                                                case 0:
                                                    c6420i.f49900c = valueOf2;
                                                    break;
                                                default:
                                                    c6420i.f49900c = valueOf2;
                                                    break;
                                            }
                                            Integer valueOf3 = Integer.valueOf(parseInt3);
                                            switch (i11) {
                                                case 0:
                                                    c6420i.f49899b = valueOf3;
                                                    break;
                                                default:
                                                    c6420i.f49899b = valueOf3;
                                                    break;
                                            }
                                            dVar.b(C6421j.f49912i0);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (c6420i.f49902e == null) {
                        r2.d dVar3 = new r2.d(substring);
                        int i16 = dVar3.f44376a;
                        if (dVar3.a(C6421j.f49918o0)) {
                            dVar3.a(C6421j.f49919p0);
                            String substring5 = dVar3.f44377b.substring(i16, dVar3.f44376a);
                            AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", substring5);
                            int parseInt4 = Integer.parseInt(substring5);
                            if (dVar3.a(C6421j.f49916m0)) {
                                dVar3.b(C6421j.f49917n0);
                            }
                            Integer valueOf4 = Integer.valueOf(parseInt4);
                            switch (i11) {
                                case 0:
                                    c6420i.f49902e = valueOf4;
                                    break;
                                default:
                                    c6420i.f49902e = valueOf4;
                                    break;
                            }
                            dVar.b(C6421j.f49912i0);
                        }
                    }
                    switch (i11) {
                        case 0:
                            eVar2 = c6420i.f49903f;
                            break;
                        default:
                            eVar2 = c6420i.f49903f;
                            if (eVar2 == null) {
                                AbstractC3557B.C2("month");
                                throw null;
                            }
                            break;
                    }
                    if (eVar2 == null && substring.length() >= 3) {
                        for (He.e eVar3 : He.e.values()) {
                            if (Lg.n.I2(substring, eVar3.f7679Y, true)) {
                                switch (i11) {
                                    case 0:
                                        c6420i.f49903f = eVar3;
                                        break;
                                    default:
                                        c6420i.f49903f = eVar3;
                                        break;
                                }
                                dVar.b(C6421j.f49912i0);
                            }
                        }
                    }
                    if (c6420i.f49904g == null) {
                        r2.d dVar4 = new r2.d(substring);
                        int i17 = dVar4.f44376a;
                        int i18 = 0;
                        while (true) {
                            if (i18 < 2) {
                                if (dVar4.a(C6421j.f49907C0)) {
                                    i18++;
                                }
                            } else {
                                for (int i19 = 0; i19 < 2; i19++) {
                                    dVar4.a(C6421j.f49908D0);
                                }
                                String substring6 = dVar4.f44377b.substring(i17, dVar4.f44376a);
                                AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", substring6);
                                int parseInt5 = Integer.parseInt(substring6);
                                if (dVar4.a(C6421j.f49905A0)) {
                                    dVar4.b(C6421j.f49906B0);
                                }
                                Integer valueOf5 = Integer.valueOf(parseInt5);
                                switch (i11) {
                                    case 0:
                                        c6420i.f49904g = valueOf5;
                                        break;
                                    default:
                                        c6420i.f49904g = valueOf5;
                                        break;
                                }
                            }
                        }
                    }
                    dVar.b(C6421j.f49912i0);
                }
            } else {
                Integer num = c6420i.f49904g;
                ?? eVar4 = new Cf.e(70, 99, 1);
                if (num != null && eVar4.s(num.intValue())) {
                    Integer num2 = c6420i.f49904g;
                    AbstractC3557B.Z(num2);
                    Integer valueOf6 = Integer.valueOf(num2.intValue() + 1900);
                    switch (i11) {
                        case 0:
                            c6420i.f49904g = valueOf6;
                            break;
                        default:
                            c6420i.f49904g = valueOf6;
                            break;
                    }
                } else {
                    ?? eVar5 = new Cf.e(0, 69, 1);
                    if (num != null && eVar5.s(num.intValue())) {
                        Integer num3 = c6420i.f49904g;
                        AbstractC3557B.Z(num3);
                        Integer valueOf7 = Integer.valueOf(num3.intValue() + 2000);
                        switch (i11) {
                            case 0:
                                c6420i.f49904g = valueOf7;
                                break;
                            default:
                                c6420i.f49904g = valueOf7;
                                break;
                        }
                    }
                }
                g(str, "day-of-month", c6420i.f49902e);
                switch (i11) {
                    case 0:
                        eVar = c6420i.f49903f;
                        break;
                    default:
                        eVar = c6420i.f49903f;
                        if (eVar == null) {
                            AbstractC3557B.C2("month");
                            throw null;
                        }
                        break;
                }
                g(str, "month", eVar);
                g(str, "year", c6420i.f49904g);
                g(str, "time", c6420i.f49901d);
                g(str, "time", c6420i.f49900c);
                g(str, "time", c6420i.f49899b);
                ?? eVar6 = new Cf.e(1, 31, 1);
                Integer num4 = c6420i.f49902e;
                if (num4 != null && eVar6.s(num4.intValue())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                i(str, z10, C6422k.f49931Z);
                Integer num5 = c6420i.f49904g;
                AbstractC3557B.Z(num5);
                if (num5.intValue() >= 1601) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                i(str, z11, C6422k.f49932h0);
                Integer num6 = c6420i.f49901d;
                AbstractC3557B.Z(num6);
                if (num6.intValue() <= 23) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                i(str, z12, C6422k.f49933i0);
                Integer num7 = c6420i.f49900c;
                AbstractC3557B.Z(num7);
                if (num7.intValue() <= 59) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                i(str, z13, C6422k.f49934j0);
                Integer num8 = c6420i.f49899b;
                AbstractC3557B.Z(num8);
                if (num8.intValue() <= 59) {
                    z14 = true;
                }
                i(str, z14, C6422k.f49935k0);
                return c6420i.a();
            }
        }
    }

    public static C6417f o(String str) {
        if (Lg.n.n2(str)) {
            return C6417f.f49885e;
        }
        C6427p c6427p = (C6427p) kf.t.o2(R4.b.N1(str));
        String str2 = c6427p.f49945a;
        int k22 = Lg.n.k2(str2, '/', 0, false, 6);
        if (k22 == -1) {
            if (AbstractC3557B.K(Lg.n.U2(str2).toString(), Separators.STAR)) {
                return C6417f.f49885e;
            }
            throw new C4992a(str, 1);
        }
        String substring = str2.substring(0, k22);
        AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", substring);
        String obj = Lg.n.U2(substring).toString();
        if (obj.length() != 0) {
            String substring2 = str2.substring(k22 + 1);
            AbstractC3557B.b0("this as java.lang.String).substring(startIndex)", substring2);
            String obj2 = Lg.n.U2(substring2).toString();
            if (!Lg.n.a2(obj, ' ') && !Lg.n.a2(obj2, ' ')) {
                if (obj2.length() != 0 && !Lg.n.a2(obj2, '/')) {
                    return new C6417f(obj, obj2, c6427p.f49946b);
                }
                throw new C4992a(str, 1);
            }
            throw new C4992a(str, 1);
        }
        throw new C4992a(str, 1);
    }

    public static void p(O0 o02, AbstractC3693x0 abstractC3693x0, io.sentry.H h10) {
        if (o02.f33836Y != null) {
            C3636c1 c3636c1 = (C3636c1) abstractC3693x0;
            c3636c1.n("event_id");
            c3636c1.v(h10, o02.f33836Y);
        }
        C3636c1 c3636c12 = (C3636c1) abstractC3693x0;
        c3636c12.n("contexts");
        c3636c12.v(h10, o02.f33837Z);
        if (o02.f33838h0 != null) {
            c3636c12.n("sdk");
            c3636c12.v(h10, o02.f33838h0);
        }
        if (o02.f33839i0 != null) {
            c3636c12.n("request");
            c3636c12.v(h10, o02.f33839i0);
        }
        Map map = o02.f33840j0;
        if (map != null && !map.isEmpty()) {
            c3636c12.n("tags");
            c3636c12.v(h10, o02.f33840j0);
        }
        if (o02.f33841k0 != null) {
            c3636c12.n("release");
            c3636c12.t(o02.f33841k0);
        }
        if (o02.f33842l0 != null) {
            c3636c12.n("environment");
            c3636c12.t(o02.f33842l0);
        }
        if (o02.f33843m0 != null) {
            c3636c12.n("platform");
            c3636c12.t(o02.f33843m0);
        }
        if (o02.f33844n0 != null) {
            c3636c12.n("user");
            c3636c12.v(h10, o02.f33844n0);
        }
        if (o02.f33846p0 != null) {
            c3636c12.n("server_name");
            c3636c12.t(o02.f33846p0);
        }
        if (o02.f33847q0 != null) {
            c3636c12.n("dist");
            c3636c12.t(o02.f33847q0);
        }
        List list = o02.f33848r0;
        if (list != null && !list.isEmpty()) {
            c3636c12.n("breadcrumbs");
            c3636c12.v(h10, o02.f33848r0);
        }
        if (o02.f33849s0 != null) {
            c3636c12.n("debug_meta");
            c3636c12.v(h10, o02.f33849s0);
        }
        Map map2 = o02.f33850t0;
        if (map2 != null && !map2.isEmpty()) {
            c3636c12.n("extra");
            c3636c12.v(h10, o02.f33850t0);
        }
    }

    @Override // io.sentry.V
    public io.sentry.transport.h c(r1 r1Var, U3.c cVar) {
        return new io.sentry.transport.d(r1Var, new io.sentry.transport.o(r1Var), r1Var.getTransportGate(), cVar);
    }

    @Override // io.sentry.clientreport.f
    public T0 d(T0 t02) {
        return t02;
    }

    @Override // io.sentry.clientreport.f
    public void a(io.sentry.clientreport.d dVar, EnumC3652i enumC3652i) {
    }

    @Override // io.sentry.clientreport.f
    public void b(io.sentry.clientreport.d dVar, T0 t02) {
    }

    @Override // io.sentry.clientreport.f
    public void e(io.sentry.clientreport.d dVar, X0 x02) {
    }
}
