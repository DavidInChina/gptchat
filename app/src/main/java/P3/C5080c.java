package p3;

/* renamed from: p3.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5080c implements L2.q {

    /* renamed from: a  reason: collision with root package name */
    public final C5081d f42452a = new C5081d(null);

    /* renamed from: b  reason: collision with root package name */
    public final s2.u f42453b = new s2.u(16384);

    /* renamed from: c  reason: collision with root package name */
    public boolean f42454c;

    @Override // L2.q
    public final int a(L2.r rVar, I2.i iVar) {
        s2.u uVar = this.f42453b;
        int read = rVar.read(uVar.f45193a, 0, 16384);
        if (read == -1) {
            return -1;
        }
        uVar.F(0);
        uVar.E(read);
        boolean z10 = this.f42454c;
        C5081d c5081d = this.f42452a;
        if (!z10) {
            c5081d.f(4, 0L);
            this.f42454c = true;
        }
        c5081d.b(uVar);
        return 0;
    }

    @Override // L2.q
    public final void d(L2.s sVar) {
        this.f42452a.g(sVar, new H(0, 1));
        sVar.d();
        sVar.b(new L2.u(-9223372036854775807L));
    }

    @Override // L2.q
    public final boolean g(L2.r rVar) {
        int i10;
        s2.u uVar = new s2.u(10);
        int i11 = 0;
        while (true) {
            rVar.n(uVar.f45193a, 0, 10);
            uVar.F(0);
            if (uVar.w() != 4801587) {
                break;
            }
            uVar.G(3);
            int t10 = uVar.t();
            i11 += t10 + 10;
            rVar.e(t10);
        }
        rVar.k();
        rVar.e(i11);
        int i12 = 0;
        int i13 = i11;
        while (true) {
            int i14 = 7;
            rVar.n(uVar.f45193a, 0, 7);
            uVar.F(0);
            int z10 = uVar.z();
            if (z10 != 44096 && z10 != 44097) {
                rVar.k();
                i13++;
                if (i13 - i11 >= 8192) {
                    return false;
                }
                rVar.e(i13);
                i12 = 0;
            } else {
                i12++;
                if (i12 >= 4) {
                    return true;
                }
                byte[] bArr = uVar.f45193a;
                if (bArr.length < 7) {
                    i10 = -1;
                } else {
                    int i15 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i15 == 65535) {
                        i15 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i14 = 4;
                    }
                    if (z10 == 44097) {
                        i14 += 2;
                    }
                    i10 = i15 + i14;
                }
                if (i10 == -1) {
                    return false;
                }
                rVar.e(i10 - 7);
            }
        }
    }

    @Override // L2.q
    public final void h(long j6, long j10) {
        this.f42454c = false;
        this.f42452a.d();
    }

    @Override // L2.q
    public final L2.q b() {
        return this;
    }

    @Override // L2.q
    public final void release() {
    }
}
