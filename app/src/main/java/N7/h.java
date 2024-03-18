package N7;

/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ i f12726Y;

    public h(i iVar) {
        this.f12726Y = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f12726Y.f12729h0) {
            try {
                Object obj = this.f12726Y.f12730i0;
                if (((j) obj) != null) {
                    ((j) obj).c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
