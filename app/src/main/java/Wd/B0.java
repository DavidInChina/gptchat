package wd;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import j$.time.Instant;
import k6.AbstractC4194d;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class B0 {
    public static final A0 Companion = new Object();

    /* renamed from: f  reason: collision with root package name */
    public static final KSerializer[] f48312f = {E0.Companion.serializer(), H0.Companion.serializer(), null, null, null};

    /* renamed from: g  reason: collision with root package name */
    public static final B0 f48313g;

    /* renamed from: h  reason: collision with root package name */
    public static final B0 f48314h;

    /* renamed from: i  reason: collision with root package name */
    public static final B0 f48315i;

    /* renamed from: a  reason: collision with root package name */
    public final E0 f48316a;

    /* renamed from: b  reason: collision with root package name */
    public final H0 f48317b;

    /* renamed from: c  reason: collision with root package name */
    public final Yg.p f48318c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f48319d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f48320e;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, wd.A0] */
    static {
        E0 e02 = E0.f48328i0;
        H0 h02 = H0.f48338Z;
        Yg.p.Companion.getClass();
        Instant ofEpochMilli = Instant.ofEpochMilli(Long.MAX_VALUE);
        AbstractC3557B.b0("ofEpochMilli(...)", ofEpochMilli);
        f48313g = new B0(e02, h02, new Yg.p(ofEpochMilli), true, true);
        E0 e03 = E0.f48329j0;
        H0 h03 = H0.f48339h0;
        Instant ofEpochMilli2 = Instant.ofEpochMilli(Long.MAX_VALUE);
        AbstractC3557B.b0("ofEpochMilli(...)", ofEpochMilli2);
        f48314h = new B0(e03, h03, new Yg.p(ofEpochMilli2), true, true);
        E0 e04 = E0.f48330k0;
        Instant ofEpochMilli3 = Instant.ofEpochMilli(Long.MAX_VALUE);
        AbstractC3557B.b0("ofEpochMilli(...)", ofEpochMilli3);
        f48315i = new B0(e04, h03, new Yg.p(ofEpochMilli3), true, true);
    }

    public B0(int i10, E0 e02, H0 h02, Yg.p pVar, boolean z10, boolean z11) {
        if (31 != (i10 & 31)) {
            R4.b.e2(i10, 31, z0.f48481b);
            throw null;
        }
        this.f48316a = e02;
        this.f48317b = h02;
        this.f48318c = pVar;
        this.f48319d = z10;
        this.f48320e = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B0)) {
            return false;
        }
        B0 b02 = (B0) obj;
        if (this.f48316a == b02.f48316a && this.f48317b == b02.f48317b && AbstractC3557B.K(this.f48318c, b02.f48318c) && this.f48319d == b02.f48319d && this.f48320e == b02.f48320e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int hashCode = (this.f48317b.hashCode() + (this.f48316a.hashCode() * 31)) * 31;
        Yg.p pVar = this.f48318c;
        if (pVar == null) {
            i10 = 0;
        } else {
            i10 = pVar.f22419Y.hashCode();
        }
        int i12 = (hashCode + i10) * 31;
        int i13 = 1237;
        if (this.f48319d) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        int i14 = (i12 + i11) * 31;
        if (this.f48320e) {
            i13 = 1231;
        }
        return i14 + i13;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Subscription(plan=");
        sb2.append(this.f48316a);
        sb2.append(", purchaseOrigin=");
        sb2.append(this.f48317b);
        sb2.append(", expirationDate=");
        sb2.append(this.f48318c);
        sb2.append(", willRenew=");
        sb2.append(this.f48319d);
        sb2.append(", isActive=");
        return AbstractC4194d.w(sb2, this.f48320e, Separators.RPAREN);
    }

    public B0(E0 e02, H0 h02, Yg.p pVar, boolean z10, boolean z11) {
        this.f48316a = e02;
        this.f48317b = h02;
        this.f48318c = pVar;
        this.f48319d = z10;
        this.f48320e = z11;
    }
}
