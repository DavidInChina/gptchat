package sb;

import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public static final k f45514Y = new kotlin.jvm.internal.o(1);

    @Override // wf.k
    public final Object invoke(Object obj) {
        List<String> list = (List) obj;
        AbstractC3557B.c0("names", list);
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list, 10));
        for (String str : list) {
            arrayList.add(M9.l.valueOf(str));
        }
        j0.u uVar = new j0.u();
        uVar.addAll(arrayList);
        return uVar;
    }
}
