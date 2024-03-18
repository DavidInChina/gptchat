package E0;

import b0.C2101e;
import b0.C2104h;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class C implements o0, P {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ E f3991Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ J f3992Z;

    public C(J j6) {
        this.f3992Z = j6;
        this.f3991Y = j6.f4019m0;
    }

    @Override // Z0.b
    public final long C(int i10) {
        return this.f3991Y.C(i10);
    }

    @Override // Z0.b
    public final long D(float f6) {
        return this.f3991Y.D(f6);
    }

    @Override // Z0.b
    public final float J(int i10) {
        return this.f3991Y.J(i10);
    }

    @Override // Z0.b
    public final float K(float f6) {
        return f6 / this.f3991Y.b();
    }

    @Override // Z0.b
    public final float O() {
        return this.f3991Y.f4001h0;
    }

    @Override // E0.AbstractC0459s
    public final boolean P() {
        return this.f3991Y.P();
    }

    @Override // Z0.b
    public final float R(float f6) {
        return this.f3991Y.b() * f6;
    }

    @Override // Z0.b
    public final int a0(float f6) {
        E e10 = this.f3991Y;
        e10.getClass();
        return R.a.b(f6, e10);
    }

    @Override // Z0.b
    public final float b() {
        return this.f3991Y.f4000Z;
    }

    @Override // Z0.b
    public final long g0(long j6) {
        E e10 = this.f3991Y;
        e10.getClass();
        return R.a.g(j6, e10);
    }

    @Override // E0.AbstractC0459s
    public final Z0.l getLayoutDirection() {
        return this.f3991Y.f3999Y;
    }

    @Override // Z0.b
    public final float i0(long j6) {
        E e10 = this.f3991Y;
        e10.getClass();
        return R.a.f(j6, e10);
    }

    @Override // E0.P
    public final O j0(int i10, int i11, Map map, wf.k kVar) {
        return this.f3991Y.j0(i10, i11, map, kVar);
    }

    @Override // Z0.b
    public final long p(long j6) {
        E e10 = this.f3991Y;
        e10.getClass();
        return R.a.e(j6, e10);
    }

    @Override // Z0.b
    public final float t(long j6) {
        E e10 = this.f3991Y;
        e10.getClass();
        return R.a.d(j6, e10);
    }

    @Override // E0.o0
    public final List z(Object obj, wf.n nVar) {
        List list;
        J j6 = this.f3992Z;
        androidx.compose.ui.node.a aVar = (androidx.compose.ui.node.a) j6.f4018l0.get(obj);
        if (aVar != null) {
            list = aVar.n();
        } else {
            list = null;
        }
        if (list != null) {
            return list;
        }
        C2104h c2104h = j6.f4024r0;
        int i10 = c2104h.f25569h0;
        int i11 = j6.f4016j0;
        if (i10 >= i11) {
            if (i10 == i11) {
                c2104h.b(obj);
            } else {
                c2104h.p(i11, obj);
            }
            j6.f4016j0++;
            HashMap hashMap = j6.f4021o0;
            if (!hashMap.containsKey(obj)) {
                j6.f4023q0.put(obj, j6.f(obj, nVar));
                androidx.compose.ui.node.a aVar2 = j6.f4012Y;
                if (aVar2.v() == 3) {
                    aVar2.m0(true);
                } else {
                    androidx.compose.ui.node.a.n0(aVar2, true, 2);
                }
            }
            androidx.compose.ui.node.a aVar3 = (androidx.compose.ui.node.a) hashMap.get(obj);
            if (aVar3 != null) {
                List h02 = aVar3.z().h0();
                C2101e c2101e = (C2101e) h02;
                int i12 = c2101e.f25561Y.f25569h0;
                for (int i13 = 0; i13 < i12; i13++) {
                    ((G0.M) c2101e.get(i13)).f5628J0.f5648b = true;
                }
                return h02;
            }
            return kf.v.f37483Y;
        }
        throw new IllegalArgumentException("Error: currentPostLookaheadIndex cannot be greater than the size of thepostLookaheadComposedSlotIds list.".toString());
    }
}
