package ci;

import Lg.n;
import Wh.C;
import Wh.D;
import Wh.q;
import Wh.s;
import Wh.w;
import Wh.x;
import Wh.z;
import ai.m;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import jh.H1;
import ji.AbstractC4120I;
import ji.AbstractC4122K;
import ji.AbstractC4136k;
import ji.AbstractC4137l;

/* loaded from: classes2.dex */
public final class h implements bi.d {

    /* renamed from: a  reason: collision with root package name */
    public final w f26681a;

    /* renamed from: b  reason: collision with root package name */
    public final m f26682b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC4137l f26683c;

    /* renamed from: d  reason: collision with root package name */
    public final AbstractC4136k f26684d;

    /* renamed from: e  reason: collision with root package name */
    public int f26685e;

    /* renamed from: f  reason: collision with root package name */
    public final C2432a f26686f;

    /* renamed from: g  reason: collision with root package name */
    public q f26687g;

    public h(w wVar, m mVar, AbstractC4137l abstractC4137l, AbstractC4136k abstractC4136k) {
        AbstractC3557B.c0("connection", mVar);
        this.f26681a = wVar;
        this.f26682b = mVar;
        this.f26683c = abstractC4137l;
        this.f26684d = abstractC4136k;
        this.f26686f = new C2432a(abstractC4137l);
    }

    @Override // bi.d
    public final void a() {
        this.f26684d.flush();
    }

    @Override // bi.d
    public final AbstractC4122K b(D d10) {
        if (!bi.e.a(d10)) {
            return h(0L);
        }
        if (n.f2("chunked", D.h(d10, "Transfer-Encoding"))) {
            s sVar = d10.f21130Y.f21336a;
            if (this.f26685e == 4) {
                this.f26685e = 5;
                return new C2435d(this, sVar);
            }
            throw new IllegalStateException(("state: " + this.f26685e).toString());
        }
        long k10 = Xh.b.k(d10);
        if (k10 != -1) {
            return h(k10);
        }
        if (this.f26685e == 4) {
            this.f26685e = 5;
            this.f26682b.l();
            return new AbstractC2433b(this);
        }
        throw new IllegalStateException(("state: " + this.f26685e).toString());
    }

    @Override // bi.d
    public final long c(D d10) {
        if (!bi.e.a(d10)) {
            return 0L;
        }
        if (n.f2("chunked", D.h(d10, "Transfer-Encoding"))) {
            return -1L;
        }
        return Xh.b.k(d10);
    }

    @Override // bi.d
    public final void cancel() {
        Socket socket = this.f26682b.f24279c;
        if (socket != null) {
            Xh.b.d(socket);
        }
    }

    @Override // bi.d
    public final C d(boolean z10) {
        C2432a c2432a = this.f26686f;
        int i10 = this.f26685e;
        if (i10 != 1 && i10 != 2 && i10 != 3) {
            throw new IllegalStateException(("state: " + this.f26685e).toString());
        }
        try {
            String R10 = c2432a.f26662a.R(c2432a.f26663b);
            c2432a.f26663b -= R10.length();
            bi.h s10 = H1.s(R10);
            int i11 = s10.f26035b;
            C c10 = new C();
            x xVar = s10.f26034a;
            AbstractC3557B.c0("protocol", xVar);
            c10.f21118b = xVar;
            c10.f21119c = i11;
            String str = s10.f26036c;
            AbstractC3557B.c0("message", str);
            c10.f21120d = str;
            c10.c(c2432a.a());
            if (z10 && i11 == 100) {
                return null;
            }
            if (i11 == 100) {
                this.f26685e = 3;
                return c10;
            } else if (102 <= i11 && i11 < 200) {
                this.f26685e = 3;
                return c10;
            } else {
                this.f26685e = 4;
                return c10;
            }
        } catch (EOFException e10) {
            throw new IOException(R.a.r("unexpected end of stream on ", this.f26682b.f24278b.f21148a.f21166i.g()), e10);
        }
    }

    @Override // bi.d
    public final void e(z zVar) {
        Proxy.Type type = this.f26682b.f24278b.f21149b.type();
        AbstractC3557B.b0("connection.route().proxy.type()", type);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(zVar.f21337b);
        sb2.append(' ');
        s sVar = zVar.f21336a;
        if (!sVar.f21258i && type == Proxy.Type.HTTP) {
            sb2.append(sVar);
        } else {
            String b10 = sVar.b();
            String d10 = sVar.d();
            if (d10 != null) {
                b10 = b10 + '?' + d10;
            }
            sb2.append(b10);
        }
        sb2.append(" HTTP/1.1");
        String sb3 = sb2.toString();
        AbstractC3557B.b0("StringBuilder().apply(builderAction).toString()", sb3);
        i(zVar.f21338c, sb3);
    }

    @Override // bi.d
    public final void f() {
        this.f26684d.flush();
    }

    @Override // bi.d
    public final AbstractC4120I g(z zVar, long j6) {
        if (n.f2("chunked", zVar.f21338c.r("Transfer-Encoding"))) {
            if (this.f26685e == 1) {
                this.f26685e = 2;
                return new C2434c(this);
            }
            throw new IllegalStateException(("state: " + this.f26685e).toString());
        } else if (j6 != -1) {
            if (this.f26685e == 1) {
                this.f26685e = 2;
                return new f(this);
            }
            throw new IllegalStateException(("state: " + this.f26685e).toString());
        } else {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
    }

    @Override // bi.d
    public final m getConnection() {
        return this.f26682b;
    }

    public final e h(long j6) {
        if (this.f26685e == 4) {
            this.f26685e = 5;
            return new e(this, j6);
        }
        throw new IllegalStateException(("state: " + this.f26685e).toString());
    }

    public final void i(q qVar, String str) {
        AbstractC3557B.c0("headers", qVar);
        AbstractC3557B.c0("requestLine", str);
        if (this.f26685e == 0) {
            AbstractC4136k abstractC4136k = this.f26684d;
            abstractC4136k.c0(str).c0(Separators.NEWLINE);
            int size = qVar.size();
            for (int i10 = 0; i10 < size; i10++) {
                abstractC4136k.c0(qVar.y(i10)).c0(": ").c0(qVar.T(i10)).c0(Separators.NEWLINE);
            }
            abstractC4136k.c0(Separators.NEWLINE);
            this.f26685e = 1;
            return;
        }
        throw new IllegalStateException(("state: " + this.f26685e).toString());
    }
}
