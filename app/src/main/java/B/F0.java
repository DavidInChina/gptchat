package B;

import Z.AbstractC1710f0;

/* loaded from: classes2.dex */
public final class F0 extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f1071Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Z.l1 f1072Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F0(AbstractC1710f0 abstractC1710f0, int i10) {
        super(1);
        this.f1071Y = i10;
        this.f1072Z = abstractC1710f0;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        int i10 = this.f1071Y;
        Z.l1 l1Var = this.f1072Z;
        switch (i10) {
            case 0:
                ((wf.k) l1Var.getValue()).invoke(Float.valueOf(((Number) obj).floatValue()));
                return jf.y.f36177a;
            default:
                return (Float) ((wf.k) l1Var.getValue()).invoke(Float.valueOf(((Number) obj).floatValue()));
        }
    }
}
