package Da;

import b4.AbstractC2121b;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import md.b;

/* loaded from: classes2.dex */
public final class a implements AbstractC2121b {

    /* renamed from: Y  reason: collision with root package name */
    public final KSerializer f3440Y;

    public a(KSerializer kSerializer) {
        AbstractC3557B.c0("serializer", kSerializer);
        this.f3440Y = kSerializer;
    }

    @Override // b4.AbstractC2121b
    public final String d(Object obj) {
        AbstractC3557B.c0("value", obj);
        return b.f39132a.d(this.f3440Y, obj);
    }

    @Override // b4.AbstractC2121b
    public final Object g(String str) {
        return b.f39132a.b(this.f3440Y, str);
    }
}
