package Ud;

import Ad.l;
import Ng.D0;
import Qd.i;
import Qd.m;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class d implements b {

    /* renamed from: a  reason: collision with root package name */
    public long f17711a;

    /* renamed from: b  reason: collision with root package name */
    public D0 f17712b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f17713c;

    @Override // Ud.b
    public final void c(i iVar) {
        AbstractC3557B.c0("analytics", iVar);
        if (!this.f17713c) {
            this.f17713c = true;
            m mVar = iVar.f14611Z;
            this.f17712b = l.O0(mVar.b(), mVar.c(), null, new c(this, iVar, null), 2);
        }
    }

    @Override // Ud.b
    public final boolean d() {
        return false;
    }

    @Override // Ud.b
    public final void e(com.segment.analytics.kotlin.core.a aVar) {
        AbstractC3557B.c0("event", aVar);
    }

    @Override // Ud.b
    public final void f() {
        if (this.f17713c) {
            this.f17713c = false;
            D0 d02 = this.f17712b;
            if (d02 != null) {
                d02.k(null);
            }
        }
    }

    @Override // Ud.b
    public final void b() {
    }
}
