package ug;

import java.util.List;
import l8.AbstractC4344b;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f46799Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ r f46800Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(r rVar, int i10) {
        super(0);
        this.f46799Y = i10;
        this.f46800Z = rVar;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final List mo122invoke() {
        int i10 = this.f46799Y;
        r rVar = this.f46800Z;
        switch (i10) {
            case 0:
                return AbstractC4344b.G0(R4.b.f0(rVar.f46802b), R4.b.g0(rVar.f46802b));
            default:
                if (rVar.f46803c) {
                    return AbstractC4344b.H0(R4.b.e0(rVar.f46802b));
                }
                return kf.v.f37483Y;
        }
    }
}
