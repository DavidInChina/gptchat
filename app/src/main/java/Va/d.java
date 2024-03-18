package Va;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import cb.C2334C;
import jf.y;
import kotlin.jvm.internal.o;
import l0.AbstractC4326r;
import wf.n;

/* loaded from: classes.dex */
public final class d extends o implements n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f18500Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C2334C f18501Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f18502h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f18503i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ int f18504j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(C2334C c2334c, AbstractC4326r abstractC4326r, int i10, int i11, int i12) {
        super(2);
        this.f18500Y = i12;
        this.f18501Z = c2334c;
        this.f18502h0 = abstractC4326r;
        this.f18503i0 = i10;
        this.f18504j0 = i11;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f18500Y;
        AbstractC4326r abstractC4326r = this.f18502h0;
        C2334C c2334c = this.f18501Z;
        int i12 = this.f18504j0;
        int i13 = this.f18503i0;
        switch (i11) {
            case 0:
                K8.d.A(c2334c, abstractC4326r, abstractC1725n, AbstractC1734s.p(i13 | 1), i12);
                return;
            default:
                Bi.c.g(c2334c, abstractC4326r, abstractC1725n, AbstractC1734s.p(i13 | 1), i12);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        switch (this.f18500Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
