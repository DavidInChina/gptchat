package bi;

import Wh.B;
import Wh.C;
import Wh.D;
import Wh.E;
import Wh.F;
import Wh.l;
import Wh.n;
import Wh.p;
import Wh.q;
import Wh.s;
import Wh.t;
import Wh.u;
import Wh.y;
import Wh.z;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import id.AbstractC3557B;

/* renamed from: bi.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2226a implements t {

    /* renamed from: a  reason: collision with root package name */
    public final l f26019a;

    public C2226a(l lVar) {
        AbstractC3557B.c0("cookieJar", lVar);
        this.f26019a = lVar;
    }

    @Override // Wh.t
    public final D a(f fVar) {
        F f6;
        z zVar = fVar.f26028e;
        y b10 = zVar.b();
        B b11 = zVar.f21339d;
        if (b11 != null) {
            u b12 = b11.b();
            if (b12 != null) {
                b10.d(SIPHeaderNames.CONTENT_TYPE, b12.f21261a);
            }
            long a5 = b11.a();
            if (a5 != -1) {
                b10.d(SIPHeaderNames.CONTENT_LENGTH, String.valueOf(a5));
                b10.f("Transfer-Encoding");
            } else {
                b10.d("Transfer-Encoding", "chunked");
                b10.f(SIPHeaderNames.CONTENT_LENGTH);
            }
        }
        q qVar = zVar.f21338c;
        String r10 = qVar.r("Host");
        boolean z10 = false;
        s sVar = zVar.f21336a;
        if (r10 == null) {
            b10.d("Host", Xh.b.w(sVar, false));
        }
        if (qVar.r("Connection") == null) {
            b10.d("Connection", "Keep-Alive");
        }
        if (qVar.r(SIPHeaderNames.ACCEPT_ENCODING) == null && qVar.r("Range") == null) {
            b10.d(SIPHeaderNames.ACCEPT_ENCODING, "gzip");
            z10 = true;
        }
        l lVar = this.f26019a;
        ((n) lVar).getClass();
        AbstractC3557B.c0("url", sVar);
        if (qVar.r(SIPHeaderNames.USER_AGENT) == null) {
            b10.d(SIPHeaderNames.USER_AGENT, "okhttp/4.12.0");
        }
        D b13 = fVar.b(b10.b());
        q qVar2 = b13.f21135k0;
        e.b(lVar, sVar, qVar2);
        C i10 = b13.i();
        i10.d(zVar);
        if (z10 && Lg.n.f2("gzip", D.h(b13, SIPHeaderNames.CONTENT_ENCODING)) && e.a(b13) && (f6 = b13.f21136l0) != null) {
            ji.u uVar = new ji.u(((E) f6).f21146h0);
            p I10 = qVar2.I();
            I10.v(SIPHeaderNames.CONTENT_ENCODING);
            I10.v(SIPHeaderNames.CONTENT_LENGTH);
            i10.c(I10.e());
            i10.f21123g = new E(D.h(b13, SIPHeaderNames.CONTENT_TYPE), -1L, R4.b.J(uVar));
        }
        return i10.a();
    }
}
