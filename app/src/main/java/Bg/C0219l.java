package Bg;

import id.AbstractC3557B;

/* renamed from: Bg.l  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0219l extends N {

    /* renamed from: a  reason: collision with root package name */
    public final Nf.i f2134a;

    public C0219l(Nf.i iVar) {
        AbstractC3557B.c0("annotations", iVar);
        this.f2134a = iVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0219l)) {
            return false;
        }
        return AbstractC3557B.K(((C0219l) obj).f2134a, this.f2134a);
    }

    public final int hashCode() {
        return this.f2134a.hashCode();
    }
}
