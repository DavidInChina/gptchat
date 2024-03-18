package G4;

import java.util.ArrayList;
import v4.C5971a;

/* renamed from: G4.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0608a {

    /* renamed from: a  reason: collision with root package name */
    public static final U3.c f5995a = U3.c.y("k", "x", "y");

    public static C4.c a(H4.b bVar, C5971a c5971a) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        if (bVar.P() == 1) {
            bVar.a();
            while (bVar.m()) {
                if (bVar.P() == 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList.add(new y4.l(c5971a, r.b(bVar, c5971a, I4.g.c(), w.f6038Y, z10, false)));
            }
            bVar.i();
            s.b(arrayList);
        } else {
            arrayList.add(new J4.a(q.b(bVar, I4.g.c())));
        }
        return new C4.c(0, arrayList);
    }

    public static C4.f b(H4.b bVar, C5971a c5971a) {
        bVar.h();
        C4.c cVar = null;
        C4.b bVar2 = null;
        boolean z10 = false;
        C4.b bVar3 = null;
        while (bVar.P() != 4) {
            int V10 = bVar.V(f5995a);
            if (V10 != 0) {
                if (V10 != 1) {
                    if (V10 != 2) {
                        bVar.a0();
                        bVar.d0();
                    } else if (bVar.P() == 6) {
                        bVar.d0();
                        z10 = true;
                    } else {
                        bVar2 = M3.H.d0(bVar, c5971a, true);
                    }
                } else if (bVar.P() == 6) {
                    bVar.d0();
                    z10 = true;
                } else {
                    bVar3 = M3.H.d0(bVar, c5971a, true);
                }
            } else {
                cVar = a(bVar, c5971a);
            }
        }
        bVar.j();
        if (z10) {
            c5971a.a("Lottie doesn't support expressions.");
        }
        if (cVar != null) {
            return cVar;
        }
        return new C4.d(bVar3, bVar2);
    }
}
