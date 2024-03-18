package Ne;

import Me.h;
import Me.i;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f12801a = new byte[0];

    public static final void a(h hVar, c cVar) {
        AbstractC3557B.c0("<this>", hVar);
        if (cVar == hVar) {
            return;
        }
        int i10 = cVar.f12023c;
        int i11 = cVar.f12022b;
        if (i10 > i11) {
            int i12 = cVar.f12025e;
            int i13 = cVar.f12026f;
            if (i13 - i12 < 8) {
                c i14 = cVar.i();
                if (i14 == null) {
                    hVar.i(cVar);
                    return;
                }
                int i15 = cVar.f12023c - cVar.f12022b;
                int min = Math.min(i15, 8 - (i13 - cVar.f12025e));
                if (i14.f12024d < min) {
                    hVar.i(cVar);
                    return;
                }
                i14.d(i14.f12022b - min);
                if (i15 > min) {
                    cVar.f12025e = i13;
                    hVar.f12037j0 = cVar.f12023c;
                    hVar.P(hVar.f12038k0 + min);
                    return;
                }
                hVar.S(i14);
                hVar.P(hVar.f12038k0 - ((i14.f12023c - i14.f12022b) - min));
                cVar.g();
                cVar.k(hVar.f12033Y);
                return;
            }
            hVar.f12036i0 = i11;
            return;
        }
        hVar.h(cVar);
    }

    public static final c b(h hVar, int i10) {
        AbstractC3557B.c0("<this>", hVar);
        return hVar.p(i10, hVar.k());
    }

    public static final c c(h hVar, c cVar) {
        AbstractC3557B.c0("<this>", hVar);
        if (cVar == hVar) {
            if (hVar.f12036i0 == hVar.f12037j0 && hVar.f12038k0 == 0) {
                return null;
            }
            return (c) hVar;
        }
        return hVar.h(cVar);
    }

    public static final c d(i iVar, int i10, c cVar) {
        AbstractC3557B.c0("<this>", iVar);
        if (cVar != null) {
            iVar.a();
        }
        return iVar.i(i10);
    }
}
