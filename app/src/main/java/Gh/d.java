package gh;

import Ad.l;
import Df.AbstractC0405d;
import id.AbstractC3557B;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C;
import kotlinx.serialization.KSerializer;
import wf.k;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Map f31633a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f31634b;

    /* renamed from: c  reason: collision with root package name */
    public final Map f31635c;

    /* renamed from: d  reason: collision with root package name */
    public final Map f31636d;

    /* renamed from: e  reason: collision with root package name */
    public final Map f31637e;

    public d(Map map, Map map2, Map map3, Map map4, Map map5) {
        AbstractC3557B.c0("class2ContextualFactory", map);
        AbstractC3557B.c0("polyBase2Serializers", map2);
        AbstractC3557B.c0("polyBase2DefaultSerializerProvider", map3);
        AbstractC3557B.c0("polyBase2NamedSerializers", map4);
        AbstractC3557B.c0("polyBase2DefaultDeserializerProvider", map5);
        this.f31633a = map;
        this.f31634b = map2;
        this.f31635c = map3;
        this.f31636d = map4;
        this.f31637e = map5;
    }

    public final KSerializer a(AbstractC0405d abstractC0405d, List list) {
        KSerializer kSerializer;
        AbstractC3557B.c0("kClass", abstractC0405d);
        AbstractC3557B.c0("typeArgumentsSerializers", list);
        c cVar = (c) this.f31633a.get(abstractC0405d);
        if (cVar != null) {
            kSerializer = cVar.a(list);
        } else {
            kSerializer = null;
        }
        if (!(kSerializer instanceof KSerializer)) {
            return null;
        }
        return kSerializer;
    }

    public final KSerializer b(Object obj, AbstractC0405d abstractC0405d) {
        KSerializer kSerializer;
        k kVar;
        AbstractC3557B.c0("baseClass", abstractC0405d);
        AbstractC3557B.c0("value", obj);
        if (!abstractC0405d.r(obj)) {
            return null;
        }
        Map map = (Map) this.f31634b.get(abstractC0405d);
        if (map != null) {
            kSerializer = (KSerializer) map.get(C.f37623a.b(obj.getClass()));
        } else {
            kSerializer = null;
        }
        if (!(kSerializer instanceof KSerializer)) {
            kSerializer = null;
        }
        if (kSerializer != null) {
            return kSerializer;
        }
        Object obj2 = this.f31635c.get(abstractC0405d);
        if (l.J0(1, obj2)) {
            kVar = (k) obj2;
        } else {
            kVar = null;
        }
        if (kVar == null) {
            return null;
        }
        return (KSerializer) kVar.invoke(obj);
    }
}
