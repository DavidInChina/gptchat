package ib;

import H.F;
import java.util.List;
import kotlin.jvm.internal.o;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class i extends o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f32924Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.k f32925Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ List f32926h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ F f32927i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(wf.k kVar, List list, F f6, int i10) {
        super(0);
        this.f32924Y = i10;
        this.f32925Z = kVar;
        this.f32926h0 = list;
        this.f32927i0 = f6;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        int i10 = this.f32924Y;
        wf.k kVar = this.f32925Z;
        List list = this.f32926h0;
        F f6 = this.f32927i0;
        switch (i10) {
            case 0:
                kVar.invoke(list.get(f6.f6549d.f6527b.h()));
                return;
            default:
                kVar.invoke(list.get(f6.f6549d.f6527b.h()));
                return;
        }
    }
}
