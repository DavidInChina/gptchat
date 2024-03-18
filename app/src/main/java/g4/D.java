package G4;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class D implements J {

    /* renamed from: Y  reason: collision with root package name */
    public static final D f5987Y = new Object();

    /* renamed from: Z  reason: collision with root package name */
    public static final U3.c f5988Z = U3.c.y("c", "v", "i", "o");

    @Override // G4.J
    public final Object c(H4.a aVar, float f6) {
        if (aVar.P() == 1) {
            aVar.a();
        }
        aVar.h();
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        boolean z10 = false;
        while (aVar.m()) {
            int V10 = aVar.V(f5988Z);
            if (V10 != 0) {
                if (V10 != 1) {
                    if (V10 != 2) {
                        if (V10 != 3) {
                            aVar.a0();
                            aVar.d0();
                        } else {
                            arrayList3 = q.c(aVar, f6);
                        }
                    } else {
                        arrayList2 = q.c(aVar, f6);
                    }
                } else {
                    arrayList = q.c(aVar, f6);
                }
            } else {
                z10 = aVar.p();
            }
        }
        aVar.j();
        if (aVar.P() == 2) {
            aVar.i();
        }
        if (arrayList != null && arrayList2 != null && arrayList3 != null) {
            if (arrayList.isEmpty()) {
                return new D4.k(new PointF(), false, Collections.emptyList());
            }
            int size = arrayList.size();
            PointF pointF = (PointF) arrayList.get(0);
            ArrayList arrayList4 = new ArrayList(size);
            for (int i10 = 1; i10 < size; i10++) {
                PointF pointF2 = (PointF) arrayList.get(i10);
                int i11 = i10 - 1;
                arrayList4.add(new B4.a(I4.f.a((PointF) arrayList.get(i11), (PointF) arrayList3.get(i11)), I4.f.a(pointF2, (PointF) arrayList2.get(i10)), pointF2));
            }
            if (z10) {
                PointF pointF3 = (PointF) arrayList.get(0);
                int i12 = size - 1;
                arrayList4.add(new B4.a(I4.f.a((PointF) arrayList.get(i12), (PointF) arrayList3.get(i12)), I4.f.a(pointF3, (PointF) arrayList2.get(0)), pointF3));
            }
            return new D4.k(pointF, z10, arrayList4);
        }
        throw new IllegalArgumentException("Shape data was missing information.");
    }
}
