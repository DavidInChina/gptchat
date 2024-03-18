package Dd;

import dh.AbstractC2688N;
import eh.AbstractC2911k;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;

/* renamed from: Dd.n  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0393n extends AbstractC2688N {

    /* renamed from: d  reason: collision with root package name */
    public static final C0393n f3564d = new AbstractC2688N(kotlin.jvm.internal.C.f37623a.b(AbstractC0392m.class));

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
            if (hashCode != -2088972283) {
                if (hashCode != -820018810) {
                    if (hashCode == 378231863 && str.equals("state_update")) {
                        return C0398t.Companion.serializer();
                    }
                } else if (str.equals("action_request")) {
                    return C0382c.Companion.serializer();
                }
            } else if (str.equals("conversation_update")) {
                return C0385f.Companion.serializer();
            }
        }
        return y.INSTANCE.serializer();
    }
}
