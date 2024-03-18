package E0;

import java.util.ArrayList;
import java.util.List;
import y.C6461B;

/* loaded from: classes2.dex */
public final class i0 extends G0.G {

    /* renamed from: b  reason: collision with root package name */
    public static final i0 f4067b = new G0.G("Undefined intrinsics block and it is required");

    @Override // E0.N
    public final O a(P p10, List list, long j6) {
        boolean isEmpty = list.isEmpty();
        kf.w wVar = kf.w.f37484Y;
        if (isEmpty) {
            return p10.j0(Z0.a.j(j6), Z0.a.i(j6), wVar, e0.f4059h0);
        }
        if (list.size() == 1) {
            d0 o10 = ((M) list.get(0)).o(j6);
            return p10.j0(A7.b.t0(o10.f4053Y, j6), A7.b.s0(o10.f4054Z, j6), wVar, new y.D(o10, 13));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((M) list.get(i10)).o(j6));
        }
        int size2 = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size2; i13++) {
            d0 d0Var = (d0) arrayList.get(i13);
            i11 = Math.max(d0Var.f4053Y, i11);
            i12 = Math.max(d0Var.f4054Z, i12);
        }
        return p10.j0(A7.b.t0(i11, j6), A7.b.s0(i12, j6), wVar, new C6461B(5, arrayList));
    }
}
