package S2;

import h7.EnumC3329c;
import x8.k0;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16099a;

    /* renamed from: b  reason: collision with root package name */
    public long f16100b;

    /* renamed from: c  reason: collision with root package name */
    public Object f16101c;

    public c(int i10) {
        this.f16099a = i10;
        if (i10 != 2) {
            this.f16100b = 0L;
            return;
        }
        this.f16100b = 0L;
        this.f16101c = EnumC3329c.REASON_UNKNOWN;
    }

    public final void a(int i10) {
        if (i10 >= 64) {
            Object obj = this.f16101c;
            if (((c) obj) != null) {
                ((c) obj).a(i10 - 64);
                return;
            }
            return;
        }
        this.f16100b &= ~(1 << i10);
    }

    public final int b(int i10) {
        Object obj = this.f16101c;
        if (((c) obj) == null) {
            if (i10 >= 64) {
                return Long.bitCount(this.f16100b);
            }
            return Long.bitCount(this.f16100b & ((1 << i10) - 1));
        } else if (i10 < 64) {
            return Long.bitCount(this.f16100b & ((1 << i10) - 1));
        } else {
            return Long.bitCount(this.f16100b) + ((c) obj).b(i10 - 64);
        }
    }

    public final void c() {
        if (((c) this.f16101c) == null) {
            this.f16101c = new c(1);
        }
    }

    public final boolean d(int i10) {
        if (i10 >= 64) {
            c();
            return ((c) this.f16101c).d(i10 - 64);
        } else if ((this.f16100b & (1 << i10)) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public final void e(int i10, boolean z10) {
        boolean z11;
        if (i10 >= 64) {
            c();
            ((c) this.f16101c).e(i10 - 64, z10);
            return;
        }
        long j6 = this.f16100b;
        if ((Long.MIN_VALUE & j6) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        long j10 = (1 << i10) - 1;
        this.f16100b = ((j6 & (~j10)) << 1) | (j6 & j10);
        if (z10) {
            h(i10);
        } else {
            a(i10);
        }
        if (z11 || ((c) this.f16101c) != null) {
            c();
            ((c) this.f16101c).e(0, z11);
        }
    }

    public final boolean f(int i10) {
        boolean z10;
        if (i10 >= 64) {
            c();
            return ((c) this.f16101c).f(i10 - 64);
        }
        long j6 = 1 << i10;
        long j10 = this.f16100b;
        if ((j10 & j6) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j11 = j10 & (~j6);
        this.f16100b = j11;
        long j12 = j6 - 1;
        this.f16100b = (j11 & j12) | Long.rotateRight((~j12) & j11, 1);
        Object obj = this.f16101c;
        if (((c) obj) != null) {
            if (((c) obj).d(0)) {
                h(63);
            }
            ((c) this.f16101c).f(0);
        }
        return z10;
    }

    public final void g() {
        this.f16100b = 0L;
        Object obj = this.f16101c;
        if (((c) obj) != null) {
            ((c) obj).g();
        }
    }

    public final void h(int i10) {
        if (i10 >= 64) {
            c();
            ((c) this.f16101c).h(i10 - 64);
            return;
        }
        this.f16100b |= 1 << i10;
    }

    public final String toString() {
        switch (this.f16099a) {
            case 1:
                if (((c) this.f16101c) == null) {
                    return Long.toBinaryString(this.f16100b);
                }
                return ((c) this.f16101c).toString() + "xx" + Long.toBinaryString(this.f16100b);
            default:
                return super.toString();
        }
    }

    public c(long j6, k0 k0Var) {
        this.f16099a = 0;
        this.f16100b = j6;
        this.f16101c = k0Var;
    }
}
