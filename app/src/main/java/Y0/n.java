package Y0;

import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f22037Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ o f22038Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(o oVar, int i10) {
        super(0);
        this.f22037Y = i10;
        this.f22038Z = oVar;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        int i10 = this.f22037Y;
        o oVar = this.f22038Z;
        switch (i10) {
            case 0:
                return Float.valueOf(oVar.a());
            default:
                return oVar;
        }
    }
}
