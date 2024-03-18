package d1;

import E0.c0;
import jf.y;

/* renamed from: d1.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2567b extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final C2567b f27847Z = new C2567b(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C2567b f27848h0 = new C2567b(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C2567b f27849i0 = new C2567b(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final C2567b f27850j0 = new C2567b(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final C2567b f27851k0 = new C2567b(4);

    /* renamed from: l0  reason: collision with root package name */
    public static final C2567b f27852l0 = new C2567b(5);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f27853Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2567b(int i10) {
        super(1);
        this.f27853Y = i10;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        y yVar = y.f36177a;
        int i10 = this.f27853Y;
        switch (i10) {
            case 0:
                L0.v vVar = (L0.v) obj;
                switch (i10) {
                    case 0:
                        Df.v[] vVarArr = L0.t.f10472a;
                        ((L0.j) vVar).y(L0.r.f10463s, yVar);
                        break;
                    default:
                        Df.v[] vVarArr2 = L0.t.f10472a;
                        ((L0.j) vVar).y(L0.r.f10462r, yVar);
                        break;
                }
                return yVar;
            case 1:
                ((Number) obj).longValue();
                return yVar;
            case 2:
                c0 c0Var = (c0) obj;
                return yVar;
            case 3:
                L0.v vVar2 = (L0.v) obj;
                switch (i10) {
                    case 0:
                        Df.v[] vVarArr3 = L0.t.f10472a;
                        ((L0.j) vVar2).y(L0.r.f10463s, yVar);
                        break;
                    default:
                        Df.v[] vVarArr4 = L0.t.f10472a;
                        ((L0.j) vVar2).y(L0.r.f10462r, yVar);
                        break;
                }
                return yVar;
            case 4:
                c0 c0Var2 = (c0) obj;
                return yVar;
            default:
                C2584s c2584s = (C2584s) obj;
                if (c2584s.isAttachedToWindow()) {
                    c2584s.m();
                }
                return yVar;
        }
    }
}
