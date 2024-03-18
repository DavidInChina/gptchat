package x6;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import z.AbstractC6708l;

/* renamed from: x6.f0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6294f0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f49293a;

    /* renamed from: b  reason: collision with root package name */
    public final long f49294b;

    /* renamed from: c  reason: collision with root package name */
    public final String f49295c;

    /* renamed from: d  reason: collision with root package name */
    public final C6291e0 f49296d;

    public C6294f0(int i10, long j6, String str, C6291e0 c6291e0) {
        AbstractC2469q0.q("method", i10);
        AbstractC3557B.c0("url", str);
        this.f49293a = i10;
        this.f49294b = j6;
        this.f49295c = str;
        this.f49296d = c6291e0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6294f0)) {
            return false;
        }
        C6294f0 c6294f0 = (C6294f0) obj;
        if (this.f49293a == c6294f0.f49293a && this.f49294b == c6294f0.f49294b && AbstractC3557B.K(this.f49295c, c6294f0.f49295c) && AbstractC3557B.K(this.f49296d, c6294f0.f49296d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        long j6 = this.f49294b;
        int v10 = E9.f.v(this.f49295c, ((AbstractC6708l.f(this.f49293a) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31, 31);
        C6291e0 c6291e0 = this.f49296d;
        if (c6291e0 == null) {
            i10 = 0;
        } else {
            i10 = c6291e0.hashCode();
        }
        return v10 + i10;
    }

    public final String toString() {
        return "Resource(method=" + AbstractC6287d.J(this.f49293a) + ", statusCode=" + this.f49294b + ", url=" + this.f49295c + ", provider=" + this.f49296d + Separators.RPAREN;
    }
}
