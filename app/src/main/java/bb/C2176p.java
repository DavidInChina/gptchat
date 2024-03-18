package bb;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import java.util.List;
import l0.AbstractC4326r;

/* renamed from: bb.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2176p extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f25881Y = 0;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f25882Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ List f25883h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f25884i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ int f25885j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2176p(List list, AbstractC4326r abstractC4326r, int i10, int i11) {
        super(2);
        this.f25883h0 = list;
        this.f25882Z = abstractC4326r;
        this.f25884i0 = i10;
        this.f25885j0 = i11;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f25881Y;
        List list = this.f25883h0;
        AbstractC4326r abstractC4326r = this.f25882Z;
        int i12 = this.f25885j0;
        int i13 = this.f25884i0;
        switch (i11) {
            case 0:
                K8.d.e0(AbstractC1734s.p(i13 | 1), i12, abstractC1725n, abstractC4326r, list);
                return;
            default:
                Bi.c.D(AbstractC1734s.p(i13 | 1), i12, abstractC1725n, abstractC4326r, list);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f25881Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2176p(AbstractC4326r abstractC4326r, List list, int i10, int i11) {
        super(2);
        this.f25882Z = abstractC4326r;
        this.f25883h0 = list;
        this.f25884i0 = i10;
        this.f25885j0 = i11;
    }
}
