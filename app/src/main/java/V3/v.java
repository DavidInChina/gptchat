package V3;

/* loaded from: classes.dex */
public final class v implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final w f18377Y;

    /* renamed from: Z  reason: collision with root package name */
    public final U3.j f18378Z;

    public v(w wVar, U3.j jVar) {
        this.f18377Y = wVar;
        this.f18378Z = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f18377Y.f18383d) {
            try {
                if (((v) this.f18377Y.f18381b.remove(this.f18378Z)) != null) {
                    u uVar = (u) this.f18377Y.f18382c.remove(this.f18378Z);
                    if (uVar != null) {
                        U3.j jVar = this.f18378Z;
                        O3.g gVar = (O3.g) uVar;
                        L3.s d10 = L3.s.d();
                        d10.a(O3.g.f13358t0, "Exceeded time limits on execution for " + jVar);
                        gVar.f13366m0.execute(new O3.f(gVar, 4));
                    }
                } else {
                    L3.s d11 = L3.s.d();
                    U3.j jVar2 = this.f18378Z;
                    d11.a("WrkTimerRunnable", "Timer with " + jVar2 + " is already marked as complete.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
