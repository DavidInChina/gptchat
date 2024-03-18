package dg;

import Sf.AbstractC1385d;
import id.AbstractC3557B;
import kg.C4290b;
import xg.AbstractC6453h;
import xg.C6452g;

/* loaded from: classes.dex */
public final class p implements AbstractC6453h {

    /* renamed from: a  reason: collision with root package name */
    public final x f28351a;

    /* renamed from: b  reason: collision with root package name */
    public final o f28352b;

    public p(Rf.d dVar, o oVar) {
        this.f28351a = dVar;
        this.f28352b = oVar;
    }

    @Override // xg.AbstractC6453h
    public final C6452g a(C4290b c4290b) {
        AbstractC3557B.c0("classId", c4290b);
        o oVar = this.f28352b;
        AbstractC3557B.c0("<this>", oVar.c().f50012c);
        AbstractC2653B L10 = P4.a.L(this.f28351a, c4290b, jg.g.f36187g);
        if (L10 == null) {
            return null;
        }
        AbstractC3557B.K(AbstractC1385d.a(((Rf.c) L10).f15499a), c4290b);
        return oVar.f(L10);
    }
}
