package r0;

import id.AbstractC3557B;
import q0.AbstractC5249a;
import q0.C5253e;

/* loaded from: classes2.dex */
public final class D extends G {

    /* renamed from: k  reason: collision with root package name */
    public final C5253e f44169k;

    /* renamed from: l  reason: collision with root package name */
    public final C5344h f44170l;

    public D(C5253e c5253e) {
        boolean z10;
        C5344h c5344h;
        this.f44169k = c5253e;
        long j6 = c5253e.f43636h;
        float b10 = AbstractC5249a.b(j6);
        long j10 = c5253e.f43635g;
        int i10 = (b10 > AbstractC5249a.b(j10) ? 1 : (b10 == AbstractC5249a.b(j10) ? 0 : -1));
        boolean z11 = false;
        long j11 = c5253e.f43633e;
        long j12 = c5253e.f43634f;
        if (i10 == 0 && AbstractC5249a.b(j10) == AbstractC5249a.b(j12) && AbstractC5249a.b(j12) == AbstractC5249a.b(j11)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (AbstractC5249a.c(j6) == AbstractC5249a.c(j10) && AbstractC5249a.c(j10) == AbstractC5249a.c(j12) && AbstractC5249a.c(j12) == AbstractC5249a.c(j11)) {
            z11 = true;
        }
        if (z10 && z11) {
            c5344h = null;
        } else {
            C5344h g10 = androidx.compose.ui.graphics.a.g();
            g10.a(c5253e);
            c5344h = g10;
        }
        this.f44170l = c5344h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        if (AbstractC3557B.K(this.f44169k, ((D) obj).f44169k)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f44169k.hashCode();
    }
}
