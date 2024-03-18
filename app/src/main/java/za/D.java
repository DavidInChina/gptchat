package Za;

import dh.AbstractC2688N;
import eh.AbstractC2911k;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;

/* loaded from: classes2.dex */
public final class D extends AbstractC2688N {

    /* renamed from: d  reason: collision with root package name */
    public static final D f23445d = new AbstractC2688N(kotlin.jvm.internal.C.f37623a.b(C.class));

    @Override // dh.AbstractC2688N
    public final KSerializer c(kotlinx.serialization.json.b bVar) {
        String str;
        AbstractC3557B.c0("element", bVar);
        kotlinx.serialization.json.b bVar2 = (kotlinx.serialization.json.b) AbstractC2911k.g(bVar).get("type");
        if (bVar2 != null) {
            str = AbstractC2911k.e(AbstractC2911k.h(bVar2));
        } else {
            str = null;
        }
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -938102371) {
                if (hashCode != 50511102) {
                    if (hashCode == 1529289095 && str.equals("generic_title_subtitle")) {
                        return C1879y.Companion.serializer();
                    }
                } else if (str.equals("category")) {
                    return C1874u.Companion.serializer();
                }
            } else if (str.equals("rating")) {
                return B.Companion.serializer();
            }
        }
        throw new IllegalArgumentException("Unknown type for ApiGizmoAboutBlock");
    }
}
