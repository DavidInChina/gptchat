package Ga;

import L9.AbstractC0905k;
import L9.C0906l;
import L9.C0907m;
import L9.C0910p;
import L9.C0912s;
import L9.C0915v;
import L9.C0918y;
import L9.I;
import dh.AbstractC2688N;
import eh.AbstractC2911k;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.JsonNull;
import x8.W;

/* loaded from: classes.dex */
public final class s extends AbstractC2688N {

    /* renamed from: d  reason: collision with root package name */
    public static final s f6236d = new AbstractC2688N(kotlin.jvm.internal.C.f37623a.b(AbstractC0905k.class));

    public static AbstractC0905k e(String str) {
        AbstractC3557B.c0("str", str);
        if (Lg.n.I2(str, "data: [DONE]", false)) {
            return C0907m.f10941a;
        }
        if (Lg.n.I2(str, "data:", false)) {
            try {
                return (AbstractC0905k) md.b.f39132a.b(f6236d, Lg.n.v2("data:", str));
            } catch (IllegalArgumentException e10) {
                return new C0906l(e10);
            }
        }
        return null;
    }

    @Override // dh.AbstractC2688N
    public final KSerializer c(kotlinx.serialization.json.b bVar) {
        AbstractC3557B.c0("element", bVar);
        if (bVar instanceof kotlinx.serialization.json.c) {
            if (AbstractC2911k.g(bVar).containsKey("moderation_response")) {
                return C0918y.Companion.serializer();
            }
            if (AbstractC3557B.K(AbstractC2911k.g(bVar).get("type"), F.f6198a)) {
                return C0912s.Companion.serializer();
            }
            if (AbstractC3557B.K(AbstractC2911k.g(bVar).get("type"), F.f6199b)) {
                return I.Companion.serializer();
            }
            if (AbstractC2911k.g(bVar).get("error") != null && !(AbstractC2911k.g(bVar).get("error") instanceof JsonNull)) {
                return C0910p.Companion.serializer();
            }
            KSerializer serializer = C0915v.Companion.serializer();
            Pc.c a5 = Pc.e.a();
            W.F(a5, "ConversationStreamDataSerializer element: " + bVar, null, 6);
            return serializer;
        }
        throw new IllegalArgumentException(("Invalid JSON element: " + bVar).toString());
    }
}
