package Ai;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ long f987Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ long f988Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Ji.d f989h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ d f990i0;

    public c(d dVar, long j6, long j10, Ji.d dVar2) {
        this.f990i0 = dVar;
        this.f987Y = j6;
        this.f988Z = j10;
        this.f989h0 = dVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (long j6 = this.f987Y; j6 < this.f988Z; j6++) {
            long j10 = 2 * j6;
            long j11 = j10 + 1;
            Ji.d dVar = this.f989h0;
            float b10 = dVar.b(j10);
            d dVar2 = this.f990i0;
            float b11 = (dVar2.f1011t.b(j10) * dVar.b(j11)) + (dVar2.f1011t.b(j11) * b10);
            dVar.c((dVar2.f1011t.b(j10) * dVar.b(j10)) - (dVar2.f1011t.b(j11) * dVar.b(j11)), j10);
            dVar.c(b11, j11);
        }
    }
}
