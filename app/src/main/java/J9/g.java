package j9;

import B9.j;
import Dd.Q;
import Ng.x0;
import Sg.u;
import We.C1650a;
import We.E;
import Xe.C1683e;
import Xe.m;
import a.C1888h;
import ce.AbstractC2397c;
import kb.C4211E;

/* loaded from: classes.dex */
public final class g implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f36089a;

    public /* synthetic */ g(int i10) {
        this.f36089a = i10;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, Ve.b] */
    @Override // p000if.a
    public final Object get() {
        Object obj;
        Object obj2;
        int i10 = this.f36089a;
        switch (i10) {
            case 0:
                return new e();
            case 1:
                return new Object();
            case 2:
                return new j();
            case 3:
                return new C4211E();
            case 4:
                return new Q();
            case 5:
                switch (i10) {
                    case 5:
                        obj = Ng.Q.f12904a;
                        if (obj == null) {
                            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                        }
                        break;
                    default:
                        obj = Ng.Q.f12906c;
                        if (obj == null) {
                            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                        }
                        break;
                }
                return obj;
            case 6:
                switch (i10) {
                    case 5:
                        obj2 = Ng.Q.f12904a;
                        if (obj2 == null) {
                            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                        }
                        break;
                    default:
                        obj2 = Ng.Q.f12906c;
                        if (obj2 == null) {
                            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                        }
                        break;
                }
                return obj2;
            case 7:
                Tg.e eVar = Ng.Q.f12904a;
                x0 x0Var = u.f16684a;
                if (x0Var != null) {
                    return x0Var;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            case 8:
                return P4.a.f(Re.c.f15466Y);
            case 9:
                return new Ue.a();
            case 10:
                return C1888h.f23785a;
            case 11:
                return Boolean.TRUE;
            default:
                ?? obj3 = new Object();
                obj3.f18728a = new C1683e();
                obj3.f18729b = new C1650a();
                obj3.f18730c = new m(false, 15);
                obj3.f18731d = new E();
                return obj3;
        }
    }
}
