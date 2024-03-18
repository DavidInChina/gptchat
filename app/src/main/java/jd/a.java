package Jd;

import Ad.l;
import L0.u;
import Ng.H;
import S0.D;
import W.j4;
import W.p4;
import W.q4;
import Z.AbstractC1725n;
import Z.r;
import com.openai.chatgpt.R;
import kotlin.jvm.internal.o;
import l0.AbstractC4326r;
import p9.AbstractC5102d;
import r9.y;
import wf.n;

/* loaded from: classes2.dex */
public final class a extends o implements n {

    /* renamed from: Z  reason: collision with root package name */
    public static final a f9079Z = new a(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final a f9080h0 = new a(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final a f9081i0 = new a(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final a f9082j0 = new a(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final a f9083k0 = new a(4);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f9084Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10) {
        super(2);
        this.f9084Y = i10;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        AbstractC1725n abstractC1725n2;
        AbstractC1725n abstractC1725n3;
        switch (this.f9084Y) {
            case 0:
                AbstractC4326r a5 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    r rVar = (r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                j4.b(H.v(R.string.voice_training_prompt_title, abstractC1725n), a5, AbstractC5102d.f42765b, 0L, null, D.f15972k0, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p4) ((r) abstractC1725n).m(q4.f20361a)).f20301b, abstractC1725n, 196608, 0, 65498);
                return;
            case 1:
                AbstractC4326r a10 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    abstractC1725n2 = abstractC1725n;
                    r rVar2 = (r) abstractC1725n2;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                } else {
                    abstractC1725n2 = abstractC1725n;
                }
                j4.b(H.v(R.string.voice_training_enroll, abstractC1725n2), a10, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
            case 2:
                AbstractC4326r a11 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    abstractC1725n3 = abstractC1725n;
                    r rVar3 = (r) abstractC1725n3;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                } else {
                    abstractC1725n3 = abstractC1725n;
                }
                j4.b(H.v(R.string.voice_training_decline, abstractC1725n3), a11, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
            case 3:
                AbstractC4326r a12 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    r rVar4 = (r) abstractC1725n;
                    if (rVar4.B()) {
                        rVar4.P();
                        return;
                    }
                }
                j4.b(H.v(R.string.voice_training_item_1_subtitle, abstractC1725n), a12, r0.r.f44257e, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 384, 0, 131066);
                return;
            case 4:
                AbstractC4326r a13 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    r rVar5 = (r) abstractC1725n;
                    if (rVar5.B()) {
                        rVar5.P();
                        return;
                    }
                }
                j4.b(H.v(R.string.voice_training_item_2_subtitle, abstractC1725n), a13, r0.r.f44257e, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 384, 0, 131066);
                return;
            default:
                u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    r rVar6 = (r) abstractC1725n;
                    if (rVar6.B()) {
                        rVar6.P();
                        return;
                    }
                }
                y.E(l.W0(null, abstractC1725n, 31), null, abstractC1725n, 8, 2);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f9084Y) {
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
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
