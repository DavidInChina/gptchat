package S2;

import I2.i;
import L2.G;
import L2.q;
import L2.r;
import L2.s;
import e3.m;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;
import p2.C5065s;
import p2.L;
import p2.M;
import p2.O;
import s2.p;
import s2.u;

/* loaded from: classes2.dex */
public final class a implements q {

    /* renamed from: b  reason: collision with root package name */
    public s f16087b;

    /* renamed from: c  reason: collision with root package name */
    public int f16088c;

    /* renamed from: d  reason: collision with root package name */
    public int f16089d;

    /* renamed from: e  reason: collision with root package name */
    public int f16090e;

    /* renamed from: g  reason: collision with root package name */
    public Z2.a f16092g;

    /* renamed from: h  reason: collision with root package name */
    public r f16093h;

    /* renamed from: i  reason: collision with root package name */
    public d f16094i;

    /* renamed from: j  reason: collision with root package name */
    public m f16095j;

    /* renamed from: a  reason: collision with root package name */
    public final u f16086a = new u(6);

    /* renamed from: f  reason: collision with root package name */
    public long f16091f = -1;

    /* JADX WARN: Removed duplicated region for block: B:79:0x0165  */
    @Override // L2.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(r rVar, i iVar) {
        String p10;
        c cVar;
        Z2.a aVar;
        long j6;
        int i10 = this.f16088c;
        u uVar = this.f16086a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 == 6) {
                                return -1;
                            }
                            throw new IllegalStateException();
                        }
                        if (this.f16094i == null || rVar != this.f16093h) {
                            this.f16093h = rVar;
                            this.f16094i = new d(rVar, this.f16091f);
                        }
                        m mVar = this.f16095j;
                        mVar.getClass();
                        int a5 = mVar.a(this.f16094i, iVar);
                        if (a5 == 1) {
                            iVar.f7995b += this.f16091f;
                        }
                        return a5;
                    }
                    long o10 = rVar.o();
                    long j10 = this.f16091f;
                    if (o10 != j10) {
                        iVar.f7995b = j10;
                        return 1;
                    }
                    if (!rVar.c(uVar.f45193a, 0, 1, true)) {
                        c();
                    } else {
                        rVar.k();
                        if (this.f16095j == null) {
                            this.f16095j = new m(8);
                        }
                        d dVar = new d(rVar, this.f16091f);
                        this.f16094i = dVar;
                        if (this.f16095j.g(dVar)) {
                            m mVar2 = this.f16095j;
                            long j11 = this.f16091f;
                            s sVar = this.f16087b;
                            sVar.getClass();
                            mVar2.f28890s = new f(j11, sVar);
                            Z2.a aVar2 = this.f16092g;
                            aVar2.getClass();
                            e(aVar2);
                            this.f16088c = 5;
                        } else {
                            c();
                        }
                    }
                    return 0;
                }
                if (this.f16089d == 65505) {
                    u uVar2 = new u(this.f16090e);
                    rVar.readFully(uVar2.f45193a, 0, this.f16090e);
                    if (this.f16092g == null && "http://ns.adobe.com/xap/1.0/".equals(uVar2.p()) && (p10 = uVar2.p()) != null) {
                        long h10 = rVar.h();
                        if (h10 != -1) {
                            try {
                                cVar = g.a(p10);
                            } catch (NumberFormatException | XmlPullParserException | O unused) {
                                p.g("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                                cVar = null;
                            }
                            if (cVar != null && ((List) cVar.f16101c).size() >= 2) {
                                int size = ((List) cVar.f16101c).size() - 1;
                                boolean z10 = false;
                                long j12 = -1;
                                long j13 = -1;
                                long j14 = -1;
                                long j15 = -1;
                                while (size >= 0) {
                                    b bVar = (b) ((List) cVar.f16101c).get(size);
                                    boolean equals = "video/mp4".equals(bVar.f16096a) | z10;
                                    if (size == 0) {
                                        h10 -= bVar.f16098c;
                                        j6 = 0;
                                    } else {
                                        j6 = h10 - bVar.f16097b;
                                    }
                                    long j16 = j6;
                                    long j17 = h10;
                                    h10 = j16;
                                    if (equals && h10 != j17) {
                                        j15 = j17 - h10;
                                        j14 = h10;
                                        equals = false;
                                    }
                                    if (size == 0) {
                                        j13 = j17;
                                        j12 = h10;
                                    }
                                    size--;
                                    z10 = equals;
                                }
                                if (j14 != -1 && j15 != -1 && j12 != -1 && j13 != -1) {
                                    aVar = new Z2.a(j12, j13, cVar.f16100b, j14, j15);
                                    this.f16092g = aVar;
                                    if (aVar != null) {
                                        this.f16091f = aVar.f23141i0;
                                    }
                                }
                            }
                        }
                        aVar = null;
                        this.f16092g = aVar;
                        if (aVar != null) {
                        }
                    }
                } else {
                    rVar.l(this.f16090e);
                }
                this.f16088c = 0;
                return 0;
            }
            uVar.C(2);
            rVar.readFully(uVar.f45193a, 0, 2);
            this.f16090e = uVar.z() - 2;
            this.f16088c = 2;
            return 0;
        }
        uVar.C(2);
        rVar.readFully(uVar.f45193a, 0, 2);
        int z11 = uVar.z();
        this.f16089d = z11;
        if (z11 == 65498) {
            if (this.f16091f != -1) {
                this.f16088c = 4;
                return 0;
            }
            c();
            return 0;
        } else if ((z11 >= 65488 && z11 <= 65497) || z11 == 65281) {
            return 0;
        } else {
            this.f16088c = 1;
            return 0;
        }
    }

    public final void c() {
        e(new L[0]);
        s sVar = this.f16087b;
        sVar.getClass();
        sVar.d();
        this.f16087b.b(new L2.u(-9223372036854775807L));
        this.f16088c = 6;
    }

    @Override // L2.q
    public final void d(s sVar) {
        this.f16087b = sVar;
    }

    public final void e(L... lArr) {
        s sVar = this.f16087b;
        sVar.getClass();
        G f6 = sVar.f(1024, 4);
        p2.r rVar = new p2.r();
        rVar.f42236j = "image/jpeg";
        rVar.f42235i = new M(lArr);
        f6.b(new C5065s(rVar));
    }

    @Override // L2.q
    public final boolean g(r rVar) {
        u uVar = this.f16086a;
        uVar.C(2);
        rVar.n(uVar.f45193a, 0, 2);
        if (uVar.z() != 65496) {
            return false;
        }
        uVar.C(2);
        rVar.n(uVar.f45193a, 0, 2);
        int z10 = uVar.z();
        this.f16089d = z10;
        if (z10 == 65504) {
            uVar.C(2);
            rVar.n(uVar.f45193a, 0, 2);
            rVar.e(uVar.z() - 2);
            uVar.C(2);
            rVar.n(uVar.f45193a, 0, 2);
            this.f16089d = uVar.z();
        }
        if (this.f16089d != 65505) {
            return false;
        }
        rVar.e(2);
        uVar.C(6);
        rVar.n(uVar.f45193a, 0, 6);
        if (uVar.v() != 1165519206 || uVar.z() != 0) {
            return false;
        }
        return true;
    }

    @Override // L2.q
    public final void h(long j6, long j10) {
        if (j6 == 0) {
            this.f16088c = 0;
            this.f16095j = null;
        } else if (this.f16088c == 5) {
            m mVar = this.f16095j;
            mVar.getClass();
            mVar.h(j6, j10);
        }
    }

    @Override // L2.q
    public final void release() {
        m mVar = this.f16095j;
        if (mVar != null) {
            mVar.getClass();
        }
    }

    @Override // L2.q
    public final q b() {
        return this;
    }
}
