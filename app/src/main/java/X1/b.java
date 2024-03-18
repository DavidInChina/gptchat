package X1;

import Z.AbstractC1699a;
import Z1.v0;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import kf.t;

/* loaded from: classes2.dex */
public final class b extends AbstractC1699a {

    /* renamed from: d  reason: collision with root package name */
    public final int f21724d;

    public b(v0 v0Var) {
        super(v0Var);
        this.f21724d = v0Var.f21749a;
    }

    @Override // Z.AbstractC1707e
    public final /* bridge */ /* synthetic */ void b(int i10, Object obj) {
        h hVar = (h) obj;
    }

    @Override // Z.AbstractC1707e
    public final void d(int i10, int i11, int i12) {
        int i13;
        ArrayList j6 = j();
        if (i10 > i11) {
            i13 = i11;
        } else {
            i13 = i11 - i12;
        }
        if (i12 == 1) {
            if (i10 != i11 + 1 && i10 != i11 - 1) {
                j6.add(i13, j6.remove(i10));
                return;
            } else {
                j6.set(i10, j6.set(i11, j6.get(i10)));
                return;
            }
        }
        List subList = j6.subList(i10, i12 + i10);
        ArrayList M22 = t.M2(subList);
        subList.clear();
        j6.addAll(i13, M22);
    }

    @Override // Z.AbstractC1707e
    public final void e(int i10, int i11) {
        ArrayList j6 = j();
        if (i11 == 1) {
            j6.remove(i10);
        } else {
            j6.subList(i10, i11 + i10).clear();
        }
    }

    @Override // Z.AbstractC1707e
    public final void g(int i10, Object obj) {
        int i11;
        h hVar = (h) obj;
        Object obj2 = this.f22596c;
        AbstractC3557B.a0("null cannot be cast to non-null type androidx.glance.EmittableWithChildren", obj2);
        int i12 = ((j) obj2).f21749a;
        if (i12 > 0) {
            if (hVar instanceof j) {
                j jVar = (j) hVar;
                if (jVar.f21750b) {
                    i11 = this.f21724d;
                } else {
                    i11 = i12 - 1;
                }
                jVar.f21749a = i11;
            }
            j().add(i10, hVar);
            return;
        }
        StringBuilder sb2 = new StringBuilder("Too many embedded views for the current surface. The maximum depth is: ");
        Object obj3 = this.f22594a;
        AbstractC3557B.a0("null cannot be cast to non-null type androidx.glance.EmittableWithChildren", obj3);
        sb2.append(((j) obj3).f21749a);
        throw new IllegalArgumentException(sb2.toString().toString());
    }

    @Override // Z.AbstractC1699a
    public final void i() {
        Object obj = this.f22594a;
        AbstractC3557B.a0("null cannot be cast to non-null type androidx.glance.EmittableWithChildren", obj);
        ((j) obj).f21751c.clear();
    }

    public final ArrayList j() {
        h hVar = (h) this.f22596c;
        if (hVar instanceof j) {
            return ((j) hVar).f21751c;
        }
        throw new IllegalStateException("Current node cannot accept children");
    }
}
