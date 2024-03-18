package Dc;

import Jd.h;
import Jd.i;
import id.AbstractC3557B;
import xd.g;

/* loaded from: classes2.dex */
public final class d extends i {

    /* renamed from: j  reason: collision with root package name */
    public final g f3497j;

    public d(g gVar) {
        super(new h(false, false));
        this.f3497j = gVar;
    }

    @Override // Ad.g
    public final void i(Ad.i iVar) {
        Jd.e eVar = (Jd.e) iVar;
        AbstractC3557B.c0("intent", eVar);
        if (eVar instanceof Jd.d) {
            h(new b(this, null));
        } else if (eVar instanceof Jd.c) {
            h(new c(this, null));
        }
    }
}
