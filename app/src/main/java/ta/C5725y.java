package ta;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import java.util.List;

/* renamed from: ta.y  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5725y extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f46024Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ List f46025Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ boolean f46026h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ wf.k f46027i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ int f46028j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ int f46029k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5725y(List list, boolean z10, wf.k kVar, int i10, int i11, int i12) {
        super(2);
        this.f46024Y = i12;
        this.f46025Z = list;
        this.f46026h0 = z10;
        this.f46027i0 = kVar;
        this.f46028j0 = i10;
        this.f46029k0 = i11;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f46024Y;
        int i12 = this.f46028j0;
        switch (i11) {
            case 0:
                AbstractC5685A.a(this.f46025Z, this.f46026h0, this.f46027i0, abstractC1725n, AbstractC1734s.p(i12 | 1), this.f46029k0);
                return;
            default:
                AbstractC5685A.b(this.f46025Z, this.f46026h0, this.f46027i0, abstractC1725n, AbstractC1734s.p(i12 | 1), this.f46029k0);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f46024Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
