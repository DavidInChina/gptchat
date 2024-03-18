package mh;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: mh.F  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4661F implements AbstractC4658C {

    /* renamed from: a  reason: collision with root package name */
    public final kh.l f39402a;

    /* renamed from: b  reason: collision with root package name */
    public final kh.c f39403b;

    public C4661F(kh.l lVar, kh.c cVar) {
        this.f39402a = lVar;
        this.f39403b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4661F)) {
            return false;
        }
        C4661F c4661f = (C4661F) obj;
        if (AbstractC3557B.K(this.f39402a, c4661f.f39402a) && AbstractC3557B.K(this.f39403b, c4661f.f39403b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f39403b.hashCode() + (this.f39402a.hashCode() * 31);
    }

    public final String toString() {
        return "SubSamplingDelegate(source=" + this.f39402a + ", imageOptions=" + this.f39403b + Separators.RPAREN;
    }
}
