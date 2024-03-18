package j1;

import i1.C3458c;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public final class l extends m {

    /* renamed from: k  reason: collision with root package name */
    public f f35991k;

    /* renamed from: l  reason: collision with root package name */
    public C3898a f35992l;

    @Override // j1.d
    public final void a(d dVar) {
        g gVar;
        int i10;
        float f6;
        float f10;
        float f11;
        if (AbstractC6708l.f(this.f36002j) != 3) {
            g gVar2 = this.f35997e;
            if (gVar2.f35977c && !gVar2.f35984j && this.f35996d == 3) {
                i1.d dVar2 = this.f35994b;
                int i11 = dVar2.f32499k;
                if (i11 != 2) {
                    if (i11 == 3) {
                        g gVar3 = dVar2.f32492d.f35997e;
                        if (gVar3.f35984j) {
                            int i12 = dVar2.f32476M;
                            if (i12 != -1) {
                                if (i12 != 0) {
                                    if (i12 != 1) {
                                        i10 = 0;
                                        gVar2.d(i10);
                                    } else {
                                        f6 = gVar3.f35981g;
                                        f10 = dVar2.f32475L;
                                    }
                                } else {
                                    f11 = gVar3.f35981g * dVar2.f32475L;
                                    i10 = (int) (f11 + 0.5f);
                                    gVar2.d(i10);
                                }
                            } else {
                                f6 = gVar3.f35981g;
                                f10 = dVar2.f32475L;
                            }
                            f11 = f6 / f10;
                            i10 = (int) (f11 + 0.5f);
                            gVar2.d(i10);
                        }
                    }
                } else {
                    i1.d dVar3 = dVar2.f32472I;
                    if (dVar3 != null) {
                        if (dVar3.f32493e.f35997e.f35984j) {
                            gVar2.d((int) ((gVar.f35981g * dVar2.f32506r) + 0.5f));
                        }
                    }
                }
            }
            f fVar = this.f36000h;
            if (fVar.f35977c) {
                f fVar2 = this.f36001i;
                if (fVar2.f35977c) {
                    if (fVar.f35984j && fVar2.f35984j && gVar2.f35984j) {
                        return;
                    }
                    if (!gVar2.f35984j && this.f35996d == 3) {
                        i1.d dVar4 = this.f35994b;
                        if (dVar4.f32498j == 0 && !dVar4.s()) {
                            int i13 = ((f) fVar.f35986l.get(0)).f35981g + fVar.f35980f;
                            int i14 = ((f) fVar2.f35986l.get(0)).f35981g + fVar2.f35980f;
                            fVar.d(i13);
                            fVar2.d(i14);
                            gVar2.d(i14 - i13);
                            return;
                        }
                    }
                    if (!gVar2.f35984j && this.f35996d == 3 && this.f35993a == 1 && fVar.f35986l.size() > 0 && fVar2.f35986l.size() > 0) {
                        int i15 = (((f) fVar2.f35986l.get(0)).f35981g + fVar2.f35980f) - (((f) fVar.f35986l.get(0)).f35981g + fVar.f35980f);
                        int i16 = gVar2.f35987m;
                        if (i15 < i16) {
                            gVar2.d(i15);
                        } else {
                            gVar2.d(i16);
                        }
                    }
                    if (gVar2.f35984j && fVar.f35986l.size() > 0 && fVar2.f35986l.size() > 0) {
                        f fVar3 = (f) fVar.f35986l.get(0);
                        f fVar4 = (f) fVar2.f35986l.get(0);
                        int i17 = fVar3.f35981g;
                        int i18 = fVar.f35980f + i17;
                        int i19 = fVar4.f35981g;
                        int i20 = fVar2.f35980f + i19;
                        float f12 = this.f35994b.T;
                        if (fVar3 == fVar4) {
                            f12 = 0.5f;
                        } else {
                            i17 = i18;
                            i19 = i20;
                        }
                        fVar.d((int) ((((i19 - i17) - gVar2.f35981g) * f12) + i17 + 0.5f));
                        fVar2.d(fVar.f35981g + gVar2.f35981g);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        i1.d dVar5 = this.f35994b;
        l(dVar5.f32513y, dVar5.f32464A, 1);
    }

    /* JADX WARN: Type inference failed for: r0v123, types: [j1.g, j1.a] */
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
            gVar.d(dVar5.j());
        }
        boolean z11 = gVar.f35984j;
        f fVar = this.f36001i;
        f fVar2 = this.f36000h;
        if (!z11) {
            i1.d dVar6 = this.f35994b;
            this.f35996d = dVar6.f32491c0[1];
            if (dVar6.f32511w) {
                this.f35992l = new g(this);
            }
            int i10 = this.f35996d;
            if (i10 != 3) {
                if (i10 == 4 && (dVar4 = this.f35994b.f32472I) != null && dVar4.f32491c0[1] == 1) {
                    int j6 = (dVar4.j() - this.f35994b.f32513y.c()) - this.f35994b.f32464A.c();
                    l lVar = dVar4.f32493e;
                    m.b(fVar2, lVar.f36000h, this.f35994b.f32513y.c());
                    m.b(fVar, lVar.f36001i, -this.f35994b.f32464A.c());
                    gVar.d(j6);
                    return;
                } else if (i10 == 1) {
                    gVar.d(this.f35994b.j());
                }
            }
        } else if (this.f35996d == 4 && (dVar3 = (dVar2 = this.f35994b).f32472I) != null && dVar3.f32491c0[1] == 1) {
            l lVar2 = dVar3.f32493e;
            m.b(fVar2, lVar2.f36000h, dVar2.f32513y.c());
            m.b(fVar, lVar2.f36001i, -this.f35994b.f32464A.c());
            return;
        }
        boolean z12 = gVar.f35984j;
        f fVar3 = this.f35991k;
        if (z12) {
            i1.d dVar7 = this.f35994b;
            if (dVar7.f32486a) {
                C3458c[] c3458cArr = dVar7.f32469F;
                C3458c c3458c = c3458cArr[2];
                C3458c c3458c2 = c3458c.f32460d;
                if (c3458c2 != null && c3458cArr[3].f32460d != null) {
                    if (dVar7.s()) {
                        fVar2.f35980f = this.f35994b.f32469F[2].c();
                        fVar.f35980f = -this.f35994b.f32469F[3].c();
                    } else {
                        f h10 = m.h(this.f35994b.f32469F[2]);
                        if (h10 != null) {
                            m.b(fVar2, h10, this.f35994b.f32469F[2].c());
                        }
                        f h11 = m.h(this.f35994b.f32469F[3]);
                        if (h11 != null) {
                            m.b(fVar, h11, -this.f35994b.f32469F[3].c());
                        }
                        fVar2.f35976b = true;
                        fVar.f35976b = true;
                    }
                    i1.d dVar8 = this.f35994b;
                    if (dVar8.f32511w) {
                        m.b(fVar3, fVar2, dVar8.P);
                        return;
                    }
                    return;
                } else if (c3458c2 != null) {
                    f h12 = m.h(c3458c);
                    if (h12 != null) {
                        m.b(fVar2, h12, this.f35994b.f32469F[2].c());
                        m.b(fVar, fVar2, gVar.f35981g);
                        i1.d dVar9 = this.f35994b;
                        if (dVar9.f32511w) {
                            m.b(fVar3, fVar2, dVar9.P);
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    C3458c c3458c3 = c3458cArr[3];
                    if (c3458c3.f32460d != null) {
                        f h13 = m.h(c3458c3);
                        if (h13 != null) {
                            m.b(fVar, h13, -this.f35994b.f32469F[3].c());
                            m.b(fVar2, fVar, -gVar.f35981g);
                        }
                        i1.d dVar10 = this.f35994b;
                        if (dVar10.f32511w) {
                            m.b(fVar3, fVar2, dVar10.P);
                            return;
                        }
                        return;
                    }
                    C3458c c3458c4 = c3458cArr[4];
                    if (c3458c4.f32460d != null) {
                        f h14 = m.h(c3458c4);
                        if (h14 != null) {
                            m.b(fVar3, h14, 0);
                            m.b(fVar2, fVar3, -this.f35994b.P);
                            m.b(fVar, fVar2, gVar.f35981g);
                            return;
                        }
                        return;
                    } else if (!(dVar7 instanceof i1.i) && dVar7.f32472I != null && dVar7.h(7).f32460d == null) {
                        i1.d dVar11 = this.f35994b;
                        m.b(fVar2, dVar11.f32472I.f32493e.f36000h, dVar11.o());
                        m.b(fVar, fVar2, gVar.f35981g);
                        i1.d dVar12 = this.f35994b;
                        if (dVar12.f32511w) {
                            m.b(fVar3, fVar2, dVar12.P);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
        if (!z12 && this.f35996d == 3) {
            i1.d dVar13 = this.f35994b;
            int i11 = dVar13.f32499k;
            if (i11 != 2) {
                if (i11 == 3 && !dVar13.s()) {
                    i1.d dVar14 = this.f35994b;
                    if (dVar14.f32498j != 3) {
                        g gVar2 = dVar14.f32492d.f35997e;
                        gVar.f35986l.add(gVar2);
                        gVar2.f35985k.add(gVar);
                        gVar.f35976b = true;
                        gVar.f35985k.add(fVar2);
                        gVar.f35985k.add(fVar);
                    }
                }
            } else {
                i1.d dVar15 = dVar13.f32472I;
                if (dVar15 != null) {
                    g gVar3 = dVar15.f32493e.f35997e;
                    gVar.f35986l.add(gVar3);
                    gVar3.f35985k.add(gVar);
                    gVar.f35976b = true;
                    gVar.f35985k.add(fVar2);
                    gVar.f35985k.add(fVar);
                }
            }
        } else {
            gVar.b(this);
        }
        i1.d dVar16 = this.f35994b;
        C3458c[] c3458cArr2 = dVar16.f32469F;
        C3458c c3458c5 = c3458cArr2[2];
        C3458c c3458c6 = c3458c5.f32460d;
        if (c3458c6 != null && c3458cArr2[3].f32460d != null) {
            if (dVar16.s()) {
                fVar2.f35980f = this.f35994b.f32469F[2].c();
                fVar.f35980f = -this.f35994b.f32469F[3].c();
            } else {
                f h15 = m.h(this.f35994b.f32469F[2]);
                f h16 = m.h(this.f35994b.f32469F[3]);
                h15.b(this);
                h16.b(this);
                this.f36002j = 4;
            }
            if (this.f35994b.f32511w) {
                c(fVar3, fVar2, 1, this.f35992l);
            }
        } else if (c3458c6 != null) {
            f h17 = m.h(c3458c5);
            if (h17 != null) {
                m.b(fVar2, h17, this.f35994b.f32469F[2].c());
                c(fVar, fVar2, 1, gVar);
                if (this.f35994b.f32511w) {
                    c(fVar3, fVar2, 1, this.f35992l);
                }
                if (this.f35996d == 3) {
                    i1.d dVar17 = this.f35994b;
                    if (dVar17.f32475L > 0.0f) {
                        j jVar = dVar17.f32492d;
                        if (jVar.f35996d == 3) {
                            jVar.f35997e.f35985k.add(gVar);
                            gVar.f35986l.add(this.f35994b.f32492d.f35997e);
                            gVar.f35975a = this;
                        }
                    }
                }
            }
        } else {
            C3458c c3458c7 = c3458cArr2[3];
            if (c3458c7.f32460d != null) {
                f h18 = m.h(c3458c7);
                if (h18 != null) {
                    m.b(fVar, h18, -this.f35994b.f32469F[3].c());
                    c(fVar2, fVar, -1, gVar);
                    if (this.f35994b.f32511w) {
                        c(fVar3, fVar2, 1, this.f35992l);
                    }
                }
            } else {
                C3458c c3458c8 = c3458cArr2[4];
                if (c3458c8.f32460d != null) {
                    f h19 = m.h(c3458c8);
                    if (h19 != null) {
                        m.b(fVar3, h19, 0);
                        c(fVar2, fVar3, -1, this.f35992l);
                        c(fVar, fVar2, 1, gVar);
                    }
                } else if (!(dVar16 instanceof i1.i) && (dVar = dVar16.f32472I) != null) {
                    m.b(fVar2, dVar.f32493e.f36000h, dVar16.o());
                    c(fVar, fVar2, 1, gVar);
                    if (this.f35994b.f32511w) {
                        c(fVar3, fVar2, 1, this.f35992l);
                    }
                    if (this.f35996d == 3) {
                        i1.d dVar18 = this.f35994b;
                        if (dVar18.f32475L > 0.0f) {
                            j jVar2 = dVar18.f32492d;
                            if (jVar2.f35996d == 3) {
                                jVar2.f35997e.f35985k.add(gVar);
                                gVar.f35986l.add(this.f35994b.f32492d.f35997e);
                                gVar.f35975a = this;
                            }
                        }
                    }
                }
            }
        }
        if (gVar.f35986l.size() == 0) {
            gVar.f35977c = true;
        }
    }

    @Override // j1.m
    public final void e() {
        f fVar = this.f36000h;
        if (fVar.f35984j) {
            this.f35994b.f32478O = fVar.f35981g;
        }
    }

    @Override // j1.m
    public final void f() {
        this.f35995c = null;
        this.f36000h.c();
        this.f36001i.c();
        this.f35991k.c();
        this.f35997e.c();
        this.f35999g = false;
    }

    @Override // j1.m
    public final boolean k() {
        if (this.f35996d != 3 || this.f35994b.f32499k == 0) {
            return true;
        }
        return false;
    }

    public final void m() {
        this.f35999g = false;
        f fVar = this.f36000h;
        fVar.c();
        fVar.f35984j = false;
        f fVar2 = this.f36001i;
        fVar2.c();
        fVar2.f35984j = false;
        f fVar3 = this.f35991k;
        fVar3.c();
        fVar3.f35984j = false;
        this.f35997e.f35984j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f35994b.f32482W;
    }
}
