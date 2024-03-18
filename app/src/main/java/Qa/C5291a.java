package qa;

import W.j4;
import Z.AbstractC1725n;
import Z.r;
import jf.y;
import kotlin.jvm.internal.o;
import l0.AbstractC4326r;
import wf.n;

/* renamed from: qa.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5291a extends o implements n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f44008Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C5293c f44009Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5291a(C5293c c5293c, int i10) {
        super(2);
        this.f44008Y = i10;
        this.f44009Z = c5293c;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f44008Y;
        C5293c c5293c = this.f44009Z;
        switch (i11) {
            case 0:
                AbstractC4326r a5 = io.sentry.compose.b.a("DisclosureContent");
                if ((i10 & 11) == 2) {
                    r rVar = (r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                j4.b(c5293c.f44018b, a5, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
            default:
                AbstractC4326r a10 = io.sentry.compose.b.a("DisclosureContent");
                if ((i10 & 11) == 2) {
                    r rVar2 = (r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                j4.b(c5293c.f44018b, a10, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        switch (this.f44008Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
