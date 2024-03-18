package na;

import Z.AbstractC1710f0;
import nf.AbstractC4828h;
import wf.AbstractC6216a;

/* renamed from: na.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4777o extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Z  reason: collision with root package name */
    public static final C4777o f40072Z = new C4777o(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C4777o f40073h0 = new C4777o(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C4777o f40074i0 = new C4777o(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final C4777o f40075j0 = new C4777o(3);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f40076Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4777o(int i10) {
        super(0);
        this.f40076Y = i10;
    }

    public final AbstractC1710f0 a() {
        int i10 = this.f40076Y;
        Z.o1 o1Var = Z.o1.f22665a;
        switch (i10) {
            case 0:
                return AbstractC4828h.Z(Boolean.FALSE, o1Var);
            case 1:
                return AbstractC4828h.Z(Boolean.FALSE, o1Var);
            case 2:
                return AbstractC4828h.Z(Boolean.FALSE, o1Var);
            default:
                return AbstractC4828h.Z(Boolean.FALSE, o1Var);
        }
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo122invoke() {
        switch (this.f40076Y) {
            case 0:
                return a();
            case 1:
                return a();
            case 2:
                return a();
            default:
                return a();
        }
    }
}
