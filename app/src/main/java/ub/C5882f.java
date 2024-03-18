package ub;

import aa.C1939b;
import ha.K;
import jf.C3959i;
import wf.AbstractC6216a;

/* renamed from: ub.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5882f extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f46551Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.k f46552Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C1939b f46553h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ K f46554i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5882f(wf.k kVar, C1939b c1939b, K k10, int i10) {
        super(0);
        this.f46551Y = i10;
        this.f46552Z = kVar;
        this.f46553h0 = c1939b;
        this.f46554i0 = k10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        int i10 = this.f46551Y;
        wf.k kVar = this.f46552Z;
        K k10 = this.f46554i0;
        C1939b c1939b = this.f46553h0;
        switch (i10) {
            case 0:
                kVar.invoke(new C3959i(c1939b, k10));
                return;
            case 1:
                kVar.invoke(new C3959i(c1939b, k10));
                return;
            case 2:
                kVar.invoke(new C3959i(c1939b, k10));
                return;
            default:
                kVar.invoke(new C3959i(c1939b, k10));
                return;
        }
    }
}
