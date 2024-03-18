package fc;

import W.j4;
import Z.AbstractC1725n;
import com.openai.chatgpt.R;
import java.util.Map;
import l0.AbstractC4326r;
import l0.C4323o;

/* loaded from: classes2.dex */
public final class r extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f30220Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ y f30221Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(y yVar, int i10) {
        super(2);
        this.f30220Y = i10;
        this.f30221Z = yVar;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        C4323o c4323o = C4323o.f37719b;
        int i11 = this.f30220Y;
        y yVar = this.f30221Z;
        switch (i11) {
            case 0:
                AbstractC4326r a5 = io.sentry.compose.b.a("DeveloperSettingsScreen");
                if ((i10 & 11) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                j4.b(Ng.H.w(R.string.settings_developer_haptics_available, new Object[]{Boolean.valueOf(yVar.f30238b)}, abstractC1725n), a5, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
            default:
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                androidx.compose.foundation.layout.a.d(androidx.compose.foundation.layout.e.e(c4323o, p9.r.f42840d), abstractC1725n);
                for (Map.Entry entry : yVar.f30239c.entrySet()) {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    j4.b(key + " : " + value, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                }
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f30220Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
