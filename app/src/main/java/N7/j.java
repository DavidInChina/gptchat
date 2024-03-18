package N7;

import java.util.concurrent.Executor;
import q.RunnableC5216j;

/* loaded from: classes.dex */
public final class j implements d, c, k {

    /* renamed from: Y  reason: collision with root package name */
    public final Executor f12731Y;

    /* renamed from: Z  reason: collision with root package name */
    public final U3.c f12732Z;

    /* renamed from: h0  reason: collision with root package name */
    public final m f12733h0;

    public j(l lVar, U3.c cVar, m mVar) {
        this.f12731Y = lVar;
        this.f12732Z = cVar;
        this.f12733h0 = mVar;
    }

    @Override // N7.d
    public final void a(Object obj) {
        this.f12733h0.g(obj);
    }

    @Override // N7.k
    public final void b(m mVar) {
        this.f12731Y.execute(new RunnableC5216j(this, 27, mVar));
    }

    public final void c() {
        m mVar = this.f12733h0;
        synchronized (mVar.f12735a) {
            try {
                if (!mVar.f12737c) {
                    mVar.f12737c = true;
                    mVar.f12738d = true;
                    mVar.f12736b.j(mVar);
                }
            } finally {
            }
        }
    }

    @Override // N7.c
    public final void g(Exception exc) {
        this.f12733h0.f(exc);
    }
}
