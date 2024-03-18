package mh;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import u0.AbstractC5824b;

/* renamed from: mh.E  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4660E {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC4658C f39399a;

    /* renamed from: b  reason: collision with root package name */
    public final long f39400b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC5824b f39401c;

    public C4660E(AbstractC4658C abstractC4658C, long j6, AbstractC5824b abstractC5824b) {
        this.f39399a = abstractC4658C;
        this.f39400b = j6;
        this.f39401c = abstractC5824b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4660E)) {
            return false;
        }
        C4660E c4660e = (C4660E) obj;
        if (AbstractC3557B.K(this.f39399a, c4660e.f39399a) && Mg.b.d(this.f39400b, c4660e.f39400b) && AbstractC3557B.K(this.f39401c, c4660e.f39401c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        AbstractC4658C abstractC4658C = this.f39399a;
        if (abstractC4658C == null) {
            i10 = 0;
        } else {
            i10 = abstractC4658C.hashCode();
        }
        int g10 = (Mg.b.g(this.f39400b) + (i10 * 31)) * 31;
        AbstractC5824b abstractC5824b = this.f39401c;
        if (abstractC5824b != null) {
            i11 = abstractC5824b.hashCode();
        }
        return g10 + i11;
    }

    public final String toString() {
        String m10 = Mg.b.m(this.f39400b);
        return "ResolveResult(delegate=" + this.f39399a + ", crossfadeDuration=" + m10 + ", placeholder=" + this.f39401c + Separators.RPAREN;
    }
}
