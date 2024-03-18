package L;

import A.AbstractC0044t0;
import java.util.ArrayList;
import java.util.List;
import y.C6461B;

/* renamed from: L.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0846f implements E0.N {

    /* renamed from: a  reason: collision with root package name */
    public static final C0846f f10122a = new Object();

    @Override // E0.N
    public final E0.O a(E0.P p10, List list, long j6) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((E0.M) list.get(i10)).o(j6));
        }
        return p10.j0(Z0.a.h(j6), Z0.a.g(j6), kf.w.f37484Y, new C6461B(1, arrayList));
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
