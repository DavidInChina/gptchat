package E;

import id.AbstractC3557B;

/* renamed from: E.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0426j implements AbstractC0425i, AbstractC0427k {

    /* renamed from: a  reason: collision with root package name */
    public final float f3877a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f3878b;

    /* renamed from: c  reason: collision with root package name */
    public final wf.n f3879c;

    /* renamed from: d  reason: collision with root package name */
    public final float f3880d;

    public C0426j(float f6, boolean z10, C0428l c0428l) {
        this.f3877a = f6;
        this.f3878b = z10;
        this.f3879c = c0428l;
        this.f3880d = f6;
    }

    @Override // E.AbstractC0425i
    public final float a() {
        return this.f3880d;
    }

    @Override // E.AbstractC0425i
    public final void b(Z0.b bVar, int i10, int[] iArr, Z0.l lVar, int[] iArr2) {
        boolean z10;
        int i11;
        int i12;
        if (iArr.length == 0) {
            return;
        }
        int a02 = bVar.a0(this.f3877a);
        if (this.f3878b && lVar == Z0.l.f22806Z) {
            z10 = true;
        } else {
            z10 = false;
        }
        C0421f c0421f = AbstractC0429m.f3907a;
        if (!z10) {
            int length = iArr.length;
            int i13 = 0;
            i12 = 0;
            i11 = 0;
            int i14 = 0;
            while (i13 < length) {
                int i15 = iArr[i13];
                int min = Math.min(i12, i10 - i15);
                iArr2[i14] = min;
                int min2 = Math.min(a02, (i10 - min) - i15);
                int i16 = iArr2[i14] + i15 + min2;
                i13++;
                i14++;
                i11 = min2;
                i12 = i16;
            }
        } else {
            i12 = 0;
            i11 = 0;
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i17 = iArr[length2];
                int min3 = Math.min(i12, i10 - i17);
                iArr2[length2] = min3;
                i11 = Math.min(a02, (i10 - min3) - i17);
                i12 = iArr2[length2] + i17 + i11;
            }
        }
        int i18 = i12 - i11;
        wf.n nVar = this.f3879c;
        if (nVar != null && i18 < i10) {
            int intValue = ((Number) nVar.invoke(Integer.valueOf(i10 - i18), lVar)).intValue();
            int length3 = iArr2.length;
            for (int i19 = 0; i19 < length3; i19++) {
                iArr2[i19] = iArr2[i19] + intValue;
            }
        }
    }

    @Override // E.AbstractC0427k
    public final void c(Z0.b bVar, int i10, int[] iArr, int[] iArr2) {
        b(bVar, i10, iArr, Z0.l.f22805Y, iArr2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0426j)) {
            return false;
        }
        C0426j c0426j = (C0426j) obj;
        if (Z0.e.a(this.f3877a, c0426j.f3877a) && this.f3878b == c0426j.f3878b && AbstractC3557B.K(this.f3879c, c0426j.f3879c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int floatToIntBits = Float.floatToIntBits(this.f3877a) * 31;
        if (this.f3878b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (floatToIntBits + i10) * 31;
        wf.n nVar = this.f3879c;
        if (nVar == null) {
            i11 = 0;
        } else {
            i11 = nVar.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (this.f3878b) {
            str = "";
        } else {
            str = "Absolute";
        }
        sb2.append(str);
        sb2.append("Arrangement#spacedAligned(");
        sb2.append((Object) Z0.e.b(this.f3877a));
        sb2.append(", ");
        sb2.append(this.f3879c);
        sb2.append(')');
        return sb2.toString();
    }
}
