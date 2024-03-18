package L2;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f10533a = new byte[10];

    /* renamed from: b  reason: collision with root package name */
    public boolean f10534b;

    /* renamed from: c  reason: collision with root package name */
    public int f10535c;

    /* renamed from: d  reason: collision with root package name */
    public long f10536d;

    /* renamed from: e  reason: collision with root package name */
    public int f10537e;

    /* renamed from: f  reason: collision with root package name */
    public int f10538f;

    /* renamed from: g  reason: collision with root package name */
    public int f10539g;

    public final void a(G g10, F f6) {
        if (this.f10535c > 0) {
            g10.e(this.f10536d, this.f10537e, this.f10538f, this.f10539g, f6);
            this.f10535c = 0;
        }
    }

    public final void b(G g10, long j6, int i10, int i11, int i12, F f6) {
        boolean z10;
        if (this.f10539g <= i11 + i12) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (!this.f10534b) {
                return;
            }
            int i13 = this.f10535c;
            int i14 = i13 + 1;
            this.f10535c = i14;
            if (i13 == 0) {
                this.f10536d = j6;
                this.f10537e = i10;
                this.f10538f = 0;
            }
            this.f10538f += i11;
            this.f10539g = i12;
            if (i14 >= 16) {
                a(g10, f6);
                return;
            }
            return;
        }
        throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
    }

    public final void c(r rVar) {
        char c10;
        if (this.f10534b) {
            return;
        }
        byte[] bArr = this.f10533a;
        rVar.n(bArr, 0, 10);
        rVar.k();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b10 = bArr[7];
            if ((b10 & 254) == 186) {
                if ((b10 & 255) == 187) {
                    c10 = '\t';
                } else {
                    c10 = '\b';
                }
                if ((40 << ((bArr[c10] >> 4) & 7)) != 0) {
                    this.f10534b = true;
                }
            }
        }
    }
}
