package p3;

import java.util.Collections;
import java.util.List;
import p2.C5065s;

/* renamed from: p3.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5086i implements AbstractC5087j {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f42514a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f42515b;

    /* renamed from: c  reason: collision with root package name */
    public long f42516c;

    /* renamed from: d  reason: collision with root package name */
    public int f42517d;

    /* renamed from: e  reason: collision with root package name */
    public int f42518e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f42519f;

    /* renamed from: g  reason: collision with root package name */
    public Object f42520g;

    public C5086i(List list) {
        this.f42514a = 0;
        this.f42519f = list;
        this.f42520g = new L2.G[list.size()];
        this.f42516c = -9223372036854775807L;
    }

    @Override // p3.AbstractC5087j
    public final void b(s2.u uVar) {
        L2.G[] gArr;
        switch (this.f42514a) {
            case 0:
                if (this.f42515b) {
                    if (this.f42517d == 2) {
                        if (uVar.a() != 0) {
                            if (uVar.u() != 32) {
                                this.f42515b = false;
                            }
                            this.f42517d--;
                            if (!this.f42515b) {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    if (this.f42517d == 1) {
                        if (uVar.a() != 0) {
                            if (uVar.u() != 0) {
                                this.f42515b = false;
                            }
                            this.f42517d--;
                            if (!this.f42515b) {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    int i10 = uVar.f45194b;
                    int a5 = uVar.a();
                    for (L2.G g10 : (L2.G[]) this.f42520g) {
                        uVar.F(i10);
                        g10.a(a5, uVar);
                    }
                    this.f42518e += a5;
                    return;
                }
                return;
            default:
                Gi.e.o((L2.G) this.f42520g);
                if (this.f42515b) {
                    int a10 = uVar.a();
                    int i11 = this.f42518e;
                    if (i11 < 10) {
                        int min = Math.min(a10, 10 - i11);
                        byte[] bArr = uVar.f45193a;
                        int i12 = uVar.f45194b;
                        s2.u uVar2 = (s2.u) this.f42519f;
                        System.arraycopy(bArr, i12, uVar2.f45193a, this.f42518e, min);
                        if (this.f42518e + min == 10) {
                            uVar2.F(0);
                            if (73 == uVar2.u() && 68 == uVar2.u() && 51 == uVar2.u()) {
                                uVar2.G(3);
                                this.f42517d = uVar2.t() + 10;
                            } else {
                                s2.p.g("Id3Reader", "Discarding invalid ID3 tag");
                                this.f42515b = false;
                                return;
                            }
                        }
                    }
                    int min2 = Math.min(a10, this.f42517d - this.f42518e);
                    ((L2.G) this.f42520g).a(min2, uVar);
                    this.f42518e += min2;
                    return;
                }
                return;
        }
    }

    @Override // p3.AbstractC5087j
    public final void d() {
        switch (this.f42514a) {
            case 0:
                this.f42515b = false;
                this.f42516c = -9223372036854775807L;
                return;
            default:
                this.f42515b = false;
                this.f42516c = -9223372036854775807L;
                return;
        }
    }

    @Override // p3.AbstractC5087j
    public final void e(boolean z10) {
        int i10;
        switch (this.f42514a) {
            case 0:
                if (this.f42515b) {
                    if (this.f42516c != -9223372036854775807L) {
                        for (L2.G g10 : (L2.G[]) this.f42520g) {
                            g10.e(this.f42516c, 1, this.f42518e, 0, null);
                        }
                    }
                    this.f42515b = false;
                    return;
                }
                return;
            default:
                Gi.e.o((L2.G) this.f42520g);
                if (this.f42515b && (i10 = this.f42517d) != 0 && this.f42518e == i10) {
                    long j6 = this.f42516c;
                    if (j6 != -9223372036854775807L) {
                        ((L2.G) this.f42520g).e(j6, 1, i10, 0, null);
                    }
                    this.f42515b = false;
                    return;
                }
                return;
        }
    }

    @Override // p3.AbstractC5087j
    public final void f(int i10, long j6) {
        switch (this.f42514a) {
            case 0:
                if ((i10 & 4) != 0) {
                    this.f42515b = true;
                    if (j6 != -9223372036854775807L) {
                        this.f42516c = j6;
                    }
                    this.f42518e = 0;
                    this.f42517d = 2;
                    return;
                }
                return;
            default:
                if ((i10 & 4) != 0) {
                    this.f42515b = true;
                    if (j6 != -9223372036854775807L) {
                        this.f42516c = j6;
                    }
                    this.f42517d = 0;
                    this.f42518e = 0;
                    return;
                }
                return;
        }
    }

    @Override // p3.AbstractC5087j
    public final void g(L2.s sVar, H h10) {
        switch (this.f42514a) {
            case 0:
                for (int i10 = 0; i10 < ((L2.G[]) this.f42520g).length; i10++) {
                    G g10 = (G) ((List) this.f42519f).get(i10);
                    h10.c();
                    h10.i();
                    L2.G f6 = sVar.f(h10.f42432c, 3);
                    p2.r rVar = new p2.r();
                    rVar.f42227a = h10.d();
                    rVar.f42237k = "application/dvbsubs";
                    rVar.f42239m = Collections.singletonList(g10.f42429b);
                    rVar.f42229c = g10.f42428a;
                    f6.b(new C5065s(rVar));
                    ((L2.G[]) this.f42520g)[i10] = f6;
                }
                return;
            default:
                h10.c();
                h10.i();
                L2.G f10 = sVar.f(h10.f42432c, 5);
                this.f42520g = f10;
                p2.r rVar2 = new p2.r();
                rVar2.f42227a = h10.d();
                rVar2.f42237k = "application/id3";
                f10.b(new C5065s(rVar2));
                return;
        }
    }

    public C5086i() {
        this.f42514a = 1;
        this.f42519f = new s2.u(10);
        this.f42516c = -9223372036854775807L;
    }
}
