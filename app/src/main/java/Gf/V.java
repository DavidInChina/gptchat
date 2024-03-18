package Gf;

import Df.AbstractC0407f;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final /* synthetic */ class V extends kotlin.jvm.internal.j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public static final V f6370Y = new kotlin.jvm.internal.j(2);

    @Override // kotlin.jvm.internal.AbstractC4305d, Df.AbstractC0404c
    public final String getName() {
        return "loadProperty";
    }

    @Override // kotlin.jvm.internal.AbstractC4305d
    public final AbstractC0407f getOwner() {
        return kotlin.jvm.internal.C.f37623a.b(xg.z.class);
    }

    @Override // kotlin.jvm.internal.AbstractC4305d
    public final String getSignature() {
        return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        xg.z zVar = (xg.z) obj;
        fg.G g10 = (fg.G) obj2;
        AbstractC3557B.c0("p0", zVar);
        AbstractC3557B.c0("p1", g10);
        return zVar.f(g10);
    }
}
