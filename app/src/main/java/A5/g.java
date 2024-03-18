package A5;

import Wh.B;
import Wh.D;
import Wh.y;
import Wh.z;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import id.AbstractC3557B;
import l8.AbstractC4344b;
import p5.AbstractC5091c;
import p5.EnumC5090b;

/* loaded from: classes.dex */
public final class g implements Wh.t {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC5091c f681a;

    public g(AbstractC5091c abstractC5091c) {
        AbstractC3557B.c0("internalLogger", abstractC5091c);
        this.f681a = abstractC5091c;
    }

    @Override // Wh.t
    public final D a(bi.f fVar) {
        z zVar = fVar.f26028e;
        B b10 = zVar.f21339d;
        if (b10 != null && zVar.f21338c.r(SIPHeaderNames.CONTENT_ENCODING) == null) {
            try {
                y b11 = zVar.b();
                b11.d(SIPHeaderNames.CONTENT_ENCODING, "gzip");
                b11.e(zVar.f21337b, new f(b10));
                zVar = b11.b();
            } catch (Exception e10) {
                P4.a.l0(this.f681a, 4, AbstractC4344b.G0(EnumC5090b.f42739Z, EnumC5090b.f42740h0), a.f657j0, e10, 48);
            }
            return fVar.b(zVar);
        }
        return fVar.b(zVar);
    }
}
