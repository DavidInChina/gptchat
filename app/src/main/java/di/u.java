package di;

import id.AbstractC3557B;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import jh.H1;
import ji.AbstractC4120I;
import ji.AbstractC4122K;
import ji.C4138m;
import y.AbstractC6463a;

/* loaded from: classes2.dex */
public final class u implements bi.d {

    /* renamed from: g  reason: collision with root package name */
    public static final List f28649g = Xh.b.l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: h  reason: collision with root package name */
    public static final List f28650h = Xh.b.l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a  reason: collision with root package name */
    public final ai.m f28651a;

    /* renamed from: b  reason: collision with root package name */
    public final bi.f f28652b;

    /* renamed from: c  reason: collision with root package name */
    public final t f28653c;

    /* renamed from: d  reason: collision with root package name */
    public volatile C2724A f28654d;

    /* renamed from: e  reason: collision with root package name */
    public final Wh.x f28655e;

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f28656f;

    public u(Wh.w wVar, ai.m mVar, bi.f fVar, t tVar) {
        AbstractC3557B.c0("connection", mVar);
        this.f28651a = mVar;
        this.f28652b = fVar;
        this.f28653c = tVar;
        Wh.x xVar = Wh.x.H2_PRIOR_KNOWLEDGE;
        this.f28655e = !wVar.f21320x0.contains(xVar) ? Wh.x.HTTP_2 : xVar;
    }

    @Override // bi.d
    public final void a() {
        C2724A c2724a = this.f28654d;
        AbstractC3557B.Z(c2724a);
        c2724a.g().close();
    }

    @Override // bi.d
    public final AbstractC4122K b(Wh.D d10) {
        C2724A c2724a = this.f28654d;
        AbstractC3557B.Z(c2724a);
        return c2724a.f28523i;
    }

    @Override // bi.d
    public final long c(Wh.D d10) {
        if (!bi.e.a(d10)) {
            return 0L;
        }
        return Xh.b.k(d10);
    }

    @Override // bi.d
    public final void cancel() {
        this.f28656f = true;
        C2724A c2724a = this.f28654d;
        if (c2724a != null) {
            c2724a.e(EnumC2728b.CANCEL);
        }
    }

    @Override // bi.d
    public final Wh.C d(boolean z10) {
        Wh.q qVar;
        C2724A c2724a = this.f28654d;
        if (c2724a != null) {
            synchronized (c2724a) {
                c2724a.f28525k.i();
                while (c2724a.f28521g.isEmpty() && c2724a.f28527m == null) {
                    c2724a.l();
                }
                c2724a.f28525k.m();
                if (!c2724a.f28521g.isEmpty()) {
                    Object removeFirst = c2724a.f28521g.removeFirst();
                    AbstractC3557B.b0("headersQueue.removeFirst()", removeFirst);
                    qVar = (Wh.q) removeFirst;
                } else {
                    IOException iOException = c2724a.f28528n;
                    if (iOException == null) {
                        EnumC2728b enumC2728b = c2724a.f28527m;
                        AbstractC3557B.Z(enumC2728b);
                        throw new F(enumC2728b);
                    }
                    throw iOException;
                }
            }
            Wh.x xVar = this.f28655e;
            AbstractC3557B.c0("protocol", xVar);
            ArrayList arrayList = new ArrayList(20);
            int size = qVar.size();
            bi.h hVar = null;
            for (int i10 = 0; i10 < size; i10++) {
                String y10 = qVar.y(i10);
                String T = qVar.T(i10);
                if (AbstractC3557B.K(y10, ":status")) {
                    hVar = H1.s("HTTP/1.1 " + T);
                } else if (!f28650h.contains(y10)) {
                    AbstractC3557B.c0("name", y10);
                    AbstractC3557B.c0("value", T);
                    arrayList.add(y10);
                    arrayList.add(Lg.n.U2(T).toString());
                }
            }
            if (hVar != null) {
                Wh.C c10 = new Wh.C();
                c10.f21118b = xVar;
                c10.f21119c = hVar.f26035b;
                String str = hVar.f26036c;
                AbstractC3557B.c0("message", str);
                c10.f21120d = str;
                Wh.p pVar = new Wh.p();
                kf.s.O1(pVar.f21239a, (String[]) arrayList.toArray(new String[0]));
                c10.f21122f = pVar;
                if (z10 && c10.f21119c == 100) {
                    return null;
                }
                return c10;
            }
            throw new ProtocolException("Expected ':status' header not present");
        }
        throw new IOException("stream wasn't created");
    }

    @Override // bi.d
    public final void e(Wh.z zVar) {
        boolean z10;
        int i10;
        C2724A c2724a;
        if (this.f28654d != null) {
            return;
        }
        boolean z11 = true;
        if (zVar.f21339d != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Wh.q qVar = zVar.f21338c;
        ArrayList arrayList = new ArrayList(qVar.size() + 4);
        arrayList.add(new C2729c(C2729c.f28553f, zVar.f21337b));
        C4138m c4138m = C2729c.f28554g;
        Wh.s sVar = zVar.f21336a;
        AbstractC3557B.c0("url", sVar);
        String b10 = sVar.b();
        String d10 = sVar.d();
        if (d10 != null) {
            b10 = b10 + '?' + d10;
        }
        arrayList.add(new C2729c(c4138m, b10));
        String r10 = zVar.f21338c.r("Host");
        if (r10 != null) {
            arrayList.add(new C2729c(C2729c.f28556i, r10));
        }
        arrayList.add(new C2729c(C2729c.f28555h, sVar.f21250a));
        int size = qVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            String y10 = qVar.y(i11);
            Locale locale = Locale.US;
            String j6 = AbstractC6463a.j("US", locale, y10, locale, "this as java.lang.String).toLowerCase(locale)");
            if (!f28649g.contains(j6) || (AbstractC3557B.K(j6, "te") && AbstractC3557B.K(qVar.T(i11), "trailers"))) {
                arrayList.add(new C2729c(j6, qVar.T(i11)));
            }
        }
        t tVar = this.f28653c;
        tVar.getClass();
        boolean z12 = !z10;
        synchronized (tVar.f28625D0) {
            synchronized (tVar) {
                if (tVar.f28633k0 > 1073741823) {
                    tVar.m(EnumC2728b.REFUSED_STREAM);
                }
                if (!tVar.f28634l0) {
                    i10 = tVar.f28633k0;
                    tVar.f28633k0 = i10 + 2;
                    c2724a = new C2724A(i10, tVar, z12, false, null);
                    if (z10 && tVar.f28622A0 < tVar.f28623B0 && c2724a.f28519e < c2724a.f28520f) {
                        z11 = false;
                    }
                    if (c2724a.i()) {
                        tVar.f28630h0.put(Integer.valueOf(i10), c2724a);
                    }
                } else {
                    throw new IOException();
                }
            }
            tVar.f28625D0.k(i10, arrayList, z12);
        }
        if (z11) {
            tVar.f28625D0.flush();
        }
        this.f28654d = c2724a;
        if (!this.f28656f) {
            C2724A c2724a2 = this.f28654d;
            AbstractC3557B.Z(c2724a2);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            c2724a2.f28525k.g(this.f28652b.f26030g, timeUnit);
            C2724A c2724a3 = this.f28654d;
            AbstractC3557B.Z(c2724a3);
            c2724a3.f28526l.g(this.f28652b.f26031h, timeUnit);
            return;
        }
        C2724A c2724a4 = this.f28654d;
        AbstractC3557B.Z(c2724a4);
        c2724a4.e(EnumC2728b.CANCEL);
        throw new IOException("Canceled");
    }

    @Override // bi.d
    public final void f() {
        this.f28653c.flush();
    }

    @Override // bi.d
    public final AbstractC4120I g(Wh.z zVar, long j6) {
        C2724A c2724a = this.f28654d;
        AbstractC3557B.Z(c2724a);
        return c2724a.g();
    }

    @Override // bi.d
    public final ai.m getConnection() {
        return this.f28651a;
    }
}
