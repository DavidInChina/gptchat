package i1;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public int f32530a;

    /* renamed from: d  reason: collision with root package name */
    public C3458c f32533d;

    /* renamed from: e  reason: collision with root package name */
    public C3458c f32534e;

    /* renamed from: f  reason: collision with root package name */
    public C3458c f32535f;

    /* renamed from: g  reason: collision with root package name */
    public C3458c f32536g;

    /* renamed from: h  reason: collision with root package name */
    public int f32537h;

    /* renamed from: i  reason: collision with root package name */
    public int f32538i;

    /* renamed from: j  reason: collision with root package name */
    public int f32539j;

    /* renamed from: k  reason: collision with root package name */
    public int f32540k;

    /* renamed from: q  reason: collision with root package name */
    public int f32546q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ g f32547r;

    /* renamed from: b  reason: collision with root package name */
    public d f32531b = null;

    /* renamed from: c  reason: collision with root package name */
    public int f32532c = 0;

    /* renamed from: l  reason: collision with root package name */
    public int f32541l = 0;

    /* renamed from: m  reason: collision with root package name */
    public int f32542m = 0;

    /* renamed from: n  reason: collision with root package name */
    public int f32543n = 0;

    /* renamed from: o  reason: collision with root package name */
    public int f32544o = 0;

    /* renamed from: p  reason: collision with root package name */
    public int f32545p = 0;

    public f(g gVar, int i10, C3458c c3458c, C3458c c3458c2, C3458c c3458c3, C3458c c3458c4, int i11) {
        this.f32547r = gVar;
        this.f32537h = 0;
        this.f32538i = 0;
        this.f32539j = 0;
        this.f32540k = 0;
        this.f32546q = 0;
        this.f32530a = i10;
        this.f32533d = c3458c;
        this.f32534e = c3458c2;
        this.f32535f = c3458c3;
        this.f32536g = c3458c4;
        this.f32537h = gVar.f32567j0;
        this.f32538i = gVar.f32563f0;
        this.f32539j = gVar.f32568k0;
        this.f32540k = gVar.f32564g0;
        this.f32546q = i11;
    }

    public final void a(d dVar) {
        int i10 = this.f32530a;
        int i11 = 0;
        g gVar = this.f32547r;
        if (i10 == 0) {
            int D6 = gVar.D(dVar, this.f32546q);
            if (dVar.f32491c0[0] == 3) {
                this.f32545p++;
                D6 = 0;
            }
            int i12 = gVar.f32550C0;
            if (dVar.f32481V != 8) {
                i11 = i12;
            }
            this.f32541l = D6 + i11 + this.f32541l;
            int C10 = gVar.C(dVar, this.f32546q);
            if (this.f32531b == null || this.f32532c < C10) {
                this.f32531b = dVar;
                this.f32532c = C10;
                this.f32542m = C10;
            }
        } else {
            int D10 = gVar.D(dVar, this.f32546q);
            int C11 = gVar.C(dVar, this.f32546q);
            if (dVar.f32491c0[1] == 3) {
                this.f32545p++;
                C11 = 0;
            }
            int i13 = gVar.f32551D0;
            if (dVar.f32481V != 8) {
                i11 = i13;
            }
            this.f32542m = C11 + i11 + this.f32542m;
            if (this.f32531b == null || this.f32532c < D10) {
                this.f32531b = dVar;
                this.f32532c = D10;
                this.f32541l = D10;
            }
        }
        this.f32544o++;
    }

    public final void b(int i10, boolean z10, boolean z11) {
        g gVar;
        boolean z12;
        int i11;
        int i12;
        d dVar;
        int i13;
        char c10;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21 = this.f32544o;
        int i22 = 0;
        while (true) {
            gVar = this.f32547r;
            if (i22 >= i21 || (i20 = this.f32543n + i22) >= gVar.f32562O0) {
                break;
            }
            d dVar2 = gVar.f32561N0[i20];
            if (dVar2 != null) {
                dVar2.u();
            }
            i22++;
        }
        if (i21 != 0 && this.f32531b != null) {
            if (z11 && i10 == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            int i23 = -1;
            int i24 = -1;
            for (int i25 = 0; i25 < i21; i25++) {
                if (z10) {
                    i19 = (i21 - 1) - i25;
                } else {
                    i19 = i25;
                }
                int i26 = this.f32543n + i19;
                if (i26 >= gVar.f32562O0) {
                    break;
                }
                if (gVar.f32561N0[i26].f32481V == 0) {
                    if (i23 == -1) {
                        i23 = i25;
                    }
                    i24 = i25;
                }
            }
            if (this.f32530a == 0) {
                d dVar3 = this.f32531b;
                dVar3.f32484Y = gVar.f32575r0;
                int i27 = this.f32538i;
                if (i10 > 0) {
                    i27 += gVar.f32551D0;
                }
                C3458c c3458c = this.f32534e;
                C3458c c3458c2 = dVar3.f32513y;
                c3458c2.a(c3458c, i27);
                C3458c c3458c3 = dVar3.f32464A;
                if (z11) {
                    c3458c3.a(this.f32536g, this.f32540k);
                }
                if (i10 > 0) {
                    this.f32534e.f32458b.f32464A.a(c3458c2, 0);
                }
                if (gVar.f32553F0 == 3 && !dVar3.f32511w) {
                    for (int i28 = 0; i28 < i21; i28++) {
                        if (z10) {
                            i18 = (i21 - 1) - i28;
                        } else {
                            i18 = i28;
                        }
                        int i29 = this.f32543n + i18;
                        if (i29 >= gVar.f32562O0) {
                            break;
                        }
                        dVar = gVar.f32561N0[i29];
                        if (dVar.f32511w) {
                            break;
                        }
                    }
                }
                dVar = dVar3;
                int i30 = 0;
                d dVar4 = null;
                while (i30 < i21) {
                    if (z10) {
                        i13 = (i21 - 1) - i30;
                    } else {
                        i13 = i30;
                    }
                    int i31 = this.f32543n + i13;
                    if (i31 < gVar.f32562O0) {
                        d dVar5 = gVar.f32561N0[i31];
                        if (i30 == 0) {
                            dVar5.f(dVar5.f32512x, this.f32533d, this.f32537h);
                        }
                        if (i13 == 0) {
                            int i32 = gVar.f32574q0;
                            float f6 = gVar.f32580w0;
                            if (this.f32543n == 0) {
                                i17 = gVar.f32576s0;
                                i15 = i32;
                                i16 = -1;
                                if (i17 != -1) {
                                    f6 = gVar.f32582y0;
                                    i14 = i17;
                                    dVar5.f32483X = i14;
                                    dVar5.S = f6;
                                }
                            } else {
                                i15 = i32;
                                i16 = -1;
                            }
                            if (z11 && (i17 = gVar.f32578u0) != i16) {
                                f6 = gVar.f32548A0;
                                i14 = i17;
                                dVar5.f32483X = i14;
                                dVar5.S = f6;
                            } else {
                                i14 = i15;
                                dVar5.f32483X = i14;
                                dVar5.S = f6;
                            }
                        }
                        if (i30 == i21 - 1) {
                            dVar5.f(dVar5.f32514z, this.f32535f, this.f32539j);
                        }
                        if (dVar4 != null) {
                            C3458c c3458c4 = dVar5.f32512x;
                            int i33 = gVar.f32550C0;
                            C3458c c3458c5 = dVar4.f32514z;
                            c3458c4.a(c3458c5, i33);
                            C3458c c3458c6 = dVar5.f32512x;
                            if (i30 == i23) {
                                int i34 = this.f32537h;
                                if (c3458c6.f()) {
                                    c3458c6.f32462f = i34;
                                }
                            }
                            c3458c5.a(c3458c6, 0);
                            if (i30 == i24 + 1) {
                                int i35 = this.f32539j;
                                if (c3458c5.f()) {
                                    c3458c5.f32462f = i35;
                                }
                            }
                        }
                        if (dVar5 != dVar3) {
                            int i36 = gVar.f32553F0;
                            c10 = 3;
                            if (i36 == 3 && dVar.f32511w && dVar5 != dVar && dVar5.f32511w) {
                                dVar5.f32465B.a(dVar.f32465B, 0);
                            } else if (i36 != 0) {
                                if (i36 != 1) {
                                    if (z12) {
                                        dVar5.f32513y.a(this.f32534e, this.f32538i);
                                        dVar5.f32464A.a(this.f32536g, this.f32540k);
                                    } else {
                                        dVar5.f32513y.a(c3458c2, 0);
                                        dVar5.f32464A.a(c3458c3, 0);
                                    }
                                } else {
                                    dVar5.f32464A.a(c3458c3, 0);
                                }
                            } else {
                                dVar5.f32513y.a(c3458c2, 0);
                            }
                        } else {
                            c10 = 3;
                        }
                        i30++;
                        dVar4 = dVar5;
                    } else {
                        return;
                    }
                }
                return;
            }
            d dVar6 = this.f32531b;
            dVar6.f32483X = gVar.f32574q0;
            int i37 = this.f32537h;
            if (i10 > 0) {
                i37 += gVar.f32550C0;
            }
            C3458c c3458c7 = dVar6.f32512x;
            C3458c c3458c8 = dVar6.f32514z;
            if (z10) {
                c3458c8.a(this.f32535f, i37);
                if (z11) {
                    c3458c7.a(this.f32533d, this.f32539j);
                }
                if (i10 > 0) {
                    this.f32535f.f32458b.f32512x.a(c3458c8, 0);
                }
            } else {
                c3458c7.a(this.f32533d, i37);
                if (z11) {
                    c3458c8.a(this.f32535f, this.f32539j);
                }
                if (i10 > 0) {
                    this.f32533d.f32458b.f32514z.a(c3458c7, 0);
                }
            }
            int i38 = 0;
            d dVar7 = null;
            while (i38 < i21) {
                int i39 = this.f32543n + i38;
                if (i39 < gVar.f32562O0) {
                    d dVar8 = gVar.f32561N0[i39];
                    if (i38 == 0) {
                        dVar8.f(dVar8.f32513y, this.f32534e, this.f32538i);
                        int i40 = gVar.f32575r0;
                        float f10 = gVar.f32581x0;
                        if (this.f32543n == 0) {
                            i12 = gVar.f32577t0;
                            i11 = -1;
                            if (i12 != -1) {
                                f10 = gVar.f32583z0;
                                i40 = i12;
                                dVar8.f32484Y = i40;
                                dVar8.T = f10;
                            }
                        } else {
                            i11 = -1;
                        }
                        if (z11 && (i12 = gVar.f32579v0) != i11) {
                            f10 = gVar.f32549B0;
                            i40 = i12;
                        }
                        dVar8.f32484Y = i40;
                        dVar8.T = f10;
                    }
                    if (i38 == i21 - 1) {
                        dVar8.f(dVar8.f32464A, this.f32536g, this.f32540k);
                    }
                    if (dVar7 != null) {
                        C3458c c3458c9 = dVar8.f32513y;
                        int i41 = gVar.f32551D0;
                        C3458c c3458c10 = dVar7.f32464A;
                        c3458c9.a(c3458c10, i41);
                        C3458c c3458c11 = dVar8.f32513y;
                        if (i38 == i23) {
                            int i42 = this.f32538i;
                            if (c3458c11.f()) {
                                c3458c11.f32462f = i42;
                            }
                        }
                        c3458c10.a(c3458c11, 0);
                        if (i38 == i24 + 1) {
                            int i43 = this.f32540k;
                            if (c3458c10.f()) {
                                c3458c10.f32462f = i43;
                            }
                        }
                    }
                    if (dVar8 != dVar6) {
                        if (z10) {
                            int i44 = gVar.f32552E0;
                            if (i44 != 0) {
                                if (i44 != 1) {
                                    if (i44 == 2) {
                                        dVar8.f32512x.a(c3458c7, 0);
                                        dVar8.f32514z.a(c3458c8, 0);
                                    }
                                } else {
                                    dVar8.f32512x.a(c3458c7, 0);
                                }
                            } else {
                                dVar8.f32514z.a(c3458c8, 0);
                            }
                        } else {
                            int i45 = gVar.f32552E0;
                            if (i45 != 0) {
                                if (i45 != 1) {
                                    if (i45 == 2) {
                                        if (z12) {
                                            dVar8.f32512x.a(this.f32533d, this.f32537h);
                                            dVar8.f32514z.a(this.f32535f, this.f32539j);
                                        } else {
                                            dVar8.f32512x.a(c3458c7, 0);
                                            dVar8.f32514z.a(c3458c8, 0);
                                        }
                                    }
                                } else {
                                    dVar8.f32514z.a(c3458c8, 0);
                                }
                            } else {
                                dVar8.f32512x.a(c3458c7, 0);
                            }
                            i38++;
                            dVar7 = dVar8;
                        }
                    }
                    i38++;
                    dVar7 = dVar8;
                } else {
                    return;
                }
            }
        }
    }

    public final int c() {
        if (this.f32530a == 1) {
            return this.f32542m - this.f32547r.f32551D0;
        }
        return this.f32542m;
    }

    public final int d() {
        if (this.f32530a == 0) {
            return this.f32541l - this.f32547r.f32550C0;
        }
        return this.f32541l;
    }

    public final void e(int i10) {
        g gVar;
        int i11;
        int i12 = this.f32545p;
        if (i12 == 0) {
            return;
        }
        int i13 = this.f32544o;
        int i14 = i10 / i12;
        int i15 = 0;
        while (true) {
            gVar = this.f32547r;
            if (i15 >= i13 || (i11 = this.f32543n + i15) >= gVar.f32562O0) {
                break;
            }
            d dVar = gVar.f32561N0[i11];
            if (this.f32530a == 0) {
                if (dVar != null) {
                    int[] iArr = dVar.f32491c0;
                    if (iArr[0] == 3 && dVar.f32498j == 0) {
                        gVar.E(dVar, 1, i14, iArr[1], dVar.j());
                    }
                }
            } else if (dVar != null) {
                int[] iArr2 = dVar.f32491c0;
                if (iArr2[1] == 3 && dVar.f32499k == 0) {
                    gVar.E(dVar, iArr2[0], dVar.m(), 1, i14);
                }
            }
            i15++;
        }
        this.f32541l = 0;
        this.f32542m = 0;
        this.f32531b = null;
        this.f32532c = 0;
        int i16 = this.f32544o;
        for (int i17 = 0; i17 < i16; i17++) {
            int i18 = this.f32543n + i17;
            if (i18 < gVar.f32562O0) {
                d dVar2 = gVar.f32561N0[i18];
                if (this.f32530a == 0) {
                    int m10 = dVar2.m();
                    int i19 = gVar.f32550C0;
                    if (dVar2.f32481V == 8) {
                        i19 = 0;
                    }
                    this.f32541l = m10 + i19 + this.f32541l;
                    int C10 = gVar.C(dVar2, this.f32546q);
                    if (this.f32531b == null || this.f32532c < C10) {
                        this.f32531b = dVar2;
                        this.f32532c = C10;
                        this.f32542m = C10;
                    }
                } else {
                    int D6 = gVar.D(dVar2, this.f32546q);
                    int C11 = gVar.C(dVar2, this.f32546q);
                    int i20 = gVar.f32551D0;
                    if (dVar2.f32481V == 8) {
                        i20 = 0;
                    }
                    this.f32542m = C11 + i20 + this.f32542m;
                    if (this.f32531b == null || this.f32532c < D6) {
                        this.f32531b = dVar2;
                        this.f32532c = D6;
                        this.f32541l = D6;
                    }
                }
            } else {
                return;
            }
        }
    }

    public final void f(int i10, C3458c c3458c, C3458c c3458c2, C3458c c3458c3, C3458c c3458c4, int i11, int i12, int i13, int i14, int i15) {
        this.f32530a = i10;
        this.f32533d = c3458c;
        this.f32534e = c3458c2;
        this.f32535f = c3458c3;
        this.f32536g = c3458c4;
        this.f32537h = i11;
        this.f32538i = i12;
        this.f32539j = i13;
        this.f32540k = i14;
        this.f32546q = i15;
    }
}
