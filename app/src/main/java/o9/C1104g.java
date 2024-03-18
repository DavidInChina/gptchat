package O9;

import android.gov.nist.javax.sip.header.ParameterNames;
import dh.AbstractC2688N;
import eh.AbstractC2911k;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;

/* renamed from: O9.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1104g extends AbstractC2688N {

    /* renamed from: d  reason: collision with root package name */
    public static final C1104g f13536d = new AbstractC2688N(kotlin.jvm.internal.C.f37623a.b(AbstractC1102f.class));

    @Override // dh.AbstractC2688N
    public final KSerializer c(kotlinx.serialization.json.b bVar) {
        String str;
        AbstractC3557B.c0("element", bVar);
        kotlinx.serialization.json.b bVar2 = (kotlinx.serialization.json.b) AbstractC2911k.g(bVar).get("content_type");
        if (bVar2 != null) {
            str = AbstractC2911k.e(AbstractC2911k.h(bVar2));
        } else {
            str = null;
        }
        EnumC1098d[] enumC1098dArr = EnumC1098d.f13527Y;
        if (AbstractC3557B.K(str, ParameterNames.TEXT)) {
            return n1.Companion.serializer();
        }
        if (AbstractC3557B.K(str, "execution_output")) {
            return K.Companion.serializer();
        }
        if (AbstractC3557B.K(str, "code") || AbstractC3557B.K(str, "tether_browsing_code")) {
            return C1096c.Companion.serializer();
        }
        if (AbstractC3557B.K(str, "multimodal_text")) {
            return Z0.Companion.serializer();
        }
        if (AbstractC3557B.K(str, "system_error")) {
            return k1.INSTANCE.serializer();
        }
        return p1.INSTANCE.serializer();
    }
}
