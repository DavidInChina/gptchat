package Jd;

import jf.y;
import kotlin.jvm.internal.o;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class g extends o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f9093Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ i f9094Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(i iVar, int i10) {
        super(0);
        this.f9093Y = i10;
        this.f9094Z = iVar;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        y yVar = y.f36177a;
        d dVar = d.f9091a;
        c cVar = c.f9090a;
        i iVar = this.f9094Z;
        int i10 = this.f9093Y;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        iVar.j(dVar);
                        break;
                    default:
                        iVar.j(cVar);
                        break;
                }
                return yVar;
            default:
                switch (i10) {
                    case 0:
                        iVar.j(dVar);
                        break;
                    default:
                        iVar.j(cVar);
                        break;
                }
                return yVar;
        }
    }
}
