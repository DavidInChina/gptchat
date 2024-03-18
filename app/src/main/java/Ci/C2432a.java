package ci;

import Lg.n;
import Wh.p;
import Wh.q;
import id.AbstractC3557B;
import ji.AbstractC4137l;

/* renamed from: ci.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2432a {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC4137l f26662a;

    /* renamed from: b  reason: collision with root package name */
    public long f26663b = 262144;

    public C2432a(AbstractC4137l abstractC4137l) {
        this.f26662a = abstractC4137l;
    }

    public final q a() {
        p pVar = new p();
        while (true) {
            String R10 = this.f26662a.R(this.f26663b);
            this.f26663b -= R10.length();
            if (R10.length() == 0) {
                return pVar.e();
            }
            int k22 = n.k2(R10, ':', 1, false, 4);
            if (k22 != -1) {
                String substring = R10.substring(0, k22);
                AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", substring);
                String substring2 = R10.substring(k22 + 1);
                AbstractC3557B.b0("this as java.lang.String).substring(startIndex)", substring2);
                pVar.a(substring, substring2);
            } else if (R10.charAt(0) == ':') {
                String substring3 = R10.substring(1);
                AbstractC3557B.b0("this as java.lang.String).substring(startIndex)", substring3);
                pVar.a("", substring3);
            } else {
                pVar.a("", R10);
            }
        }
    }
}
