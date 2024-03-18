package nc;

import ca.AbstractC2318j;
import gb.k0;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final e f40227Z = new e(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final e f40228h0 = new e(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final e f40229i0 = new e(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final e f40230j0 = new e(3);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f40231Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10) {
        super(1);
        this.f40231Y = i10;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f40231Y;
        switch (i10) {
            case 0:
                AbstractC2318j abstractC2318j = (AbstractC2318j) obj;
                AbstractC3557B.c0("it", abstractC2318j);
                return abstractC2318j.a();
            case 1:
                k0 k0Var = (k0) obj;
                switch (i10) {
                    case 1:
                        AbstractC3557B.c0("it", k0Var);
                        break;
                    default:
                        AbstractC3557B.c0("it", k0Var);
                        break;
                }
                return yVar;
            case 2:
                k0 k0Var2 = (k0) obj;
                switch (i10) {
                    case 1:
                        AbstractC3557B.c0("it", k0Var2);
                        break;
                    default:
                        AbstractC3557B.c0("it", k0Var2);
                        break;
                }
                return yVar;
            default:
                return null;
        }
    }
}
