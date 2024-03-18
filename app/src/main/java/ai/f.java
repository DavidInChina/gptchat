package ai;

import Wh.C1656a;
import Wh.G;
import Wh.s;
import di.C2727a;
import di.EnumC2728b;
import di.F;
import id.AbstractC3557B;
import java.io.IOException;
import java.net.Socket;
import java.util.List;
import java.util.NoSuchElementException;
import m.C4528h;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final n f24240a;

    /* renamed from: b  reason: collision with root package name */
    public final C1656a f24241b;

    /* renamed from: c  reason: collision with root package name */
    public final j f24242c;

    /* renamed from: d  reason: collision with root package name */
    public final Wh.n f24243d;

    /* renamed from: e  reason: collision with root package name */
    public C4528h f24244e;

    /* renamed from: f  reason: collision with root package name */
    public p f24245f;

    /* renamed from: g  reason: collision with root package name */
    public int f24246g;

    /* renamed from: h  reason: collision with root package name */
    public int f24247h;

    /* renamed from: i  reason: collision with root package name */
    public int f24248i;

    /* renamed from: j  reason: collision with root package name */
    public G f24249j;

    public f(n nVar, C1656a c1656a, j jVar, Wh.n nVar2) {
        AbstractC3557B.c0("connectionPool", nVar);
        AbstractC3557B.c0("eventListener", nVar2);
        this.f24240a = nVar;
        this.f24241b = c1656a;
        this.f24242c = jVar;
        this.f24243d = nVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x019a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final m a(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        boolean z12;
        C4528h c4528h;
        p pVar;
        List list;
        Socket socket;
        while (!this.f24242c.f24270u0) {
            m mVar = this.f24242c.f24264o0;
            if (mVar != null) {
                synchronized (mVar) {
                    try {
                        if (!mVar.f24286j && b(mVar.f24278b.f21148a.f21166i)) {
                            socket = null;
                        }
                        socket = this.f24242c.k();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (this.f24242c.f24264o0 != null) {
                    if (socket != null) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    z12 = z11;
                    if (mVar.j(z12)) {
                        return mVar;
                    }
                    mVar.l();
                    if (this.f24249j == null && (c4528h = this.f24244e) != null && !c4528h.n() && (pVar = this.f24245f) != null && !pVar.a()) {
                        throw new IOException("exhausted all routes");
                    }
                } else {
                    if (socket != null) {
                        Xh.b.d(socket);
                    }
                    Wh.n nVar = this.f24243d;
                    j jVar = this.f24242c;
                    nVar.getClass();
                    AbstractC3557B.c0("call", jVar);
                }
            }
            this.f24246g = 0;
            this.f24247h = 0;
            this.f24248i = 0;
            if (this.f24240a.a(this.f24241b, this.f24242c, null, false)) {
                mVar = this.f24242c.f24264o0;
                AbstractC3557B.Z(mVar);
                Wh.n nVar2 = this.f24243d;
                j jVar2 = this.f24242c;
                nVar2.getClass();
                AbstractC3557B.c0("call", jVar2);
            } else {
                G g10 = this.f24249j;
                try {
                    if (g10 != null) {
                        this.f24249j = null;
                    } else {
                        C4528h c4528h2 = this.f24244e;
                        if (c4528h2 != null && c4528h2.n()) {
                            C4528h c4528h3 = this.f24244e;
                            AbstractC3557B.Z(c4528h3);
                            if (c4528h3.n()) {
                                int i14 = c4528h3.f38769Y;
                                c4528h3.f38769Y = i14 + 1;
                                g10 = (G) ((List) c4528h3.f38770Z).get(i14);
                            } else {
                                throw new NoSuchElementException();
                            }
                        } else {
                            p pVar2 = this.f24245f;
                            if (pVar2 == null) {
                                C1656a c1656a = this.f24241b;
                                j jVar3 = this.f24242c;
                                pVar2 = new p(c1656a, jVar3.f24255Y.f21301H0, jVar3, this.f24243d);
                                this.f24245f = pVar2;
                            }
                            C4528h b10 = pVar2.b();
                            this.f24244e = b10;
                            list = (List) b10.f38770Z;
                            if (!this.f24242c.f24270u0) {
                                if (this.f24240a.a(this.f24241b, this.f24242c, list, false)) {
                                    mVar = this.f24242c.f24264o0;
                                    AbstractC3557B.Z(mVar);
                                    Wh.n nVar3 = this.f24243d;
                                    j jVar4 = this.f24242c;
                                    nVar3.getClass();
                                    AbstractC3557B.c0("call", jVar4);
                                } else if (b10.n()) {
                                    int i15 = b10.f38769Y;
                                    b10.f38769Y = i15 + 1;
                                    g10 = (G) ((List) b10.f38770Z).get(i15);
                                    m mVar2 = new m(this.f24240a, g10);
                                    this.f24242c.f24272w0 = mVar2;
                                    mVar2.c(i10, i11, i12, i13, z10, this.f24242c, this.f24243d);
                                    this.f24242c.f24272w0 = null;
                                    this.f24242c.f24255Y.f21301H0.a(mVar2.f24278b);
                                    if (!this.f24240a.a(this.f24241b, this.f24242c, list, true)) {
                                        m mVar3 = this.f24242c.f24264o0;
                                        AbstractC3557B.Z(mVar3);
                                        this.f24249j = g10;
                                        Socket socket2 = mVar2.f24280d;
                                        AbstractC3557B.Z(socket2);
                                        Xh.b.d(socket2);
                                        Wh.n nVar4 = this.f24243d;
                                        j jVar5 = this.f24242c;
                                        nVar4.getClass();
                                        AbstractC3557B.c0("call", jVar5);
                                        mVar = mVar3;
                                    } else {
                                        synchronized (mVar2) {
                                            n nVar5 = this.f24240a;
                                            nVar5.getClass();
                                            byte[] bArr = Xh.b.f21996a;
                                            nVar5.f24298e.add(mVar2);
                                            nVar5.f24296c.c(nVar5.f24297d, 0L);
                                            this.f24242c.b(mVar2);
                                        }
                                        Wh.n nVar6 = this.f24243d;
                                        j jVar6 = this.f24242c;
                                        nVar6.getClass();
                                        AbstractC3557B.c0("call", jVar6);
                                        z12 = z11;
                                        mVar = mVar2;
                                        if (mVar.j(z12)) {
                                        }
                                    }
                                } else {
                                    throw new NoSuchElementException();
                                }
                            } else {
                                throw new IOException("Canceled");
                            }
                        }
                    }
                    mVar2.c(i10, i11, i12, i13, z10, this.f24242c, this.f24243d);
                    this.f24242c.f24272w0 = null;
                    this.f24242c.f24255Y.f21301H0.a(mVar2.f24278b);
                    if (!this.f24240a.a(this.f24241b, this.f24242c, list, true)) {
                    }
                } catch (Throwable th3) {
                    this.f24242c.f24272w0 = null;
                    throw th3;
                }
                list = null;
                m mVar22 = new m(this.f24240a, g10);
                this.f24242c.f24272w0 = mVar22;
            }
            z12 = z11;
            if (mVar.j(z12)) {
            }
        }
        throw new IOException("Canceled");
    }

    public final boolean b(s sVar) {
        AbstractC3557B.c0("url", sVar);
        s sVar2 = this.f24241b.f21166i;
        if (sVar.f21254e == sVar2.f21254e && AbstractC3557B.K(sVar.f21253d, sVar2.f21253d)) {
            return true;
        }
        return false;
    }

    public final void c(IOException iOException) {
        AbstractC3557B.c0("e", iOException);
        this.f24249j = null;
        if (iOException instanceof F) {
            if (((F) iOException).f28542Y == EnumC2728b.REFUSED_STREAM) {
                this.f24246g++;
                return;
            }
        }
        if (iOException instanceof C2727a) {
            this.f24247h++;
        } else {
            this.f24248i++;
        }
    }
}
