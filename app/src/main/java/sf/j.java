package Sf;

import Df.AbstractC0407f;
import id.AbstractC3557B;
import java.lang.reflect.Member;

/* loaded from: classes.dex */
public final /* synthetic */ class j extends kotlin.jvm.internal.j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public static final j f16614Y = new kotlin.jvm.internal.j(1);

    @Override // kotlin.jvm.internal.AbstractC4305d, Df.AbstractC0404c
    public final String getName() {
        return "isSynthetic";
    }

    @Override // kotlin.jvm.internal.AbstractC4305d
    public final AbstractC0407f getOwner() {
        return kotlin.jvm.internal.C.f37623a.b(Member.class);
    }

    @Override // kotlin.jvm.internal.AbstractC4305d
    public final String getSignature() {
        return "isSynthetic()Z";
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        Member member = (Member) obj;
        AbstractC3557B.c0("p0", member);
        return Boolean.valueOf(member.isSynthetic());
    }
}
