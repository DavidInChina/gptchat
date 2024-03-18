package gb;

import A.AbstractC0044t0;
import H0.B0;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import yf.AbstractC6583a;

/* renamed from: gb.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3241s implements E0.N {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.layout.d f31511a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f31512b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f31513c;

    public C3241s(androidx.compose.foundation.layout.d dVar, int i10, int i11) {
        this.f31511a = dVar;
        this.f31512b = i10;
        this.f31513c = i11;
    }

    @Override // E0.N
    public final E0.O a(E0.P p10, List list, long j6) {
        AbstractC3557B.c0("$this$Layout", p10);
        AbstractC3557B.c0("measurables", list);
        int size = list.size();
        int i10 = 2;
        if (size != 2 && size != 4) {
            i10 = 3;
        }
        int i11 = i10 - 1;
        int size2 = (list.size() + i11) / i10;
        androidx.compose.foundation.layout.d dVar = this.f31511a;
        int h10 = Z0.a.h(dVar.f24736b);
        int i12 = this.f31512b;
        int min = Math.min((h10 - (i11 * i12)) / i10, this.f31513c);
        long j10 = dVar.f24736b;
        int p11 = com.google.android.gms.internal.play_billing.N.p(min, 0, Z0.a.h(j10) / i10);
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((E0.M) it.next()).o(B0.d(p11, p11)));
        }
        return p10.j0((com.google.android.gms.internal.play_billing.N.p(i11, Z0.a.j(j10), Z0.a.h(j10)) * i12) + (p11 * i10), (com.google.android.gms.internal.play_billing.N.p(size2 - 1, Z0.a.i(j10), Z0.a.g(j10)) * i12) + (p11 * size2), kf.w.f37484Y, new r(arrayList, i10, p11, i12));
    }

    @Override // E0.N
    public final /* synthetic */ int b(G0.g0 g0Var, List list, int i10) {
        return AbstractC0044t0.d(this, g0Var, list, i10);
    }

    @Override // E0.N
    public final /* synthetic */ int c(G0.g0 g0Var, List list, int i10) {
        return AbstractC0044t0.f(this, g0Var, list, i10);
    }

    @Override // E0.N
    public final /* synthetic */ int d(G0.g0 g0Var, List list, int i10) {
        return AbstractC0044t0.h(this, g0Var, list, i10);
    }

    @Override // E0.N
    public final /* synthetic */ int e(G0.g0 g0Var, List list, int i10) {
        return AbstractC0044t0.b(this, g0Var, list, i10);
    }
}
