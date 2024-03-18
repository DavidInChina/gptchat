package U3;

import L3.C0892d;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import k6.AbstractC4194d;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final String f17432a;

    /* renamed from: b  reason: collision with root package name */
    public final int f17433b;

    /* renamed from: c  reason: collision with root package name */
    public final L3.g f17434c;

    /* renamed from: d  reason: collision with root package name */
    public final long f17435d;

    /* renamed from: e  reason: collision with root package name */
    public final long f17436e;

    /* renamed from: f  reason: collision with root package name */
    public final long f17437f;

    /* renamed from: g  reason: collision with root package name */
    public final C0892d f17438g;

    /* renamed from: h  reason: collision with root package name */
    public final int f17439h;

    /* renamed from: i  reason: collision with root package name */
    public final int f17440i;

    /* renamed from: j  reason: collision with root package name */
    public final long f17441j;

    /* renamed from: k  reason: collision with root package name */
    public final long f17442k;

    /* renamed from: l  reason: collision with root package name */
    public final int f17443l;

    /* renamed from: m  reason: collision with root package name */
    public final int f17444m;

    /* renamed from: n  reason: collision with root package name */
    public final long f17445n;

    /* renamed from: o  reason: collision with root package name */
    public final int f17446o;

    /* renamed from: p  reason: collision with root package name */
    public final List f17447p;

    /* renamed from: q  reason: collision with root package name */
    public final List f17448q;

    public p(String str, int i10, L3.g gVar, long j6, long j10, long j11, C0892d c0892d, int i11, int i12, long j12, long j13, int i13, int i14, long j14, int i15, ArrayList arrayList, ArrayList arrayList2) {
        AbstractC3557B.c0(ParameterNames.ID, str);
        AbstractC2469q0.q("state", i10);
        AbstractC2469q0.q("backoffPolicy", i12);
        this.f17432a = str;
        this.f17433b = i10;
        this.f17434c = gVar;
        this.f17435d = j6;
        this.f17436e = j10;
        this.f17437f = j11;
        this.f17438g = c0892d;
        this.f17439h = i11;
        this.f17440i = i12;
        this.f17441j = j12;
        this.f17442k = j13;
        this.f17443l = i13;
        this.f17444m = i14;
        this.f17445n = j14;
        this.f17446o = i15;
        this.f17447p = arrayList;
        this.f17448q = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (AbstractC3557B.K(this.f17432a, pVar.f17432a) && this.f17433b == pVar.f17433b && AbstractC3557B.K(this.f17434c, pVar.f17434c) && this.f17435d == pVar.f17435d && this.f17436e == pVar.f17436e && this.f17437f == pVar.f17437f && AbstractC3557B.K(this.f17438g, pVar.f17438g) && this.f17439h == pVar.f17439h && this.f17440i == pVar.f17440i && this.f17441j == pVar.f17441j && this.f17442k == pVar.f17442k && this.f17443l == pVar.f17443l && this.f17444m == pVar.f17444m && this.f17445n == pVar.f17445n && this.f17446o == pVar.f17446o && AbstractC3557B.K(this.f17447p, pVar.f17447p) && AbstractC3557B.K(this.f17448q, pVar.f17448q)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int d10 = AbstractC6708l.d(this.f17433b, this.f17432a.hashCode() * 31, 31);
        long j6 = this.f17435d;
        long j10 = this.f17436e;
        long j11 = this.f17437f;
        int hashCode = this.f17438g.hashCode();
        int d11 = AbstractC6708l.d(this.f17440i, (((hashCode + ((((((((this.f17434c.hashCode() + d10) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31)) * 31) + this.f17439h) * 31, 31);
        long j12 = this.f17441j;
        long j13 = this.f17442k;
        long j14 = this.f17445n;
        return this.f17448q.hashCode() + AbstractC4194d.s(this.f17447p, (((((((((((d11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + this.f17443l) * 31) + this.f17444m) * 31) + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.f17446o) * 31, 31);
    }

    public final String toString() {
        return "WorkInfoPojo(id=" + this.f17432a + ", state=" + E9.f.R(this.f17433b) + ", output=" + this.f17434c + ", initialDelay=" + this.f17435d + ", intervalDuration=" + this.f17436e + ", flexDuration=" + this.f17437f + ", constraints=" + this.f17438g + ", runAttemptCount=" + this.f17439h + ", backoffPolicy=" + E9.f.P(this.f17440i) + ", backoffDelayDuration=" + this.f17441j + ", lastEnqueueTime=" + this.f17442k + ", periodCount=" + this.f17443l + ", generation=" + this.f17444m + ", nextScheduleTimeOverride=" + this.f17445n + ", stopReason=" + this.f17446o + ", tags=" + this.f17447p + ", progress=" + this.f17448q + ')';
    }
}
