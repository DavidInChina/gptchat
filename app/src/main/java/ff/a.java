package Ff;

import Df.AbstractC0407f;
import fg.C3056y;
import id.AbstractC3557B;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.j;
import wf.n;
import xg.z;

/* loaded from: classes2.dex */
public final /* synthetic */ class a extends j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public static final a f5369Y = new j(2);

    @Override // kotlin.jvm.internal.AbstractC4305d, Df.AbstractC0404c
    public final String getName() {
        return "loadFunction";
    }

    @Override // kotlin.jvm.internal.AbstractC4305d
    public final AbstractC0407f getOwner() {
        return C.f37623a.b(z.class);
    }

    @Override // kotlin.jvm.internal.AbstractC4305d
    public final String getSignature() {
        return "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;";
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        C3056y c3056y = (C3056y) obj2;
        AbstractC3557B.c0("p0", zVar);
        AbstractC3557B.c0("p1", c3056y);
        return zVar.e(c3056y);
    }
}
