package ec;

import Z.AbstractC1710f0;
import Z.o1;
import nf.AbstractC4828h;
import wf.AbstractC6216a;

/* renamed from: ec.v  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2870v extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Z  reason: collision with root package name */
    public static final C2870v f29252Z = new C2870v(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C2870v f29253h0 = new C2870v(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C2870v f29254i0 = new C2870v(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final C2870v f29255j0 = new C2870v(3);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f29256Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2870v(int i10) {
        super(0);
        this.f29256Y = i10;
    }

    public final AbstractC1710f0 a() {
        int i10 = this.f29256Y;
        o1 o1Var = o1.f22665a;
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
        switch (this.f29256Y) {
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
