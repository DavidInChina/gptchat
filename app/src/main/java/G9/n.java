package G9;

import G0.X;
import Ng.H;
import W.AbstractC1607r1;
import W.j4;
import W.p4;
import W.q4;
import Z.AbstractC1725n;
import cb.C2334C;
import com.openai.chatgpt.R;
import k6.AbstractC4194d;
import l0.AbstractC4326r;
import l0.C4323o;
import r9.y;
import ta.AbstractC5685A;
import u0.AbstractC5824b;
import wd.C6190g0;
import wd.EnumC6192h0;

/* loaded from: classes2.dex */
public final class n extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f6148Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C2334C f6149Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(C2334C c2334c, int i10) {
        super(2);
        this.f6148Y = i10;
        this.f6149Z = c2334c;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        EnumC6192h0 enumC6192h0;
        int i11;
        int i12;
        C4323o c4323o = C4323o.f37719b;
        int i13 = this.f6148Y;
        C2334C c2334c = this.f6149Z;
        switch (i13) {
            case 0:
                AbstractC4326r a5 = io.sentry.compose.b.a("ConversationDetailsScreenContent");
                if ((i10 & 11) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                String str = c2334c.f26440c;
                if (str == null) {
                    str = "";
                }
                j4.b(str, a5, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
            case 1:
                AbstractC4326r a10 = io.sentry.compose.b.a("GizmoListItem");
                if ((i10 & 11) == 2) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                L4.a.T(c2334c.f26439b, a10, 1, 2, abstractC1725n, 3456, 2);
                return;
            case 2:
                AbstractC4326r a11 = io.sentry.compose.b.a("GizmoListItem");
                if ((i10 & 11) == 2) {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                String str2 = c2334c.f26446i;
                if (str2 != null) {
                    enumC6192h0 = C6190g0.a(str2);
                } else {
                    enumC6192h0 = null;
                }
                K8.d.z(this.f6149Z, AbstractC4194d.a((X) a11, androidx.compose.foundation.layout.e.j(c4323o, p9.q.f42831b)), enumC6192h0, abstractC1725n, 0, 0);
                return;
            case 3:
                AbstractC4326r a12 = io.sentry.compose.b.a("InputGizmoMentionsView");
                if ((i10 & 11) == 2) {
                    Z.r rVar4 = (Z.r) abstractC1725n;
                    if (rVar4.B()) {
                        rVar4.P();
                        return;
                    }
                }
                AbstractC5685A.e(this.f6149Z, a12, false, abstractC1725n, 384, 2);
                return;
            case 4:
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar5 = (Z.r) abstractC1725n;
                    if (rVar5.B()) {
                        rVar5.P();
                        return;
                    }
                }
                K8.d.A(c2334c, androidx.compose.foundation.layout.e.j(c4323o, p9.q.f42831b), abstractC1725n, 0, 0);
                return;
            case 5:
                AbstractC4326r a13 = io.sentry.compose.b.a("InputGizmoMentionsView");
                if ((i10 & 11) == 2) {
                    Z.r rVar6 = (Z.r) abstractC1725n;
                    if (rVar6.B()) {
                        rVar6.P();
                        return;
                    }
                }
                if (c2334c.f26455r) {
                    i11 = R.drawable.pin;
                } else {
                    i11 = R.drawable.recent;
                }
                AbstractC5824b F10 = kotlin.jvm.internal.m.F(i11, abstractC1725n);
                AbstractC4326r a14 = AbstractC4194d.a((X) a13, androidx.compose.foundation.layout.e.j(c4323o, p9.q.f42831b));
                if (c2334c.f26455r) {
                    i12 = R.string.conversation_icon_pinned_cd;
                } else {
                    i12 = R.string.conversation_icon_recent_cd;
                }
                AbstractC1607r1.a(F10, H.v(i12, abstractC1725n), a14, 0L, abstractC1725n, 8, 8);
                return;
            case 6:
                AbstractC4326r a15 = io.sentry.compose.b.a("GizmoPicker");
                if ((i10 & 11) == 2) {
                    Z.r rVar7 = (Z.r) abstractC1725n;
                    if (rVar7.B()) {
                        rVar7.P();
                        return;
                    }
                }
                j4.b(y.p0(c2334c, abstractC1725n), a15, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
            case 7:
                L0.u uVar2 = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar8 = (Z.r) abstractC1725n;
                    if (rVar8.B()) {
                        rVar8.P();
                        return;
                    }
                }
                K8.d.z(this.f6149Z, androidx.compose.foundation.layout.e.j(c4323o, p9.q.f42830a), null, abstractC1725n, 0, 4);
                return;
            case 8:
                AbstractC4326r a16 = io.sentry.compose.b.a("GizmoPickerItem");
                if ((i10 & 11) == 2) {
                    Z.r rVar9 = (Z.r) abstractC1725n;
                    if (rVar9.B()) {
                        rVar9.P();
                        return;
                    }
                }
                j4.b(y.p0(c2334c, abstractC1725n), a16, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
            case 9:
                L0.u uVar3 = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar10 = (Z.r) abstractC1725n;
                    if (rVar10.B()) {
                        rVar10.P();
                        return;
                    }
                }
                K8.d.z(this.f6149Z, androidx.compose.foundation.layout.e.j(c4323o, p9.q.f42831b), null, abstractC1725n, 0, 4);
                return;
            default:
                AbstractC4326r a17 = io.sentry.compose.b.a("GizmoStoreListItem");
                if ((i10 & 11) == 2) {
                    Z.r rVar11 = (Z.r) abstractC1725n;
                    if (rVar11.B()) {
                        rVar11.P();
                        return;
                    }
                }
                j4.b(c2334c.f26439b, a17, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((p4) ((Z.r) abstractC1725n).m(q4.f20361a)).f20307h, abstractC1725n, 0, 3120, 55294);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f6148Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 1:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 2:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 3:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 4:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 5:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 6:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 7:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 8:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 9:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
