package dc;

import Ng.H;
import W.j4;
import Z.AbstractC1725n;
import Z.r;
import com.openai.chatgpt.R;
import jf.y;
import kotlin.jvm.internal.o;
import l0.AbstractC4326r;

/* loaded from: classes.dex */
public final class m extends o implements wf.n {

    /* renamed from: Z  reason: collision with root package name */
    public static final m f28213Z = new m(0);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f28214Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i10) {
        super(2);
        this.f28214Y = i10;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        switch (this.f28214Y) {
            case 0:
                AbstractC4326r a5 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    r rVar = (r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                j4.b(H.v(R.string.settings_beta_features, abstractC1725n), a5, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
            default:
                AbstractC4326r a10 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    r rVar2 = (r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                K8.d.g(Ad.l.W0(null, abstractC1725n, 31), a10, null, abstractC1725n, 8, 6);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        switch (this.f28214Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
