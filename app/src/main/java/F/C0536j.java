package F;

import E0.d0;
import G.C0565u;
import id.AbstractC3557B;
import java.util.Arrays;
import java.util.List;

/* renamed from: F.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0536j {

    /* renamed from: a  reason: collision with root package name */
    public G.r[] f4930a;

    public final void a(A a5, Ng.F f6) {
        C0565u c0565u;
        List list = a5.f4827b;
        int length = this.f4930a.length;
        for (int size = list.size(); size < length; size++) {
            G.r rVar = this.f4930a[size];
            if (rVar != null) {
                rVar.d();
            }
        }
        if (this.f4930a.length != list.size()) {
            Object[] copyOf = Arrays.copyOf(this.f4930a, list.size());
            AbstractC3557B.b0("copyOf(this, newSize)", copyOf);
            this.f4930a = (G.r[]) copyOf;
        }
        int size2 = list.size();
        for (int i10 = 0; i10 < size2; i10++) {
            Object u10 = ((d0) list.get(i10)).u();
            if (u10 instanceof C0565u) {
                c0565u = (C0565u) u10;
            } else {
                c0565u = null;
            }
            if (c0565u == null) {
                G.r rVar2 = this.f4930a[i10];
                if (rVar2 != null) {
                    rVar2.d();
                }
                this.f4930a[i10] = null;
            } else {
                G.r rVar3 = this.f4930a[i10];
                if (rVar3 == null) {
                    rVar3 = new G.r(f6);
                    this.f4930a[i10] = rVar3;
                }
                rVar3.f5552b = c0565u.f5568s0;
                rVar3.f5553c = c0565u.f5569t0;
            }
        }
    }
}
