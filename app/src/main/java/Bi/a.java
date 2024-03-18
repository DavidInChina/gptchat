package Bi;

/* loaded from: classes2.dex */
public final class a implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f2411Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f2412Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ int f2413h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f2414i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ float[] f2415j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ float[] f2416k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ int f2417l0;

    public /* synthetic */ a(int i10, int i11, int i12, int i13, int i14, float[] fArr, float[] fArr2) {
        this.f2411Y = i14;
        this.f2412Z = i10;
        this.f2413h0 = i11;
        this.f2414i0 = i12;
        this.f2415j0 = fArr;
        this.f2416k0 = fArr2;
        this.f2417l0 = i13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f2411Y;
        float[] fArr = this.f2416k0;
        float[] fArr2 = this.f2415j0;
        int i11 = this.f2417l0;
        int i12 = this.f2414i0;
        int i13 = this.f2413h0;
        int i14 = this.f2412Z;
        switch (i10) {
            case 0:
                int i15 = i14 + i13;
                while (i12 > 512) {
                    int i16 = i12 >> 2;
                    c.o0(i16, i15 - i16, i11 - (i12 >> 3), fArr2, fArr);
                    i12 = i16;
                }
                c.m0(i12, 1, i15 - i12, this.f2417l0, this.f2415j0, this.f2416k0);
                int i17 = i14 - i12;
                int i18 = 0;
                for (int i19 = i13 - i12; i19 > 0; i19 -= i12) {
                    i18++;
                    int i20 = this.f2417l0;
                    float[] fArr3 = this.f2416k0;
                    int i21 = i12;
                    c.m0(i21, c.w0(i21, i19, i18, this.f2412Z, i20, this.f2415j0, fArr3), i17 + i19, this.f2417l0, this.f2415j0, this.f2416k0);
                }
                return;
            default:
                int i22 = i14 + i13;
                int i23 = 1;
                while (i12 > 512) {
                    i12 >>= 2;
                    i23 <<= 2;
                    c.q0(i12, i22 - i12, i11 - i12, fArr2, fArr);
                }
                c.m0(i12, 0, i22 - i12, this.f2417l0, this.f2415j0, this.f2416k0);
                int i24 = i23 >> 1;
                int i25 = i14 - i12;
                while (true) {
                    i13 -= i12;
                    if (i13 > 0) {
                        i24++;
                        int i26 = i12;
                        c.m0(i26, c.w0(i26, i13, i24, this.f2412Z, this.f2417l0, this.f2415j0, this.f2416k0), i25 + i13, this.f2417l0, this.f2415j0, this.f2416k0);
                    } else {
                        return;
                    }
                }
        }
    }
}
