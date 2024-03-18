package x6;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import z.AbstractC6708l;

/* renamed from: x6.r0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6329r0 {

    /* renamed from: a  reason: collision with root package name */
    public final C6332s0 f49426a;

    /* renamed from: b  reason: collision with root package name */
    public final int f49427b;

    public C6329r0(C6332s0 c6332s0, int i10) {
        AbstractC2469q0.q("source", i10);
        this.f49426a = c6332s0;
        this.f49427b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6329r0)) {
            return false;
        }
        C6329r0 c6329r0 = (C6329r0) obj;
        if (AbstractC3557B.K(this.f49426a, c6329r0.f49426a) && this.f49427b == c6329r0.f49427b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC6708l.f(this.f49427b) + (this.f49426a.f49434a.hashCode() * 31);
    }

    public final String toString() {
        return "Container(view=" + this.f49426a + ", source=" + AbstractC6287d.S(this.f49427b) + Separators.RPAREN;
    }
}
