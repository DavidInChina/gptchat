package r9;

import E.AbstractC0429m;
import E.AbstractC0434s;
import E.C0424h;
import E.p0;
import E0.N;
import F.AbstractC0539m;
import F.M;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import G0.X;
import H0.AbstractC0701r0;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.AbstractC1734s;
import Z.C1723m;
import Z.C1741v0;
import Z.L0;
import h0.C3288a;
import i2.C3463e;
import id.AbstractC3557B;
import j$.time.LocalDate;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import k6.AbstractC4194d;
import l0.AbstractC4326r;
import l0.C4310b;
import t9.AbstractC5684a;
import y.AbstractC6463a;
import y.s0;
import yf.AbstractC6583a;
import z.AbstractC6657D;
import z.AbstractC6696f;
import z.C6736z;

/* loaded from: classes2.dex */
public abstract class x {

    /* renamed from: a  reason: collision with root package name */
    public static final int f44618a;

    /* renamed from: b  reason: collision with root package name */
    public static final ArrayList f44619b;

    /* renamed from: c  reason: collision with root package name */
    public static final List f44620c;

    static {
        Yg.r rVar = AbstractC5684a.f45797a;
        int year = rVar.f22420Y.getYear() - 100;
        f44618a = year;
        Cf.e eVar = new Cf.e(year, rVar.f22420Y.getYear(), 1);
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(eVar, 10));
        Cf.f it = eVar.iterator();
        while (it.f3111h0) {
            arrayList.add(String.valueOf(it.a()));
        }
        f44619b = arrayList;
        String[] shortMonths = new DateFormatSymbols().getShortMonths();
        AbstractC3557B.b0("getShortMonths(...)", shortMonths);
        f44620c = kf.q.z3(shortMonths);
    }

    public static final void a(Yg.r rVar, wf.k kVar, AbstractC4326r abstractC4326r, AbstractC1725n abstractC1725n, int i10, int i11) {
        AbstractC4326r abstractC4326r2;
        AbstractC3557B.c0("selectedDate", rVar);
        AbstractC3557B.c0("onValueChange", kVar);
        AbstractC4326r a5 = io.sentry.compose.b.a("DatePicker");
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.X(1093548187);
        if ((i11 & 4) != 0) {
            abstractC4326r2 = a5;
        } else {
            abstractC4326r2 = abstractC4326r;
        }
        C0424h c0424h = AbstractC0429m.f3913g;
        AbstractC4326r a10 = AbstractC4194d.a((X) a5, androidx.compose.foundation.layout.e.d(abstractC4326r2, 1.0f));
        rVar2.W(693286680);
        N a11 = p0.a(c0424h, C4310b.f37702o0, rVar2);
        rVar2.W(-1323940314);
        int i12 = rVar2.P;
        AbstractC1732q0 p10 = rVar2.p();
        AbstractC0584m.f5811i.getClass();
        C0582k c0582k = C0583l.f5804b;
        C3288a i13 = androidx.compose.ui.layout.a.i(a10);
        if (rVar2.f22696a instanceof AbstractC1707e) {
            rVar2.Z();
            if (rVar2.f22695O) {
                rVar2.o(c0582k);
            } else {
                rVar2.k0();
            }
            U3.f.n0(rVar2, a11, C0583l.f5808f);
            U3.f.n0(rVar2, p10, C0583l.f5807e);
            C0581j c0581j = C0583l.f5809g;
            if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i12))) {
                AbstractC6463a.q(i12, rVar2, i12, c0581j);
            }
            AbstractC6463a.r(0, i13, new L0(rVar2), rVar2, 2058660585);
            Yg.r rVar3 = AbstractC5684a.f45797a;
            DateFormat dateInstance = DateFormat.getDateInstance(3);
            AbstractC3557B.a0("null cannot be cast to non-null type java.text.SimpleDateFormat", dateInstance);
            String pattern = ((SimpleDateFormat) dateInstance).toPattern();
            AbstractC3557B.Z(pattern);
            String lowerCase = pattern.toLowerCase(Locale.ROOT);
            AbstractC3557B.b0("toLowerCase(...)", lowerCase);
            if (Lg.n.k2(lowerCase, 'm', 0, false, 6) < Lg.n.k2(pattern, 'd', 0, false, 6)) {
                rVar2.W(-217249387);
                int i14 = (i10 & 112) | 8;
                c(rVar, kVar, rVar2, i14);
                b(rVar, kVar, rVar2, i14);
                rVar2.t(false);
            } else {
                rVar2.W(-217249266);
                int i15 = (i10 & 112) | 8;
                b(rVar, kVar, rVar2, i15);
                c(rVar, kVar, rVar2, i15);
                rVar2.t(false);
            }
            e(rVar, kVar, rVar2, (i10 & 112) | 8);
            rVar2.t(false);
            rVar2.t(true);
            rVar2.t(false);
            rVar2.t(false);
            C1741v0 v10 = rVar2.v();
            if (v10 != null) {
                v10.f22739d = new G.E(rVar, kVar, abstractC4326r2, i10, i11, 12);
                return;
            }
            return;
        }
        R4.b.r1();
        throw null;
    }

    public static final void b(Yg.r rVar, wf.k kVar, AbstractC1725n abstractC1725n, int i10) {
        AbstractC4326r a5 = io.sentry.compose.b.a("DayPicker");
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.X(-693885094);
        int year = rVar.f22420Y.getYear();
        LocalDate localDate = rVar.f22420Y;
        int monthValue = localDate.getMonthValue();
        Yg.r rVar3 = AbstractC5684a.f45797a;
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, monthValue - 1, 1);
        Cf.e eVar = new Cf.e(1, calendar.getActualMaximum(5), 1);
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(eVar, 10));
        Cf.f it = eVar.iterator();
        while (it.f3111h0) {
            arrayList.add(String.valueOf(it.a()));
        }
        d(arrayList, f(arrayList.size()) + (localDate.getDayOfMonth() - 3), new t(rVar, kVar, 0), a5, rVar2, 8, 8);
        C1741v0 v10 = rVar2.v();
        if (v10 != null) {
            v10.f22739d = new u(rVar, kVar, i10, 0);
        }
    }

    public static final void c(Yg.r rVar, wf.k kVar, AbstractC1725n abstractC1725n, int i10) {
        AbstractC4326r a5 = io.sentry.compose.b.a("MonthPicker");
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.X(351860926);
        List list = f44620c;
        d(list, f(list.size()) + (rVar.f22420Y.getMonthValue() - 3), new t(rVar, kVar, 1), a5, rVar2, 8, 8);
        C1741v0 v10 = rVar2.v();
        if (v10 != null) {
            v10.f22739d = new u(rVar, kVar, i10, 1);
        }
    }

    public static final void d(List list, int i10, wf.k kVar, AbstractC4326r abstractC4326r, AbstractC1725n abstractC1725n, int i11, int i12) {
        AbstractC4326r a5 = io.sentry.compose.b.a("Spinner");
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(16425720);
        if ((i12 & 8) == 0) {
            a5 = abstractC4326r;
        }
        F.J a10 = M.a(i10, rVar, 2);
        rVar.W(1148456277);
        rVar.W(1157296644);
        boolean g10 = rVar.g(a10);
        Object K10 = rVar.K();
        io.sentry.hints.i iVar = C1723m.f22654Y;
        if (g10 || K10 == iVar) {
            K10 = new C.c(a10, C.p.f2480a);
            rVar.h0(K10);
        }
        rVar.t(false);
        C.o oVar = (C.o) K10;
        float f6 = C.n.f2479a;
        rVar.W(-473984552);
        C6736z a11 = s0.a(rVar);
        rVar.W(1618982084);
        boolean g11 = rVar.g((Z0.b) rVar.m(AbstractC0701r0.f7002e)) | rVar.g(oVar) | rVar.g(a11);
        Object K11 = rVar.K();
        if (g11 || K11 == iVar) {
            K11 = new C.j(oVar, AbstractC6696f.v(0, 0, AbstractC6657D.f51128d, 3), a11, AbstractC6696f.u(0.0f, 400.0f, null, 5));
            rVar.h0(K11);
        }
        rVar.t(false);
        C.j jVar = (C.j) K11;
        rVar.t(false);
        rVar.t(false);
        jf.y yVar = jf.y.f36177a;
        rVar.W(1165653943);
        boolean g12 = rVar.g(a10) | rVar.g(jVar);
        Object K12 = rVar.K();
        if (g12 || K12 == iVar) {
            K12 = new w(a10, jVar, null);
            rVar.h0(K12);
        }
        rVar.t(false);
        AbstractC1734s.e(yVar, (wf.n) K12, rVar);
        AbstractC4326r n10 = androidx.compose.foundation.layout.e.n(a5, p9.r.f42844h, 0.0f, 2);
        rVar.W(733328855);
        N c10 = AbstractC0434s.c(C4310b.f37693Y, false, rVar);
        rVar.W(-1323940314);
        int i13 = rVar.P;
        AbstractC1732q0 p10 = rVar.p();
        AbstractC0584m.f5811i.getClass();
        C0582k c0582k = C0583l.f5804b;
        C3288a i14 = androidx.compose.ui.layout.a.i(n10);
        if (rVar.f22696a instanceof AbstractC1707e) {
            rVar.Z();
            if (rVar.f22695O) {
                rVar.o(c0582k);
            } else {
                rVar.k0();
            }
            U3.f.n0(rVar, c10, C0583l.f5808f);
            U3.f.n0(rVar, p10, C0583l.f5807e);
            C0581j c0581j = C0583l.f5809g;
            if (rVar.f22695O || !AbstractC3557B.K(rVar.K(), Integer.valueOf(i13))) {
                AbstractC6463a.q(i13, rVar, i13, c0581j);
            }
            AbstractC6463a.r(0, i14, new L0(rVar), rVar, 2058660585);
            AbstractC0539m.a(io.sentry.compose.b.a("Spinner"), a10, null, false, null, C4310b.f37706s0, jVar, false, new C6.a(list, a10, kVar, 2), rVar, 196608, 157);
            rVar.t(false);
            rVar.t(true);
            rVar.t(false);
            rVar.t(false);
            C1741v0 v10 = rVar.v();
            if (v10 != null) {
                v10.f22739d = new C3463e(list, i10, kVar, a5, i11, i12);
                return;
            }
            return;
        }
        R4.b.r1();
        throw null;
    }

    public static final void e(Yg.r rVar, wf.k kVar, AbstractC1725n abstractC1725n, int i10) {
        AbstractC4326r a5 = io.sentry.compose.b.a("YearPicker");
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.X(538287063);
        ArrayList arrayList = f44619b;
        d(arrayList, f(arrayList.size()) + ((rVar.f22420Y.getYear() - f44618a) - 2), new t(rVar, kVar, 2), a5, rVar2, 8, 8);
        C1741v0 v10 = rVar2.v();
        if (v10 != null) {
            v10.f22739d = new u(rVar, kVar, i10, 2);
        }
    }

    public static final int f(int i10) {
        int i11 = 1073741823 % i10;
        if (i11 < i10 / 2) {
            return 1073741823 - i11;
        }
        return (i10 + 1073741823) - i11;
    }

    public static Yg.r g(Yg.r rVar, int i10, int i11, int i12, int i13) {
        if ((i13 & 1) != 0) {
            i10 = rVar.f22420Y.getYear();
        }
        if ((i13 & 2) != 0) {
            i11 = rVar.f22420Y.getMonthValue();
        }
        if ((i13 & 4) != 0) {
            i12 = rVar.f22420Y.getDayOfMonth();
        }
        Yg.r rVar2 = AbstractC5684a.f45797a;
        Calendar calendar = Calendar.getInstance();
        calendar.set(i10, i11 - 1, 1);
        return new Yg.r(i10, i11, Math.min(i12, calendar.getActualMaximum(5)));
    }
}
