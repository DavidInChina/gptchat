package x6;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: a  reason: collision with root package name */
    public final String f49023a;

    /* renamed from: b  reason: collision with root package name */
    public final String f49024b;

    /* renamed from: c  reason: collision with root package name */
    public final String f49025c;

    /* renamed from: d  reason: collision with root package name */
    public final int f49026d;

    public K(String str, String str2, String str3, int i10) {
        AbstractC2469q0.q("source", i10);
        this.f49023a = str;
        this.f49024b = str2;
        this.f49025c = str3;
        this.f49026d = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K)) {
            return false;
        }
        K k10 = (K) obj;
        if (AbstractC3557B.K(this.f49023a, k10.f49023a) && AbstractC3557B.K(this.f49024b, k10.f49024b) && AbstractC3557B.K(this.f49025c, k10.f49025c) && this.f49026d == k10.f49026d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f49023a.hashCode() * 31;
        int i11 = 0;
        String str = this.f49024b;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i12 = (hashCode + i10) * 31;
        String str2 = this.f49025c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return AbstractC6708l.f(this.f49026d) + ((i12 + i11) * 31);
    }

    public final String toString() {
        return "Cause(message=" + this.f49023a + ", type=" + this.f49024b + ", stack=" + this.f49025c + ", source=" + AbstractC6287d.H(this.f49026d) + Separators.RPAREN;
    }
}
