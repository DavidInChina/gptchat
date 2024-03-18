package Gf;

import jf.AbstractC3957g;
import jf.EnumC3958h;
import l8.AbstractC4344b;

/* loaded from: classes2.dex */
public final class U extends D {

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ Df.v[] f6365g;

    /* renamed from: c  reason: collision with root package name */
    public final v0 f6366c;

    /* renamed from: d  reason: collision with root package name */
    public final v0 f6367d = AbstractC4344b.C0(new T(this, 1));

    /* renamed from: e  reason: collision with root package name */
    public final AbstractC3957g f6368e;

    /* renamed from: f  reason: collision with root package name */
    public final AbstractC3957g f6369f;

    static {
        kotlin.jvm.internal.D d10 = kotlin.jvm.internal.C.f37623a;
        f6365g = new Df.v[]{d10.g(new kotlin.jvm.internal.u(d10.b(U.class), "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;")), d10.g(new kotlin.jvm.internal.u(d10.b(U.class), "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;")), d10.g(new kotlin.jvm.internal.u(d10.b(U.class), "members", "getMembers()Ljava/util/Collection;"))};
    }

    public U(W w10) {
        super(w10);
        this.f6366c = AbstractC4344b.C0(new Q(w10, 0));
        EnumC3958h enumC3958h = EnumC3958h.f36152Y;
        this.f6368e = R4.b.C1(enumC3958h, new S(this, w10));
        this.f6369f = R4.b.C1(enumC3958h, new T(this, 0));
        AbstractC4344b.C0(new S(w10, this));
    }
}
