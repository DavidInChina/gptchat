package Xb;

import jf.y;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f21825Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ j f21826Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(j jVar, int i10) {
        super(0);
        this.f21825Y = i10;
        this.f21826Z = jVar;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        y yVar = y.f36177a;
        e eVar = e.f21820a;
        f fVar = f.f21821a;
        j jVar = this.f21826Z;
        int i10 = this.f21825Y;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        jVar.j(eVar);
                        break;
                    default:
                        jVar.j(fVar);
                        break;
                }
                return yVar;
            default:
                switch (i10) {
                    case 0:
                        jVar.j(eVar);
                        break;
                    default:
                        jVar.j(fVar);
                        break;
                }
                return yVar;
        }
    }
}
