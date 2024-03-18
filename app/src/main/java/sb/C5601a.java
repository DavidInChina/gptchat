package sb;

import Ng.H;
import W.j4;
import Z.AbstractC1725n;
import com.openai.chatgpt.R;
import id.AbstractC3557B;
import j0.C3878C;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import jf.y;
import l0.AbstractC4326r;
import yf.AbstractC6583a;

/* renamed from: sb.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5601a extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Z  reason: collision with root package name */
    public static final C5601a f45491Z = new C5601a(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C5601a f45492h0 = new C5601a(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C5601a f45493i0 = new C5601a(3);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f45494Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5601a(int i10) {
        super(2);
        this.f45494Y = i10;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        switch (this.f45494Y) {
            case 0:
                AbstractC4326r a5 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                j4.b(H.v(R.string.message_feedback_placeholder, abstractC1725n), a5, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
            default:
                AbstractC4326r a10 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                l.a(54, 4, abstractC1725n, a10, C5603c.f45498Z, f45492h0);
                return;
        }
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        switch (this.f45494Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 1:
                AbstractC3557B.c0("<anonymous parameter 0>", (String) obj);
                AbstractC3557B.c0("<anonymous parameter 1>", (List) obj2);
                return yVar;
            case 2:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                j0.u uVar = (j0.u) obj2;
                AbstractC3557B.c0("$this$Saver", (i0.d) obj);
                AbstractC3557B.c0("tags", uVar);
                ArrayList arrayList = new ArrayList(AbstractC6583a.H1(uVar, 10));
                ListIterator listIterator = uVar.listIterator();
                while (true) {
                    C3878C c3878c = (C3878C) listIterator;
                    if (c3878c.hasNext()) {
                        arrayList.add(((M9.l) c3878c.next()).name());
                    } else {
                        return arrayList;
                    }
                }
        }
    }
}
