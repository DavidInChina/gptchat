package L3;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: a  reason: collision with root package name */
    public final UUID f10665a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10666b;

    /* renamed from: c  reason: collision with root package name */
    public final Set f10667c;

    /* renamed from: d  reason: collision with root package name */
    public final g f10668d;

    /* renamed from: e  reason: collision with root package name */
    public final g f10669e;

    /* renamed from: f  reason: collision with root package name */
    public final int f10670f;

    /* renamed from: g  reason: collision with root package name */
    public final int f10671g;

    /* renamed from: h  reason: collision with root package name */
    public final C0892d f10672h;

    /* renamed from: i  reason: collision with root package name */
    public final long f10673i;

    /* renamed from: j  reason: collision with root package name */
    public final A f10674j;

    /* renamed from: k  reason: collision with root package name */
    public final long f10675k;

    /* renamed from: l  reason: collision with root package name */
    public final int f10676l;

    public B(UUID uuid, int i10, HashSet hashSet, g gVar, g gVar2, int i11, int i12, C0892d c0892d, long j6, A a5, long j10, int i13) {
        AbstractC2469q0.q("state", i10);
        AbstractC3557B.c0("outputData", gVar);
        AbstractC3557B.c0("constraints", c0892d);
        this.f10665a = uuid;
        this.f10666b = i10;
        this.f10667c = hashSet;
        this.f10668d = gVar;
        this.f10669e = gVar2;
        this.f10670f = i11;
        this.f10671g = i12;
        this.f10672h = c0892d;
        this.f10673i = j6;
        this.f10674j = a5;
        this.f10675k = j10;
        this.f10676l = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !AbstractC3557B.K(B.class, obj.getClass())) {
            return false;
        }
        B b10 = (B) obj;
        if (this.f10670f != b10.f10670f || this.f10671g != b10.f10671g || !AbstractC3557B.K(this.f10665a, b10.f10665a) || this.f10666b != b10.f10666b || !AbstractC3557B.K(this.f10668d, b10.f10668d) || !AbstractC3557B.K(this.f10672h, b10.f10672h) || this.f10673i != b10.f10673i || !AbstractC3557B.K(this.f10674j, b10.f10674j) || this.f10675k != b10.f10675k || this.f10676l != b10.f10676l || !AbstractC3557B.K(this.f10667c, b10.f10667c)) {
            return false;
        }
        return AbstractC3557B.K(this.f10669e, b10.f10669e);
    }

    public final int hashCode() {
        int i10;
        int d10 = AbstractC6708l.d(this.f10666b, this.f10665a.hashCode() * 31, 31);
        int hashCode = this.f10667c.hashCode();
        int hashCode2 = this.f10669e.hashCode();
        int hashCode3 = this.f10672h.hashCode();
        long j6 = this.f10673i;
        int hashCode4 = (((hashCode3 + ((((((hashCode2 + ((hashCode + ((this.f10668d.hashCode() + d10) * 31)) * 31)) * 31) + this.f10670f) * 31) + this.f10671g) * 31)) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        A a5 = this.f10674j;
        if (a5 != null) {
            i10 = a5.hashCode();
        } else {
            i10 = 0;
        }
        long j10 = this.f10675k;
        return ((((hashCode4 + i10) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f10676l;
    }

    public final String toString() {
        return "WorkInfo{id='" + this.f10665a + "', state=" + E9.f.R(this.f10666b) + ", outputData=" + this.f10668d + ", tags=" + this.f10667c + ", progress=" + this.f10669e + ", runAttemptCount=" + this.f10670f + ", generation=" + this.f10671g + ", constraints=" + this.f10672h + ", initialDelayMillis=" + this.f10673i + ", periodicityInfo=" + this.f10674j + ", nextScheduleTimeMillis=" + this.f10675k + "}, stopReason=" + this.f10676l;
    }
}
