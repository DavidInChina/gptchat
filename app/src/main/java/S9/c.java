package S9;

import id.AbstractC3557B;
import kotlin.jvm.internal.o;
import wf.k;

/* loaded from: classes.dex */
public final class c extends o implements k {

    /* renamed from: Y  reason: collision with root package name */
    public static final c f16407Y = new o(1);

    @Override // wf.k
    public final Object invoke(Object obj) {
        kotlinx.serialization.json.d dVar;
        String r10;
        kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) obj;
        AbstractC3557B.c0("it", bVar);
        if (bVar instanceof kotlinx.serialization.json.d) {
            dVar = (kotlinx.serialization.json.d) bVar;
        } else {
            dVar = null;
        }
        if (dVar == null || (r10 = dVar.r()) == null) {
            return bVar.toString();
        }
        return r10;
    }
}
