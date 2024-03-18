package Ai;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f975Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f976Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ int f977h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ float[] f978i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ float[] f979j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ d f980k0;

    public a(d dVar, int i10, int i11, int i12, float[] fArr, float[] fArr2) {
        this.f980k0 = dVar;
        this.f975Y = i10;
        this.f976Z = i11;
        this.f977h0 = i12;
        this.f978i0 = fArr;
        this.f979j0 = fArr2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i10 = this.f975Y; i10 < this.f976Z; i10++) {
            int i11 = i10 * 2;
            int i12 = i11 + 1;
            int i13 = this.f977h0 + i10;
            float[] fArr = this.f979j0;
            float f6 = fArr[i13];
            float[] fArr2 = this.f980k0.f1008q;
            float f10 = f6 * fArr2[i11];
            float[] fArr3 = this.f978i0;
            fArr3[i11] = f10;
            fArr3[i12] = (-fArr[i13]) * fArr2[i12];
        }
    }
}
