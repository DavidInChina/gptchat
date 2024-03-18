package fb;

import W.j4;
import Z.AbstractC1725n;
import Z.r;
import jf.y;
import l0.AbstractC4326r;

/* renamed from: fb.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2988g extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f30090Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C2995n f30091Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2988g(C2995n c2995n, int i10) {
        super(2);
        this.f30090Y = i10;
        this.f30091Z = c2995n;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f30090Y;
        C2995n c2995n = this.f30091Z;
        switch (i11) {
            case 0:
                AbstractC4326r a5 = io.sentry.compose.b.a("ArtifactItem");
                if ((i10 & 11) == 2) {
                    r rVar = (r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                j4.b(c2995n.f30102b, a5, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
            default:
                AbstractC4326r a10 = io.sentry.compose.b.a("ArtifactItem");
                if ((i10 & 11) == 2) {
                    r rVar2 = (r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                j4.b(c2995n.f30103c, a10, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        switch (this.f30090Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
