package L2;

import java.io.Serializable;

/* renamed from: L2.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0882c {

    /* renamed from: a  reason: collision with root package name */
    public int f10569a;

    /* renamed from: b  reason: collision with root package name */
    public Serializable f10570b;

    /* renamed from: c  reason: collision with root package name */
    public int f10571c;

    /* renamed from: d  reason: collision with root package name */
    public int f10572d;

    /* renamed from: e  reason: collision with root package name */
    public int f10573e;

    /* renamed from: f  reason: collision with root package name */
    public int f10574f;

    /* renamed from: g  reason: collision with root package name */
    public int f10575g;

    public final boolean a(int i10) {
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        if ((i10 & (-2097152)) == -2097152) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return false;
        }
        this.f10569a = i11;
        this.f10570b = AbstractC0881b.f10562m[3 - i12];
        int i17 = AbstractC0881b.f10563n[i14];
        this.f10572d = i17;
        int i18 = 2;
        if (i11 == 2) {
            this.f10572d = i17 / 2;
        } else if (i11 == 0) {
            this.f10572d = i17 / 4;
        }
        int i19 = (i10 >>> 9) & 1;
        int i20 = 1152;
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 == 3) {
                    i20 = 384;
                } else {
                    throw new IllegalArgumentException();
                }
            }
        } else if (i11 != 3) {
            i20 = 576;
        }
        this.f10575g = i20;
        if (i12 == 3) {
            if (i11 == 3) {
                i16 = AbstractC0881b.f10564o[i13 - 1];
            } else {
                i16 = AbstractC0881b.f10565p[i13 - 1];
            }
            this.f10574f = i16;
            this.f10571c = (((i16 * 12) / this.f10572d) + i19) * 4;
        } else {
            int i21 = 144;
            if (i11 == 3) {
                if (i12 == 2) {
                    i15 = AbstractC0881b.f10566q[i13 - 1];
                } else {
                    i15 = AbstractC0881b.f10567r[i13 - 1];
                }
                this.f10574f = i15;
                this.f10571c = ((i15 * 144) / this.f10572d) + i19;
            } else {
                int i22 = AbstractC0881b.f10568s[i13 - 1];
                this.f10574f = i22;
                if (i12 == 1) {
                    i21 = 72;
                }
                this.f10571c = ((i21 * i22) / this.f10572d) + i19;
            }
        }
        if (((i10 >> 6) & 3) == 3) {
            i18 = 1;
        }
        this.f10573e = i18;
        return true;
    }
}
