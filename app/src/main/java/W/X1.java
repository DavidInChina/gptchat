package W;

import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class X1 extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f19826Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f19827Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ X1(AbstractC6216a abstractC6216a, int i10) {
        super(0);
        this.f19826Y = i10;
        this.f19827Z = abstractC6216a;
    }

    public final Float a() {
        int i10 = this.f19826Y;
        AbstractC6216a abstractC6216a = this.f19827Z;
        switch (i10) {
            case 1:
                return Float.valueOf(com.google.android.gms.internal.play_billing.N.o(((Number) abstractC6216a.mo122invoke()).floatValue(), 0.0f, 1.0f));
            default:
                return Float.valueOf(com.google.android.gms.internal.play_billing.N.o(((Number) abstractC6216a.mo122invoke()).floatValue(), 0.0f, 1.0f));
        }
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        switch (this.f19826Y) {
            case 0:
                this.f19827Z.mo122invoke();
                return Boolean.TRUE;
            case 1:
                return a();
            default:
                return a();
        }
    }
}
