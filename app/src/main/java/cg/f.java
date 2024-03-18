package Cg;

import Df.AbstractC0407f;
import id.AbstractC3557B;
import kotlin.jvm.internal.C;

/* loaded from: classes.dex */
public final /* synthetic */ class f extends kotlin.jvm.internal.j implements wf.k {
    @Override // kotlin.jvm.internal.AbstractC4305d, Df.AbstractC0404c
    public final String getName() {
        return "prepareType";
    }

    @Override // kotlin.jvm.internal.AbstractC4305d
    public final AbstractC0407f getOwner() {
        return C.f37623a.b(g.class);
    }

    @Override // kotlin.jvm.internal.AbstractC4305d
    public final String getSignature() {
        return "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;";
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        Eg.f fVar = (Eg.f) obj;
        AbstractC3557B.c0("p0", fVar);
        return ((g) this.receiver).a(fVar);
    }
}
