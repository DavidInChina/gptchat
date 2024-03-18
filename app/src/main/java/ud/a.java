package Ud;

import Qd.i;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public int f17705a;

    /* renamed from: b  reason: collision with root package name */
    public int f17706b;

    @Override // Ud.b
    public final void b() {
        this.f17706b = 0;
    }

    @Override // Ud.b
    public final void c(i iVar) {
        AbstractC3557B.c0("analytics", iVar);
    }

    @Override // Ud.b
    public final boolean d() {
        if (this.f17706b >= this.f17705a) {
            return true;
        }
        return false;
    }

    @Override // Ud.b
    public final void e(com.segment.analytics.kotlin.core.a aVar) {
        AbstractC3557B.c0("event", aVar);
        this.f17706b++;
    }

    @Override // Ud.b
    public final void f() {
    }
}
