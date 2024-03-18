package m8;

/* loaded from: classes.dex */
public abstract class j implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final N7.f f38974Y;

    public j() {
        this.f38974Y = null;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e10) {
            N7.f fVar = this.f38974Y;
            if (fVar != null) {
                fVar.a(e10);
            }
        }
    }

    public j(N7.f fVar) {
        this.f38974Y = fVar;
    }
}
