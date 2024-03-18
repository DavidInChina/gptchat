package Ng;

/* loaded from: classes.dex */
public final class X extends Y {

    /* renamed from: h0  reason: collision with root package name */
    public final Runnable f12915h0;

    public X(Runnable runnable, long j6) {
        super(j6);
        this.f12915h0 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12915h0.run();
    }

    @Override // Ng.Y
    public final String toString() {
        return super.toString() + this.f12915h0;
    }
}
