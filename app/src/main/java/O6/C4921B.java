package o6;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import id.AbstractC3557B;
import java.util.Map;
import m6.C4564c;
import y.AbstractC6463a;
import z.AbstractC6708l;

/* renamed from: o6.B  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4921B extends L4.a {

    /* renamed from: j  reason: collision with root package name */
    public final String f40615j;

    /* renamed from: k  reason: collision with root package name */
    public final String f40616k;

    /* renamed from: l  reason: collision with root package name */
    public final int f40617l;

    /* renamed from: m  reason: collision with root package name */
    public final Map f40618m;

    /* renamed from: n  reason: collision with root package name */
    public final C4564c f40619n;

    public C4921B(String str, String str2, int i10, Map map, C4564c c4564c) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
        AbstractC3557B.c0("url", str2);
        AbstractC2469q0.q("method", i10);
        this.f40615j = str;
        this.f40616k = str2;
        this.f40617l = i10;
        this.f40618m = map;
        this.f40619n = c4564c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4921B)) {
            return false;
        }
        C4921B c4921b = (C4921B) obj;
        if (AbstractC3557B.K(this.f40615j, c4921b.f40615j) && AbstractC3557B.K(this.f40616k, c4921b.f40616k) && this.f40617l == c4921b.f40617l && AbstractC3557B.K(this.f40618m, c4921b.f40618m) && AbstractC3557B.K(this.f40619n, c4921b.f40619n)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f40619n.hashCode() + AbstractC6463a.f(this.f40618m, AbstractC6708l.d(this.f40617l, E9.f.v(this.f40616k, this.f40615j.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return "StartResource(key=" + this.f40615j + ", url=" + this.f40616k + ", method=" + AbstractC2469q0.z(this.f40617l) + ", attributes=" + this.f40618m + ", eventTime=" + this.f40619n + Separators.RPAREN;
    }

    @Override // L4.a
    public final C4564c v0() {
        return this.f40619n;
    }
}
