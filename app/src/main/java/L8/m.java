package L8;

import I8.C;
import I8.D;
import I8.E;
import z.AbstractC6708l;

/* loaded from: classes2.dex */
public final class m extends E {

    /* renamed from: b  reason: collision with root package name */
    public static final l f10809b = new l(0, new m(C.f8096Z));

    /* renamed from: a  reason: collision with root package name */
    public final D f10810a;

    public m(I8.z zVar) {
        this.f10810a = zVar;
    }

    @Override // I8.E
    public final Object b(P8.b bVar) {
        int R02 = bVar.R0();
        int f6 = AbstractC6708l.f(R02);
        if (f6 != 5 && f6 != 6) {
            if (f6 == 8) {
                bVar.A0();
                return null;
            }
            throw new RuntimeException("Expecting number, got: " + E9.f.L(R02) + "; at path " + bVar.r());
        }
        return this.f10810a.a(bVar);
    }

    @Override // I8.E
    public final void c(P8.c cVar, Object obj) {
        cVar.d0((Number) obj);
    }
}
