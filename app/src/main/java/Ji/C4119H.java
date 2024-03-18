package ji;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.security.MessageDigest;
import k6.AbstractC4194d;

/* renamed from: ji.H  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4119H extends C4138m {

    /* renamed from: j0  reason: collision with root package name */
    public final transient byte[][] f36684j0;

    /* renamed from: k0  reason: collision with root package name */
    public final transient int[] f36685k0;

    public C4119H(byte[][] bArr, int[] iArr) {
        super(C4138m.f36722i0.f36723Y);
        this.f36684j0 = bArr;
        this.f36685k0 = iArr;
    }

    @Override // ji.C4138m
    public final String a() {
        throw null;
    }

    @Override // ji.C4138m
    public final C4138m c(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.f36684j0;
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr = this.f36685k0;
            int i12 = iArr[length + i10];
            int i13 = iArr[i10];
            messageDigest.update(bArr[i10], i12, i13 - i11);
            i10++;
            i11 = i13;
        }
        byte[] digest = messageDigest.digest();
        AbstractC3557B.Z(digest);
        return new C4138m(digest);
    }

    @Override // ji.C4138m
    public final int d() {
        return this.f36685k0[this.f36684j0.length - 1];
    }

    @Override // ji.C4138m
    public final String e() {
        return t().e();
    }

    @Override // ji.C4138m
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4138m) {
            C4138m c4138m = (C4138m) obj;
            if (c4138m.d() == d() && m(0, c4138m, d())) {
                return true;
            }
        }
        return false;
    }

    @Override // ji.C4138m
    public final int f(int i10, byte[] bArr) {
        AbstractC3557B.c0("other", bArr);
        return t().f(i10, bArr);
    }

    @Override // ji.C4138m
    public final byte[] h() {
        return q();
    }

    @Override // ji.C4138m
    public final int hashCode() {
        int i10 = this.f36724Z;
        if (i10 == 0) {
            byte[][] bArr = this.f36684j0;
            int length = bArr.length;
            int i11 = 0;
            int i12 = 1;
            int i13 = 0;
            while (i11 < length) {
                int[] iArr = this.f36685k0;
                int i14 = iArr[length + i11];
                int i15 = iArr[i11];
                byte[] bArr2 = bArr[i11];
                int i16 = (i15 - i13) + i14;
                while (i14 < i16) {
                    i12 = (i12 * 31) + bArr2[i14];
                    i14++;
                }
                i11++;
                i13 = i15;
            }
            this.f36724Z = i12;
            return i12;
        }
        return i10;
    }

    @Override // ji.C4138m
    public final byte i(int i10) {
        int i11;
        byte[][] bArr = this.f36684j0;
        int[] iArr = this.f36685k0;
        AbstractC4127b.b(iArr[bArr.length - 1], i10, 1L);
        int Y7 = K4.J.Y(this, i10);
        if (Y7 == 0) {
            i11 = 0;
        } else {
            i11 = iArr[Y7 - 1];
        }
        return bArr[Y7][(i10 - i11) + iArr[bArr.length + Y7]];
    }

    @Override // ji.C4138m
    public final int j(int i10, byte[] bArr) {
        AbstractC3557B.c0("other", bArr);
        return t().j(i10, bArr);
    }

    @Override // ji.C4138m
    public final boolean l(int i10, int i11, int i12, byte[] bArr) {
        int i13;
        AbstractC3557B.c0("other", bArr);
        if (i10 < 0 || i10 > d() - i12 || i11 < 0 || i11 > bArr.length - i12) {
            return false;
        }
        int i14 = i12 + i10;
        int Y7 = K4.J.Y(this, i10);
        while (i10 < i14) {
            int[] iArr = this.f36685k0;
            if (Y7 == 0) {
                i13 = 0;
            } else {
                i13 = iArr[Y7 - 1];
            }
            byte[][] bArr2 = this.f36684j0;
            int i15 = iArr[bArr2.length + Y7];
            int min = Math.min(i14, (iArr[Y7] - i13) + i13) - i10;
            if (!AbstractC4127b.a(bArr2[Y7], (i10 - i13) + i15, bArr, i11, min)) {
                return false;
            }
            i11 += min;
            i10 += min;
            Y7++;
        }
        return true;
    }

    @Override // ji.C4138m
    public final boolean m(int i10, C4138m c4138m, int i11) {
        int i12;
        AbstractC3557B.c0("other", c4138m);
        if (i10 < 0 || i10 > d() - i11) {
            return false;
        }
        int i13 = i11 + i10;
        int Y7 = K4.J.Y(this, i10);
        int i14 = 0;
        while (i10 < i13) {
            int[] iArr = this.f36685k0;
            if (Y7 == 0) {
                i12 = 0;
            } else {
                i12 = iArr[Y7 - 1];
            }
            byte[][] bArr = this.f36684j0;
            int i15 = iArr[bArr.length + Y7];
            int min = Math.min(i13, (iArr[Y7] - i12) + i12) - i10;
            if (!c4138m.l(i14, (i10 - i12) + i15, min, bArr[Y7])) {
                return false;
            }
            i14 += min;
            i10 += min;
            Y7++;
        }
        return true;
    }

    @Override // ji.C4138m
    public final C4138m n(int i10, int i11) {
        int c10 = AbstractC4127b.c(i11, this);
        if (i10 >= 0) {
            if (c10 <= d()) {
                int i12 = c10 - i10;
                if (i12 >= 0) {
                    if (i10 == 0 && c10 == d()) {
                        return this;
                    }
                    if (i10 == c10) {
                        return C4138m.f36722i0;
                    }
                    int Y7 = K4.J.Y(this, i10);
                    int Y10 = K4.J.Y(this, c10 - 1);
                    byte[][] bArr = this.f36684j0;
                    byte[][] bArr2 = (byte[][]) kf.q.c3(Y7, Y10 + 1, bArr);
                    int[] iArr = new int[bArr2.length * 2];
                    int i13 = 0;
                    int[] iArr2 = this.f36685k0;
                    if (Y7 <= Y10) {
                        int i14 = Y7;
                        int i15 = 0;
                        while (true) {
                            iArr[i15] = Math.min(iArr2[i14] - i10, i12);
                            int i16 = i15 + 1;
                            iArr[i15 + bArr2.length] = iArr2[bArr.length + i14];
                            if (i14 == Y10) {
                                break;
                            }
                            i14++;
                            i15 = i16;
                        }
                    }
                    if (Y7 != 0) {
                        i13 = iArr2[Y7 - 1];
                    }
                    int length = bArr2.length;
                    iArr[length] = (i10 - i13) + iArr[length];
                    return new C4119H(bArr2, iArr);
                }
                throw new IllegalArgumentException(AbstractC2469q0.i("endIndex=", c10, " < beginIndex=", i10).toString());
            }
            StringBuilder q10 = android.gov.nist.core.a.q("endIndex=", c10, " > length(");
            q10.append(d());
            q10.append(')');
            throw new IllegalArgumentException(q10.toString().toString());
        }
        throw new IllegalArgumentException(AbstractC4194d.v("beginIndex=", i10, " < 0").toString());
    }

    @Override // ji.C4138m
    public final C4138m p() {
        return t().p();
    }

    @Override // ji.C4138m
    public final byte[] q() {
        byte[] bArr = new byte[d()];
        byte[][] bArr2 = this.f36684j0;
        int length = bArr2.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int[] iArr = this.f36685k0;
            int i13 = iArr[length + i10];
            int i14 = iArr[i10];
            int i15 = i14 - i11;
            kf.q.X2(bArr2[i10], i12, bArr, i13, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    @Override // ji.C4138m
    public final void s(C4135j c4135j, int i10) {
        int i11;
        AbstractC3557B.c0("buffer", c4135j);
        int Y7 = K4.J.Y(this, 0);
        int i12 = 0;
        while (i12 < i10) {
            int[] iArr = this.f36685k0;
            if (Y7 == 0) {
                i11 = 0;
            } else {
                i11 = iArr[Y7 - 1];
            }
            byte[][] bArr = this.f36684j0;
            int i13 = iArr[bArr.length + Y7];
            int min = Math.min(i10, (iArr[Y7] - i11) + i11) - i12;
            int i14 = (i12 - i11) + i13;
            C4117F c4117f = new C4117F(bArr[Y7], i14, i14 + min, true, false);
            C4117F c4117f2 = c4135j.f36720Y;
            if (c4117f2 == null) {
                c4117f.f36680g = c4117f;
                c4117f.f36679f = c4117f;
                c4135j.f36720Y = c4117f;
            } else {
                C4117F c4117f3 = c4117f2.f36680g;
                AbstractC3557B.Z(c4117f3);
                c4117f3.b(c4117f);
            }
            i12 += min;
            Y7++;
        }
        c4135j.f36721Z += i10;
    }

    public final C4138m t() {
        return new C4138m(q());
    }

    @Override // ji.C4138m
    public final String toString() {
        return t().toString();
    }
}
