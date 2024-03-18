package p3;

import s2.AbstractC5530A;

/* renamed from: p3.C  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5075C implements I {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC5074B f42392a;

    /* renamed from: b  reason: collision with root package name */
    public final s2.u f42393b = new s2.u(32);

    /* renamed from: c  reason: collision with root package name */
    public int f42394c;

    /* renamed from: d  reason: collision with root package name */
    public int f42395d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f42396e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f42397f;

    public C5075C(AbstractC5074B abstractC5074B) {
        this.f42392a = abstractC5074B;
    }

    @Override // p3.I
    public final void a(int i10, s2.u uVar) {
        boolean z10;
        int i11;
        boolean z11;
        if ((i10 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i11 = uVar.f45194b + uVar.u();
        } else {
            i11 = -1;
        }
        if (this.f42397f) {
            if (!z10) {
                return;
            }
            this.f42397f = false;
            uVar.F(i11);
            this.f42395d = 0;
        }
        while (uVar.a() > 0) {
            int i12 = this.f42395d;
            s2.u uVar2 = this.f42393b;
            if (i12 < 3) {
                if (i12 == 0) {
                    int u10 = uVar.u();
                    uVar.F(uVar.f45194b - 1);
                    if (u10 == 255) {
                        this.f42397f = true;
                        return;
                    }
                }
                int min = Math.min(uVar.a(), 3 - this.f42395d);
                uVar.e(uVar2.f45193a, this.f42395d, min);
                int i13 = this.f42395d + min;
                this.f42395d = i13;
                if (i13 == 3) {
                    uVar2.F(0);
                    uVar2.E(3);
                    uVar2.G(1);
                    int u11 = uVar2.u();
                    int u12 = uVar2.u();
                    if ((u11 & 128) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f42396e = z11;
                    int i14 = (((u11 & 15) << 8) | u12) + 3;
                    this.f42394c = i14;
                    byte[] bArr = uVar2.f45193a;
                    if (bArr.length < i14) {
                        uVar2.b(Math.min(4098, Math.max(i14, bArr.length * 2)));
                    }
                }
            } else {
                int min2 = Math.min(uVar.a(), this.f42394c - this.f42395d);
                uVar.e(uVar2.f45193a, this.f42395d, min2);
                int i15 = this.f42395d + min2;
                this.f42395d = i15;
                int i16 = this.f42394c;
                if (i15 != i16) {
                    continue;
                } else {
                    if (this.f42396e) {
                        if (AbstractC5530A.k(0, i16, -1, uVar2.f45193a) != 0) {
                            this.f42397f = true;
                            return;
                        }
                        uVar2.E(this.f42394c - 4);
                    } else {
                        uVar2.E(i16);
                    }
                    uVar2.F(0);
                    this.f42392a.b(uVar2);
                    this.f42395d = 0;
                }
            }
        }
    }

    @Override // p3.I
    public final void c(s2.z zVar, L2.s sVar, H h10) {
        this.f42392a.c(zVar, sVar, h10);
        this.f42397f = true;
    }

    @Override // p3.I
    public final void d() {
        this.f42397f = true;
    }
}
