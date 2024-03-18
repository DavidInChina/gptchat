package Cc;

import Ad.i;
import Dd.W;
import Id.g;
import Id.h;
import Id.j;
import Id.k;
import Id.l;
import id.AbstractC3557B;
import nf.AbstractC4828h;

/* loaded from: classes.dex */
public final class d extends g {

    /* renamed from: j  reason: collision with root package name */
    public final W f2983j;

    public d(W w10) {
        super(new l(k.f8556a, null, null, false));
        this.f2983j = w10;
        Ad.l.O0(AbstractC4828h.Q(this), null, null, new a(this, null), 3);
    }

    @Override // Ad.g
    public final void i(i iVar) {
        j jVar = (j) iVar;
        AbstractC3557B.c0("intent", jVar);
        if (jVar instanceof Id.i) {
            l(b.f2979Y);
        } else if (jVar instanceof h) {
            h(new c(this, jVar, null));
        }
    }
}
