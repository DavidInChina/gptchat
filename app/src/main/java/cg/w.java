package Cg;

import Bg.A;
import Df.AbstractC0407f;
import id.AbstractC3557B;
import kotlin.jvm.internal.C;

/* loaded from: classes.dex */
public final /* synthetic */ class w extends kotlin.jvm.internal.j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f3154Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(int i10, Object obj) {
        super(2, obj);
        this.f3154Y = i10;
    }

    public final Boolean f(A a5, A a10) {
        boolean z10;
        switch (this.f3154Y) {
            case 0:
                AbstractC3557B.c0("p0", a5);
                AbstractC3557B.c0("p1", a10);
                ((x) this.receiver).getClass();
                n.f3142b.getClass();
                o oVar = m.f3141b;
                if (oVar.b(a5, a10) && !oVar.b(a10, a5)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                AbstractC3557B.c0("p0", a5);
                AbstractC3557B.c0("p1", a10);
                return Boolean.valueOf(((o) this.receiver).a(a5, a10));
        }
    }

    @Override // kotlin.jvm.internal.AbstractC4305d, Df.AbstractC0404c
    public final String getName() {
        switch (this.f3154Y) {
            case 0:
                return "isStrictSupertype";
            default:
                return "equalTypes";
        }
    }

    @Override // kotlin.jvm.internal.AbstractC4305d
    public final AbstractC0407f getOwner() {
        switch (this.f3154Y) {
            case 0:
                return C.f37623a.b(x.class);
            default:
                return C.f37623a.b(o.class);
        }
    }

    @Override // kotlin.jvm.internal.AbstractC4305d
    public final String getSignature() {
        switch (this.f3154Y) {
            case 0:
                return "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
            default:
                return "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f3154Y) {
            case 0:
                return f((A) obj, (A) obj2);
            default:
                return f((A) obj, (A) obj2);
        }
    }
}
