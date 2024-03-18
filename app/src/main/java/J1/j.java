package j1;

import i1.C3458c;
import java.util.ArrayList;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public final class j extends m {

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f35988k = new int[2];

    public static void m(int[] iArr, int i10, int i11, int i12, int i13, float f6, int i14) {
        int i15 = i11 - i10;
        int i16 = i13 - i12;
        if (i14 != -1) {
            if (i14 != 0) {
                if (i14 == 1) {
                    iArr[0] = i15;
                    iArr[1] = (int) ((i15 * f6) + 0.5f);
                    return;
                }
                return;
            }
            iArr[0] = (int) ((i16 * f6) + 0.5f);
            iArr[1] = i16;
            return;
        }
        int i17 = (int) ((i16 * f6) + 0.5f);
        int i18 = (int) ((i15 / f6) + 0.5f);
        if (i17 <= i15) {
            iArr[0] = i17;
            iArr[1] = i16;
        } else if (i18 <= i16) {
            iArr[0] = i15;
            iArr[1] = i18;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0244, code lost:
        if (r3 != 1) goto L119;
     */
    @Override // j1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(d dVar) {
        g gVar;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        float f6;
        float f10;
        float f11;
        if (AbstractC6708l.f(this.f36002j) != 3) {
            g gVar2 = this.f35997e;
            boolean z14 = gVar2.f35984j;
            f fVar = this.f36000h;
            f fVar2 = this.f36001i;
            if (!z14 && this.f35996d == 3) {
                i1.d dVar2 = this.f35994b;
                int i11 = dVar2.f32498j;
                if (i11 != 2) {
                    if (i11 == 3) {
                        int i12 = dVar2.f32499k;
                        if (i12 != 0 && i12 != 3) {
                            int i13 = dVar2.f32476M;
                            if (i13 != -1) {
                                if (i13 != 0) {
                                    if (i13 != 1) {
                                        i10 = 0;
                                        gVar2.d(i10);
                                    } else {
                                        f6 = dVar2.f32493e.f35997e.f35981g;
                                        f10 = dVar2.f32475L;
                                    }
                                } else {
                                    f11 = dVar2.f32493e.f35997e.f35981g / dVar2.f32475L;
                                    i10 = (int) (f11 + 0.5f);
                                    gVar2.d(i10);
                                }
                            } else {
                                f6 = dVar2.f32493e.f35997e.f35981g;
                                f10 = dVar2.f32475L;
                            }
                            f11 = f6 * f10;
                            i10 = (int) (f11 + 0.5f);
                            gVar2.d(i10);
                        } else {
                            l lVar = dVar2.f32493e;
                            f fVar3 = lVar.f36000h;
                            f fVar4 = lVar.f36001i;
                            if (dVar2.f32512x.f32460d != null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (dVar2.f32513y.f32460d != null) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (dVar2.f32514z.f32460d != null) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (dVar2.f32464A.f32460d != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            int i14 = dVar2.f32476M;
                            if (z10 && z11 && z12 && z13) {
                                float f12 = dVar2.f32475L;
                                boolean z15 = fVar3.f35984j;
                                int[] iArr = f35988k;
                                if (z15 && fVar4.f35984j) {
                                    if (fVar.f35977c && fVar2.f35977c) {
                                        m(iArr, ((f) fVar.f35986l.get(0)).f35981g + fVar.f35980f, ((f) fVar2.f35986l.get(0)).f35981g - fVar2.f35980f, fVar3.f35981g + fVar3.f35980f, fVar4.f35981g - fVar4.f35980f, f12, i14);
                                        gVar2.d(iArr[0]);
                                        this.f35994b.f32493e.f35997e.d(iArr[1]);
                                        return;
                                    }
                                    return;
                                }
                                boolean z16 = fVar.f35984j;
                                ArrayList arrayList = fVar3.f35986l;
                                if (z16 && fVar2.f35984j) {
                                    if (fVar3.f35977c && fVar4.f35977c) {
                                        m(iArr, fVar.f35981g + fVar.f35980f, fVar2.f35981g - fVar2.f35980f, ((f) arrayList.get(0)).f35981g + fVar3.f35980f, ((f) fVar4.f35986l.get(0)).f35981g - fVar4.f35980f, f12, i14);
                                        gVar2.d(iArr[0]);
                                        this.f35994b.f32493e.f35997e.d(iArr[1]);
                                    } else {
                                        return;
                                    }
                                }
                                if (fVar.f35977c && fVar2.f35977c && fVar3.f35977c && fVar4.f35977c) {
                                    m(iArr, ((f) fVar.f35986l.get(0)).f35981g + fVar.f35980f, ((f) fVar2.f35986l.get(0)).f35981g - fVar2.f35980f, ((f) arrayList.get(0)).f35981g + fVar3.f35980f, ((f) fVar4.f35986l.get(0)).f35981g - fVar4.f35980f, f12, i14);
                                    gVar2.d(iArr[0]);
                                    this.f35994b.f32493e.f35997e.d(iArr[1]);
                                } else {
                                    return;
                                }
                            } else if (z10 && z12) {
                                if (fVar.f35977c && fVar2.f35977c) {
                                    float f13 = dVar2.f32475L;
                                    int i15 = ((f) fVar.f35986l.get(0)).f35981g + fVar.f35980f;
                                    int i16 = ((f) fVar2.f35986l.get(0)).f35981g - fVar2.f35980f;
                                    if (i14 != -1 && i14 != 0) {
                                        if (i14 == 1) {
                                            int g10 = g(i16 - i15, 0);
                                            int i17 = (int) ((g10 / f13) + 0.5f);
                                            int g11 = g(i17, 1);
                                            if (i17 != g11) {
                                                g10 = (int) ((g11 * f13) + 0.5f);
                                            }
                                            gVar2.d(g10);
                                            this.f35994b.f32493e.f35997e.d(g11);
                                        }
                                    } else {
                                        int g12 = g(i16 - i15, 0);
                                        int i18 = (int) ((g12 * f13) + 0.5f);
                                        int g13 = g(i18, 1);
                                        if (i18 != g13) {
                                            g12 = (int) ((g13 / f13) + 0.5f);
                                        }
                                        gVar2.d(g12);
                                        this.f35994b.f32493e.f35997e.d(g13);
                                    }
                                } else {
                                    return;
                                }
                            } else if (z11 && z13) {
                                if (fVar3.f35977c && fVar4.f35977c) {
                                    float f14 = dVar2.f32475L;
                                    int i19 = ((f) fVar3.f35986l.get(0)).f35981g + fVar3.f35980f;
                                    int i20 = ((f) fVar4.f35986l.get(0)).f35981g - fVar4.f35980f;
                                    if (i14 != -1) {
                                        if (i14 == 0) {
                                            int g14 = g(i20 - i19, 1);
                                            int i21 = (int) ((g14 * f14) + 0.5f);
                                            int g15 = g(i21, 0);
                                            if (i21 != g15) {
                                                g14 = (int) ((g15 / f14) + 0.5f);
                                            }
                                            gVar2.d(g15);
                                            this.f35994b.f32493e.f35997e.d(g14);
                                        }
                                    }
                                    int g16 = g(i20 - i19, 1);
                                    int i22 = (int) ((g16 / f14) + 0.5f);
                                    int g17 = g(i22, 0);
                                    if (i22 != g17) {
                                        g16 = (int) ((g17 * f14) + 0.5f);
                                    }
                                    gVar2.d(g17);
                                    this.f35994b.f32493e.f35997e.d(g16);
                                } else {
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    i1.d dVar3 = dVar2.f32472I;
                    if (dVar3 != null) {
                        if (dVar3.f32492d.f35997e.f35984j) {
                            gVar2.d((int) ((gVar.f35981g * dVar2.f32503o) + 0.5f));
                        }
                    }
                }
            }
            if (fVar.f35977c && fVar2.f35977c) {
                if (fVar.f35984j && fVar2.f35984j && gVar2.f35984j) {
                    return;
                }
                if (!gVar2.f35984j && this.f35996d == 3) {
                    i1.d dVar4 = this.f35994b;
                    if (dVar4.f32498j == 0 && !dVar4.r()) {
                        int i23 = ((f) fVar.f35986l.get(0)).f35981g + fVar.f35980f;
                        int i24 = ((f) fVar2.f35986l.get(0)).f35981g + fVar2.f35980f;
                        fVar.d(i23);
                        fVar2.d(i24);
                        gVar2.d(i24 - i23);
                        return;
                    }
                }
                if (!gVar2.f35984j && this.f35996d == 3 && this.f35993a == 1 && fVar.f35986l.size() > 0 && fVar2.f35986l.size() > 0) {
                    int min = Math.min((((f) fVar2.f35986l.get(0)).f35981g + fVar2.f35980f) - (((f) fVar.f35986l.get(0)).f35981g + fVar.f35980f), gVar2.f35987m);
                    i1.d dVar5 = this.f35994b;
                    int i25 = dVar5.f32502n;
                    int max = Math.max(dVar5.f32501m, min);
                    if (i25 > 0) {
                        max = Math.min(i25, max);
                    }
                    gVar2.d(max);
                }
                if (!gVar2.f35984j) {
                    return;
                }
                f fVar5 = (f) fVar.f35986l.get(0);
                f fVar6 = (f) fVar2.f35986l.get(0);
                int i26 = fVar5.f35981g;
                int i27 = fVar.f35980f + i26;
                int i28 = fVar6.f35981g;
                int i29 = fVar2.f35980f + i28;
                float f15 = this.f35994b.S;
                if (fVar5 == fVar6) {
                    f15 = 0.5f;
                } else {
                    i26 = i27;
                    i28 = i29;
                }
                fVar.d((int) ((((i28 - i26) - gVar2.f35981g) * f15) + i26 + 0.5f));
                fVar2.d(fVar.f35981g + gVar2.f35981g);
                return;
            }
            return;
        }
        i1.d dVar6 = this.f35994b;
        l(dVar6.f32512x, dVar6.f32514z, 0);
    }

    @Override // j1.m
    public final void d() {
        i1.d dVar;
        i1.d dVar2;
        i1.d dVar3;
        i1.d dVar4;
        i1.d dVar5 = this.f35994b;
        boolean z10 = dVar5.f32486a;
        g gVar = this.f35997e;
        if (z10) {
            gVar.d(dVar5.m());
        }
        boolean z11 = gVar.f35984j;
        f fVar = this.f36001i;
        f fVar2 = this.f36000h;
        if (!z11) {
            i1.d dVar6 = this.f35994b;
            int i10 = dVar6.f32491c0[0];
            this.f35996d = i10;
            if (i10 != 3) {
                if (i10 == 4 && (((dVar4 = dVar6.f32472I) != null && dVar4.f32491c0[0] == 1) || dVar4.f32491c0[0] == 4)) {
                    int m10 = (dVar4.m() - this.f35994b.f32512x.c()) - this.f35994b.f32514z.c();
                    j jVar = dVar4.f32492d;
                    m.b(fVar2, jVar.f36000h, this.f35994b.f32512x.c());
                    m.b(fVar, jVar.f36001i, -this.f35994b.f32514z.c());
                    gVar.d(m10);
                    return;
                } else if (i10 == 1) {
                    gVar.d(dVar6.m());
                }
            }
        } else if (this.f35996d == 4 && (((dVar3 = (dVar2 = this.f35994b).f32472I) != null && dVar3.f32491c0[0] == 1) || dVar3.f32491c0[0] == 4)) {
            m.b(fVar2, dVar3.f32492d.f36000h, dVar2.f32512x.c());
            m.b(fVar, dVar3.f32492d.f36001i, -this.f35994b.f32514z.c());
            return;
        }
        if (gVar.f35984j) {
            i1.d dVar7 = this.f35994b;
            if (dVar7.f32486a) {
                C3458c[] c3458cArr = dVar7.f32469F;
                C3458c c3458c = c3458cArr[0];
                C3458c c3458c2 = c3458c.f32460d;
                if (c3458c2 != null && c3458cArr[1].f32460d != null) {
                    if (dVar7.r()) {
                        fVar2.f35980f = this.f35994b.f32469F[0].c();
                        fVar.f35980f = -this.f35994b.f32469F[1].c();
                        return;
                    }
                    f h10 = m.h(this.f35994b.f32469F[0]);
                    if (h10 != null) {
                        m.b(fVar2, h10, this.f35994b.f32469F[0].c());
                    }
                    f h11 = m.h(this.f35994b.f32469F[1]);
                    if (h11 != null) {
                        m.b(fVar, h11, -this.f35994b.f32469F[1].c());
                    }
                    fVar2.f35976b = true;
                    fVar.f35976b = true;
                    return;
                } else if (c3458c2 != null) {
                    f h12 = m.h(c3458c);
                    if (h12 != null) {
                        m.b(fVar2, h12, this.f35994b.f32469F[0].c());
                        m.b(fVar, fVar2, gVar.f35981g);
                        return;
                    }
                    return;
                } else {
                    C3458c c3458c3 = c3458cArr[1];
                    if (c3458c3.f32460d != null) {
                        f h13 = m.h(c3458c3);
                        if (h13 != null) {
                            m.b(fVar, h13, -this.f35994b.f32469F[1].c());
                            m.b(fVar2, fVar, -gVar.f35981g);
                            return;
                        }
                        return;
                    } else if (!(dVar7 instanceof i1.i) && dVar7.f32472I != null && dVar7.h(7).f32460d == null) {
                        i1.d dVar8 = this.f35994b;
                        m.b(fVar2, dVar8.f32472I.f32492d.f36000h, dVar8.n());
                        m.b(fVar, fVar2, gVar.f35981g);
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
        if (this.f35996d == 3) {
            i1.d dVar9 = this.f35994b;
            int i11 = dVar9.f32498j;
            if (i11 != 2) {
                if (i11 == 3) {
                    if (dVar9.f32499k == 3) {
                        fVar2.f35975a = this;
                        fVar.f35975a = this;
                        l lVar = dVar9.f32493e;
                        lVar.f36000h.f35975a = this;
                        lVar.f36001i.f35975a = this;
                        gVar.f35975a = this;
                        if (dVar9.s()) {
                            gVar.f35986l.add(this.f35994b.f32493e.f35997e);
                            this.f35994b.f32493e.f35997e.f35985k.add(gVar);
                            l lVar2 = this.f35994b.f32493e;
                            lVar2.f35997e.f35975a = this;
                            gVar.f35986l.add(lVar2.f36000h);
                            gVar.f35986l.add(this.f35994b.f32493e.f36001i);
                            this.f35994b.f32493e.f36000h.f35985k.add(gVar);
                            this.f35994b.f32493e.f36001i.f35985k.add(gVar);
                        } else if (this.f35994b.r()) {
                            this.f35994b.f32493e.f35997e.f35986l.add(gVar);
                            gVar.f35985k.add(this.f35994b.f32493e.f35997e);
                        } else {
                            this.f35994b.f32493e.f35997e.f35986l.add(gVar);
                        }
                    } else {
                        g gVar2 = dVar9.f32493e.f35997e;
                        gVar.f35986l.add(gVar2);
                        gVar2.f35985k.add(gVar);
                        this.f35994b.f32493e.f36000h.f35985k.add(gVar);
                        this.f35994b.f32493e.f36001i.f35985k.add(gVar);
                        gVar.f35976b = true;
                        gVar.f35985k.add(fVar2);
                        gVar.f35985k.add(fVar);
                        fVar2.f35986l.add(gVar);
                        fVar.f35986l.add(gVar);
                    }
                }
            } else {
                i1.d dVar10 = dVar9.f32472I;
                if (dVar10 != null) {
                    g gVar3 = dVar10.f32493e.f35997e;
                    gVar.f35986l.add(gVar3);
                    gVar3.f35985k.add(gVar);
                    gVar.f35976b = true;
                    gVar.f35985k.add(fVar2);
                    gVar.f35985k.add(fVar);
                }
            }
        }
        i1.d dVar11 = this.f35994b;
        C3458c[] c3458cArr2 = dVar11.f32469F;
        C3458c c3458c4 = c3458cArr2[0];
        C3458c c3458c5 = c3458c4.f32460d;
        if (c3458c5 != null && c3458cArr2[1].f32460d != null) {
            if (dVar11.r()) {
                fVar2.f35980f = this.f35994b.f32469F[0].c();
                fVar.f35980f = -this.f35994b.f32469F[1].c();
                return;
            }
            f h14 = m.h(this.f35994b.f32469F[0]);
            f h15 = m.h(this.f35994b.f32469F[1]);
            h14.b(this);
            h15.b(this);
            this.f36002j = 4;
        } else if (c3458c5 != null) {
            f h16 = m.h(c3458c4);
            if (h16 != null) {
                m.b(fVar2, h16, this.f35994b.f32469F[0].c());
                c(fVar, fVar2, 1, gVar);
            }
        } else {
            C3458c c3458c6 = c3458cArr2[1];
            if (c3458c6.f32460d != null) {
                f h17 = m.h(c3458c6);
                if (h17 != null) {
                    m.b(fVar, h17, -this.f35994b.f32469F[1].c());
                    c(fVar2, fVar, -1, gVar);
                }
            } else if (!(dVar11 instanceof i1.i) && (dVar = dVar11.f32472I) != null) {
                m.b(fVar2, dVar.f32492d.f36000h, dVar11.n());
                c(fVar, fVar2, 1, gVar);
            }
        }
    }

    @Override // j1.m
    public final void e() {
        f fVar = this.f36000h;
        if (fVar.f35984j) {
            this.f35994b.f32477N = fVar.f35981g;
        }
    }

    @Override // j1.m
    public final void f() {
        this.f35995c = null;
        this.f36000h.c();
        this.f36001i.c();
        this.f35997e.c();
        this.f35999g = false;
    }

    @Override // j1.m
    public final boolean k() {
        if (this.f35996d != 3 || this.f35994b.f32498j == 0) {
            return true;
        }
        return false;
    }

    public final void n() {
        this.f35999g = false;
        f fVar = this.f36000h;
        fVar.c();
        fVar.f35984j = false;
        f fVar2 = this.f36001i;
        fVar2.c();
        fVar2.f35984j = false;
        this.f35997e.f35984j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f35994b.f32482W;
    }
}
