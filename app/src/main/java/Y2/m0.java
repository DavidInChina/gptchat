package y2;

import android.os.SystemClock;
import s2.AbstractC5530A;
import s2.AbstractC5532b;

/* loaded from: classes.dex */
public final class m0 implements Q {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC5532b f50656Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f50657Z;

    /* renamed from: h0  reason: collision with root package name */
    public long f50658h0;

    /* renamed from: i0  reason: collision with root package name */
    public long f50659i0;

    /* renamed from: j0  reason: collision with root package name */
    public p2.S f50660j0 = p2.S.f41931i0;

    public m0(AbstractC5532b abstractC5532b) {
        this.f50656Y = abstractC5532b;
    }

    @Override // y2.Q
    public final long a() {
        long j6;
        long j10 = this.f50658h0;
        if (this.f50657Z) {
            ((s2.w) this.f50656Y).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f50659i0;
            p2.S s10 = this.f50660j0;
            if (s10.f41934Y == 1.0f) {
                j6 = AbstractC5530A.C(elapsedRealtime);
            } else {
                j6 = elapsedRealtime * s10.f41936h0;
            }
            return j10 + j6;
        }
        return j10;
    }

    public final void b(long j6) {
        this.f50658h0 = j6;
        if (this.f50657Z) {
            ((s2.w) this.f50656Y).getClass();
            this.f50659i0 = SystemClock.elapsedRealtime();
        }
    }

    @Override // y2.Q
    public final p2.S c() {
        return this.f50660j0;
    }

    @Override // y2.Q
    public final void d(p2.S s10) {
        if (this.f50657Z) {
            b(a());
        }
        this.f50660j0 = s10;
    }

    public final void e() {
        if (!this.f50657Z) {
            ((s2.w) this.f50656Y).getClass();
            this.f50659i0 = SystemClock.elapsedRealtime();
            this.f50657Z = true;
        }
    }
}
