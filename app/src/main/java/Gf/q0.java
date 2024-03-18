package Gf;

import Sf.AbstractC1385d;
import id.AbstractC3557B;
import java.lang.reflect.Type;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class q0 extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f6456Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ r0 f6457Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(r0 r0Var, int i10) {
        super(0);
        this.f6456Y = i10;
        this.f6457Z = r0Var;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        Type type;
        int i10 = this.f6456Y;
        r0 r0Var = this.f6457Z;
        switch (i10) {
            case 0:
                v0 v0Var = r0Var.f6461Z;
                if (v0Var != null) {
                    type = (Type) v0Var.mo122invoke();
                } else {
                    type = null;
                }
                AbstractC3557B.Z(type);
                return AbstractC1385d.c(type);
            default:
                return r0Var.f(r0Var.f6460Y);
        }
    }
}
