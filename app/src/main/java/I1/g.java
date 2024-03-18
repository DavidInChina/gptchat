package i1;

import h1.C3298e;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class g extends j {

    /* renamed from: A0  reason: collision with root package name */
    public float f32548A0;

    /* renamed from: B0  reason: collision with root package name */
    public float f32549B0;

    /* renamed from: C0  reason: collision with root package name */
    public int f32550C0;

    /* renamed from: D0  reason: collision with root package name */
    public int f32551D0;

    /* renamed from: E0  reason: collision with root package name */
    public int f32552E0;

    /* renamed from: F0  reason: collision with root package name */
    public int f32553F0;

    /* renamed from: G0  reason: collision with root package name */
    public int f32554G0;

    /* renamed from: H0  reason: collision with root package name */
    public int f32555H0;

    /* renamed from: I0  reason: collision with root package name */
    public int f32556I0;

    /* renamed from: J0  reason: collision with root package name */
    public ArrayList f32557J0;

    /* renamed from: K0  reason: collision with root package name */
    public d[] f32558K0;

    /* renamed from: L0  reason: collision with root package name */
    public d[] f32559L0;

    /* renamed from: M0  reason: collision with root package name */
    public int[] f32560M0;

    /* renamed from: N0  reason: collision with root package name */
    public d[] f32561N0;

    /* renamed from: O0  reason: collision with root package name */
    public int f32562O0;

    /* renamed from: f0  reason: collision with root package name */
    public int f32563f0;

    /* renamed from: g0  reason: collision with root package name */
    public int f32564g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f32565h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f32566i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f32567j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f32568k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f32569l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f32570m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f32571n0;

    /* renamed from: o0  reason: collision with root package name */
    public j1.b f32572o0;

    /* renamed from: p0  reason: collision with root package name */
    public k1.f f32573p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f32574q0;

    /* renamed from: r0  reason: collision with root package name */
    public int f32575r0;

    /* renamed from: s0  reason: collision with root package name */
    public int f32576s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f32577t0;

    /* renamed from: u0  reason: collision with root package name */
    public int f32578u0;

    /* renamed from: v0  reason: collision with root package name */
    public int f32579v0;

    /* renamed from: w0  reason: collision with root package name */
    public float f32580w0;

    /* renamed from: x0  reason: collision with root package name */
    public float f32581x0;

    /* renamed from: y0  reason: collision with root package name */
    public float f32582y0;

    /* renamed from: z0  reason: collision with root package name */
    public float f32583z0;

    public final int C(d dVar, int i10) {
        if (dVar == null) {
            return 0;
        }
        int[] iArr = dVar.f32491c0;
        if (iArr[1] == 3) {
            int i11 = dVar.f32499k;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (dVar.f32506r * i10);
                if (i12 != dVar.j()) {
                    E(dVar, iArr[0], dVar.m(), 1, i12);
                }
                return i12;
            } else if (i11 == 1) {
                return dVar.j();
            } else {
                if (i11 == 3) {
                    return (int) ((dVar.m() * dVar.f32475L) + 0.5f);
                }
            }
        }
        return dVar.j();
    }

    public final int D(d dVar, int i10) {
        if (dVar == null) {
            return 0;
        }
        int[] iArr = dVar.f32491c0;
        if (iArr[0] == 3) {
            int i11 = dVar.f32498j;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (dVar.f32503o * i10);
                if (i12 != dVar.m()) {
                    E(dVar, 1, i12, iArr[1], dVar.j());
                }
                return i12;
            } else if (i11 == 1) {
                return dVar.m();
            } else {
                if (i11 == 3) {
                    return (int) ((dVar.j() * dVar.f32475L) + 0.5f);
                }
            }
        }
        return dVar.m();
    }

    public final void E(d dVar, int i10, int i11, int i12, int i13) {
        k1.f fVar;
        boolean z10;
        d dVar2;
        while (true) {
            fVar = this.f32573p0;
            if (fVar != null || (dVar2 = this.f32472I) == null) {
                break;
            }
            this.f32573p0 = ((e) dVar2).f32518g0;
        }
        j1.b bVar = this.f32572o0;
        bVar.f35954a = i10;
        bVar.f35955b = i12;
        bVar.f35956c = i11;
        bVar.f35957d = i13;
        fVar.a(dVar, bVar);
        dVar.z(this.f32572o0.f35958e);
        dVar.w(this.f32572o0.f35959f);
        j1.b bVar2 = this.f32572o0;
        dVar.f32511w = bVar2.f35961h;
        int i14 = bVar2.f35960g;
        dVar.P = i14;
        if (i14 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        dVar.f32511w = z10;
    }

    @Override // i1.j, i1.i
    public final void a() {
        for (int i10 = 0; i10 < this.f32590e0; i10++) {
            d dVar = this.f32589d0[i10];
        }
    }

    @Override // i1.d
    public final void b(C3298e c3298e) {
        boolean z10;
        boolean z11;
        d dVar;
        int i10;
        super.b(c3298e);
        d dVar2 = this.f32472I;
        if (dVar2 != null) {
            z10 = ((e) dVar2).f32519h0;
        } else {
            z10 = false;
        }
        int i11 = this.f32554G0;
        ArrayList arrayList = this.f32557J0;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2 && this.f32560M0 != null && this.f32559L0 != null && this.f32558K0 != null) {
                    for (int i12 = 0; i12 < this.f32562O0; i12++) {
                        this.f32561N0[i12].u();
                    }
                    int[] iArr = this.f32560M0;
                    int i13 = iArr[0];
                    int i14 = iArr[1];
                    d dVar3 = null;
                    for (int i15 = 0; i15 < i13; i15++) {
                        if (z10) {
                            i10 = (i13 - i15) - 1;
                        } else {
                            i10 = i15;
                        }
                        d dVar4 = this.f32559L0[i10];
                        if (dVar4 != null && dVar4.f32481V != 8) {
                            C3458c c3458c = dVar4.f32512x;
                            if (i15 == 0) {
                                dVar4.f(c3458c, this.f32512x, this.f32567j0);
                                dVar4.f32483X = this.f32574q0;
                                dVar4.S = this.f32580w0;
                            }
                            if (i15 == i13 - 1) {
                                dVar4.f(dVar4.f32514z, this.f32514z, this.f32568k0);
                            }
                            if (i15 > 0) {
                                dVar4.f(c3458c, dVar3.f32514z, this.f32550C0);
                                dVar3.f(dVar3.f32514z, c3458c, 0);
                            }
                            dVar3 = dVar4;
                        }
                    }
                    for (int i16 = 0; i16 < i14; i16++) {
                        d dVar5 = this.f32558K0[i16];
                        if (dVar5 != null && dVar5.f32481V != 8) {
                            C3458c c3458c2 = dVar5.f32513y;
                            if (i16 == 0) {
                                dVar5.f(c3458c2, this.f32513y, this.f32563f0);
                                dVar5.f32484Y = this.f32575r0;
                                dVar5.T = this.f32581x0;
                            }
                            if (i16 == i14 - 1) {
                                dVar5.f(dVar5.f32464A, this.f32464A, this.f32564g0);
                            }
                            if (i16 > 0) {
                                dVar5.f(c3458c2, dVar3.f32464A, this.f32551D0);
                                dVar3.f(dVar3.f32464A, c3458c2, 0);
                            }
                            dVar3 = dVar5;
                        }
                    }
                    for (int i17 = 0; i17 < i13; i17++) {
                        for (int i18 = 0; i18 < i14; i18++) {
                            int i19 = (i18 * i13) + i17;
                            if (this.f32556I0 == 1) {
                                i19 = (i17 * i14) + i18;
                            }
                            d[] dVarArr = this.f32561N0;
                            if (i19 < dVarArr.length && (dVar = dVarArr[i19]) != null && dVar.f32481V != 8) {
                                d dVar6 = this.f32559L0[i17];
                                d dVar7 = this.f32558K0[i18];
                                if (dVar != dVar6) {
                                    dVar.f(dVar.f32512x, dVar6.f32512x, 0);
                                    dVar.f(dVar.f32514z, dVar6.f32514z, 0);
                                }
                                if (dVar != dVar7) {
                                    dVar.f(dVar.f32513y, dVar7.f32513y, 0);
                                    dVar.f(dVar.f32464A, dVar7.f32464A, 0);
                                }
                            }
                        }
                    }
                }
            } else {
                int size = arrayList.size();
                for (int i20 = 0; i20 < size; i20++) {
                    f fVar = (f) arrayList.get(i20);
                    if (i20 == size - 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    fVar.b(i20, z10, z11);
                }
            }
        } else if (arrayList.size() > 0) {
            ((f) arrayList.get(0)).b(0, z10, true);
        }
        this.f32569l0 = false;
    }
}
