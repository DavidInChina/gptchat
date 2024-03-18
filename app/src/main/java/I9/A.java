package I9;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import l0.AbstractC4326r;

/* loaded from: classes.dex */
public final class A extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f8135Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ String f8136Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f8137h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f8138i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ int f8139j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A(String str, AbstractC4326r abstractC4326r, int i10, int i11, int i12) {
        super(2);
        this.f8135Y = i12;
        this.f8136Z = str;
        this.f8137h0 = abstractC4326r;
        this.f8138i0 = i10;
        this.f8139j0 = i11;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f8135Y;
        AbstractC4326r abstractC4326r = this.f8137h0;
        String str = this.f8136Z;
        int i12 = this.f8139j0;
        int i13 = this.f8138i0;
        switch (i11) {
            case 0:
                L4.a.M(str, abstractC4326r, abstractC1725n, AbstractC1734s.p(i13 | 1), i12);
                return;
            default:
                Bi.c.j(str, abstractC4326r, abstractC1725n, AbstractC1734s.p(i13 | 1), i12);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f8135Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
