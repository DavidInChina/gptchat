package p3;

import java.util.List;
import p2.C5065s;
import q1.AbstractC5260f;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: a  reason: collision with root package name */
    public final List f42435a;

    /* renamed from: b  reason: collision with root package name */
    public final L2.G[] f42436b;

    public J(List list) {
        this.f42435a = list;
        this.f42436b = new L2.G[list.size()];
    }

    public final void a(long j6, s2.u uVar) {
        if (uVar.a() < 9) {
            return;
        }
        int g10 = uVar.g();
        int g11 = uVar.g();
        int u10 = uVar.u();
        if (g10 == 434 && g11 == 1195456820 && u10 == 3) {
            AbstractC5260f.l(j6, uVar, this.f42436b);
        }
    }

    public final void b(L2.s sVar, H h10) {
        boolean z10;
        int i10 = 0;
        while (true) {
            L2.G[] gArr = this.f42436b;
            if (i10 < gArr.length) {
                h10.c();
                h10.i();
                L2.G f6 = sVar.f(h10.f42432c, 3);
                C5065s c5065s = (C5065s) this.f42435a.get(i10);
                String str = c5065s.f42319q0;
                if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                Gi.e.k("Invalid closed caption MIME type provided: " + str, z10);
                p2.r rVar = new p2.r();
                rVar.f42227a = h10.d();
                rVar.f42237k = str;
                rVar.f42230d = c5065s.f42311i0;
                rVar.f42229c = c5065s.f42310h0;
                rVar.f42222C = c5065s.f42302I0;
                rVar.f42239m = c5065s.f42321s0;
                f6.b(new C5065s(rVar));
                gArr[i10] = f6;
                i10++;
            } else {
                return;
            }
        }
    }
}
