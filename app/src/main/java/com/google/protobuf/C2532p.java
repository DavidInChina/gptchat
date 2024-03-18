package com.google.protobuf;

import java.nio.charset.Charset;

/* renamed from: com.google.protobuf.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2532p extends AbstractC2529o {

    /* renamed from: i0  reason: collision with root package name */
    public final byte[] f27575i0;

    public C2532p(byte[] bArr) {
        bArr.getClass();
        this.f27575i0 = bArr;
    }

    @Override // com.google.protobuf.AbstractC2534q
    public void I(int i10, byte[] bArr) {
        System.arraycopy(this.f27575i0, 0, bArr, 0, i10);
    }

    @Override // com.google.protobuf.AbstractC2534q
    public byte M(int i10) {
        return this.f27575i0[i10];
    }

    @Override // com.google.protobuf.AbstractC2534q
    public final boolean T() {
        int u02 = u0();
        if (F1.f27398a.Z(u02, size() + u02, this.f27575i0) == 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractC2534q
    public final AbstractC2543v U() {
        return AbstractC2543v.h(this.f27575i0, u0(), size(), true);
    }

    @Override // com.google.protobuf.AbstractC2534q
    public final int V(int i10, int i11) {
        int u02 = u0();
        Charset charset = AbstractC2536r0.f27584a;
        for (int i12 = u02; i12 < u02 + i11; i12++) {
            i10 = (i10 * 31) + this.f27575i0[i12];
        }
        return i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2534q) || size() != ((AbstractC2534q) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof C2532p) {
            C2532p c2532p = (C2532p) obj;
            int i10 = this.f27583Y;
            int i11 = c2532p.f27583Y;
            if (i10 != 0 && i11 != 0 && i10 != i11) {
                return false;
            }
            int size = size();
            if (size <= c2532p.size()) {
                if (size <= c2532p.size()) {
                    int u02 = u0() + size;
                    int u03 = u0();
                    int u04 = c2532p.u0();
                    while (u03 < u02) {
                        if (this.f27575i0[u03] != c2532p.f27575i0[u04]) {
                            return false;
                        }
                        u03++;
                        u04++;
                    }
                    return true;
                }
                StringBuilder q10 = android.gov.nist.core.a.q("Ran off end of other: 0, ", size, ", ");
                q10.append(c2532p.size());
                throw new IllegalArgumentException(q10.toString());
            }
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        return obj.equals(this);
    }

    @Override // com.google.protobuf.AbstractC2534q
    public byte f(int i10) {
        return this.f27575i0[i10];
    }

    @Override // com.google.protobuf.AbstractC2534q
    public final AbstractC2534q i0(int i10) {
        int r10 = AbstractC2534q.r(0, i10, size());
        if (r10 == 0) {
            return AbstractC2534q.f27581Z;
        }
        return new C2526n(this.f27575i0, u0(), r10);
    }

    @Override // com.google.protobuf.AbstractC2534q
    public final String m0(Charset charset) {
        return new String(this.f27575i0, u0(), size(), charset);
    }

    @Override // com.google.protobuf.AbstractC2534q
    public final void r0(AbstractC2508h abstractC2508h) {
        abstractC2508h.V(this.f27575i0, u0(), size());
    }

    @Override // com.google.protobuf.AbstractC2534q
    public int size() {
        return this.f27575i0.length;
    }

    public int u0() {
        return 0;
    }
}
