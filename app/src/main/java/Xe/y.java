package Xe;

import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class y extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f21943Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ z f21944Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(z zVar, int i10) {
        super(0);
        this.f21943Y = i10;
        this.f21944Z = zVar;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        z zVar = this.f21944Z;
        int i10 = this.f21943Y;
        switch (i10) {
            case 0:
                zVar.b().dispose();
                return jf.y.f36177a;
            case 1:
                switch (i10) {
                    case 1:
                        return Boolean.valueOf(zVar.b().setEnabled(true));
                    default:
                        return Boolean.valueOf(zVar.b().setEnabled(false));
                }
            default:
                switch (i10) {
                    case 1:
                        return Boolean.valueOf(zVar.b().setEnabled(true));
                    default:
                        return Boolean.valueOf(zVar.b().setEnabled(false));
                }
        }
    }
}
