package G4;

import java.util.ArrayList;
import v4.C5971a;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a  reason: collision with root package name */
    public static final U3.c f6029a = U3.c.y("k");

    public static ArrayList a(H4.a aVar, C5971a c5971a, float f6, J j6, boolean z10) {
        ArrayList arrayList = new ArrayList();
        if (aVar.P() == 6) {
            c5971a.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        aVar.h();
        while (aVar.m()) {
            if (aVar.V(f6029a) != 0) {
                aVar.d0();
            } else if (aVar.P() == 1) {
                aVar.a();
                if (aVar.P() == 7) {
                    arrayList.add(r.b(aVar, c5971a, f6, j6, false, z10));
                } else {
                    while (aVar.m()) {
                        arrayList.add(r.b(aVar, c5971a, f6, j6, true, z10));
                    }
                }
                aVar.i();
            } else {
                arrayList.add(r.b(aVar, c5971a, f6, j6, false, z10));
            }
        }
        aVar.j();
        b(arrayList);
        return arrayList;
    }

    public static void b(ArrayList arrayList) {
        int i10;
        Object obj;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            i10 = size - 1;
            if (i11 >= i10) {
                break;
            }
            J4.a aVar = (J4.a) arrayList.get(i11);
            i11++;
            J4.a aVar2 = (J4.a) arrayList.get(i11);
            aVar.f8845h = Float.valueOf(aVar2.f8844g);
            if (aVar.f8840c == null && (obj = aVar2.f8839b) != null) {
                aVar.f8840c = obj;
                if (aVar instanceof y4.l) {
                    ((y4.l) aVar).d();
                }
            }
        }
        J4.a aVar3 = (J4.a) arrayList.get(i10);
        if ((aVar3.f8839b == null || aVar3.f8840c == null) && arrayList.size() > 1) {
            arrayList.remove(aVar3);
        }
    }
}
