package o6;

import A.AbstractC0044t0;
import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.util.Map;
import k6.AbstractC4194d;
import m6.C4564c;
import z.AbstractC6708l;

/* renamed from: o6.y  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4945y extends L4.a {

    /* renamed from: j  reason: collision with root package name */
    public final int f40910j;

    /* renamed from: k  reason: collision with root package name */
    public final String f40911k;

    /* renamed from: l  reason: collision with root package name */
    public final String f40912l;

    /* renamed from: m  reason: collision with root package name */
    public final String f40913m;

    /* renamed from: n  reason: collision with root package name */
    public final A6.b f40914n;

    /* renamed from: o  reason: collision with root package name */
    public final Map f40915o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f40916p;

    /* renamed from: q  reason: collision with root package name */
    public final C4564c f40917q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f40918r;

    public C4945y(int i10, String str, String str2, String str3, A6.b bVar, Map map, boolean z10, int i11) {
        C4564c c4564c = new C4564c();
        z10 = (i11 & 256) != 0 ? false : z10;
        AbstractC2469q0.q("type", i10);
        this.f40910j = i10;
        this.f40911k = str;
        this.f40912l = str2;
        this.f40913m = str3;
        this.f40914n = bVar;
        this.f40915o = map;
        this.f40916p = false;
        this.f40917q = c4564c;
        this.f40918r = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4945y)) {
            return false;
        }
        C4945y c4945y = (C4945y) obj;
        if (this.f40910j == c4945y.f40910j && AbstractC3557B.K(this.f40911k, c4945y.f40911k) && AbstractC3557B.K(this.f40912l, c4945y.f40912l) && AbstractC3557B.K(this.f40913m, c4945y.f40913m) && AbstractC3557B.K(this.f40914n, c4945y.f40914n) && AbstractC3557B.K(this.f40915o, c4945y.f40915o) && this.f40916p == c4945y.f40916p && AbstractC3557B.K(this.f40917q, c4945y.f40917q) && this.f40918r == c4945y.f40918r) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int v10 = E9.f.v(this.f40911k, AbstractC6708l.f(this.f40910j) * 31, 31);
        int i13 = 0;
        String str = this.f40912l;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i14 = (v10 + i10) * 31;
        String str2 = this.f40913m;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i15 = (i14 + i11) * 31;
        A6.b bVar = this.f40914n;
        if (bVar == null) {
            i12 = 0;
        } else {
            i12 = bVar.hashCode();
        }
        int i16 = (i15 + i12) * 31;
        Map map = this.f40915o;
        if (map != null) {
            i13 = map.hashCode();
        }
        int i17 = (i16 + i13) * 31;
        int i18 = 1;
        boolean z10 = this.f40916p;
        if (z10) {
            z10 = true;
        }
        int i19 = z10 ? 1 : 0;
        int i20 = z10 ? 1 : 0;
        int hashCode = (this.f40917q.hashCode() + ((i17 + i19) * 31)) * 31;
        boolean z11 = this.f40918r;
        if (!z11) {
            i18 = z11 ? 1 : 0;
        }
        return hashCode + i18;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SendTelemetry(type=");
        sb2.append(AbstractC0044t0.G(this.f40910j));
        sb2.append(", message=");
        sb2.append(this.f40911k);
        sb2.append(", stack=");
        sb2.append(this.f40912l);
        sb2.append(", kind=");
        sb2.append(this.f40913m);
        sb2.append(", coreConfiguration=");
        sb2.append(this.f40914n);
        sb2.append(", additionalProperties=");
        sb2.append(this.f40915o);
        sb2.append(", onlyOnce=");
        sb2.append(this.f40916p);
        sb2.append(", eventTime=");
        sb2.append(this.f40917q);
        sb2.append(", isMetric=");
        return AbstractC4194d.w(sb2, this.f40918r, Separators.RPAREN);
    }

    @Override // L4.a
    public final C4564c v0() {
        return this.f40917q;
    }
}
