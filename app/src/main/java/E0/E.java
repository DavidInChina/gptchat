package E0;

import A.AbstractC0044t0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class E implements o0 {

    /* renamed from: Y  reason: collision with root package name */
    public Z0.l f3999Y = Z0.l.f22806Z;

    /* renamed from: Z  reason: collision with root package name */
    public float f4000Z;

    /* renamed from: h0  reason: collision with root package name */
    public float f4001h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ J f4002i0;

    public E(J j6) {
        this.f4002i0 = j6;
    }

    @Override // Z0.b
    public final long C(int i10) {
        return R.a.h(J(i10), this);
    }

    @Override // Z0.b
    public final long D(float f6) {
        return a(K(f6));
    }

    @Override // Z0.b
    public final float J(int i10) {
        return i10 / b();
    }

    @Override // Z0.b
    public final float K(float f6) {
        return f6 / b();
    }

    @Override // Z0.b
    public final float O() {
        return this.f4001h0;
    }

    @Override // E0.AbstractC0459s
    public final boolean P() {
        J j6 = this.f4002i0;
        if (j6.f4012Y.v() != 4 && j6.f4012Y.v() != 2) {
            return false;
        }
        return true;
    }

    @Override // Z0.b
    public final float R(float f6) {
        return b() * f6;
    }

    public final /* synthetic */ long a(float f6) {
        return R.a.h(f6, this);
    }

    @Override // Z0.b
    public final /* synthetic */ int a0(float f6) {
        return R.a.b(f6, this);
    }

    @Override // Z0.b
    public final float b() {
        return this.f4000Z;
    }

    @Override // Z0.b
    public final /* synthetic */ long g0(long j6) {
        return R.a.g(j6, this);
    }

    @Override // E0.AbstractC0459s
    public final Z0.l getLayoutDirection() {
        return this.f3999Y;
    }

    @Override // Z0.b
    public final /* synthetic */ float i0(long j6) {
        return R.a.f(j6, this);
    }

    @Override // E0.P
    public final O j0(int i10, int i11, Map map, wf.k kVar) {
        if ((i10 & (-16777216)) == 0 && ((-16777216) & i11) == 0) {
            return new D(i10, i11, map, this, this.f4002i0, kVar);
        }
        throw new IllegalStateException(AbstractC0044t0.y("Size(", i10, " x ", i11, ") is out of range. Each dimension must be between 0 and 16777215.").toString());
    }

    @Override // Z0.b
    public final /* synthetic */ long p(long j6) {
        return R.a.e(j6, this);
    }

    @Override // Z0.b
    public final /* synthetic */ float t(long j6) {
        return R.a.d(j6, this);
    }

    @Override // E0.o0
    public final List z(Object obj, wf.n nVar) {
        J j6 = this.f4002i0;
        j6.d();
        androidx.compose.ui.node.a aVar = j6.f4012Y;
        int v10 = aVar.v();
        if (v10 != 1 && v10 != 3 && v10 != 2 && v10 != 4) {
            throw new IllegalStateException("subcompose can only be used inside the measure or layout blocks".toString());
        }
        HashMap hashMap = j6.f4018l0;
        Object obj2 = hashMap.get(obj);
        if (obj2 == null) {
            obj2 = (androidx.compose.ui.node.a) j6.f4021o0.remove(obj);
            if (obj2 != null) {
                int i10 = j6.f4026t0;
                if (i10 > 0) {
                    j6.f4026t0 = i10 - 1;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else {
                obj2 = j6.j(obj);
                if (obj2 == null) {
                    int i11 = j6.f4015i0;
                    androidx.compose.ui.node.a aVar2 = new androidx.compose.ui.node.a(2, true, 0);
                    aVar.f24853q0 = true;
                    aVar.L(i11, aVar2);
                    aVar.f24853q0 = false;
                    obj2 = aVar2;
                }
            }
            hashMap.put(obj, obj2);
        }
        androidx.compose.ui.node.a aVar3 = (androidx.compose.ui.node.a) obj2;
        if (kf.t.i2(j6.f4015i0, aVar.r()) != aVar3) {
            int indexOf = aVar.r().indexOf(aVar3);
            int i12 = j6.f4015i0;
            if (indexOf >= i12) {
                if (i12 != indexOf) {
                    aVar.f24853q0 = true;
                    aVar.d0(indexOf, i12, 1);
                    aVar.f24853q0 = false;
                }
            } else {
                throw new IllegalArgumentException(("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.").toString());
            }
        }
        j6.f4015i0++;
        j6.g(aVar3, obj, nVar);
        if (v10 != 1 && v10 != 3) {
            return aVar3.m();
        }
        return aVar3.n();
    }
}
