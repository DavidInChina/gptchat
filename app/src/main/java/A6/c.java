package A6;

import A.AbstractC0044t0;
import B6.o;
import B6.p;
import B6.q;
import B6.r;
import B6.s;
import B6.t;
import B6.u;
import I2.i;
import K4.J;
import i6.h;
import id.AbstractC3557B;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import kf.w;
import m6.C4562a;
import o6.C4929h;
import p5.AbstractC5091c;
import p5.EnumC5090b;
import q5.C5271a;
import u5.g;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public final class c implements h {

    /* renamed from: a  reason: collision with root package name */
    public final r5.d f707a;

    /* renamed from: b  reason: collision with root package name */
    public final S5.d f708b;

    /* renamed from: c  reason: collision with root package name */
    public final S5.d f709c;

    /* renamed from: e  reason: collision with root package name */
    public boolean f711e;

    /* renamed from: d  reason: collision with root package name */
    public final int f710d = 100;

    /* renamed from: f  reason: collision with root package name */
    public final LinkedHashSet f712f = new LinkedHashSet();

    public c(g gVar, S5.c cVar, S5.c cVar2) {
        this.f707a = gVar;
        this.f708b = cVar;
        this.f709c = cVar2;
    }

    public static final u b(c cVar, C5271a c5271a, long j6, String str, String str2, String str3) {
        int i10;
        t tVar;
        o oVar;
        int[] h10;
        int i11;
        cVar.getClass();
        C4562a c10 = c(c5271a);
        int i12 = 0;
        i iVar = new i(4, 0);
        AbstractC5091c l10 = cVar.f707a.l();
        String str4 = c5271a.f43901g;
        AbstractC3557B.c0("source", str4);
        AbstractC3557B.c0("internalLogger", l10);
        try {
        } catch (NoSuchElementException e10) {
            P4.a.m0(l10, 5, EnumC5090b.f42738Y, new C4929h(str4, 7), e10, false, 48);
        }
        for (int i13 : AbstractC6708l.h(6)) {
            if (AbstractC3557B.K(AbstractC0044t0.o(i13), str4)) {
                i12 = i13;
                if (i12 == 0) {
                    i10 = 1;
                } else {
                    i10 = i12;
                }
                p pVar = new p(c10.f38945a);
                r rVar = new r(c10.f38946b);
                q qVar = null;
                String str5 = c10.f38948d;
                if (str5 != null) {
                    tVar = new t(str5);
                } else {
                    tVar = null;
                }
                String str6 = c10.f38951g;
                if (str6 != null) {
                    oVar = new o(str6);
                } else {
                    oVar = null;
                }
                if (str2 != null || str3 != null) {
                    qVar = new q(str2, str3);
                }
                return new u(iVar, j6, "dd-sdk-android", i10, c5271a.f43902h, pVar, rVar, tVar, oVar, null, new s(str, qVar));
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static C4562a c(C5271a c5271a) {
        Map map = (Map) c5271a.f43909o.get("rum");
        if (map == null) {
            map = w.f37484Y;
        }
        String str = C4562a.f38944m;
        return J.v(map);
    }

    @Override // i6.h
    public final void a(String str, boolean z10) {
        AbstractC3557B.c0("sessionId", str);
        this.f712f.clear();
    }
}
