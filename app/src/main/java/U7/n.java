package u7;

import Df.AbstractC0405d;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import id.AbstractC3557B;
import java.util.List;
import t7.C5682d;
import ve.AbstractC6034c;
import xe.AbstractC6432u;
import xe.AbstractC6435x;

/* loaded from: classes2.dex */
public final class n extends UnsupportedOperationException {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f46467Y = 0;

    /* renamed from: Z  reason: collision with root package name */
    public final Object f46468Z;

    public n(C5682d c5682d) {
        this.f46468Z = c5682d;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        int i10 = this.f46467Y;
        Object obj = this.f46468Z;
        switch (i10) {
            case 0:
                return "Missing ".concat(String.valueOf((C5682d) obj));
            default:
                return (String) obj;
        }
    }

    public n(AbstractC6034c abstractC6034c, AbstractC0405d abstractC0405d, AbstractC0405d abstractC0405d2) {
        AbstractC3557B.c0("from", abstractC0405d);
        AbstractC3557B.c0("to", abstractC0405d2);
        StringBuilder sb2 = new StringBuilder("\n        Expected response body of the type '");
        sb2.append(abstractC0405d2);
        sb2.append("' but was '");
        sb2.append(abstractC0405d);
        sb2.append("'\n        In response from `");
        sb2.append(AbstractC3557B.u1(abstractC6034c).O());
        sb2.append("`\n        Response status `");
        sb2.append(abstractC6034c.f());
        sb2.append("`\n        Response header `ContentType: ");
        AbstractC6432u a5 = abstractC6034c.a();
        List list = AbstractC6435x.f49956a;
        sb2.append(a5.e(SIPHeaderNames.CONTENT_TYPE));
        sb2.append("` \n        Request header `Accept: ");
        sb2.append(AbstractC3557B.u1(abstractC6034c).a().e(SIPHeaderNames.ACCEPT));
        sb2.append("`\n        \n        You can read how to resolve NoTransformationFoundException at FAQ: \n        https://ktor.io/docs/faq.html#no-transformation-found-exception\n    ");
        this.f46468Z = Bi.c.M1(sb2.toString());
    }
}
