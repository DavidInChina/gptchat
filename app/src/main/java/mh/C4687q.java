package mh;

import E0.AbstractC0454m;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import l0.AbstractC4313e;
import q0.C5252d;
import q0.C5254f;

/* renamed from: mh.q  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4687q implements v {

    /* renamed from: a  reason: collision with root package name */
    public final long f39498a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC0454m f39499b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC4313e f39500c;

    public C4687q(long j6, AbstractC0454m abstractC0454m, AbstractC4313e abstractC4313e) {
        AbstractC3557B.c0("scale", abstractC0454m);
        AbstractC3557B.c0("alignment", abstractC4313e);
        this.f39498a = j6;
        this.f39499b = abstractC0454m;
        this.f39500c = abstractC4313e;
    }

    @Override // mh.v
    public final long a(long j6) {
        return this.f39498a;
    }

    @Override // mh.v
    public final C5252d b(long j6, Z0.l lVar) {
        AbstractC3557B.c0("direction", lVar);
        if (!C5254f.f(j6)) {
            AbstractC0454m abstractC0454m = this.f39499b;
            long j10 = this.f39498a;
            long m10 = androidx.compose.ui.layout.a.m(j10, abstractC0454m.a(j10, j6));
            long a5 = this.f39500c.a(Ng.H.c((int) C5254f.d(m10), (int) C5254f.b(m10)), Ng.H.c((int) C5254f.d(j6), (int) C5254f.b(j6)), lVar);
            int i10 = Z0.i.f22798c;
            return A7.b.K(R4.b.r((int) (a5 >> 32), (int) (a5 & 4294967295L)), m10);
        }
        throw new IllegalStateException("Layout size is empty".toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4687q)) {
            return false;
        }
        C4687q c4687q = (C4687q) obj;
        if (C5254f.a(this.f39498a, c4687q.f39498a) && AbstractC3557B.K(this.f39499b, c4687q.f39499b) && AbstractC3557B.K(this.f39500c, c4687q.f39500c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f39499b.hashCode();
        return this.f39500c.hashCode() + ((hashCode + (C5254f.e(this.f39498a) * 31)) * 31);
    }

    public final String toString() {
        String g10 = C5254f.g(this.f39498a);
        return "RelativeContentLocation(size=" + g10 + ", scale=" + this.f39499b + ", alignment=" + this.f39500c + Separators.RPAREN;
    }
}
