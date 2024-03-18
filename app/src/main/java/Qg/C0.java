package Qg;

import l8.AbstractC4344b;
import lf.C4436a;
import o9.C4957e;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class C0 implements w0 {

    /* renamed from: a  reason: collision with root package name */
    public final long f14726a;

    /* renamed from: b  reason: collision with root package name */
    public final long f14727b;

    public C0(long j6, long j10) {
        this.f14726a = j6;
        this.f14727b = j10;
        if (j6 >= 0) {
            if (j10 >= 0) {
                return;
            }
            throw new IllegalArgumentException(("replayExpiration(" + j10 + " ms) cannot be negative").toString());
        }
        throw new IllegalArgumentException(("stopTimeout(" + j6 + " ms) cannot be negative").toString());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [pf.j, wf.n] */
    @Override // Qg.w0
    public final AbstractC1206i a(D0 d02) {
        return L4.a.i0(new C4957e(L4.a.V0(d02, new A0(this, null)), new AbstractC5163j(2, null), 1));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0) {
            C0 c02 = (C0) obj;
            if (this.f14726a == c02.f14726a && this.f14727b == c02.f14727b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f14726a;
        long j10 = this.f14727b;
        return (((int) (j6 ^ (j6 >>> 32))) * 31) + ((int) ((j10 >>> 32) ^ j10));
    }

    public final String toString() {
        C4436a c4436a = new C4436a(2);
        long j6 = this.f14726a;
        if (j6 > 0) {
            c4436a.add("stopTimeout=" + j6 + "ms");
        }
        long j10 = this.f14727b;
        if (j10 < Long.MAX_VALUE) {
            c4436a.add("replayExpiration=" + j10 + "ms");
        }
        return android.gov.nist.core.a.n(new StringBuilder("SharingStarted.WhileSubscribed("), kf.t.m2(AbstractC4344b.Q(c4436a), null, null, null, null, 63), ')');
    }
}
