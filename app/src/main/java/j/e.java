package J;

import ic.r;
import kotlin.jvm.internal.o;
import wf.AbstractC6216a;
import wf.k;

/* loaded from: classes2.dex */
public final class e extends o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f8726Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ k f8727Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ boolean f8728h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(k kVar, boolean z10, int i10) {
        super(0);
        this.f8726Y = i10;
        this.f8727Z = kVar;
        this.f8728h0 = z10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        int i10 = this.f8726Y;
        k kVar = this.f8727Z;
        boolean z10 = this.f8728h0;
        switch (i10) {
            case 0:
                kVar.invoke(Boolean.valueOf(!z10));
                return;
            case 1:
                kVar.invoke(Boolean.valueOf(!z10));
                return;
            default:
                kVar.invoke(new r(!z10));
                return;
        }
    }
}
