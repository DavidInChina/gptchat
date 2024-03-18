package Hi;

import id.AbstractC3557B;
import java.util.List;
import java.util.Map;
import k6.AbstractC4194d;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: A  reason: collision with root package name */
    public final b f7826A;

    /* renamed from: B  reason: collision with root package name */
    public final b f7827B;

    /* renamed from: C  reason: collision with root package name */
    public final b f7828C;

    /* renamed from: D  reason: collision with root package name */
    public final a f7829D;

    /* renamed from: E  reason: collision with root package name */
    public final Long f7830E;

    /* renamed from: F  reason: collision with root package name */
    public final Map f7831F;

    /* renamed from: a  reason: collision with root package name */
    public final long f7832a;

    /* renamed from: b  reason: collision with root package name */
    public final long f7833b;

    /* renamed from: c  reason: collision with root package name */
    public final Long f7834c;

    /* renamed from: d  reason: collision with root package name */
    public final long f7835d;

    /* renamed from: e  reason: collision with root package name */
    public final long f7836e;

    /* renamed from: f  reason: collision with root package name */
    public final int f7837f;

    /* renamed from: g  reason: collision with root package name */
    public final int f7838g;

    /* renamed from: h  reason: collision with root package name */
    public final int f7839h;

    /* renamed from: i  reason: collision with root package name */
    public final int f7840i;

    /* renamed from: j  reason: collision with root package name */
    public final String f7841j;

    /* renamed from: k  reason: collision with root package name */
    public final i f7842k;

    /* renamed from: l  reason: collision with root package name */
    public final Long f7843l;

    /* renamed from: m  reason: collision with root package name */
    public final Long f7844m;

    /* renamed from: n  reason: collision with root package name */
    public final List f7845n;

    /* renamed from: o  reason: collision with root package name */
    public final Long f7846o;

    /* renamed from: p  reason: collision with root package name */
    public final Long f7847p;

    /* renamed from: q  reason: collision with root package name */
    public final Long f7848q;

    /* renamed from: r  reason: collision with root package name */
    public final AbstractC3557B f7849r;

    /* renamed from: s  reason: collision with root package name */
    public final Long f7850s;

    /* renamed from: t  reason: collision with root package name */
    public final Long f7851t;

    /* renamed from: u  reason: collision with root package name */
    public final b f7852u;

    /* renamed from: v  reason: collision with root package name */
    public final a f7853v;

    /* renamed from: w  reason: collision with root package name */
    public final b f7854w;

    /* renamed from: x  reason: collision with root package name */
    public final b f7855x;

    /* renamed from: y  reason: collision with root package name */
    public final b f7856y;

    /* renamed from: z  reason: collision with root package name */
    public final b f7857z;

    public c(long j6, long j10, Long l10, long j11, long j12, int i10, int i11, int i12, int i13, String str, i iVar, Long l11, Long l12, List list, Long l13, Long l14, Long l15, AbstractC3557B abstractC3557B, Long l16, Long l17, b bVar, a aVar, b bVar2, b bVar3, b bVar4, b bVar5, b bVar6, b bVar7, b bVar8, a aVar2, Long l18, Map map) {
        AbstractC3557B.c0("appTasks", list);
        AbstractC3557B.c0("appUpdateData", abstractC3557B);
        AbstractC3557B.c0("customFirstEvents", map);
        this.f7832a = j6;
        this.f7833b = j10;
        this.f7834c = l10;
        this.f7835d = j11;
        this.f7836e = j12;
        this.f7837f = i10;
        this.f7838g = i11;
        this.f7839h = i12;
        this.f7840i = i13;
        this.f7841j = str;
        this.f7842k = iVar;
        this.f7843l = l11;
        this.f7844m = l12;
        this.f7845n = list;
        this.f7846o = l13;
        this.f7847p = l14;
        this.f7848q = l15;
        this.f7849r = abstractC3557B;
        this.f7850s = l16;
        this.f7851t = l17;
        this.f7852u = bVar;
        this.f7853v = aVar;
        this.f7854w = bVar2;
        this.f7855x = bVar3;
        this.f7856y = bVar4;
        this.f7857z = bVar5;
        this.f7826A = bVar6;
        this.f7827B = bVar7;
        this.f7828C = bVar8;
        this.f7829D = aVar2;
        this.f7830E = l18;
        this.f7831F = map;
    }

    public static c a(c cVar, Long l10, AbstractC3557B abstractC3557B, Long l11, Long l12, b bVar, a aVar, b bVar2, b bVar3, b bVar4, b bVar5, b bVar6, b bVar7, b bVar8, a aVar2, int i10) {
        Long l13;
        Long l14;
        Long l15;
        int i11;
        long j6 = cVar.f7832a;
        long j10 = cVar.f7833b;
        Long l16 = cVar.f7834c;
        long j11 = cVar.f7835d;
        long j12 = cVar.f7836e;
        int i12 = cVar.f7837f;
        int i13 = cVar.f7838g;
        int i14 = cVar.f7839h;
        int i15 = cVar.f7840i;
        String str = cVar.f7841j;
        i iVar = cVar.f7842k;
        Long l17 = cVar.f7843l;
        Long l18 = cVar.f7844m;
        List list = cVar.f7845n;
        Long l19 = cVar.f7846o;
        Long l20 = cVar.f7847p;
        if ((i10 & 65536) != 0) {
            l14 = l20;
            l13 = cVar.f7848q;
        } else {
            l14 = l20;
            l13 = l10;
        }
        AbstractC3557B abstractC3557B2 = (i10 & 131072) != 0 ? cVar.f7849r : abstractC3557B;
        if ((i10 & 262144) != 0) {
            i11 = i15;
            l15 = cVar.f7850s;
        } else {
            i11 = i15;
            l15 = l11;
        }
        Long l21 = (i10 & 524288) != 0 ? cVar.f7851t : l12;
        b bVar9 = (i10 & 1048576) != 0 ? cVar.f7852u : bVar;
        a aVar3 = (i10 & 2097152) != 0 ? cVar.f7853v : aVar;
        b bVar10 = (i10 & 4194304) != 0 ? cVar.f7854w : bVar2;
        b bVar11 = (i10 & 8388608) != 0 ? cVar.f7855x : bVar3;
        b bVar12 = (i10 & 16777216) != 0 ? cVar.f7856y : bVar4;
        b bVar13 = (i10 & 33554432) != 0 ? cVar.f7857z : bVar5;
        b bVar14 = (i10 & 67108864) != 0 ? cVar.f7826A : bVar6;
        b bVar15 = (i10 & 134217728) != 0 ? cVar.f7827B : bVar7;
        b bVar16 = (i10 & 268435456) != 0 ? cVar.f7828C : bVar8;
        a aVar4 = (i10 & 536870912) != 0 ? cVar.f7829D : aVar2;
        Long l22 = cVar.f7830E;
        Map map = cVar.f7831F;
        cVar.getClass();
        AbstractC3557B.c0("appTasks", list);
        AbstractC3557B.c0("appUpdateData", abstractC3557B2);
        AbstractC3557B.c0("customFirstEvents", map);
        return new c(j6, j10, l16, j11, j12, i12, i13, i14, i11, str, iVar, l17, l18, list, l19, l14, l13, abstractC3557B2, l15, l21, bVar9, aVar3, bVar10, bVar11, bVar12, bVar13, bVar14, bVar15, bVar16, aVar4, l22, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f7832a == cVar.f7832a && this.f7833b == cVar.f7833b && AbstractC3557B.K(this.f7834c, cVar.f7834c) && this.f7835d == cVar.f7835d && this.f7836e == cVar.f7836e && this.f7837f == cVar.f7837f && this.f7838g == cVar.f7838g && this.f7839h == cVar.f7839h && this.f7840i == cVar.f7840i && AbstractC3557B.K(this.f7841j, cVar.f7841j) && this.f7842k == cVar.f7842k && AbstractC3557B.K(this.f7843l, cVar.f7843l) && AbstractC3557B.K(this.f7844m, cVar.f7844m) && AbstractC3557B.K(this.f7845n, cVar.f7845n) && AbstractC3557B.K(this.f7846o, cVar.f7846o) && AbstractC3557B.K(this.f7847p, cVar.f7847p) && AbstractC3557B.K(this.f7848q, cVar.f7848q) && AbstractC3557B.K(this.f7849r, cVar.f7849r) && AbstractC3557B.K(this.f7850s, cVar.f7850s) && AbstractC3557B.K(this.f7851t, cVar.f7851t) && AbstractC3557B.K(this.f7852u, cVar.f7852u) && AbstractC3557B.K(this.f7853v, cVar.f7853v) && AbstractC3557B.K(this.f7854w, cVar.f7854w) && AbstractC3557B.K(this.f7855x, cVar.f7855x) && AbstractC3557B.K(this.f7856y, cVar.f7856y) && AbstractC3557B.K(this.f7857z, cVar.f7857z) && AbstractC3557B.K(this.f7826A, cVar.f7826A) && AbstractC3557B.K(this.f7827B, cVar.f7827B) && AbstractC3557B.K(this.f7828C, cVar.f7828C) && AbstractC3557B.K(this.f7829D, cVar.f7829D) && AbstractC3557B.K(this.f7830E, cVar.f7830E) && AbstractC3557B.K(this.f7831F, cVar.f7831F)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        long j6 = this.f7832a;
        long j10 = this.f7833b;
        int i30 = ((((int) (j6 ^ (j6 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        int i31 = 0;
        Long l10 = this.f7834c;
        if (l10 == null) {
            i10 = 0;
        } else {
            i10 = l10.hashCode();
        }
        long j11 = this.f7835d;
        long j12 = this.f7836e;
        int i32 = (((((((((((((i30 + i10) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + this.f7837f) * 31) + this.f7838g) * 31) + this.f7839h) * 31) + this.f7840i) * 31;
        String str = this.f7841j;
        if (str == null) {
            i11 = 0;
        } else {
            i11 = str.hashCode();
        }
        int i33 = (i32 + i11) * 31;
        i iVar = this.f7842k;
        if (iVar == null) {
            i12 = 0;
        } else {
            i12 = iVar.hashCode();
        }
        int i34 = (i33 + i12) * 31;
        Long l11 = this.f7843l;
        if (l11 == null) {
            i13 = 0;
        } else {
            i13 = l11.hashCode();
        }
        int i35 = (i34 + i13) * 31;
        Long l12 = this.f7844m;
        if (l12 == null) {
            i14 = 0;
        } else {
            i14 = l12.hashCode();
        }
        int s10 = AbstractC4194d.s(this.f7845n, (i35 + i14) * 31, 31);
        Long l13 = this.f7846o;
        if (l13 == null) {
            i15 = 0;
        } else {
            i15 = l13.hashCode();
        }
        int i36 = (s10 + i15) * 31;
        Long l14 = this.f7847p;
        if (l14 == null) {
            i16 = 0;
        } else {
            i16 = l14.hashCode();
        }
        int i37 = (i36 + i16) * 31;
        Long l15 = this.f7848q;
        if (l15 == null) {
            i17 = 0;
        } else {
            i17 = l15.hashCode();
        }
        int hashCode = (this.f7849r.hashCode() + ((i37 + i17) * 31)) * 31;
        Long l16 = this.f7850s;
        if (l16 == null) {
            i18 = 0;
        } else {
            i18 = l16.hashCode();
        }
        int i38 = (hashCode + i18) * 31;
        Long l17 = this.f7851t;
        if (l17 == null) {
            i19 = 0;
        } else {
            i19 = l17.hashCode();
        }
        int i39 = (i38 + i19) * 31;
        b bVar = this.f7852u;
        if (bVar == null) {
            i20 = 0;
        } else {
            i20 = bVar.hashCode();
        }
        int i40 = (i39 + i20) * 31;
        a aVar = this.f7853v;
        if (aVar == null) {
            i21 = 0;
        } else {
            i21 = aVar.hashCode();
        }
        int i41 = (i40 + i21) * 31;
        b bVar2 = this.f7854w;
        if (bVar2 == null) {
            i22 = 0;
        } else {
            i22 = bVar2.hashCode();
        }
        int i42 = (i41 + i22) * 31;
        b bVar3 = this.f7855x;
        if (bVar3 == null) {
            i23 = 0;
        } else {
            i23 = bVar3.hashCode();
        }
        int i43 = (i42 + i23) * 31;
        b bVar4 = this.f7856y;
        if (bVar4 == null) {
            i24 = 0;
        } else {
            i24 = bVar4.hashCode();
        }
        int i44 = (i43 + i24) * 31;
        b bVar5 = this.f7857z;
        if (bVar5 == null) {
            i25 = 0;
        } else {
            i25 = bVar5.hashCode();
        }
        int i45 = (i44 + i25) * 31;
        b bVar6 = this.f7826A;
        if (bVar6 == null) {
            i26 = 0;
        } else {
            i26 = bVar6.hashCode();
        }
        int i46 = (i45 + i26) * 31;
        b bVar7 = this.f7827B;
        if (bVar7 == null) {
            i27 = 0;
        } else {
            i27 = bVar7.hashCode();
        }
        int i47 = (i46 + i27) * 31;
        b bVar8 = this.f7828C;
        if (bVar8 == null) {
            i28 = 0;
        } else {
            i28 = bVar8.hashCode();
        }
        int i48 = (i47 + i28) * 31;
        a aVar2 = this.f7829D;
        if (aVar2 == null) {
            i29 = 0;
        } else {
            i29 = aVar2.hashCode();
        }
        int i49 = (i48 + i29) * 31;
        Long l18 = this.f7830E;
        if (l18 != null) {
            i31 = l18.hashCode();
        }
        return this.f7831F.hashCode() + ((i49 + i31) * 31);
    }

    public final String toString() {
        return "AppStartData(processStartRealtimeMillis=" + this.f7832a + ", processStartUptimeMillis=" + this.f7833b + ", handleBindApplicationElapsedUptimeMillis=" + this.f7834c + ", firstAppClassLoadElapsedUptimeMillis=" + this.f7835d + ", perfsInitElapsedUptimeMillis=" + this.f7836e + ", importance=" + this.f7837f + ", importanceAfterFirstPost=" + this.f7838g + ", importanceReasonCode=" + this.f7839h + ", importanceReasonPid=" + this.f7840i + ", startImportanceReasonComponent=" + ((Object) this.f7841j) + ", lastAppVisibilityState=" + this.f7842k + ", lastVisibilityChangeElapsedTimeMillis=" + this.f7843l + ", lastAppAliveElapsedTimeMillis=" + this.f7844m + ", appTasks=" + this.f7845n + ", classLoaderInstantiatedElapsedUptimeMillis=" + this.f7846o + ", applicationInstantiatedElapsedUptimeMillis=" + this.f7847p + ", firstIdleElapsedUptimeMillis=" + this.f7848q + ", appUpdateData=" + this.f7849r + ", firstPostElapsedUptimeMillis=" + this.f7850s + ", firstPostAtFrontElapsedUptimeMillis=" + this.f7851t + ", firstComponentInstantiated=" + this.f7852u + ", firstActivityOnCreate=" + this.f7853v + ", firstActivityOnStart=" + this.f7854w + ", firstActivityOnResume=" + this.f7855x + ", firstGlobalLayout=" + this.f7856y + ", firstPreDraw=" + this.f7857z + ", firstDraw=" + this.f7826A + ", firstIdleAfterFirstDraw=" + this.f7827B + ", firstPostAfterFirstDraw=" + this.f7828C + ", firstTouchEvent=" + this.f7829D + ", firstFrameAfterFullyDrawnElapsedUptimeMillis=" + this.f7830E + ", customFirstEvents=" + this.f7831F + ')';
    }
}
