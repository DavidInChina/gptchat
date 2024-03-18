package Ng;

import kf.C4288m;

/* renamed from: Ng.b0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1053b0 extends B {

    /* renamed from: j0  reason: collision with root package name */
    public static final /* synthetic */ int f12924j0 = 0;

    /* renamed from: Z  reason: collision with root package name */
    public long f12925Z;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f12926h0;

    /* renamed from: i0  reason: collision with root package name */
    public C4288m f12927i0;

    public final void F0(P p10) {
        C4288m c4288m = this.f12927i0;
        if (c4288m == null) {
            c4288m = new C4288m();
            this.f12927i0 = c4288m;
        }
        c4288m.addLast(p10);
    }

    public abstract Thread H0();

    public final void P0(boolean z10) {
        long j6;
        long j10 = this.f12925Z;
        if (z10) {
            j6 = 4294967296L;
        } else {
            j6 = 1;
        }
        this.f12925Z = j6 + j10;
        if (!z10) {
            this.f12926h0 = true;
        }
    }

    public final boolean R0() {
        if (this.f12925Z >= 4294967296L) {
            return true;
        }
        return false;
    }

    public abstract long S0();

    public final boolean T0() {
        Object obj;
        C4288m c4288m = this.f12927i0;
        if (c4288m == null) {
            return false;
        }
        if (c4288m.isEmpty()) {
            obj = null;
        } else {
            obj = c4288m.removeFirst();
        }
        P p10 = (P) obj;
        if (p10 == null) {
            return false;
        }
        p10.run();
        return true;
    }

    public void U0(long j6, Y y10) {
        I.f12886n0.Y0(j6, y10);
    }

    public abstract void shutdown();

    public final void w0(boolean z10) {
        long j6;
        long j10 = this.f12925Z;
        if (z10) {
            j6 = 4294967296L;
        } else {
            j6 = 1;
        }
        long j11 = j10 - j6;
        this.f12925Z = j11;
        if (j11 <= 0 && this.f12926h0) {
            shutdown();
        }
    }
}
