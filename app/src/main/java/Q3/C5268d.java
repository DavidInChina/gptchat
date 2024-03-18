package q3;

import I2.i;
import L2.G;
import L2.q;
import L2.r;
import L2.s;
import android.util.Pair;
import p2.O;
import s2.AbstractC5530A;
import s2.p;
import s2.u;

/* renamed from: q3.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5268d implements q {

    /* renamed from: a  reason: collision with root package name */
    public s f43733a;

    /* renamed from: b  reason: collision with root package name */
    public G f43734b;

    /* renamed from: e  reason: collision with root package name */
    public AbstractC5266b f43737e;

    /* renamed from: c  reason: collision with root package name */
    public int f43735c = 0;

    /* renamed from: d  reason: collision with root package name */
    public long f43736d = -1;

    /* renamed from: f  reason: collision with root package name */
    public int f43738f = -1;

    /* renamed from: g  reason: collision with root package name */
    public long f43739g = -1;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b0  */
    /* JADX WARN: Type inference failed for: r1v3, types: [L2.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.Serializable] */
    @Override // L2.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(r rVar, i iVar) {
        boolean z10;
        boolean z11;
        ?? r32;
        int i10;
        Gi.e.o(this.f43734b);
        int i11 = AbstractC5530A.f45131a;
        int i12 = this.f43735c;
        int i13 = 4;
        boolean z12 = true;
        if (i12 != 0) {
            long j6 = -1;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 == 4) {
                            if (this.f43739g == -1) {
                                z12 = false;
                            }
                            Gi.e.n(z12);
                            AbstractC5266b abstractC5266b = this.f43737e;
                            abstractC5266b.getClass();
                            if (abstractC5266b.b(rVar, this.f43739g - rVar.o())) {
                                return -1;
                            }
                            return 0;
                        }
                        throw new IllegalStateException();
                    }
                    rVar.k();
                    i F12 = A7.b.F1(1684108385, rVar, new u(8));
                    rVar.l(8);
                    Pair create = Pair.create(Long.valueOf(rVar.o()), Long.valueOf(F12.f7995b));
                    this.f43738f = ((Long) create.first).intValue();
                    long longValue = ((Long) create.second).longValue();
                    long j10 = this.f43736d;
                    if (j10 != -1 && longValue == 4294967295L) {
                        longValue = j10;
                    }
                    this.f43739g = this.f43738f + longValue;
                    long h10 = rVar.h();
                    if (h10 != -1 && this.f43739g > h10) {
                        p.g("WavExtractor", "Data exceeds input length: " + this.f43739g + ", " + h10);
                        this.f43739g = h10;
                    }
                    AbstractC5266b abstractC5266b2 = this.f43737e;
                    abstractC5266b2.getClass();
                    abstractC5266b2.c(this.f43738f, this.f43739g);
                    this.f43735c = 4;
                    return 0;
                }
                u uVar = new u(16);
                long j11 = A7.b.F1(1718449184, rVar, uVar).f7995b;
                if (j11 >= 16) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                Gi.e.n(z11);
                rVar.n(uVar.f45193a, 0, 16);
                uVar.F(0);
                int n10 = uVar.n();
                int n11 = uVar.n();
                int m10 = uVar.m();
                int m11 = uVar.m();
                int n12 = uVar.n();
                int n13 = uVar.n();
                int i14 = ((int) j11) - 16;
                if (i14 > 0) {
                    byte[] bArr = new byte[i14];
                    rVar.n(bArr, 0, i14);
                    r32 = bArr;
                } else {
                    r32 = AbstractC5530A.f45136f;
                }
                rVar.l((int) (rVar.d() - rVar.o()));
                ?? obj = new Object();
                obj.f10569a = n10;
                obj.f10571c = n11;
                obj.f10572d = m10;
                obj.f10573e = m11;
                obj.f10574f = n12;
                obj.f10575g = n13;
                obj.f10570b = r32;
                if (n10 == 17) {
                    this.f43737e = new C5265a(this.f43733a, this.f43734b, obj);
                } else if (n10 == 6) {
                    this.f43737e = new C5267c(this.f43733a, this.f43734b, obj, "audio/g711-alaw", -1);
                } else if (n10 == 7) {
                    this.f43737e = new C5267c(this.f43733a, this.f43734b, obj, "audio/g711-mlaw", -1);
                } else {
                    if (n10 != 1) {
                        if (n10 != 3) {
                            if (n10 != 65534) {
                                i10 = 0;
                            }
                        } else {
                            if (n13 != 32) {
                                i13 = 0;
                            }
                            i10 = i13;
                        }
                        if (i10 == 0) {
                            this.f43737e = new C5267c(this.f43733a, this.f43734b, obj, "audio/raw", i10);
                        } else {
                            throw O.b("Unsupported WAV format type: " + obj.f10569a);
                        }
                    }
                    i10 = AbstractC5530A.t(n13);
                    if (i10 == 0) {
                    }
                }
                this.f43735c = 3;
                return 0;
            }
            u uVar2 = new u(8);
            i a5 = i.a(rVar, uVar2);
            if (a5.f7994a != 1685272116) {
                rVar.k();
            } else {
                rVar.e(8);
                uVar2.F(0);
                rVar.n(uVar2.f45193a, 0, 8);
                j6 = uVar2.j();
                rVar.l(((int) a5.f7995b) + 8);
            }
            this.f43736d = j6;
            this.f43735c = 2;
            return 0;
        }
        if (rVar.o() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Gi.e.n(z10);
        int i15 = this.f43738f;
        if (i15 != -1) {
            rVar.l(i15);
            this.f43735c = 4;
        } else if (A7.b.g0(rVar)) {
            rVar.l((int) (rVar.d() - rVar.o()));
            this.f43735c = 1;
        } else {
            throw O.a("Unsupported or unrecognized wav file type.", null);
        }
        return 0;
    }

    @Override // L2.q
    public final void d(s sVar) {
        this.f43733a = sVar;
        this.f43734b = sVar.f(0, 1);
        sVar.d();
    }

    @Override // L2.q
    public final boolean g(r rVar) {
        return A7.b.g0(rVar);
    }

    @Override // L2.q
    public final void h(long j6, long j10) {
        int i10;
        if (j6 == 0) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        this.f43735c = i10;
        AbstractC5266b abstractC5266b = this.f43737e;
        if (abstractC5266b != null) {
            abstractC5266b.a(j10);
        }
    }

    @Override // L2.q
    public final q b() {
        return this;
    }

    @Override // L2.q
    public final void release() {
    }
}
