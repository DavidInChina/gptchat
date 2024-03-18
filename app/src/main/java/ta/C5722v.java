package ta;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import l0.AbstractC4326r;
import za.C6783B;

/* renamed from: ta.v  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5722v extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f46014Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C6783B f46015Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.k f46016h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f46017i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ int f46018j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ int f46019k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5722v(C6783B c6783b, wf.k kVar, AbstractC4326r abstractC4326r, int i10, int i11, int i12) {
        super(2);
        this.f46014Y = i12;
        this.f46015Z = c6783b;
        this.f46016h0 = kVar;
        this.f46017i0 = abstractC4326r;
        this.f46018j0 = i10;
        this.f46019k0 = i11;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f46014Y;
        int i12 = this.f46018j0;
        switch (i11) {
            case 0:
                int p10 = AbstractC1734s.p(i12 | 1);
                AbstractC5723w.a(this.f46015Z, this.f46016h0, this.f46017i0, abstractC1725n, p10, this.f46019k0);
                return;
            default:
                int p11 = AbstractC1734s.p(i12 | 1);
                AbstractC5685A.c(this.f46015Z, this.f46016h0, this.f46017i0, abstractC1725n, p11, this.f46019k0);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f46014Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
