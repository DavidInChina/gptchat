package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: x6.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6323p {

    /* renamed from: a  reason: collision with root package name */
    public final C6277A f49410a;

    /* renamed from: b  reason: collision with root package name */
    public final C6326q f49411b;

    public C6323p(C6277A c6277a, C6326q c6326q) {
        this.f49410a = c6277a;
        this.f49411b = c6326q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6323p)) {
            return false;
        }
        C6323p c6323p = (C6323p) obj;
        if (AbstractC3557B.K(this.f49410a, c6323p.f49410a) && AbstractC3557B.K(this.f49411b, c6323p.f49411b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        C6277A c6277a = this.f49410a;
        if (c6277a == null) {
            i10 = 0;
        } else {
            i10 = c6277a.hashCode();
        }
        int i12 = i10 * 31;
        C6326q c6326q = this.f49411b;
        if (c6326q != null) {
            i11 = c6326q.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        return "DdAction(position=" + this.f49410a + ", target=" + this.f49411b + Separators.RPAREN;
    }
}
