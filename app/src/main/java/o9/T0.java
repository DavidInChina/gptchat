package O9;

import dh.AbstractC2688N;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;

/* loaded from: classes2.dex */
public final class T0 extends AbstractC2688N {

    /* renamed from: d  reason: collision with root package name */
    public static final T0 f13499d = new AbstractC2688N(kotlin.jvm.internal.C.f37623a.b(S0.class));

    @Override // dh.AbstractC2688N
    public final KSerializer c(kotlinx.serialization.json.b bVar) {
        kotlinx.serialization.json.c cVar;
        kotlinx.serialization.json.d dVar;
        AbstractC3557B.c0("element", bVar);
        String str = null;
        if (bVar instanceof kotlinx.serialization.json.c) {
            cVar = (kotlinx.serialization.json.c) bVar;
        } else {
            cVar = null;
        }
        if (cVar != null) {
            Object obj = cVar.get("type");
            if (obj instanceof kotlinx.serialization.json.d) {
                dVar = (kotlinx.serialization.json.d) obj;
            } else {
                dVar = null;
            }
            if (dVar != null) {
                str = dVar.r();
            }
            if (AbstractC3557B.K(str, "file")) {
                return O0.Companion.serializer();
            }
            return R0.Companion.serializer();
        }
        throw new IllegalArgumentException("Expected JsonObject");
    }
}
