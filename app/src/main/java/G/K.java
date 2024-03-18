package G;

import E0.o0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class K implements J, E0.P {

    /* renamed from: Y  reason: collision with root package name */
    public final D f5434Y;

    /* renamed from: Z  reason: collision with root package name */
    public final o0 f5435Z;

    /* renamed from: h0  reason: collision with root package name */
    public final F f5436h0;

    /* renamed from: i0  reason: collision with root package name */
    public final HashMap f5437i0 = new HashMap();

    public K(D d10, o0 o0Var) {
        this.f5434Y = d10;
        this.f5435Z = o0Var;
        this.f5436h0 = (F) d10.f5417b.mo122invoke();
    }

    @Override // Z0.b
    public final long C(int i10) {
        return this.f5435Z.C(i10);
    }

    @Override // Z0.b
    public final long D(float f6) {
        return this.f5435Z.D(f6);
    }

    @Override // Z0.b
    public final float J(int i10) {
        return this.f5435Z.J(i10);
    }

    @Override // Z0.b
    public final float K(float f6) {
        return this.f5435Z.K(f6);
    }

    @Override // Z0.b
    public final float O() {
        return this.f5435Z.O();
    }

    @Override // E0.AbstractC0459s
    public final boolean P() {
        return this.f5435Z.P();
    }

    @Override // Z0.b
    public final float R(float f6) {
        return this.f5435Z.R(f6);
    }

    public final List a(int i10, long j6) {
        HashMap hashMap = this.f5437i0;
        List list = (List) hashMap.get(Integer.valueOf(i10));
        if (list == null) {
            F f6 = this.f5436h0;
            Object b10 = f6.b(i10);
            List z10 = this.f5435Z.z(b10, this.f5434Y.a(b10, i10, f6.d(i10)));
            int size = z10.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(((E0.M) z10.get(i11)).o(j6));
            }
            hashMap.put(Integer.valueOf(i10), arrayList);
            return arrayList;
        }
        return list;
    }

    @Override // Z0.b
    public final int a0(float f6) {
        return this.f5435Z.a0(f6);
    }

    @Override // Z0.b
    public final float b() {
        return this.f5435Z.b();
    }

    @Override // Z0.b
    public final long g0(long j6) {
        return this.f5435Z.g0(j6);
    }

    @Override // E0.AbstractC0459s
    public final Z0.l getLayoutDirection() {
        return this.f5435Z.getLayoutDirection();
    }

    @Override // Z0.b
    public final float i0(long j6) {
        return this.f5435Z.i0(j6);
    }

    @Override // E0.P
    public final E0.O j0(int i10, int i11, Map map, wf.k kVar) {
        return this.f5435Z.j0(i10, i11, map, kVar);
    }

    @Override // Z0.b
    public final long p(long j6) {
        return this.f5435Z.p(j6);
    }

    @Override // Z0.b
    public final float t(long j6) {
        return this.f5435Z.t(j6);
    }
}
