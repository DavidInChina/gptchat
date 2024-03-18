package E2;

import a1.C1915c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import y2.C6513P;
import y2.l0;

/* loaded from: classes.dex */
public final class E implements AbstractC0490w, AbstractC0489v {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC0490w[] f4130Y;

    /* renamed from: h0  reason: collision with root package name */
    public final C1915c f4132h0;

    /* renamed from: k0  reason: collision with root package name */
    public AbstractC0489v f4135k0;

    /* renamed from: l0  reason: collision with root package name */
    public i0 f4136l0;

    /* renamed from: i0  reason: collision with root package name */
    public final ArrayList f4133i0 = new ArrayList();

    /* renamed from: j0  reason: collision with root package name */
    public final HashMap f4134j0 = new HashMap();

    /* renamed from: n0  reason: collision with root package name */
    public J0.a f4138n0 = new J0.a(new Z[0]);

    /* renamed from: Z  reason: collision with root package name */
    public final IdentityHashMap f4131Z = new IdentityHashMap();

    /* renamed from: m0  reason: collision with root package name */
    public AbstractC0490w[] f4137m0 = new AbstractC0490w[0];

    public E(C1915c c1915c, long[] jArr, AbstractC0490w... abstractC0490wArr) {
        this.f4132h0 = c1915c;
        this.f4130Y = abstractC0490wArr;
        c1915c.getClass();
        for (int i10 = 0; i10 < abstractC0490wArr.length; i10++) {
            long j6 = jArr[i10];
            if (j6 != 0) {
                this.f4130Y[i10] = new h0(abstractC0490wArr[i10], j6);
            }
        }
    }

    @Override // E2.Z
    public final void C(long j6) {
        this.f4138n0.C(j6);
    }

    @Override // E2.AbstractC0489v
    public final void a(AbstractC0490w abstractC0490w) {
        ArrayList arrayList = this.f4133i0;
        arrayList.remove(abstractC0490w);
        if (!arrayList.isEmpty()) {
            return;
        }
        AbstractC0490w[] abstractC0490wArr = this.f4130Y;
        int i10 = 0;
        for (AbstractC0490w abstractC0490w2 : abstractC0490wArr) {
            i10 += abstractC0490w2.u().f4361Y;
        }
        p2.h0[] h0VarArr = new p2.h0[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < abstractC0490wArr.length; i12++) {
            i0 u10 = abstractC0490wArr[i12].u();
            int i13 = u10.f4361Y;
            int i14 = 0;
            while (i14 < i13) {
                p2.h0 b10 = u10.b(i14);
                p2.h0 h0Var = new p2.h0(i12 + ":" + b10.f42073Z, b10.f42075i0);
                this.f4134j0.put(h0Var, b10);
                h0VarArr[i11] = h0Var;
                i14++;
                i11++;
            }
        }
        this.f4136l0 = new i0(h0VarArr);
        AbstractC0489v abstractC0489v = this.f4135k0;
        abstractC0489v.getClass();
        abstractC0489v.a(this);
    }

    @Override // E2.AbstractC0489v
    public final void b(Z z10) {
        AbstractC0490w abstractC0490w = (AbstractC0490w) z10;
        AbstractC0489v abstractC0489v = this.f4135k0;
        abstractC0489v.getClass();
        abstractC0489v.b(this);
    }

    @Override // E2.Z
    public final long c() {
        return this.f4138n0.c();
    }

    @Override // E2.AbstractC0490w
    public final void e() {
        for (AbstractC0490w abstractC0490w : this.f4130Y) {
            abstractC0490w.e();
        }
    }

    @Override // E2.AbstractC0490w
    public final long j(long j6) {
        long j10 = this.f4137m0[0].j(j6);
        int i10 = 1;
        while (true) {
            AbstractC0490w[] abstractC0490wArr = this.f4137m0;
            if (i10 < abstractC0490wArr.length) {
                if (abstractC0490wArr[i10].j(j10) == j10) {
                    i10++;
                } else {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else {
                return j10;
            }
        }
    }

    @Override // E2.AbstractC0490w
    public final void k(long j6) {
        for (AbstractC0490w abstractC0490w : this.f4137m0) {
            abstractC0490w.k(j6);
        }
    }

    @Override // E2.Z
    public final boolean l() {
        return this.f4138n0.l();
    }

    @Override // E2.Z
    public final boolean m(C6513P c6513p) {
        ArrayList arrayList = this.f4133i0;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((AbstractC0490w) arrayList.get(i10)).m(c6513p);
            }
            return false;
        }
        return this.f4138n0.m(c6513p);
    }

    @Override // E2.AbstractC0490w
    public final long p(long j6, l0 l0Var) {
        AbstractC0490w abstractC0490w;
        AbstractC0490w[] abstractC0490wArr = this.f4137m0;
        if (abstractC0490wArr.length > 0) {
            abstractC0490w = abstractC0490wArr[0];
        } else {
            abstractC0490w = this.f4130Y[0];
        }
        return abstractC0490w.p(j6, l0Var);
    }

    @Override // E2.AbstractC0490w
    public final void q(AbstractC0489v abstractC0489v, long j6) {
        this.f4135k0 = abstractC0489v;
        ArrayList arrayList = this.f4133i0;
        AbstractC0490w[] abstractC0490wArr = this.f4130Y;
        Collections.addAll(arrayList, abstractC0490wArr);
        for (AbstractC0490w abstractC0490w : abstractC0490wArr) {
            abstractC0490w.q(this, j6);
        }
    }

    @Override // E2.AbstractC0490w
    public final long r() {
        AbstractC0490w[] abstractC0490wArr;
        AbstractC0490w[] abstractC0490wArr2;
        long j6 = -9223372036854775807L;
        for (AbstractC0490w abstractC0490w : this.f4137m0) {
            long r10 = abstractC0490w.r();
            if (r10 != -9223372036854775807L) {
                if (j6 == -9223372036854775807L) {
                    for (AbstractC0490w abstractC0490w2 : this.f4137m0) {
                        if (abstractC0490w2 == abstractC0490w) {
                            break;
                        } else if (abstractC0490w2.j(r10) != r10) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j6 = r10;
                } else if (r10 != j6) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j6 != -9223372036854775807L && abstractC0490w.j(j6) != j6) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j6;
    }

    @Override // E2.AbstractC0490w
    public final i0 u() {
        i0 i0Var = this.f4136l0;
        i0Var.getClass();
        return i0Var;
    }

    @Override // E2.AbstractC0490w
    public final long v(H2.s[] sVarArr, boolean[] zArr, Y[] yArr, boolean[] zArr2, long j6) {
        IdentityHashMap identityHashMap;
        Y y10;
        ArrayList arrayList;
        Integer num;
        int i10;
        int[] iArr = new int[sVarArr.length];
        int[] iArr2 = new int[sVarArr.length];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int length = sVarArr.length;
            identityHashMap = this.f4131Z;
            if (i12 >= length) {
                break;
            }
            Y y11 = yArr[i12];
            if (y11 == null) {
                num = null;
            } else {
                num = (Integer) identityHashMap.get(y11);
            }
            if (num == null) {
                i10 = -1;
            } else {
                i10 = num.intValue();
            }
            iArr[i12] = i10;
            H2.s sVar = sVarArr[i12];
            if (sVar != null) {
                String str = sVar.a().f42073Z;
                iArr2[i12] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i12] = -1;
            }
            i12++;
        }
        identityHashMap.clear();
        int length2 = sVarArr.length;
        Y[] yArr2 = new Y[length2];
        Y[] yArr3 = new Y[sVarArr.length];
        H2.s[] sVarArr2 = new H2.s[sVarArr.length];
        AbstractC0490w[] abstractC0490wArr = this.f4130Y;
        ArrayList arrayList2 = new ArrayList(abstractC0490wArr.length);
        long j10 = j6;
        int i13 = 0;
        while (i13 < abstractC0490wArr.length) {
            int i14 = i11;
            while (i14 < sVarArr.length) {
                if (iArr[i14] == i13) {
                    y10 = yArr[i14];
                } else {
                    y10 = null;
                }
                yArr3[i14] = y10;
                if (iArr2[i14] == i13) {
                    H2.s sVar2 = sVarArr[i14];
                    sVar2.getClass();
                    arrayList = arrayList2;
                    p2.h0 h0Var = (p2.h0) this.f4134j0.get(sVar2.a());
                    h0Var.getClass();
                    sVarArr2[i14] = new D(sVar2, h0Var);
                } else {
                    arrayList = arrayList2;
                    sVarArr2[i14] = null;
                }
                i14++;
                arrayList2 = arrayList;
            }
            ArrayList arrayList3 = arrayList2;
            int i15 = i13;
            AbstractC0490w[] abstractC0490wArr2 = abstractC0490wArr;
            H2.s[] sVarArr3 = sVarArr2;
            long v10 = abstractC0490wArr[i13].v(sVarArr2, zArr, yArr3, zArr2, j10);
            if (i15 == 0) {
                j10 = v10;
            } else if (v10 != j10) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i16 = 0; i16 < sVarArr.length; i16++) {
                boolean z11 = true;
                if (iArr2[i16] == i15) {
                    Y y12 = yArr3[i16];
                    y12.getClass();
                    yArr2[i16] = yArr3[i16];
                    identityHashMap.put(y12, Integer.valueOf(i15));
                    z10 = true;
                } else if (iArr[i16] == i15) {
                    if (yArr3[i16] != null) {
                        z11 = false;
                    }
                    Gi.e.n(z11);
                }
            }
            if (z10) {
                arrayList3.add(abstractC0490wArr2[i15]);
            }
            i13 = i15 + 1;
            arrayList2 = arrayList3;
            abstractC0490wArr = abstractC0490wArr2;
            sVarArr2 = sVarArr3;
            i11 = 0;
        }
        int i17 = i11;
        System.arraycopy(yArr2, i17, yArr, i17, length2);
        AbstractC0490w[] abstractC0490wArr3 = (AbstractC0490w[]) arrayList2.toArray(new AbstractC0490w[i17]);
        this.f4137m0 = abstractC0490wArr3;
        this.f4132h0.getClass();
        this.f4138n0 = new J0.a(abstractC0490wArr3);
        return j10;
    }

    @Override // E2.Z
    public final long x() {
        return this.f4138n0.x();
    }
}
