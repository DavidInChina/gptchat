package L2;

import p2.C5065s;

/* loaded from: classes.dex */
public final class D implements q {

    /* renamed from: a  reason: collision with root package name */
    public final int f10522a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10523b;

    /* renamed from: c  reason: collision with root package name */
    public final String f10524c;

    /* renamed from: d  reason: collision with root package name */
    public int f10525d;

    /* renamed from: e  reason: collision with root package name */
    public int f10526e;

    /* renamed from: f  reason: collision with root package name */
    public s f10527f;

    /* renamed from: g  reason: collision with root package name */
    public G f10528g;

    public D(int i10, int i11, String str) {
        this.f10522a = i10;
        this.f10523b = i11;
        this.f10524c = str;
    }

    @Override // L2.q
    public final int a(r rVar, I2.i iVar) {
        int i10 = this.f10526e;
        if (i10 != 1) {
            if (i10 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        G g10 = this.f10528g;
        g10.getClass();
        int c10 = g10.c(rVar, 1024, true);
        if (c10 == -1) {
            this.f10526e = 2;
            this.f10528g.e(0L, 1, this.f10525d, 0, null);
            this.f10525d = 0;
        } else {
            this.f10525d += c10;
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [L2.B, java.lang.Object] */
    @Override // L2.q
    public final void d(s sVar) {
        this.f10527f = sVar;
        G f6 = sVar.f(1024, 4);
        this.f10528g = f6;
        p2.r rVar = new p2.r();
        rVar.f42236j = this.f10524c;
        rVar.f42224E = 1;
        rVar.f42225F = 1;
        f6.b(new C5065s(rVar));
        this.f10527f.d();
        this.f10527f.b(new Object());
        this.f10526e = 1;
    }

    @Override // L2.q
    public final boolean g(r rVar) {
        boolean z10;
        int i10 = this.f10523b;
        int i11 = this.f10522a;
        if (i11 != -1 && i10 != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        Gi.e.n(z10);
        s2.u uVar = new s2.u(i10);
        rVar.n(uVar.f45193a, 0, i10);
        if (uVar.z() == i11) {
            return true;
        }
        return false;
    }

    @Override // L2.q
    public final void h(long j6, long j10) {
        if (j6 == 0 || this.f10526e == 1) {
            this.f10526e = 1;
            this.f10525d = 0;
        }
    }

    @Override // L2.q
    public final q b() {
        return this;
    }

    @Override // L2.q
    public final void release() {
    }
}
