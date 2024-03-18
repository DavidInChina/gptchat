package ub;

import E.q0;
import Ng.H;
import W.j4;
import Z.AbstractC1725n;
import com.openai.chatgpt.R;
import ha.C3354G;
import ha.C3357J;
import ha.C3381y;
import ha.K;
import id.AbstractC3557B;
import l0.AbstractC4326r;

/* loaded from: classes2.dex */
public final class g extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f46555Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ K f46556Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(K k10, int i10) {
        super(3);
        this.f46555Y = i10;
        this.f46556Z = k10;
    }

    public final void a(q0 q0Var, AbstractC1725n abstractC1725n, int i10) {
        int i11;
        int i12;
        int i13 = this.f46555Y;
        K k10 = this.f46556Z;
        switch (i13) {
            case 0:
                AbstractC3557B.c0("$this$Button", q0Var);
                AbstractC4326r a5 = io.sentry.compose.b.a("ActionButton");
                if ((i10 & 81) == 16) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                int ordinal = ((C3381y) k10).f32089b.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        i11 = R.string.tool_function_confirm;
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    i11 = R.string.tool_function_allow;
                }
                j4.b(H.v(i11, abstractC1725n), a5, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
            case 1:
                AbstractC3557B.c0("$this$OutlinedButton", q0Var);
                AbstractC4326r a10 = io.sentry.compose.b.a("ActionButton");
                if ((i10 & 81) == 16) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                int ordinal2 = ((C3354G) k10).f32007b.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        i12 = R.string.tool_function_deny;
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    i12 = R.string.tool_function_decline;
                }
                j4.b(H.v(i12, abstractC1725n), a10, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
            default:
                AbstractC3557B.c0("$this$Button", q0Var);
                AbstractC4326r a11 = io.sentry.compose.b.a("ActionButton");
                if ((i10 & 81) == 16) {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                Object[] objArr = new Object[1];
                String str = ((C3357J) k10).f32014d;
                if (str == null) {
                    str = "";
                }
                objArr[0] = str;
                j4.b(H.w(R.string.tool_function_oauth_login, objArr, abstractC1725n), a11, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
        }
    }

    @Override // wf.o
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f46555Y) {
            case 0:
                a((q0) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            case 1:
                a((q0) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            default:
                a((q0) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
        }
    }
}
