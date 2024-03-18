package N7;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final m f12723a = new m();

    public final void a(Exception exc) {
        m mVar = this.f12723a;
        mVar.getClass();
        A7.b.l0(exc, "Exception must not be null");
        synchronized (mVar.f12735a) {
            try {
                if (!mVar.f12737c) {
                    mVar.f12737c = true;
                    mVar.f12740f = exc;
                    mVar.f12736b.j(mVar);
                }
            } finally {
            }
        }
    }

    public final void b(Object obj) {
        m mVar = this.f12723a;
        synchronized (mVar.f12735a) {
            try {
                if (!mVar.f12737c) {
                    mVar.f12737c = true;
                    mVar.f12739e = obj;
                    mVar.f12736b.j(mVar);
                }
            } finally {
            }
        }
    }
}
