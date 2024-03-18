package G;

import java.util.Map;

/* loaded from: classes.dex */
public final class a0 extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f5482Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ i0.m f5483Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(i0.m mVar, int i10) {
        super(1);
        this.f5482Y = i10;
        this.f5483Z = mVar;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        boolean z10;
        int i10 = this.f5482Y;
        i0.m mVar = this.f5483Z;
        switch (i10) {
            case 0:
                if (mVar != null) {
                    z10 = mVar.a(obj);
                } else {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            default:
                return new c0(mVar, (Map) obj);
        }
    }
}
