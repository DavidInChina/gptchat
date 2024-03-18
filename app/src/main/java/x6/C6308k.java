package x6;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import z.AbstractC6708l;

/* renamed from: x6.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6308k {

    /* renamed from: a  reason: collision with root package name */
    public final C6311l f49344a;

    /* renamed from: b  reason: collision with root package name */
    public final int f49345b;

    public C6308k(C6311l c6311l, int i10) {
        AbstractC2469q0.q("source", i10);
        this.f49344a = c6311l;
        this.f49345b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6308k)) {
            return false;
        }
        C6308k c6308k = (C6308k) obj;
        if (AbstractC3557B.K(this.f49344a, c6308k.f49344a) && this.f49345b == c6308k.f49345b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC6708l.f(this.f49345b) + (this.f49344a.f49370a.hashCode() * 31);
    }

    public final String toString() {
        return "Container(view=" + this.f49344a + ", source=" + AbstractC6287d.E(this.f49345b) + Separators.RPAREN;
    }
}
