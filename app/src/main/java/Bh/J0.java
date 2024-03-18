package Bh;

/* loaded from: classes2.dex */
public final class J0 implements N0 {

    /* renamed from: Y  reason: collision with root package name */
    public final ph.f f2224Y;

    public J0(ph.f fVar) {
        this.f2224Y = fVar;
    }

    @Override // Bh.N0
    public final void a() {
        ph.f fVar = ph.f.f43189k0;
        ph.f fVar2 = this.f2224Y;
        if (fVar2.compareTo(fVar) <= 0) {
            return;
        }
        throw new IllegalStateException("Cannot write subroutine for class file version " + fVar2);
    }

    @Override // Bh.N0
    public final void b(String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        if (z17) {
            ph.f fVar = ph.f.f43188j0;
            ph.f fVar2 = this.f2224Y;
            if (!fVar2.d(fVar)) {
                throw new IllegalStateException("Cannot define generic method '" + str + "' for class file version " + fVar2);
            }
        }
        if (!z14 && z10) {
            throw new IllegalStateException(android.gov.nist.core.a.A("Cannot define static or non-virtual method '", str, "' to be abstract"));
        }
    }

    @Override // Bh.N0
    public final void c() {
        ph.f fVar = ph.f.f43201w0;
        ph.f fVar2 = this.f2224Y;
        if (!fVar2.e(fVar)) {
            return;
        }
        throw new IllegalStateException("Cannot define permitted subclasses for class file version " + fVar2);
    }

    @Override // Bh.N0
    public final void d() {
        ph.f fVar = ph.f.f43191m0;
        ph.f fVar2 = this.f2224Y;
        if (!fVar2.e(fVar)) {
            return;
        }
        throw new IllegalStateException("Cannot write method type to constant pool for class file version " + fVar2);
    }

    @Override // Bh.N0
    public final void e() {
        ph.f fVar = ph.f.f43195q0;
        ph.f fVar2 = this.f2224Y;
        if (!fVar2.e(fVar)) {
            return;
        }
        throw new IllegalStateException("Cannot write dynamic constant for class file version " + fVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || J0.class != obj.getClass()) {
            return false;
        }
        if (this.f2224Y.equals(((J0) obj).f2224Y)) {
            return true;
        }
        return false;
    }

    @Override // Bh.N0
    public final void f() {
        ph.f fVar = ph.f.f43192n0;
        ph.f fVar2 = this.f2224Y;
        if (!fVar2.e(fVar)) {
            return;
        }
        throw new IllegalStateException("Cannot invoke default method for class file version " + fVar2);
    }

    @Override // Bh.N0
    public final void g() {
        ph.f fVar = ph.f.f43198t0;
        ph.f fVar2 = this.f2224Y;
        if (!fVar2.e(fVar)) {
            return;
        }
        throw new IllegalStateException("Cannot define record for class file version " + fVar2);
    }

    @Override // Bh.N0
    public final void h() {
        ph.f fVar = ph.f.f43191m0;
        ph.f fVar2 = this.f2224Y;
        if (!fVar2.e(fVar)) {
            return;
        }
        throw new IllegalStateException("Cannot write invoke dynamic instruction for class file version " + fVar2);
    }

    public final int hashCode() {
        return (J0.class.hashCode() * 31) + this.f2224Y.f43205Y;
    }

    @Override // Bh.N0
    public final void i() {
        ph.f fVar = ph.f.f43189k0;
        ph.f fVar2 = this.f2224Y;
        if (!fVar2.e(fVar)) {
            return;
        }
        throw new IllegalStateException("Cannot write annotations for class file version " + fVar2);
    }

    @Override // Bh.N0
    public final void j() {
        ph.f fVar = ph.f.f43189k0;
        ph.f fVar2 = this.f2224Y;
        if (!fVar2.e(fVar)) {
            return;
        }
        throw new IllegalStateException("Cannot write type to constant pool for class file version " + fVar2);
    }

    @Override // Bh.N0
    public final void k(String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        if (z13) {
            ph.f fVar = ph.f.f43188j0;
            ph.f fVar2 = this.f2224Y;
            if (!fVar2.d(fVar)) {
                throw new IllegalStateException("Cannot define generic field '" + str + "' for class file version " + fVar2);
            }
        }
    }

    @Override // Bh.N0
    public final void m() {
        ph.f fVar = ph.f.f43191m0;
        ph.f fVar2 = this.f2224Y;
        if (!fVar2.e(fVar)) {
            return;
        }
        throw new IllegalStateException("Cannot write method handle to constant pool for class file version " + fVar2);
    }

    @Override // Bh.N0
    public final void n() {
        ph.f fVar = ph.f.f43195q0;
        ph.f fVar2 = this.f2224Y;
        if (!fVar2.e(fVar)) {
            return;
        }
        throw new IllegalStateException("Cannot define nest mate for class file version " + fVar2);
    }

    @Override // Bh.N0
    public final void o(int i10, boolean z10, boolean z11) {
        int i11 = i10 & 8192;
        ph.f fVar = this.f2224Y;
        if (i11 != 0 && !fVar.d(ph.f.f43189k0)) {
            throw new IllegalStateException("Cannot define annotation type for class file version " + fVar);
        } else if (z11 && !fVar.d(ph.f.f43188j0)) {
            throw new IllegalStateException("Cannot define a generic type for class file version " + fVar);
        }
    }

    @Override // Bh.N0
    public final void p() {
        ph.f fVar = ph.f.f43189k0;
        ph.f fVar2 = this.f2224Y;
        if (!fVar2.e(fVar)) {
            return;
        }
        throw new IllegalStateException("Cannot write type annotations for class file version " + fVar2);
    }

    @Override // Bh.N0
    public final void l(String str) {
    }
}
