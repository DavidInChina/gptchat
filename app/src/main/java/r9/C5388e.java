package r9;

import Z.AbstractC1710f0;
import na.D0;
import wf.AbstractC6216a;

/* renamed from: r9.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5388e extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f44544Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f44545Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1710f0 f44546h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5388e(AbstractC1710f0 abstractC1710f0, AbstractC6216a abstractC6216a) {
        super(0);
        this.f44544Y = 0;
        this.f44546h0 = abstractC1710f0;
        this.f44545Z = abstractC6216a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5388e(AbstractC6216a abstractC6216a, AbstractC1710f0 abstractC1710f0, int i10) {
        super(0);
        this.f44544Y = i10;
        this.f44545Z = abstractC6216a;
        this.f44546h0 = abstractC1710f0;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        int i10 = this.f44544Y;
        AbstractC1710f0 abstractC1710f0 = this.f44546h0;
        AbstractC6216a abstractC6216a = this.f44545Z;
        switch (i10) {
            case 0:
                if (((Boolean) abstractC1710f0.getValue()).booleanValue()) {
                    return;
                }
                abstractC1710f0.setValue(Boolean.TRUE);
                abstractC6216a.mo122invoke();
                return;
            case 1:
                float f6 = D0.f39745a;
                abstractC1710f0.setValue(Boolean.FALSE);
                abstractC6216a.mo122invoke();
                return;
            case 2:
                abstractC1710f0.setValue(Boolean.FALSE);
                abstractC6216a.mo122invoke();
                return;
            default:
                abstractC6216a.mo122invoke();
                int i11 = nc.y.f40262a;
                abstractC1710f0.setValue(Boolean.TRUE);
                return;
        }
    }
}
