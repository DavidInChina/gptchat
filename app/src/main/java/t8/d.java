package T8;

import N0.E;
import W.Z0;
import W.j4;
import Z.AbstractC1725n;
import Z.r;
import kotlin.jvm.internal.o;
import wf.n;

/* loaded from: classes.dex */
public final class d extends o implements n {

    /* renamed from: Z  reason: collision with root package name */
    public static final d f16960Z = new d(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final d f16961h0 = new d(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f16962Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10) {
        super(2);
        this.f16962Y = i10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16962Y) {
            case 0:
                ((Number) obj2).intValue();
                r rVar = (r) ((AbstractC1725n) obj);
                rVar.W(-1935155269);
                E e10 = (E) rVar.m(j4.f20182a);
                rVar.t(false);
                return e10;
            default:
                ((Number) obj2).intValue();
                r rVar2 = (r) ((AbstractC1725n) obj);
                rVar2.W(659794844);
                long j6 = ((r0.r) rVar2.m(Z0.f19875a)).f44265a;
                rVar2.t(false);
                return new r0.r(j6);
        }
    }
}
