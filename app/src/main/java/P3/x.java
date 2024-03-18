package p3;

/* loaded from: classes.dex */
public final class x implements I {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC5087j f42685a;

    /* renamed from: b  reason: collision with root package name */
    public final s2.t f42686b = new s2.t(new byte[10], 0);

    /* renamed from: c  reason: collision with root package name */
    public int f42687c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f42688d;

    /* renamed from: e  reason: collision with root package name */
    public s2.z f42689e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f42690f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f42691g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f42692h;

    /* renamed from: i  reason: collision with root package name */
    public int f42693i;

    /* renamed from: j  reason: collision with root package name */
    public int f42694j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f42695k;

    /* renamed from: l  reason: collision with root package name */
    public long f42696l;

    public x(AbstractC5087j abstractC5087j) {
        this.f42685a = abstractC5087j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // p3.I
    public final void a(int i10, s2.u uVar) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z10;
        Gi.e.o(this.f42689e);
        int i17 = i10 & 1;
        AbstractC5087j abstractC5087j = this.f42685a;
        int i18 = -1;
        int i19 = 3;
        int i20 = 2;
        ?? r92 = 0;
        if (i17 != 0) {
            int i21 = this.f42687c;
            if (i21 != 0 && i21 != 1) {
                if (i21 != 2) {
                    if (i21 == 3) {
                        if (this.f42694j != -1) {
                            s2.p.g("PesReader", "Unexpected start indicator: expected " + this.f42694j + " more bytes");
                        }
                        if (uVar.f45195c == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        abstractC5087j.e(z10);
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    s2.p.g("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            this.f42687c = 1;
            this.f42688d = 0;
        }
        int i22 = i10;
        while (uVar.a() > 0) {
            int i23 = this.f42687c;
            if (i23 != 0) {
                s2.t tVar = this.f42686b;
                if (i23 != 1) {
                    if (i23 != i20) {
                        if (i23 == i19) {
                            int a5 = uVar.a();
                            int i24 = this.f42694j;
                            if (i24 == i18) {
                                i16 = r92;
                            } else {
                                i16 = a5 - i24;
                            }
                            if (i16 > 0) {
                                a5 -= i16;
                                uVar.E(uVar.f45194b + a5);
                            }
                            abstractC5087j.b(uVar);
                            int i25 = this.f42694j;
                            if (i25 != i18) {
                                int i26 = i25 - a5;
                                this.f42694j = i26;
                                if (i26 == 0) {
                                    abstractC5087j.e(r92);
                                    this.f42687c = 1;
                                    int i27 = r92 == true ? 1 : 0;
                                    int i28 = r92 == true ? 1 : 0;
                                    int i29 = r92 == true ? 1 : 0;
                                    int i30 = r92 == true ? 1 : 0;
                                    this.f42688d = i27;
                                }
                            }
                            int i31 = i19;
                            i11 = i18;
                            i12 = i31;
                            int i32 = r92;
                            i13 = i20;
                            i14 = i32;
                        } else {
                            throw new IllegalStateException();
                        }
                    } else if (b(Math.min(10, this.f42693i), uVar, tVar.f45186b) && b(this.f42693i, uVar, null)) {
                        tVar.p(r92);
                        this.f42696l = -9223372036854775807L;
                        int i33 = 4;
                        if (this.f42690f) {
                            tVar.s(4);
                            tVar.s(1);
                            tVar.s(1);
                            long i34 = (tVar.i(i19) << 30) | (tVar.i(15) << 15) | tVar.i(15);
                            tVar.s(1);
                            if (!this.f42692h && this.f42691g) {
                                tVar.s(4);
                                tVar.s(1);
                                long i35 = tVar.i(15) << 15;
                                tVar.s(1);
                                tVar.s(1);
                                this.f42689e.b(i35 | (tVar.i(i19) << 30) | tVar.i(15));
                                this.f42692h = true;
                            }
                            this.f42696l = this.f42689e.b(i34);
                        }
                        if (!this.f42695k) {
                            i33 = 0;
                        }
                        i22 |= i33;
                        abstractC5087j.f(i22, this.f42696l);
                        this.f42687c = 3;
                        this.f42688d = 0;
                        r92 = 0;
                        i20 = 2;
                        i19 = 3;
                        i18 = -1;
                    } else {
                        i12 = i19;
                        i11 = -1;
                        int i36 = r92;
                        i13 = i20;
                        i14 = i36;
                    }
                } else {
                    i12 = i19;
                    int i37 = r92;
                    if (b(9, uVar, tVar.f45186b)) {
                        tVar.p(i37);
                        int i38 = tVar.i(24);
                        if (i38 != 1) {
                            android.gov.nist.core.a.v("Unexpected start code prefix: ", i38, "PesReader");
                            this.f42694j = -1;
                            i11 = -1;
                            i15 = 0;
                            i13 = 2;
                        } else {
                            tVar.s(8);
                            int i39 = tVar.i(16);
                            tVar.s(5);
                            this.f42695k = tVar.h();
                            i13 = 2;
                            tVar.s(2);
                            this.f42690f = tVar.h();
                            this.f42691g = tVar.h();
                            tVar.s(6);
                            int i40 = tVar.i(8);
                            this.f42693i = i40;
                            if (i39 == 0) {
                                this.f42694j = -1;
                                i11 = -1;
                            } else {
                                int i41 = (i39 - 3) - i40;
                                this.f42694j = i41;
                                if (i41 < 0) {
                                    s2.p.g("PesReader", "Found negative packet payload size: " + this.f42694j);
                                    i11 = -1;
                                    this.f42694j = -1;
                                } else {
                                    i11 = -1;
                                }
                            }
                            i15 = 2;
                        }
                        this.f42687c = i15;
                        i14 = 0;
                        this.f42688d = 0;
                    } else {
                        i14 = i37;
                        i11 = -1;
                        i13 = 2;
                    }
                }
            } else {
                int i42 = i19;
                i11 = i18;
                i12 = i42;
                int i43 = r92 == true ? 1 : 0;
                Object[] objArr = r92 == true ? 1 : 0;
                Object[] objArr2 = r92 == true ? 1 : 0;
                Object[] objArr3 = r92 == true ? 1 : 0;
                int i44 = i43;
                i13 = i20;
                i14 = i44;
                uVar.G(uVar.a());
            }
            int i45 = i11;
            i19 = i12;
            i18 = i45;
            int i46 = i13;
            r92 = i14;
            i20 = i46;
        }
    }

    public final boolean b(int i10, s2.u uVar, byte[] bArr) {
        int min = Math.min(uVar.a(), i10 - this.f42688d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            uVar.G(min);
        } else {
            uVar.e(bArr, this.f42688d, min);
        }
        int i11 = this.f42688d + min;
        this.f42688d = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }

    @Override // p3.I
    public final void c(s2.z zVar, L2.s sVar, H h10) {
        this.f42689e = zVar;
        this.f42685a.g(sVar, h10);
    }

    @Override // p3.I
    public final void d() {
        this.f42687c = 0;
        this.f42688d = 0;
        this.f42692h = false;
        this.f42685a.d();
    }
}
