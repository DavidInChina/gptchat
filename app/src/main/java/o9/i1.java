package O9;

import dh.AbstractC2688N;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;

/* loaded from: classes.dex */
public final class i1 extends AbstractC2688N {

    /* renamed from: d  reason: collision with root package name */
    public static final i1 f13544d = new AbstractC2688N(kotlin.jvm.internal.C.f37623a.b(h1.class));

    @Override // dh.AbstractC2688N
    public final KSerializer c(kotlinx.serialization.json.b bVar) {
        AbstractC3557B.c0("element", bVar);
        if (bVar instanceof kotlinx.serialization.json.d) {
            return g1.Companion.serializer();
        }
        return d1.Companion.serializer();
    }
}
