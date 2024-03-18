package Lf;

import Bg.D;
import id.AbstractC3557B;
import java.util.List;
import l8.AbstractC4344b;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class m extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f11104Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ q f11105Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(q qVar, int i10) {
        super(0);
        this.f11104Y = i10;
        this.f11105Z = qVar;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        int i10 = this.f11104Y;
        q qVar = this.f11105Z;
        switch (i10) {
            case 0:
                D e10 = qVar.f11114a.j().e();
                AbstractC3557B.b0("getAnyType(...)", e10);
                return e10;
            default:
                List F02 = AbstractC4344b.F0(Nf.f.a(qVar.f11114a.j(), "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", null, 6));
                if (F02.isEmpty()) {
                    return Nf.h.f12822a;
                }
                return new Nf.j(0, F02);
        }
    }
}
