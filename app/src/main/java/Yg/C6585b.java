package yg;

import Df.AbstractC0407f;
import id.AbstractC3557B;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.j;
import wf.k;

/* renamed from: yg.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C6585b extends j implements k {
    @Override // kotlin.jvm.internal.AbstractC4305d, Df.AbstractC0404c
    public final String getName() {
        return "loadResource";
    }

    @Override // kotlin.jvm.internal.AbstractC4305d
    public final AbstractC0407f getOwner() {
        return C.f37623a.b(C6588e.class);
    }

    @Override // kotlin.jvm.internal.AbstractC4305d
    public final String getSignature() {
        return "loadResource(Ljava/lang/String;)Ljava/io/InputStream;";
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        String str = (String) obj;
        AbstractC3557B.c0("p0", str);
        ((C6588e) this.receiver).getClass();
        return C6588e.a(str);
    }
}
