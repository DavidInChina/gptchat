package u8;

/* renamed from: u8.p  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractRunnableC5866p implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final N7.f f46497Y;

    public AbstractRunnableC5866p() {
        this.f46497Y = null;
    }

    public void a(Exception exc) {
        N7.f fVar = this.f46497Y;
        if (fVar != null) {
            fVar.a(exc);
        }
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e10) {
            a(e10);
        }
    }

    public AbstractRunnableC5866p(N7.f fVar) {
        this.f46497Y = fVar;
    }
}
