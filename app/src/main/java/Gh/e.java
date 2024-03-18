package gh;

import Ad.t;
import Df.AbstractC0405d;
import id.AbstractC3557B;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f31638a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f31639b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f31640c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f31641d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final HashMap f31642e = new HashMap();

    public static void a(e eVar, AbstractC0405d abstractC0405d, c cVar) {
        eVar.getClass();
        AbstractC3557B.c0("forClass", abstractC0405d);
        HashMap hashMap = eVar.f31638a;
        c cVar2 = (c) hashMap.get(abstractC0405d);
        if (cVar2 != null && !AbstractC3557B.K(cVar2, cVar)) {
            throw new t("Contextual serializer or serializer provider for " + abstractC0405d + " already registered in this module", 3);
        }
        hashMap.put(abstractC0405d, cVar);
    }
}
