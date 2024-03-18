package M1;

import Ng.C1084s;
import id.AbstractC3557B;
import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public final class r extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public static final r f11456Y = new kotlin.jvm.internal.o(2);

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        p pVar = (p) obj;
        Throwable th2 = (Throwable) obj2;
        AbstractC3557B.c0("msg", pVar);
        if (pVar instanceof o) {
            o oVar = (o) pVar;
            if (th2 == null) {
                th2 = new CancellationException("DataStore scope was cancelled before updateData could complete");
            }
            ((C1084s) oVar.f11452b).q0(th2);
        }
        return jf.y.f36177a;
    }
}
