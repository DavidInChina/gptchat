package e3;

import s2.AbstractC5530A;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final p f28936a;

    /* renamed from: b  reason: collision with root package name */
    public final int f28937b;

    /* renamed from: c  reason: collision with root package name */
    public final long[] f28938c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f28939d;

    /* renamed from: e  reason: collision with root package name */
    public final int f28940e;

    /* renamed from: f  reason: collision with root package name */
    public final long[] f28941f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f28942g;

    /* renamed from: h  reason: collision with root package name */
    public final long f28943h;

    public s(p pVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j6) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (iArr.length == jArr2.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        Gi.e.l(z10);
        if (jArr.length == jArr2.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        Gi.e.l(z11);
        Gi.e.l(iArr2.length == jArr2.length ? true : z12);
        this.f28936a = pVar;
        this.f28938c = jArr;
        this.f28939d = iArr;
        this.f28940e = i10;
        this.f28941f = jArr2;
        this.f28942g = iArr2;
        this.f28943h = j6;
        this.f28937b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j6) {
        long[] jArr = this.f28941f;
        for (int b10 = AbstractC5530A.b(jArr, j6, true); b10 < jArr.length; b10++) {
            if ((this.f28942g[b10] & 1) != 0) {
                return b10;
            }
        }
        return -1;
    }
}
