package Bh;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class G0 implements N0 {

    /* renamed from: Y  reason: collision with root package name */
    public final ArrayList f2209Y = new ArrayList();

    public G0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            N0 n02 = (N0) it.next();
            if (n02 instanceof G0) {
                this.f2209Y.addAll(((G0) n02).f2209Y);
            } else {
                this.f2209Y.add(n02);
            }
        }
    }

    @Override // Bh.N0
    public final void a() {
        Iterator it = this.f2209Y.iterator();
        while (it.hasNext()) {
            ((N0) it.next()).a();
        }
    }

    @Override // Bh.N0
    public final void b(String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        Iterator it = this.f2209Y.iterator();
        while (it.hasNext()) {
            ((N0) it.next()).b(str, z10, z11, z12, z13, z14, z15, z16, z17);
        }
    }

    @Override // Bh.N0
    public final void c() {
        Iterator it = this.f2209Y.iterator();
        while (it.hasNext()) {
            ((N0) it.next()).c();
        }
    }

    @Override // Bh.N0
    public final void d() {
        Iterator it = this.f2209Y.iterator();
        while (it.hasNext()) {
            ((N0) it.next()).d();
        }
    }

    @Override // Bh.N0
    public final void e() {
        Iterator it = this.f2209Y.iterator();
        while (it.hasNext()) {
            ((N0) it.next()).e();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && G0.class == obj.getClass() && this.f2209Y.equals(((G0) obj).f2209Y)) {
            return true;
        }
        return false;
    }

    @Override // Bh.N0
    public final void f() {
        Iterator it = this.f2209Y.iterator();
        while (it.hasNext()) {
            ((N0) it.next()).f();
        }
    }

    @Override // Bh.N0
    public final void g() {
        Iterator it = this.f2209Y.iterator();
        while (it.hasNext()) {
            ((N0) it.next()).g();
        }
    }

    @Override // Bh.N0
    public final void h() {
        Iterator it = this.f2209Y.iterator();
        while (it.hasNext()) {
            ((N0) it.next()).h();
        }
    }

    public final int hashCode() {
        return this.f2209Y.hashCode() + (G0.class.hashCode() * 31);
    }

    @Override // Bh.N0
    public final void i() {
        Iterator it = this.f2209Y.iterator();
        while (it.hasNext()) {
            ((N0) it.next()).i();
        }
    }

    @Override // Bh.N0
    public final void j() {
        Iterator it = this.f2209Y.iterator();
        while (it.hasNext()) {
            ((N0) it.next()).j();
        }
    }

    @Override // Bh.N0
    public final void k(String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        Iterator it = this.f2209Y.iterator();
        while (it.hasNext()) {
            ((N0) it.next()).k(str, z10, z11, z12, z13);
        }
    }

    @Override // Bh.N0
    public final void l(String str) {
        Iterator it = this.f2209Y.iterator();
        while (it.hasNext()) {
            ((N0) it.next()).l(str);
        }
    }

    @Override // Bh.N0
    public final void m() {
        Iterator it = this.f2209Y.iterator();
        while (it.hasNext()) {
            ((N0) it.next()).m();
        }
    }

    @Override // Bh.N0
    public final void n() {
        Iterator it = this.f2209Y.iterator();
        while (it.hasNext()) {
            ((N0) it.next()).n();
        }
    }

    @Override // Bh.N0
    public final void o(int i10, boolean z10, boolean z11) {
        Iterator it = this.f2209Y.iterator();
        while (it.hasNext()) {
            ((N0) it.next()).o(i10, z10, z11);
        }
    }

    @Override // Bh.N0
    public final void p() {
        Iterator it = this.f2209Y.iterator();
        while (it.hasNext()) {
            ((N0) it.next()).p();
        }
    }
}
