package G;

import E0.l0;
import E0.n0;
import Z.G0;
import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import b0.C2104h;
import id.AbstractC3557B;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class T implements G0, P, Runnable, Choreographer.FrameCallback {

    /* renamed from: p0  reason: collision with root package name */
    public static long f5452p0;

    /* renamed from: Y  reason: collision with root package name */
    public final Q f5453Y;

    /* renamed from: Z  reason: collision with root package name */
    public final n0 f5454Z;

    /* renamed from: h0  reason: collision with root package name */
    public final D f5455h0;

    /* renamed from: i0  reason: collision with root package name */
    public final View f5456i0;

    /* renamed from: k0  reason: collision with root package name */
    public long f5458k0;

    /* renamed from: l0  reason: collision with root package name */
    public long f5459l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f5460m0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f5462o0;

    /* renamed from: j0  reason: collision with root package name */
    public final C2104h f5457j0 = new C2104h(new S[16]);

    /* renamed from: n0  reason: collision with root package name */
    public final Choreographer f5461n0 = Choreographer.getInstance();

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (r3 >= 30.0f) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public T(Q q10, n0 n0Var, D d10, View view) {
        float f6;
        this.f5453Y = q10;
        this.f5454Z = n0Var;
        this.f5455h0 = d10;
        this.f5456i0 = view;
        if (f5452p0 == 0) {
            Display display = view.getDisplay();
            if (!view.isInEditMode() && display != null) {
                f6 = display.getRefreshRate();
            }
            f6 = 60.0f;
            f5452p0 = 1000000000 / f6;
        }
    }

    @Override // Z.G0
    public final void c() {
        this.f5462o0 = false;
        this.f5453Y.f5447a = null;
        this.f5456i0.removeCallbacks(this);
        this.f5461n0.removeFrameCallback(this);
    }

    @Override // Z.G0
    public final void d() {
        this.f5453Y.f5447a = this;
        this.f5462o0 = true;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j6) {
        if (this.f5462o0) {
            this.f5456i0.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        C2104h c2104h = this.f5457j0;
        if (!c2104h.k() && this.f5460m0 && this.f5462o0) {
            View view = this.f5456i0;
            if (view.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime()) + f5452p0;
                if (System.nanoTime() > nanos) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z11 = false;
                while (c2104h.l() && !z11) {
                    S s10 = (S) c2104h.f25567Y[0];
                    D d10 = this.f5455h0;
                    F f6 = (F) d10.f5417b.mo122invoke();
                    if (!s10.f5451d) {
                        int a5 = f6.a();
                        int i10 = s10.f5448a;
                        if (i10 >= 0 && i10 < a5) {
                            if (s10.f5450c == null) {
                                Trace.beginSection("compose:lazylist:prefetch:compose");
                                try {
                                    long nanoTime = System.nanoTime();
                                    boolean z12 = z11;
                                    if (nanoTime + this.f5458k0 >= nanos && !z10) {
                                        z11 = true;
                                    }
                                    Object b10 = f6.b(i10);
                                    s10.f5450c = this.f5454Z.a().f(b10, d10.a(b10, i10, f6.d(i10)));
                                    long nanoTime2 = System.nanoTime() - nanoTime;
                                    long j6 = this.f5458k0;
                                    if (j6 != 0) {
                                        long j10 = 4;
                                        nanoTime2 = (nanoTime2 / j10) + ((j6 / j10) * 3);
                                    }
                                    this.f5458k0 = nanoTime2;
                                    z10 = false;
                                    z11 = z12;
                                } finally {
                                    Trace.endSection();
                                }
                            } else {
                                boolean z13 = z11;
                                Trace.beginSection("compose:lazylist:prefetch:measure");
                                try {
                                    long nanoTime3 = System.nanoTime();
                                    if (this.f5459l0 + nanoTime3 >= nanos && !z10) {
                                        z11 = true;
                                    }
                                    l0 l0Var = s10.f5450c;
                                    AbstractC3557B.Z(l0Var);
                                    int a10 = l0Var.a();
                                    for (int i11 = 0; i11 < a10; i11++) {
                                        l0Var.b(i11, s10.f5449b);
                                    }
                                    long nanoTime4 = System.nanoTime() - nanoTime3;
                                    long j11 = this.f5459l0;
                                    if (j11 != 0) {
                                        long j12 = 4;
                                        nanoTime4 = (nanoTime4 / j12) + ((j11 / j12) * 3);
                                    }
                                    this.f5459l0 = nanoTime4;
                                    c2104h.n(0);
                                    z10 = false;
                                    z11 = z13;
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                    }
                    c2104h.n(0);
                    z11 = z11;
                }
                if (z11) {
                    this.f5461n0.postFrameCallback(this);
                    return;
                } else {
                    this.f5460m0 = false;
                    return;
                }
            }
        }
        this.f5460m0 = false;
    }

    @Override // Z.G0
    public final void a() {
    }
}
