package o6;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import id.AbstractC3557B;
import java.util.Map;
import m6.C4564c;
import y.AbstractC6463a;
import z.AbstractC6708l;

/* loaded from: classes2.dex */
public final class F extends L4.a {

    /* renamed from: j  reason: collision with root package name */
    public final String f40633j;

    /* renamed from: k  reason: collision with root package name */
    public final Long f40634k;

    /* renamed from: l  reason: collision with root package name */
    public final String f40635l;

    /* renamed from: m  reason: collision with root package name */
    public final int f40636m = 1;

    /* renamed from: n  reason: collision with root package name */
    public final Throwable f40637n;

    /* renamed from: o  reason: collision with root package name */
    public final Map f40638o;

    /* renamed from: p  reason: collision with root package name */
    public final C4564c f40639p;

    public F(String str, Long l10, String str2, Throwable th2, Map map) {
        C4564c c4564c = new C4564c();
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
        AbstractC2469q0.q("source", 1);
        this.f40633j = str;
        this.f40634k = l10;
        this.f40635l = str2;
        this.f40637n = th2;
        this.f40638o = map;
        this.f40639p = c4564c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f6 = (F) obj;
        if (AbstractC3557B.K(this.f40633j, f6.f40633j) && AbstractC3557B.K(this.f40634k, f6.f40634k) && AbstractC3557B.K(this.f40635l, f6.f40635l) && this.f40636m == f6.f40636m && AbstractC3557B.K(this.f40637n, f6.f40637n) && AbstractC3557B.K(this.f40638o, f6.f40638o) && AbstractC3557B.K(this.f40639p, f6.f40639p)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f40633j.hashCode() * 31;
        Long l10 = this.f40634k;
        if (l10 == null) {
            i10 = 0;
        } else {
            i10 = l10.hashCode();
        }
        int d10 = AbstractC6708l.d(this.f40636m, E9.f.v(this.f40635l, (hashCode + i10) * 31, 31), 31);
        return this.f40639p.hashCode() + AbstractC6463a.f(this.f40638o, (this.f40637n.hashCode() + d10) * 31, 31);
    }

    public final String toString() {
        return "StopResourceWithError(key=" + this.f40633j + ", statusCode=" + this.f40634k + ", message=" + this.f40635l + ", source=" + AbstractC2469q0.x(this.f40636m) + ", throwable=" + this.f40637n + ", attributes=" + this.f40638o + ", eventTime=" + this.f40639p + Separators.RPAREN;
    }

    @Override // L4.a
    public final C4564c v0() {
        return this.f40639p;
    }
}
