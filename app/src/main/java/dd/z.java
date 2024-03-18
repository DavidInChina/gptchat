package Dd;

import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Set;
import xe.AbstractC6412a;
import xe.C6405J;
import xe.C6408M;

/* loaded from: classes2.dex */
public final class z extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public static final z f3583Y = new kotlin.jvm.internal.o(2);

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        C6405J c6405j = (C6405J) obj;
        AbstractC3557B.c0("$this$url", c6405j);
        AbstractC3557B.c0("it", (C6405J) obj2);
        c6405j.e(new C6408M("http", 1));
        c6405j.d("10.0.2.2:8005");
        ArrayList arrayList = new ArrayList(1);
        String str = new String[]{"get_token"}[0];
        Set set = AbstractC6412a.f49873a;
        AbstractC3557B.c0("<this>", str);
        arrayList.add(AbstractC6412a.g(str, false));
        c6405j.c(arrayList);
        return jf.y.f36177a;
    }
}
