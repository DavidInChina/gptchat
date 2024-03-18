package r9;

import Z.AbstractC1710f0;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class G extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f44497Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.k f44498Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1710f0 f44499h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ G(wf.k kVar, AbstractC1710f0 abstractC1710f0, int i10) {
        super(0);
        this.f44497Y = i10;
        this.f44498Z = kVar;
        this.f44499h0 = abstractC1710f0;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        int i10 = this.f44497Y;
        AbstractC1710f0 abstractC1710f0 = this.f44499h0;
        wf.k kVar = this.f44498Z;
        switch (i10) {
            case 0:
                abstractC1710f0.setValue("");
                kVar.invoke("");
                return;
            case 1:
                abstractC1710f0.setValue(Boolean.FALSE);
                kVar.invoke(null);
                return;
            default:
                kVar.invoke(nc.q.f40248a);
                abstractC1710f0.setValue(Boolean.FALSE);
                return;
        }
    }
}
