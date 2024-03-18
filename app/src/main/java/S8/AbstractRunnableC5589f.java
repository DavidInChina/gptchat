package s8;

/* renamed from: s8.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC5589f implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final N7.f f45444Y;

    public AbstractRunnableC5589f() {
        this.f45444Y = null;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e10) {
            N7.f fVar = this.f45444Y;
            if (fVar != null) {
                fVar.a(e10);
            }
        }
    }

    public AbstractRunnableC5589f(N7.f fVar) {
        this.f45444Y = fVar;
    }
}
