package s3;

import android.os.Bundle;
import id.AbstractC3557B;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import l8.AbstractC4344b;

@V("navigation")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Ls3/G;", "Ls3/W;", "Ls3/E;", "navigation-common_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: s3.G  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5544G extends W {

    /* renamed from: c  reason: collision with root package name */
    public final X f45240c;

    public C5544G(X x10) {
        AbstractC3557B.c0("navigatorProvider", x10);
        this.f45240c = x10;
    }

    @Override // s3.W
    public final void d(List list, C5548K c5548k) {
        AbstractC5540C abstractC5540C;
        String str;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5562l c5562l = (C5562l) it.next();
            AbstractC5540C abstractC5540C2 = c5562l.f45306Z;
            AbstractC3557B.a0("null cannot be cast to non-null type androidx.navigation.NavGraph", abstractC5540C2);
            C5542E c5542e = (C5542E) abstractC5540C2;
            Bundle d10 = c5562l.d();
            int i10 = c5542e.f45228p0;
            String str2 = c5542e.f45230r0;
            if (i10 == 0 && str2 == null) {
                StringBuilder sb2 = new StringBuilder("no start destination defined via app:startDestination for ");
                int i11 = c5542e.f45221l0;
                if (i11 != 0) {
                    str = String.valueOf(i11);
                } else {
                    str = "the root navigation";
                }
                sb2.append(str);
                throw new IllegalStateException(sb2.toString().toString());
            }
            if (str2 != null) {
                abstractC5540C = c5542e.V(str2, false);
            } else {
                abstractC5540C = c5542e.U(i10, false);
            }
            if (abstractC5540C == null) {
                if (c5542e.f45229q0 == null) {
                    String str3 = c5542e.f45230r0;
                    if (str3 == null) {
                        str3 = String.valueOf(c5542e.f45228p0);
                    }
                    c5542e.f45229q0 = str3;
                }
                String str4 = c5542e.f45229q0;
                AbstractC3557B.Z(str4);
                throw new IllegalArgumentException(android.gov.nist.core.a.A("navigation destination ", str4, " is not a direct child of this NavGraph"));
            }
            W b10 = this.f45240c.b(abstractC5540C.f45215Y);
            C5565o b11 = b();
            Bundle s10 = abstractC5540C.s(d10);
            AbstractC5568s abstractC5568s = b11.f45330h;
            b10.d(AbstractC4344b.F0(P5.c.u(abstractC5568s.f45340a, abstractC5540C, s10, abstractC5568s.k(), abstractC5568s.f45355p)), c5548k);
        }
    }

    /* renamed from: g */
    public C5542E a() {
        return new C5542E(this);
    }
}
