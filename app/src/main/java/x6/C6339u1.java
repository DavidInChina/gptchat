package x6;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import z.AbstractC6708l;

/* renamed from: x6.u1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6339u1 {

    /* renamed from: a  reason: collision with root package name */
    public final C6342v1 f49449a;

    /* renamed from: b  reason: collision with root package name */
    public final int f49450b;

    public C6339u1(C6342v1 c6342v1, int i10) {
        AbstractC2469q0.q("source", i10);
        this.f49449a = c6342v1;
        this.f49450b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6339u1)) {
            return false;
        }
        C6339u1 c6339u1 = (C6339u1) obj;
        if (AbstractC3557B.K(this.f49449a, c6339u1.f49449a) && this.f49450b == c6339u1.f49450b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC6708l.f(this.f49450b) + (this.f49449a.f49454a.hashCode() * 31);
    }

    public final String toString() {
        return "Container(view=" + this.f49449a + ", source=" + AbstractC6301h1.t(this.f49450b) + Separators.RPAREN;
    }
}
