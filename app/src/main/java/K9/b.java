package k9;

import C6.g;
import android.app.Application;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import f9.C2958j;
import g6.C3202b;
import id.AbstractC3557B;
import java.util.LinkedHashMap;
import java.util.List;
import wd.EnumC6206t;
import yf.AbstractC6583a;

/* loaded from: classes2.dex */
public final class b implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f37202a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f37203b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f37204c;

    public /* synthetic */ b(Object obj, AbstractC2400f abstractC2400f, int i10) {
        this.f37202a = i10;
        this.f37203b = obj;
        this.f37204c = abstractC2400f;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, P5.c] */
    public final g6.d a() {
        int i10 = this.f37202a;
        p000if.a aVar = this.f37204c;
        Object obj = this.f37203b;
        switch (i10) {
            case 0:
                EnumC6206t enumC6206t = (EnumC6206t) aVar.get();
                ((C4204a) obj).getClass();
                AbstractC3557B.c0("appType", enumC6206t);
                return new e6.c(C4204a.f37201a, new S5.c(A7.b.W0(enumC6206t)));
            default:
                EnumC6206t enumC6206t2 = (EnumC6206t) aVar.get();
                ((C4204a) obj).getClass();
                AbstractC3557B.c0("appType", enumC6206t2);
                S5.c cVar = new S5.c(A7.b.W0(enumC6206t2));
                ?? obj2 = new Object();
                List list = C4204a.f37201a;
                AbstractC3557B.c0("tracedHosts", list);
                int n02 = P4.a.n0(AbstractC6583a.H1(list, 10));
                if (n02 < 16) {
                    n02 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(n02);
                for (Object obj3 : list) {
                    String str = (String) obj3;
                    linkedHashMap.put(obj3, R4.b.X1(g.f2720Y, g.f2723i0));
                }
                return new g6.d(null, linkedHashMap, obj2, null, cVar, C3202b.f31285Y);
        }
    }

    @Override // p000if.a
    public final Object get() {
        switch (this.f37202a) {
            case 0:
                return a();
            case 1:
                return a();
            default:
                Application application = (Application) this.f37204c.get();
                ((P5.c) this.f37203b).getClass();
                AbstractC3557B.c0("context", application);
                return new C2958j(0, application);
        }
    }
}
