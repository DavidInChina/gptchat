package Hh;

import Eh.AbstractC0511j;
import yh.AbstractC6632q;

/* loaded from: classes2.dex */
public enum h implements n {
    f7807h0("ZERO", o.ZERO),
    f7808i0("SINGLE", o.SINGLE),
    f7809j0("DOUBLE", o.DOUBLE);
    

    /* renamed from: Y  reason: collision with root package name */
    public final l f7811Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f7812Z;

    h(String str, o oVar) {
        this.f7811Y = new l(oVar.f7825Y * (-1), 0);
        this.f7812Z = r2;
    }

    public static h h(AbstractC6632q abstractC6632q) {
        int ordinal = abstractC6632q.p().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return f7809j0;
                }
                throw new AssertionError();
            }
            return f7808i0;
        }
        return f7807h0;
    }

    @Override // Hh.n
    public final boolean b() {
        return true;
    }

    public l e(Nh.l lVar, AbstractC0511j abstractC0511j) {
        lVar.n(this.f7812Z);
        return this.f7811Y;
    }
}
