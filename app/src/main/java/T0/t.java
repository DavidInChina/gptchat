package T0;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public String f16812a;

    /* renamed from: b  reason: collision with root package name */
    public m f16813b;

    /* renamed from: c  reason: collision with root package name */
    public int f16814c;

    /* renamed from: d  reason: collision with root package name */
    public int f16815d;

    public final int a() {
        m mVar = this.f16813b;
        if (mVar == null) {
            return this.f16812a.length();
        }
        return (mVar.f16797b - mVar.M()) + (this.f16812a.length() - (this.f16815d - this.f16814c));
    }

    public final void b(int i10, int i11, String str) {
        if (i10 <= i11) {
            if (i10 >= 0) {
                m mVar = this.f16813b;
                if (mVar == null) {
                    int max = Math.max(255, str.length() + 128);
                    char[] cArr = new char[max];
                    int min = Math.min(i10, 64);
                    int min2 = Math.min(this.f16812a.length() - i11, 64);
                    String str2 = this.f16812a;
                    int i12 = i10 - min;
                    AbstractC3557B.a0("null cannot be cast to non-null type java.lang.String", str2);
                    str2.getChars(i12, i10, cArr, 0);
                    String str3 = this.f16812a;
                    int i13 = max - min2;
                    int i14 = min2 + i11;
                    AbstractC3557B.a0("null cannot be cast to non-null type java.lang.String", str3);
                    str3.getChars(i11, i14, cArr, i13);
                    str.getChars(0, str.length(), cArr, min);
                    this.f16813b = new m(cArr, str.length() + min, i13);
                    this.f16814c = i12;
                    this.f16815d = i14;
                    return;
                }
                int i15 = this.f16814c;
                int i16 = i10 - i15;
                int i17 = i11 - i15;
                if (i16 >= 0 && i17 <= mVar.f16797b - mVar.M()) {
                    int length = str.length() - (i17 - i16);
                    if (length > mVar.M()) {
                        int M10 = length - mVar.M();
                        int i18 = mVar.f16797b;
                        do {
                            i18 *= 2;
                        } while (i18 - mVar.f16797b < M10);
                        char[] cArr2 = new char[i18];
                        kf.q.Y2((char[]) mVar.f16800e, cArr2, 0, 0, mVar.f16798c);
                        int i19 = mVar.f16797b;
                        int i20 = mVar.f16799d;
                        int i21 = i19 - i20;
                        int i22 = i18 - i21;
                        kf.q.Y2((char[]) mVar.f16800e, cArr2, i22, i20, i21 + i20);
                        mVar.f16800e = cArr2;
                        mVar.f16797b = i18;
                        mVar.f16799d = i22;
                    }
                    int i23 = mVar.f16798c;
                    if (i16 < i23 && i17 <= i23) {
                        int i24 = i23 - i17;
                        char[] cArr3 = (char[]) mVar.f16800e;
                        kf.q.Y2(cArr3, cArr3, mVar.f16799d - i24, i17, i23);
                        mVar.f16798c = i16;
                        mVar.f16799d -= i24;
                    } else if (i16 < i23 && i17 >= i23) {
                        mVar.f16799d = mVar.M() + i17;
                        mVar.f16798c = i16;
                    } else {
                        int M11 = mVar.M() + i16;
                        int M12 = mVar.M() + i17;
                        int i25 = mVar.f16799d;
                        char[] cArr4 = (char[]) mVar.f16800e;
                        kf.q.Y2(cArr4, cArr4, mVar.f16798c, i25, M11);
                        mVar.f16798c += M11 - i25;
                        mVar.f16799d = M12;
                    }
                    str.getChars(0, str.length(), (char[]) mVar.f16800e, mVar.f16798c);
                    mVar.f16798c = str.length() + mVar.f16798c;
                    return;
                }
                this.f16812a = toString();
                this.f16813b = null;
                this.f16814c = -1;
                this.f16815d = -1;
                b(i10, i11, str);
                return;
            }
            throw new IllegalArgumentException(android.gov.nist.core.a.e("start must be non-negative, but was ", i10).toString());
        }
        throw new IllegalArgumentException(AbstractC2469q0.i("start index must be less than or equal to end index: ", i10, " > ", i11).toString());
    }

    public final String toString() {
        m mVar = this.f16813b;
        if (mVar == null) {
            return this.f16812a;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) this.f16812a, 0, this.f16814c);
        sb2.append((char[]) mVar.f16800e, 0, mVar.f16798c);
        int i10 = mVar.f16799d;
        sb2.append((char[]) mVar.f16800e, i10, mVar.f16797b - i10);
        String str = this.f16812a;
        sb2.append((CharSequence) str, this.f16815d, str.length());
        return sb2.toString();
    }
}
