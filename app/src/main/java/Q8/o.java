package Q8;

import jf.y;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class o extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f14517Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.k f14518Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ U3.f f14519h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(wf.k kVar, U3.f fVar, int i10) {
        super(0);
        this.f14517Y = i10;
        this.f14518Z = kVar;
        this.f14519h0 = fVar;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        y yVar = y.f36177a;
        U3.f fVar = this.f14519h0;
        wf.k kVar = this.f14518Z;
        int i10 = this.f14517Y;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        kVar.invoke(((R8.p) fVar).f15158g);
                        break;
                    default:
                        kVar.invoke(((R8.q) fVar).f15161h);
                        break;
                }
                return yVar;
            default:
                switch (i10) {
                    case 0:
                        kVar.invoke(((R8.p) fVar).f15158g);
                        break;
                    default:
                        kVar.invoke(((R8.q) fVar).f15161h);
                        break;
                }
                return yVar;
        }
    }
}
