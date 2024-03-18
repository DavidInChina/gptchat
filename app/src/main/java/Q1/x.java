package Q1;

import H0.u1;
import android.content.Context;
import android.content.pm.PackageManager;
import android.gov.nist.core.Separators;
import android.graphics.Typeface;
import android.os.Handler;
import java.nio.MappedByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import m.C4528h;
import s1.AbstractC5528j;
import z1.AbstractC6744c;
import z1.C6749h;

/* loaded from: classes2.dex */
public final class x implements k {

    /* renamed from: a  reason: collision with root package name */
    public final Context f14361a;

    /* renamed from: b  reason: collision with root package name */
    public final q.r f14362b;

    /* renamed from: c  reason: collision with root package name */
    public final P5.c f14363c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f14364d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public Handler f14365e;

    /* renamed from: f  reason: collision with root package name */
    public Executor f14366f;

    /* renamed from: g  reason: collision with root package name */
    public ThreadPoolExecutor f14367g;

    /* renamed from: h  reason: collision with root package name */
    public Bi.c f14368h;

    /* renamed from: i  reason: collision with root package name */
    public u1 f14369i;

    public x(Context context, q.r rVar) {
        P5.c cVar = y.f14370d;
        R4.b.U(context, "Context cannot be null");
        this.f14361a = context.getApplicationContext();
        this.f14362b = rVar;
        this.f14363c = cVar;
    }

    @Override // Q1.k
    public final void a(Bi.c cVar) {
        synchronized (this.f14364d) {
            this.f14368h = cVar;
        }
        c();
    }

    public final void b() {
        synchronized (this.f14364d) {
            try {
                this.f14368h = null;
                u1 u1Var = this.f14369i;
                if (u1Var != null) {
                    P5.c cVar = this.f14363c;
                    Context context = this.f14361a;
                    cVar.getClass();
                    context.getContentResolver().unregisterContentObserver(u1Var);
                    this.f14369i = null;
                }
                Handler handler = this.f14365e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f14365e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f14367g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f14366f = null;
                this.f14367g = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        synchronized (this.f14364d) {
            try {
                if (this.f14368h == null) {
                    return;
                }
                if (this.f14366f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC1173a("emojiCompat", 0));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f14367g = threadPoolExecutor;
                    this.f14366f = threadPoolExecutor;
                }
                this.f14366f.execute(new Runnable(this) { // from class: Q1.w

                    /* renamed from: Z  reason: collision with root package name */
                    public final /* synthetic */ x f14360Z;

                    {
                        this.f14360Z = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (r2) {
                            case 0:
                                x xVar = this.f14360Z;
                                synchronized (xVar.f14364d) {
                                    try {
                                        if (xVar.f14368h != null) {
                                            try {
                                                C6749h d10 = xVar.d();
                                                int i10 = d10.f51457e;
                                                if (i10 == 2) {
                                                    synchronized (xVar.f14364d) {
                                                    }
                                                }
                                                if (i10 == 0) {
                                                    int i11 = y1.q.f50332a;
                                                    y1.p.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                                    P5.c cVar = xVar.f14363c;
                                                    Context context = xVar.f14361a;
                                                    cVar.getClass();
                                                    Typeface G10 = AbstractC5528j.f45113a.G(context, new C6749h[]{d10}, 0);
                                                    MappedByteBuffer M02 = r9.y.M0(xVar.f14361a, d10.f51453a);
                                                    if (M02 != null && G10 != null) {
                                                        y1.p.a("EmojiCompat.MetadataRepo.create");
                                                        U3.n nVar = new U3.n(G10, Df.H.n0(M02));
                                                        y1.p.b();
                                                        y1.p.b();
                                                        synchronized (xVar.f14364d) {
                                                            Bi.c cVar2 = xVar.f14368h;
                                                            if (cVar2 != null) {
                                                                cVar2.t1(nVar);
                                                            }
                                                        }
                                                        xVar.b();
                                                        return;
                                                    }
                                                    throw new RuntimeException("Unable to open file.");
                                                }
                                                throw new RuntimeException("fetchFonts result is not OK. (" + i10 + Separators.RPAREN);
                                            } catch (Throwable th2) {
                                                synchronized (xVar.f14364d) {
                                                    try {
                                                        Bi.c cVar3 = xVar.f14368h;
                                                        if (cVar3 != null) {
                                                            cVar3.s1(th2);
                                                        }
                                                        xVar.b();
                                                        return;
                                                    } finally {
                                                    }
                                                }
                                            }
                                        }
                                        return;
                                    } finally {
                                    }
                                }
                            default:
                                this.f14360Z.c();
                                return;
                        }
                    }
                });
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final C6749h d() {
        try {
            P5.c cVar = this.f14363c;
            Context context = this.f14361a;
            q.r rVar = this.f14362b;
            cVar.getClass();
            C4528h a5 = AbstractC6744c.a(context, rVar);
            if (a5.f38769Y == 0) {
                C6749h[] c6749hArr = (C6749h[]) a5.f38770Z;
                if (c6749hArr != null && c6749hArr.length != 0) {
                    return c6749hArr[0];
                }
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            throw new RuntimeException(android.gov.nist.core.a.l(new StringBuilder("fetchFonts failed ("), a5.f38769Y, Separators.RPAREN));
        } catch (PackageManager.NameNotFoundException e10) {
            throw new RuntimeException("provider not found", e10);
        }
    }
}
