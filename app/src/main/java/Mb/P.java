package Mb;

import android.gov.nist.core.LexerCore;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class P extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f11825Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ F f11826Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ P(F f6, int i10) {
        super(1);
        this.f11825Y = i10;
        this.f11826Z = f6;
    }

    public final G a(G g10) {
        int i10 = this.f11825Y;
        F f6 = this.f11826Z;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("$this$setState", g10);
                return G.e(g10, Lg.o.Z2(96, ((C) f6).f11761a), null, null, null, null, null, null, false, false, false, false, false, 4094);
            case 1:
                AbstractC3557B.c0("$this$setState", g10);
                return G.e(g10, null, Lg.o.Z2(96, ((D) f6).f11764a), null, null, null, null, null, false, false, false, false, false, LexerCore.ID_NO_WHITESPACE);
            case 2:
                AbstractC3557B.c0("$this$setState", g10);
                return G.e(g10, null, null, ((A) f6).f11754a, null, null, null, null, false, false, false, false, false, 4075);
            case 3:
                AbstractC3557B.c0("$this$setState", g10);
                return G.e(g10, null, null, null, ((E) f6).f11767a, null, null, null, false, false, false, false, false, 4087);
            default:
                AbstractC3557B.c0("$this$setState", g10);
                return G.e(g10, null, null, null, null, null, ((B) f6).f11757a, null, false, false, false, false, false, 4063);
        }
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f11825Y) {
            case 0:
                return a((G) obj);
            case 1:
                return a((G) obj);
            case 2:
                return a((G) obj);
            case 3:
                return a((G) obj);
            default:
                return a((G) obj);
        }
    }
}
