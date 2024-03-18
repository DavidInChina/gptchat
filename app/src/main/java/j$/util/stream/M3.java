package j$.util.stream;

/* loaded from: classes3.dex */
final class M3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Runnable f35478a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Runnable f35479b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public M3(Runnable runnable, Runnable runnable2) {
        this.f35478a = runnable;
        this.f35479b = runnable2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.f35479b;
        try {
            this.f35478a.run();
            runnable.run();
        } catch (Throwable th2) {
            try {
                runnable.run();
            } catch (Throwable th3) {
                try {
                    th2.addSuppressed(th3);
                } catch (Throwable unused) {
                }
            }
            throw th2;
        }
    }
}
