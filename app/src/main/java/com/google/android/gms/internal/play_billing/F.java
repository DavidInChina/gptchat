package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public class F extends E {

    /* renamed from: h0  reason: collision with root package name */
    public final byte[] f26842h0;

    public F(byte[] bArr) {
        this.f26840Y = 0;
        bArr.getClass();
        this.f26842h0 = bArr;
    }

    @Override // com.google.android.gms.internal.play_billing.E
    public int I() {
        return this.f26842h0.length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof E) || I() != ((E) obj).I()) {
            return false;
        }
        if (I() == 0) {
            return true;
        }
        if (obj instanceof F) {
            F f6 = (F) obj;
            int i10 = this.f26840Y;
            int i11 = f6.f26840Y;
            if (i10 != 0 && i11 != 0 && i10 != i11) {
                return false;
            }
            int I10 = I();
            if (I10 <= f6.I()) {
                if (I10 <= f6.I()) {
                    int i12 = 0;
                    int i13 = 0;
                    while (i12 < I10) {
                        if (this.f26842h0[i12] != f6.f26842h0[i13]) {
                            return false;
                        }
                        i12++;
                        i13++;
                    }
                    return true;
                }
                throw new IllegalArgumentException(AbstractC2469q0.i("Ran off end of other: 0, ", I10, ", ", f6.I()));
            }
            throw new IllegalArgumentException("Length too large: " + I10 + I());
        }
        return obj.equals(this);
    }

    @Override // com.google.android.gms.internal.play_billing.E
    public byte s(int i10) {
        return this.f26842h0[i10];
    }

    @Override // com.google.android.gms.internal.play_billing.E
    public byte y(int i10) {
        return this.f26842h0[i10];
    }
}
