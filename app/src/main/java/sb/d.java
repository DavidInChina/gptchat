package Sb;

import Rb.AbstractC1279z;
import Rb.C1277x;
import Rb.C1278y;
import Rb.M;
import id.AbstractC3557B;
import jf.C3959i;
import kf.AbstractC4268D;
import kf.t;
import kotlin.jvm.internal.o;
import wf.k;

/* loaded from: classes.dex */
public final class d extends o implements k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f16492Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC1279z f16493Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(AbstractC1279z abstractC1279z, int i10) {
        super(1);
        this.f16492Y = i10;
        this.f16493Z = abstractC1279z;
    }

    public final M a(M m10) {
        int i10 = this.f16492Y;
        AbstractC1279z abstractC1279z = this.f16493Z;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("$this$setState", m10);
                return M.e(m10, null, null, t.x2(((C1277x) abstractC1279z).f15379b, m10.f15278c), false, null, 27);
            default:
                AbstractC3557B.c0("$this$setState", m10);
                C1278y c1278y = (C1278y) abstractC1279z;
                return M.e(m10, null, null, null, false, AbstractC4268D.g1(m10.f15280e, new C3959i(c1278y.f15380a, c1278y.f15381b)), 15);
        }
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f16492Y) {
            case 0:
                return a((M) obj);
            default:
                return a((M) obj);
        }
    }
}
