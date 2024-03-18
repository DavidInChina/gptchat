package ai;

import Wh.AbstractC1661f;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import p2.F;

/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC1661f f24250Y;

    /* renamed from: Z  reason: collision with root package name */
    public volatile AtomicInteger f24251Z = new AtomicInteger(0);

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ j f24252h0;

    public g(j jVar, AbstractC1661f abstractC1661f) {
        this.f24252h0 = jVar;
        this.f24250Y = abstractC1661f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IOException e10;
        F f6;
        Throwable th2;
        j jVar = this.f24252h0;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName("OkHttp " + this.f24252h0.f24256Z.f21336a.g());
        try {
            jVar.f24260k0.i();
            boolean z10 = false;
            try {
                try {
                    this.f24250Y.c(jVar, jVar.h());
                    f6 = jVar.f24255Y.f21302Y;
                } catch (IOException e11) {
                    e10 = e11;
                    z10 = true;
                    if (z10) {
                        ei.m mVar = ei.m.f29511a;
                        ei.m.f29511a.getClass();
                        ei.m.i(4, "Callback failure for " + j.a(jVar), e10);
                    } else {
                        this.f24250Y.a(jVar, e10);
                    }
                    f6 = jVar.f24255Y.f21302Y;
                    f6.e(this);
                } catch (Throwable th3) {
                    th2 = th3;
                    z10 = true;
                    jVar.d();
                    if (!z10) {
                        IOException iOException = new IOException("canceled due to " + th2);
                        P4.a.m(iOException, th2);
                        this.f24250Y.a(jVar, iOException);
                    }
                    throw th2;
                }
            } catch (IOException e12) {
                e10 = e12;
            } catch (Throwable th4) {
                th2 = th4;
            }
            f6.e(this);
        } finally {
            currentThread.setName(name);
        }
    }
}
