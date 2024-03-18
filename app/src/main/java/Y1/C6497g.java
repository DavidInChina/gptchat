package y1;

/* renamed from: y1.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6497g {

    /* renamed from: a  reason: collision with root package name */
    public boolean f50322a;

    /* renamed from: b  reason: collision with root package name */
    public AbstractC6496f f50323b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f50324c;

    public final void a(AbstractC6496f abstractC6496f) {
        synchronized (this) {
            while (this.f50324c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.f50323b == abstractC6496f) {
                return;
            }
            this.f50323b = abstractC6496f;
            if (this.f50322a) {
                abstractC6496f.b();
            }
        }
    }
}
