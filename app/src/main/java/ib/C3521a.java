package ib;

import K4.J;
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
import wf.n;

/* renamed from: ib.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3521a extends o implements n {

    /* renamed from: Z  reason: collision with root package name */
    public static final C3521a f32902Z = new C3521a(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C3521a f32903h0 = new C3521a(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C3521a f32904i0 = new C3521a(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final C3521a f32905j0 = new C3521a(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final C3521a f32906k0 = new C3521a(4);

    /* renamed from: l0  reason: collision with root package name */
    public static final C3521a f32907l0 = new C3521a(5);

    /* renamed from: m0  reason: collision with root package name */
    public static final C3521a f32908m0 = new C3521a(6);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f32909Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3521a(int i10) {
        super(2);
        this.f32909Y = i10;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        switch (this.f32909Y) {
            case 0:
                AbstractC4326r a5 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    r rVar = (r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                j4.b(H.v(R.string.conversations_conversation_rename, abstractC1725n), a5, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
            case 1:
                u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    r rVar2 = (r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                AbstractC4326r a10 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    r rVar3 = (r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                AbstractC1607r1.b(Gi.e.z(), H.v(R.string.content_description_close, abstractC1725n), a10, 0L, abstractC1725n, 0, 12);
                return;
            case 3:
                AbstractC4326r a11 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    r rVar4 = (r) abstractC1725n;
                    if (rVar4.B()) {
                        rVar4.P();
                        return;
                    }
                }
                AbstractC1607r1.b(J.D(), H.v(R.string.conversations_image_share, abstractC1725n), a11, 0L, abstractC1725n, 0, 12);
                return;
            case 4:
                AbstractC4326r a12 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    r rVar5 = (r) abstractC1725n;
                    if (rVar5.B()) {
                        rVar5.P();
                        return;
                    }
                }
                AbstractC1607r1.a(m.F(R.drawable.download, abstractC1725n), H.v(R.string.conversations_image_download, abstractC1725n), a12, 0L, abstractC1725n, 8, 12);
                return;
            case 5:
                AbstractC4326r a13 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    r rVar6 = (r) abstractC1725n;
                    if (rVar6.B()) {
                        rVar6.P();
                        return;
                    }
                }
                j4.b(H.v(R.string.conversations_select_text, abstractC1725n), a13, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
            case 6:
                AbstractC4326r a14 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    r rVar7 = (r) abstractC1725n;
                    if (rVar7.B()) {
                        rVar7.P();
                        return;
                    }
                }
                AbstractC1607r1.b(Gi.e.z(), H.v(R.string.content_description_close, abstractC1725n), a14, 0L, abstractC1725n, 0, 12);
                return;
            default:
                u uVar2 = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    r rVar8 = (r) abstractC1725n;
                    if (rVar8.B()) {
                        rVar8.P();
                        return;
                    }
                }
                A7.b.Q(54, abstractC1725n, "Hello World", e.f32920Y);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        switch (this.f32909Y) {
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
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
