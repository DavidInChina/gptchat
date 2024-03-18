package td;

import Pc.e;
import ah.C1999j;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import md.b;
import x8.W;

/* renamed from: td.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5756a {

    /* renamed from: a  reason: collision with root package name */
    public final KSerializer f46115a;

    public C5756a(KSerializer kSerializer) {
        AbstractC3557B.c0("serializer", kSerializer);
        this.f46115a = kSerializer;
    }

    public final Object a(String str) {
        try {
            return b.f39132a.b(this.f46115a, str);
        } catch (C1999j e10) {
            W.W(e.a(), "Could not deserialize for store, falling back to null", e10, null, 4);
            return null;
        }
    }
}
