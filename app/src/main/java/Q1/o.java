package Q1;

import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes2.dex */
public final class o extends Bi.c {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Bi.c f14342h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f14343i;

    public o(Bi.c cVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f14342h = cVar;
        this.f14343i = threadPoolExecutor;
    }

    @Override // Bi.c
    public final void s1(Throwable th2) {
        ThreadPoolExecutor threadPoolExecutor = this.f14343i;
        try {
            this.f14342h.s1(th2);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // Bi.c
    public final void t1(U3.n nVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f14343i;
        try {
            this.f14342h.t1(nVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
