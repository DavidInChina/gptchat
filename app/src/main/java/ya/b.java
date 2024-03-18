package Ya;

import ab.C1965s;
import bb.C2152D;
import cb.C2334C;
import cb.C2362c0;
import ic.P;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import kf.v;
import nc.z;
import yf.AbstractC6583a;

/* loaded from: classes2.dex */
public final class b extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f22147Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C2334C f22148Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(C2334C c2334c, int i10) {
        super(1);
        this.f22147Y = i10;
        this.f22148Z = c2334c;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        C2334C c2334c = this.f22148Z;
        switch (this.f22147Y) {
            case 0:
                C2362c0 c2362c0 = (C2362c0) obj;
                AbstractC3557B.c0("gizmos", c2362c0);
                List<C2334C> list = c2362c0.f26511b;
                ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list, 10));
                for (C2334C c2334c2 : list) {
                    if (AbstractC3557B.K(c2334c.f26438a, c2334c2.f26438a)) {
                        c2334c2 = c2334c;
                    }
                    arrayList.add(c2334c2);
                }
                return C2362c0.a(c2362c0, null, arrayList, 1);
            case 1:
                C1965s c1965s = (C1965s) obj;
                AbstractC3557B.c0("$this$setState", c1965s);
                return C1965s.e(c1965s, null, c2334c, null, 11);
            case 2:
                C2152D c2152d = (C2152D) obj;
                AbstractC3557B.c0("$this$setState", c2152d);
                return C2152D.e(c2152d, this.f22148Z, null, null, null, false, null, false, false, 509);
            case 3:
                P p10 = (P) obj;
                AbstractC3557B.c0("$this$setState", p10);
                return P.e(p10, null, true, false, v.f37483Y, null, false, null, this.f22148Z, 117);
            default:
                z zVar = (z) obj;
                AbstractC3557B.c0("$this$setState", zVar);
                return z.e(zVar, null, null, null, false, null, null, this.f22148Z, null, 895);
        }
    }
}
