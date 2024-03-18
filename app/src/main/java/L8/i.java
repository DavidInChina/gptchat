package L8;

import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class i extends P8.c {

    /* renamed from: u0  reason: collision with root package name */
    public static final h f10796u0 = new h();

    /* renamed from: v0  reason: collision with root package name */
    public static final I8.w f10797v0 = new I8.w("closed");

    /* renamed from: s0  reason: collision with root package name */
    public String f10799s0;

    /* renamed from: r0  reason: collision with root package name */
    public final ArrayList f10798r0 = new ArrayList();

    /* renamed from: t0  reason: collision with root package name */
    public I8.r f10800t0 = I8.t.f8132Y;

    public i() {
        super(f10796u0);
    }

    public final void A0(I8.r rVar) {
        if (this.f10799s0 != null) {
            if (!(rVar instanceof I8.t) || this.f13876n0) {
                ((I8.u) w0()).U(this.f10799s0, rVar);
            }
            this.f10799s0 = null;
        } else if (this.f10798r0.isEmpty()) {
            this.f10800t0 = rVar;
        } else {
            I8.r w02 = w0();
            if (w02 instanceof I8.p) {
                ((I8.p) w02).U(rVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    @Override // P8.c
    public final P8.c F() {
        A0(I8.t.f8132Y);
        return this;
    }

    @Override // P8.c
    public final void S(double d10) {
        if (!this.f13873k0 && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d10);
        }
        A0(new I8.w(Double.valueOf(d10)));
    }

    @Override // P8.c
    public final void V(long j6) {
        A0(new I8.w(Long.valueOf(j6)));
    }

    @Override // P8.c
    public final void a0(Boolean bool) {
        if (bool == null) {
            A0(I8.t.f8132Y);
        } else {
            A0(new I8.w(bool));
        }
    }

    @Override // P8.c, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ArrayList arrayList = this.f10798r0;
        if (arrayList.isEmpty()) {
            arrayList.add(f10797v0);
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // P8.c
    public final void d0(Number number) {
        if (number == null) {
            A0(I8.t.f8132Y);
            return;
        }
        if (!this.f13873k0) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        A0(new I8.w(number));
    }

    @Override // P8.c
    public final void f0(String str) {
        if (str == null) {
            A0(I8.t.f8132Y);
        } else {
            A0(new I8.w(str));
        }
    }

    @Override // P8.c
    public final void h() {
        I8.p pVar = new I8.p();
        A0(pVar);
        this.f10798r0.add(pVar);
    }

    @Override // P8.c
    public final void i() {
        I8.u uVar = new I8.u();
        A0(uVar);
        this.f10798r0.add(uVar);
    }

    @Override // P8.c
    public final void k() {
        ArrayList arrayList = this.f10798r0;
        if (!arrayList.isEmpty() && this.f10799s0 == null) {
            if (w0() instanceof I8.p) {
                arrayList.remove(arrayList.size() - 1);
                return;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // P8.c
    public final void m() {
        ArrayList arrayList = this.f10798r0;
        if (!arrayList.isEmpty() && this.f10799s0 == null) {
            if (w0() instanceof I8.u) {
                arrayList.remove(arrayList.size() - 1);
                return;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // P8.c
    public final void m0(boolean z10) {
        A0(new I8.w(Boolean.valueOf(z10)));
    }

    @Override // P8.c
    public final void p(String str) {
        Objects.requireNonNull(str, "name == null");
        if (!this.f10798r0.isEmpty() && this.f10799s0 == null) {
            if (w0() instanceof I8.u) {
                this.f10799s0 = str;
                return;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    public final I8.r w0() {
        ArrayList arrayList = this.f10798r0;
        return (I8.r) arrayList.get(arrayList.size() - 1);
    }

    @Override // P8.c, java.io.Flushable
    public final void flush() {
    }
}
