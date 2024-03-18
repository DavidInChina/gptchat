package bb;

import W.P0;
import W.R0;
import W.j4;
import W.p4;
import W.q4;
import Z.AbstractC1725n;
import cb.C2334C;
import cb.EnumC2370k;
import com.openai.chatgpt.R;
import l0.AbstractC4326r;

/* renamed from: bb.b0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2156b0 extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ boolean f25786Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C2334C f25787Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ boolean f25788h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2156b0(boolean z10, C2334C c2334c, boolean z11) {
        super(2);
        this.f25786Y = z10;
        this.f25787Z = c2334c;
        this.f25788h0 = z11;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        C2334C c2334c;
        int i10;
        String str;
        String str2;
        int i11;
        String str3;
        AbstractC1725n abstractC1725n = (AbstractC1725n) obj;
        int intValue = ((Number) obj2).intValue();
        AbstractC4326r a5 = io.sentry.compose.b.a("GizmoStoreListItem");
        if ((intValue & 11) == 2) {
            Z.r rVar = (Z.r) abstractC1725n;
            if (rVar.B()) {
                rVar.P();
                return jf.y.f36177a;
            }
        }
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.W(702086397);
        boolean z10 = this.f25786Y;
        String str4 = "";
        C2334C c2334c2 = this.f25787Z;
        if (z10) {
            String str5 = c2334c2.f26440c;
            if (str5 == null) {
                str3 = str4;
            } else {
                str3 = str5;
            }
            c2334c = c2334c2;
            j4.b(str3, a5, ((P0) rVar2.m(R0.f19593a)).f19533q, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 2, null, ((p4) rVar2.m(q4.f20361a)).f20310k, rVar2, 0, 27696, 38906);
        } else {
            c2334c = c2334c2;
        }
        rVar2.t(false);
        boolean z11 = this.f25788h0;
        if (!z11) {
            rVar2.W(702086852);
            str = Ng.H.w(R.string.gizmo_author_byline, new Object[]{Bi.c.W0(c2334c, rVar2)}, rVar2);
            rVar2.t(false);
            i10 = 2;
        } else if (z11) {
            rVar2.W(702087009);
            EnumC2370k enumC2370k = c2334c.f26463z;
            if (enumC2370k == null) {
                i11 = -1;
            } else {
                i11 = k0.f25866a[enumC2370k.ordinal()];
            }
            int i12 = R.string.gizmo_share_level_private;
            if (i11 != -1 && i11 != 1) {
                i10 = 2;
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            i12 = R.string.gizmo_share_level_link;
                        } else {
                            throw new RuntimeException();
                        }
                    } else {
                        i12 = R.string.gizmo_share_level_public;
                    }
                } else {
                    i12 = R.string.gizmo_share_level_workspace;
                }
            } else {
                i10 = 2;
            }
            str = Ng.H.v(i12, rVar2);
            rVar2.t(false);
        } else {
            rVar2.W(702067419);
            rVar2.t(false);
            throw new RuntimeException();
        }
        String str6 = c2334c.f26456s;
        rVar2.W(702087089);
        if (str6 == null) {
            str2 = str;
        } else {
            Object[] objArr = new Object[i10];
            objArr[0] = str;
            String str7 = c2334c.f26456s;
            if (str7 != null) {
                str4 = str7;
            }
            objArr[1] = str4;
            str2 = Ng.H.w(R.string.gizmo_list_item_details_separator, objArr, rVar2);
        }
        rVar2.t(false);
        j4.b(str2, a5, ((P0) rVar2.m(R0.f19593a)).f19529m, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((p4) rVar2.m(q4.f20361a)).f20310k, rVar2, 0, 3120, 55290);
        return jf.y.f36177a;
    }
}
