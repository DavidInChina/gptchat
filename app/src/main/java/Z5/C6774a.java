package z5;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import k6.AbstractC4194d;
import z.AbstractC6708l;

/* renamed from: z5.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6774a {

    /* renamed from: a  reason: collision with root package name */
    public final int f51736a;

    /* renamed from: b  reason: collision with root package name */
    public final int f51737b;

    /* renamed from: c  reason: collision with root package name */
    public final long f51738c;

    /* renamed from: d  reason: collision with root package name */
    public final long f51739d;

    /* renamed from: e  reason: collision with root package name */
    public final long f51740e;

    public C6774a(int i10, int i11) {
        AbstractC2469q0.q("frequency", i10);
        this.f51736a = i10;
        this.f51737b = i11;
        long i12 = AbstractC4194d.i(i10);
        this.f51738c = i12;
        this.f51739d = 10 * i12;
        this.f51740e = 5 * i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6774a)) {
            return false;
        }
        C6774a c6774a = (C6774a) obj;
        if (this.f51736a == c6774a.f51736a && this.f51737b == c6774a.f51737b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (AbstractC6708l.f(this.f51736a) * 31) + this.f51737b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DataUploadConfiguration(frequency=");
        sb2.append(AbstractC4194d.N(this.f51736a));
        sb2.append(", maxBatchesPerUploadJob=");
        return android.gov.nist.core.a.l(sb2, this.f51737b, Separators.RPAREN);
    }
}
