package J2;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Surface;
import android.view.WindowManager;
import s2.AbstractC5530A;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final d f8809a;

    /* renamed from: b  reason: collision with root package name */
    public final o f8810b;

    /* renamed from: c  reason: collision with root package name */
    public final r f8811c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f8812d;

    /* renamed from: e  reason: collision with root package name */
    public Surface f8813e;

    /* renamed from: f  reason: collision with root package name */
    public float f8814f;

    /* renamed from: g  reason: collision with root package name */
    public float f8815g;

    /* renamed from: h  reason: collision with root package name */
    public float f8816h;

    /* renamed from: i  reason: collision with root package name */
    public float f8817i;

    /* renamed from: j  reason: collision with root package name */
    public int f8818j;

    /* renamed from: k  reason: collision with root package name */
    public long f8819k;

    /* renamed from: l  reason: collision with root package name */
    public long f8820l;

    /* renamed from: m  reason: collision with root package name */
    public long f8821m;

    /* renamed from: n  reason: collision with root package name */
    public long f8822n;

    /* renamed from: o  reason: collision with root package name */
    public long f8823o;

    /* renamed from: p  reason: collision with root package name */
    public long f8824p;

    /* renamed from: q  reason: collision with root package name */
    public long f8825q;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, J2.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s(Context context) {
        p pVar;
        DisplayManager displayManager;
        ?? obj = new Object();
        obj.f8744a = new c();
        obj.f8745b = new c();
        obj.f8747d = -9223372036854775807L;
        this.f8809a = obj;
        r rVar = null;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            if (AbstractC5530A.f45131a >= 17 && (displayManager = (DisplayManager) applicationContext.getSystemService("display")) != null) {
                pVar = new q(displayManager);
            } else {
                pVar = null;
            }
            if (pVar == null) {
                WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
                if (windowManager != null) {
                    pVar = new p(windowManager);
                }
            }
            this.f8810b = pVar;
            this.f8811c = pVar != null ? r.f8804j0 : rVar;
            this.f8819k = -9223372036854775807L;
            this.f8820l = -9223372036854775807L;
            this.f8814f = -1.0f;
            this.f8817i = 1.0f;
            this.f8818j = 0;
        }
        pVar = null;
        this.f8810b = pVar;
        this.f8811c = pVar != null ? r.f8804j0 : rVar;
        this.f8819k = -9223372036854775807L;
        this.f8820l = -9223372036854775807L;
        this.f8814f = -1.0f;
        this.f8817i = 1.0f;
        this.f8818j = 0;
    }

    public final long a(long j6) {
        long j10;
        r rVar;
        long j11;
        long j12;
        if (this.f8824p != -1 && this.f8809a.f8744a.a()) {
            d dVar = this.f8809a;
            if (dVar.f8744a.a()) {
                c cVar = dVar.f8744a;
                long j13 = cVar.f8740e;
                if (j13 == 0) {
                    j12 = 0;
                } else {
                    j12 = cVar.f8741f / j13;
                }
            } else {
                j12 = -9223372036854775807L;
            }
            j10 = this.f8825q + (((float) ((this.f8821m - this.f8824p) * j12)) / this.f8817i);
            if (Math.abs(j6 - j10) > 20000000) {
                this.f8821m = 0L;
                this.f8824p = -1L;
                this.f8822n = -1L;
            }
            this.f8822n = this.f8821m;
            this.f8823o = j10;
            rVar = this.f8811c;
            if (rVar == null && this.f8819k != -9223372036854775807L) {
                long j14 = rVar.f8805Y;
                if (j14 == -9223372036854775807L) {
                    return j10;
                }
                long j15 = this.f8819k;
                long j16 = (((j10 - j14) / j15) * j15) + j14;
                if (j10 <= j16) {
                    j11 = j16 - j15;
                } else {
                    j11 = j16;
                    j16 = j15 + j16;
                }
                if (j16 - j10 >= j10 - j11) {
                    j16 = j11;
                }
                return j16 - this.f8820l;
            }
            return j10;
        }
        j10 = j6;
        this.f8822n = this.f8821m;
        this.f8823o = j10;
        rVar = this.f8811c;
        if (rVar == null) {
        }
        return j10;
    }

    public final void b() {
        Surface surface;
        if (AbstractC5530A.f45131a >= 30 && (surface = this.f8813e) != null && this.f8818j != Integer.MIN_VALUE && this.f8816h != 0.0f) {
            this.f8816h = 0.0f;
            n.a(surface, 0.0f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
        if (r1.f8742g[(int) ((r6 - 1) % 15)] != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(long j6) {
        long j10 = this.f8822n;
        if (j10 != -1) {
            this.f8824p = j10;
            this.f8825q = this.f8823o;
        }
        this.f8821m++;
        long j11 = j6 * 1000;
        d dVar = this.f8809a;
        dVar.f8744a.b(j11);
        int i10 = 0;
        if (dVar.f8744a.a()) {
            dVar.f8746c = false;
        } else if (dVar.f8747d != -9223372036854775807L) {
            if (dVar.f8746c) {
                c cVar = dVar.f8745b;
                long j12 = cVar.f8739d;
                if (j12 != 0) {
                }
                dVar.f8746c = true;
                dVar.f8745b.b(j11);
            }
            dVar.f8745b.c();
            dVar.f8745b.b(dVar.f8747d);
            dVar.f8746c = true;
            dVar.f8745b.b(j11);
        }
        if (dVar.f8746c && dVar.f8745b.a()) {
            c cVar2 = dVar.f8744a;
            dVar.f8744a = dVar.f8745b;
            dVar.f8745b = cVar2;
            dVar.f8746c = false;
        }
        dVar.f8747d = j11;
        if (!dVar.f8744a.a()) {
            i10 = dVar.f8748e + 1;
        }
        dVar.f8748e = i10;
        d();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        float f6;
        float f10;
        long j6;
        if (AbstractC5530A.f45131a >= 30 && this.f8813e != null) {
            d dVar = this.f8809a;
            if (dVar.f8744a.a()) {
                if (dVar.f8744a.a()) {
                    c cVar = dVar.f8744a;
                    long j10 = cVar.f8740e;
                    long j11 = 0;
                    if (j10 != 0) {
                        j11 = cVar.f8741f / j10;
                    }
                    f6 = (float) (1.0E9d / j11);
                } else {
                    f6 = -1.0f;
                }
            } else {
                f6 = this.f8814f;
            }
            float f11 = this.f8815g;
            if (f6 == f11) {
                return;
            }
            int i10 = (f6 > (-1.0f) ? 1 : (f6 == (-1.0f) ? 0 : -1));
            if (i10 != 0 && f11 != -1.0f) {
                if (dVar.f8744a.a()) {
                    if (dVar.f8744a.a()) {
                        j6 = dVar.f8744a.f8741f;
                    } else {
                        j6 = -9223372036854775807L;
                    }
                    if (j6 >= 5000000000L) {
                        f10 = 0.02f;
                        if (Math.abs(f6 - this.f8815g) < f10) {
                            return;
                        }
                    }
                }
                f10 = 1.0f;
                if (Math.abs(f6 - this.f8815g) < f10) {
                }
            } else if (i10 == 0 && dVar.f8748e < 30) {
                return;
            }
            this.f8815g = f6;
            e(false);
        }
    }

    public final void e(boolean z10) {
        Surface surface;
        float f6;
        if (AbstractC5530A.f45131a >= 30 && (surface = this.f8813e) != null && this.f8818j != Integer.MIN_VALUE) {
            if (this.f8812d) {
                float f10 = this.f8815g;
                if (f10 != -1.0f) {
                    f6 = f10 * this.f8817i;
                    if (z10 && this.f8816h == f6) {
                        return;
                    }
                    this.f8816h = f6;
                    n.a(surface, f6);
                }
            }
            f6 = 0.0f;
            if (z10) {
            }
            this.f8816h = f6;
            n.a(surface, f6);
        }
    }
}
