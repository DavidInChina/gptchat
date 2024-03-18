package x6;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import z.AbstractC6708l;

/* renamed from: x6.g1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6298g1 {

    /* renamed from: a  reason: collision with root package name */
    public final String f49317a;

    /* renamed from: b  reason: collision with root package name */
    public final int f49318b;

    /* renamed from: c  reason: collision with root package name */
    public final Boolean f49319c;

    public C6298g1(String str, int i10, Boolean bool) {
        AbstractC3557B.c0(ParameterNames.ID, str);
        AbstractC2469q0.q("type", i10);
        this.f49317a = str;
        this.f49318b = i10;
        this.f49319c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6298g1)) {
            return false;
        }
        C6298g1 c6298g1 = (C6298g1) obj;
        if (AbstractC3557B.K(this.f49317a, c6298g1.f49317a) && this.f49318b == c6298g1.f49318b && AbstractC3557B.K(this.f49319c, c6298g1.f49319c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int d10 = AbstractC6708l.d(this.f49318b, this.f49317a.hashCode() * 31, 31);
        Boolean bool = this.f49319c;
        if (bool == null) {
            i10 = 0;
        } else {
            i10 = bool.hashCode();
        }
        return d10 + i10;
    }

    public final String toString() {
        return "ResourceEventSession(id=" + this.f49317a + ", type=" + AbstractC6287d.a0(this.f49318b) + ", hasReplay=" + this.f49319c + Separators.RPAREN;
    }
}
