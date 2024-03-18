package ya;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import jf.y;

/* renamed from: ya.s  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6571s extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ long f50877Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f50878Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6571s(long j6, int i10) {
        super(2);
        this.f50877Y = j6;
        this.f50878Z = i10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p10 = AbstractC1734s.p(this.f50878Z | 1);
        K8.d.i0(this.f50877Y, (AbstractC1725n) obj, p10);
        return y.f36177a;
    }
}
