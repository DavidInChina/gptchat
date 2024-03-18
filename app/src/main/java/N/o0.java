package N;

import A.AbstractC0044t0;
import java.util.ArrayList;
import java.util.List;
import y.C6461B;

/* loaded from: classes2.dex */
public final class o0 implements E0.N {

    /* renamed from: a  reason: collision with root package name */
    public static final o0 f12389a = new Object();

    @Override // E0.N
    public final E0.O a(E0.P p10, List list, long j6) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        Integer num = 0;
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((E0.M) list.get(i10)).o(j6));
        }
        int size2 = arrayList.size();
        Integer num2 = num;
        for (int i11 = 0; i11 < size2; i11++) {
            num2 = Integer.valueOf(Math.max(num2.intValue(), ((E0.d0) arrayList.get(i11)).f4053Y));
        }
        int intValue = num2.intValue();
        int size3 = arrayList.size();
        for (int i12 = 0; i12 < size3; i12++) {
            num = Integer.valueOf(Math.max(num.intValue(), ((E0.d0) arrayList.get(i12)).f4054Z));
        }
        return p10.j0(intValue, num.intValue(), kf.w.f37484Y, new C6461B(3, arrayList));
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
