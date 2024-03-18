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
public final class E extends L4.a {

    /* renamed from: j  reason: collision with root package name */
    public final String f40627j;

    /* renamed from: k  reason: collision with root package name */
    public final Long f40628k;

    /* renamed from: l  reason: collision with root package name */
    public final Long f40629l;

    /* renamed from: m  reason: collision with root package name */
    public final int f40630m;

    /* renamed from: n  reason: collision with root package name */
    public final Map f40631n;

    /* renamed from: o  reason: collision with root package name */
    public final C4564c f40632o;

    public E(String str, Long l10, Long l11, int i10, Map map, C4564c c4564c) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
        AbstractC2469q0.q("kind", i10);
        this.f40627j = str;
        this.f40628k = l10;
        this.f40629l = l11;
        this.f40630m = i10;
        this.f40631n = map;
        this.f40632o = c4564c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e10 = (E) obj;
        if (AbstractC3557B.K(this.f40627j, e10.f40627j) && AbstractC3557B.K(this.f40628k, e10.f40628k) && AbstractC3557B.K(this.f40629l, e10.f40629l) && this.f40630m == e10.f40630m && AbstractC3557B.K(this.f40631n, e10.f40631n) && AbstractC3557B.K(this.f40632o, e10.f40632o)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f40627j.hashCode() * 31;
        int i11 = 0;
        Long l10 = this.f40628k;
        if (l10 == null) {
            i10 = 0;
        } else {
            i10 = l10.hashCode();
        }
        int i12 = (hashCode + i10) * 31;
        Long l11 = this.f40629l;
        if (l11 != null) {
            i11 = l11.hashCode();
        }
        return this.f40632o.hashCode() + AbstractC6463a.f(this.f40631n, AbstractC6708l.d(this.f40630m, (i12 + i11) * 31, 31), 31);
    }

    public final String toString() {
        return "StopResource(key=" + this.f40627j + ", statusCode=" + this.f40628k + ", size=" + this.f40629l + ", kind=" + AbstractC2469q0.y(this.f40630m) + ", attributes=" + this.f40631n + ", eventTime=" + this.f40632o + Separators.RPAREN;
    }

    @Override // L4.a
    public final C4564c v0() {
        return this.f40632o;
    }
}
