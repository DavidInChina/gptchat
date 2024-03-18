package Hi;

import id.AbstractC3557B;
import java.util.List;
import k6.AbstractC4194d;

/* loaded from: classes2.dex */
public final class g extends AbstractC3557B {

    /* renamed from: h  reason: collision with root package name */
    public final h f7864h;

    /* renamed from: i  reason: collision with root package name */
    public final long f7865i;

    /* renamed from: j  reason: collision with root package name */
    public final long f7866j;

    /* renamed from: k  reason: collision with root package name */
    public final List f7867k;

    /* renamed from: l  reason: collision with root package name */
    public final List f7868l;

    /* renamed from: m  reason: collision with root package name */
    public final Boolean f7869m;

    /* renamed from: n  reason: collision with root package name */
    public final Boolean f7870n;

    /* renamed from: o  reason: collision with root package name */
    public final Boolean f7871o;

    /* renamed from: p  reason: collision with root package name */
    public final Long f7872p;

    public g(h hVar, long j6, long j10, List list, List list2, Boolean bool, Boolean bool2, Boolean bool3, Long l10) {
        AbstractC3557B.c0("status", hVar);
        AbstractC3557B.c0("allInstalledVersionNames", list);
        AbstractC3557B.c0("allInstalledVersionCodes", list2);
        this.f7864h = hVar;
        this.f7865i = j6;
        this.f7866j = j10;
        this.f7867k = list;
        this.f7868l = list2;
        this.f7869m = bool;
        this.f7870n = bool2;
        this.f7871o = bool3;
        this.f7872p = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f7864h == gVar.f7864h && this.f7865i == gVar.f7865i && this.f7866j == gVar.f7866j && AbstractC3557B.K(this.f7867k, gVar.f7867k) && AbstractC3557B.K(this.f7868l, gVar.f7868l) && AbstractC3557B.K(this.f7869m, gVar.f7869m) && AbstractC3557B.K(this.f7870n, gVar.f7870n) && AbstractC3557B.K(this.f7871o, gVar.f7871o) && AbstractC3557B.K(this.f7872p, gVar.f7872p)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        long j6 = this.f7865i;
        long j10 = this.f7866j;
        int s10 = AbstractC4194d.s(this.f7868l, AbstractC4194d.s(this.f7867k, ((((this.f7864h.hashCode() * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31, 31), 31);
        int i13 = 0;
        Boolean bool = this.f7869m;
        if (bool == null) {
            i10 = 0;
        } else {
            i10 = bool.hashCode();
        }
        int i14 = (s10 + i10) * 31;
        Boolean bool2 = this.f7870n;
        if (bool2 == null) {
            i11 = 0;
        } else {
            i11 = bool2.hashCode();
        }
        int i15 = (i14 + i11) * 31;
        Boolean bool3 = this.f7871o;
        if (bool3 == null) {
            i12 = 0;
        } else {
            i12 = bool3.hashCode();
        }
        int i16 = (i15 + i12) * 31;
        Long l10 = this.f7872p;
        if (l10 != null) {
            i13 = l10.hashCode();
        }
        return i16 + i13;
    }

    public final String toString() {
        return "RealAppUpdateData(status=" + this.f7864h + ", firstInstallTimeMillis=" + this.f7865i + ", lastUpdateTimeMillis=" + this.f7866j + ", allInstalledVersionNames=" + this.f7867k + ", allInstalledVersionCodes=" + this.f7868l + ", updatedOsSinceLastStart=" + this.f7869m + ", rebootedSinceLastStart=" + this.f7870n + ", crashedInLastProcess=" + this.f7871o + ", elapsedRealtimeSinceCrash=" + this.f7872p + ')';
    }
}
