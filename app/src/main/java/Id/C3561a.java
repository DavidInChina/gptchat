package id;

import android.gov.nist.core.Separators;
import jf.C3970t;

/* renamed from: id.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3561a {

    /* renamed from: a  reason: collision with root package name */
    public final long f33089a;

    /* renamed from: b  reason: collision with root package name */
    public final long f33090b;

    public C3561a(long j6, long j10) {
        this.f33089a = j6;
        this.f33090b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3561a)) {
            return false;
        }
        C3561a c3561a = (C3561a) obj;
        if (r0.r.c(this.f33089a, c3561a.f33089a) && r0.r.c(this.f33090b, c3561a.f33090b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = r0.r.f44264l;
        return C3970t.a(this.f33090b) + (C3970t.a(this.f33089a) * 31);
    }

    public final String toString() {
        String i10 = r0.r.i(this.f33089a);
        String i11 = r0.r.i(this.f33090b);
        return "CellPalette(text=" + i10 + ", background=" + i11 + Separators.RPAREN;
    }
}
