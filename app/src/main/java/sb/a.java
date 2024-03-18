package Sb;

import Rb.C;
import Rb.M;
import id.AbstractC3557B;
import java.util.List;
import kf.AbstractC4268D;
import kf.t;
import kf.v;
import kf.w;
import kotlin.jvm.internal.o;
import wf.k;

/* loaded from: classes.dex */
public final class a extends o implements k {

    /* renamed from: Z  reason: collision with root package name */
    public static final a f16480Z = new a(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final a f16481h0 = new a(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final a f16482i0 = new a(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final a f16483j0 = new a(3);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f16484Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10) {
        super(1);
        this.f16484Y = i10;
    }

    public final M a(M m10) {
        switch (this.f16484Y) {
            case 0:
                AbstractC3557B.c0("$this$setState", m10);
                List list = m10.f15278c;
                return M.e(m10, null, null, t.a2(list), false, AbstractC4268D.b1(t.P2(((C) t.o2(list)).f15258j), m10.f15280e), 11);
            case 1:
                AbstractC3557B.c0("$this$setState", m10);
                return M.e(m10, null, null, v.f37483Y, false, w.f37484Y, 3);
            case 2:
                AbstractC3557B.c0("$this$setState", m10);
                return M.e(m10, null, null, null, true, null, 23);
            default:
                AbstractC3557B.c0("$this$setState", m10);
                return M.e(m10, null, null, null, false, null, 23);
        }
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f16484Y) {
            case 0:
                return a((M) obj);
            case 1:
                return a((M) obj);
            case 2:
                return a((M) obj);
            default:
                return a((M) obj);
        }
    }
}
