package F0;

import Z.C1724m0;
import Z.o1;
import nf.AbstractC4828h;

/* loaded from: classes2.dex */
public final class j extends Bi.c {

    /* renamed from: h  reason: collision with root package name */
    public final c f5029h;

    /* renamed from: i  reason: collision with root package name */
    public final C1724m0 f5030i = AbstractC4828h.Z(null, o1.f22665a);

    public j(c cVar) {
        this.f5029h = cVar;
    }

    @Override // Bi.c
    public final boolean G0(c cVar) {
        if (cVar == this.f5029h) {
            return true;
        }
        return false;
    }

    @Override // Bi.c
    public final Object N0(i iVar) {
        if (iVar == this.f5029h) {
            Object value = this.f5030i.getValue();
            if (value == null) {
                return null;
            }
            return value;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
