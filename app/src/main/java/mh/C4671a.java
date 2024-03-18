package mh;

import E0.j0;
import android.gov.nist.core.Separators;

/* renamed from: mh.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4671a {

    /* renamed from: a  reason: collision with root package name */
    public final long f39433a;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4671a)) {
            return false;
        }
        long j6 = ((C4671a) obj).f39433a;
        int i10 = j0.f4070b;
        if (this.f39433a != j6) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10 = j0.f4070b;
        long j6 = this.f39433a;
        return (int) (j6 ^ (j6 >>> 32));
    }

    public final String toString() {
        return android.gov.nist.core.a.A("BaseZoomFactor(value=", j0.c(this.f39433a), Separators.RPAREN);
    }
}
