package W3;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final g f20709Y;

    /* renamed from: Z  reason: collision with root package name */
    public final A8.a f20710Z;

    public e(g gVar, A8.a aVar) {
        this.f20709Y = gVar;
        this.f20710Z = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f20709Y.f20718Y != this) {
            return;
        }
        if (g.f20716k0.j(this.f20709Y, this, g.f(this.f20710Z))) {
            g.c(this.f20709Y);
        }
    }
}
