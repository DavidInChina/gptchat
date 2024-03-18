package db;

import L0.u;
import Ng.H;
import W.AbstractC1607r1;
import W.j4;
import Z.AbstractC1725n;
import Z.r;
import com.openai.chatgpt.R;
import jf.y;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.o;
import l0.AbstractC4326r;
import l0.C4323o;
import p9.q;
import wf.n;

/* renamed from: db.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2613a extends o implements n {

    /* renamed from: Z  reason: collision with root package name */
    public static final C2613a f28171Z = new C2613a(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C2613a f28172h0 = new C2613a(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C2613a f28173i0 = new C2613a(2);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f28174Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2613a(int i10) {
        super(2);
        this.f28174Y = i10;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        C4323o c4323o = C4323o.f37719b;
        switch (this.f28174Y) {
            case 0:
                AbstractC4326r a5 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    r rVar = (r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                j4.b(H.v(R.string.gizmo_rating_toast_title, abstractC1725n), a5, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
            case 1:
                u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    r rVar2 = (r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                AbstractC1607r1.a(m.F(R.drawable.star_filled, abstractC1725n), null, androidx.compose.foundation.layout.e.j(c4323o, q.f42831b), 0L, abstractC1725n, 56, 8);
                return;
            default:
                u uVar2 = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    r rVar3 = (r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                AbstractC1607r1.a(m.F(R.drawable.chevron_right_md, abstractC1725n), null, androidx.compose.foundation.layout.e.j(c4323o, q.f42831b), 0L, abstractC1725n, 56, 8);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        switch (this.f28174Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 1:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
