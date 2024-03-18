package Ai;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ long f981Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ long f982Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ long f983h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Ji.d f984i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Ji.d f985j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ d f986k0;

    public b(d dVar, long j6, long j10, long j11, Ji.d dVar2, Ji.d dVar3) {
        this.f986k0 = dVar;
        this.f981Y = j6;
        this.f982Z = j10;
        this.f983h0 = j11;
        this.f984i0 = dVar2;
        this.f985j0 = dVar3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (long j6 = this.f981Y; j6 < this.f982Z; j6++) {
            long j10 = 2 * j6;
            long j11 = j10 + 1;
            long j12 = this.f983h0 + j6;
            Ji.d dVar = this.f985j0;
            float b10 = dVar.b(j12);
            d dVar2 = this.f986k0;
            float b11 = dVar2.f1009r.b(j10) * b10;
            Ji.d dVar3 = this.f984i0;
            dVar3.c(b11, j10);
            dVar3.c(dVar2.f1009r.b(j11) * (-dVar.b(j12)), j11);
        }
    }
}
