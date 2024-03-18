package id;

import Z.AbstractC1710f0;
import q0.C5254f;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f33113Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC1710f0 f33114Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(AbstractC1710f0 abstractC1710f0, int i10) {
        super(0);
        this.f33113Y = i10;
        this.f33114Z = abstractC1710f0;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        jf.y yVar = jf.y.f36177a;
        switch (this.f33113Y) {
            case 0:
                mo122invoke();
                return yVar;
            case 1:
                mo122invoke();
                return yVar;
            case 2:
                mo122invoke();
                return yVar;
            default:
                return new C5254f(((C5254f) this.f33114Z.getValue()).f43640a);
        }
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke  reason: collision with other method in class */
    public final void mo122invoke() {
        int i10 = this.f33113Y;
        AbstractC1710f0 abstractC1710f0 = this.f33114Z;
        switch (i10) {
            case 0:
                abstractC1710f0.setValue(null);
                return;
            case 1:
                abstractC1710f0.setValue(Boolean.valueOf(!((Boolean) abstractC1710f0.getValue()).booleanValue()));
                return;
            default:
                abstractC1710f0.setValue(Boolean.valueOf(!((Boolean) abstractC1710f0.getValue()).booleanValue()));
                return;
        }
    }
}
