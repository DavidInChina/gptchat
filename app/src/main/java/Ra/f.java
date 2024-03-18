package Ra;

import android.gov.nist.core.Separators;
import id.x;

/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f15196Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ x f15197Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(x xVar, int i10) {
        super(1);
        this.f15196Y = i10;
        this.f15197Z = xVar;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        int i10 = this.f15196Y;
        x xVar = this.f15197Z;
        switch (i10) {
            case 0:
                return android.gov.nist.core.a.A(Separators.DOUBLE_QUOTE, xVar.a(((Number) obj).intValue()), Separators.DOUBLE_QUOTE);
            default:
                long j6 = ((id.m) obj).f33107a;
                String a5 = xVar.a((int) (4294967295L & j6));
                return ((int) (j6 >> 32)) + ",\"" + a5 + Separators.DOUBLE_QUOTE;
        }
    }
}
