package Aa;

import jf.y;
import kotlin.jvm.internal.o;
import wf.AbstractC6216a;
import wf.k;

/* loaded from: classes.dex */
public final class h extends o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f740Y = 1;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ d f741Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ k f742h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(d dVar, k kVar) {
        super(0);
        this.f741Z = dVar;
        this.f742h0 = kVar;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        y yVar = y.f36177a;
        d dVar = this.f741Z;
        k kVar = this.f742h0;
        int i10 = this.f740Y;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        kVar.invoke(dVar);
                        break;
                    default:
                        if (dVar != null) {
                            kVar.invoke(dVar);
                            break;
                        }
                        break;
                }
                return yVar;
            default:
                switch (i10) {
                    case 0:
                        kVar.invoke(dVar);
                        break;
                    default:
                        if (dVar != null) {
                            kVar.invoke(dVar);
                            break;
                        }
                        break;
                }
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, d dVar) {
        super(0);
        this.f742h0 = kVar;
        this.f741Z = dVar;
    }
}
