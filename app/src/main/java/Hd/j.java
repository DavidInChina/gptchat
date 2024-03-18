package Hd;

import Qg.D0;
import Z.AbstractC1725n;
import Z.AbstractC1734s;
import ee.C2888f;
import kotlin.jvm.internal.o;
import l0.AbstractC4326r;
import q1.AbstractC5260f;
import r9.y;
import wf.n;

/* loaded from: classes.dex */
public final class j extends o implements n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f7659Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f7660Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ int f7661h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f7662i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f7663j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(C2888f c2888f, int i10, Object obj, int i11) {
        super(2);
        this.f7659Y = 2;
        this.f7662i0 = c2888f;
        this.f7660Z = i10;
        this.f7663j0 = obj;
        this.f7661h0 = i11;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f7659Y;
        Object obj = this.f7663j0;
        int i12 = this.f7660Z;
        int i13 = this.f7661h0;
        Object obj2 = this.f7662i0;
        switch (i11) {
            case 0:
                AbstractC5260f.b((D0) obj2, (AbstractC4326r) obj, abstractC1725n, AbstractC1734s.p(i12 | 1), i13);
                return;
            case 1:
                y.E((Tc.f) obj2, (Jd.i) obj, abstractC1725n, AbstractC1734s.p(i12 | 1), i13);
                return;
            default:
                ((C2888f) obj2).e(i12, obj, abstractC1725n, AbstractC1734s.p(i13 | 1));
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f7659Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 1:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj, Object obj2, int i10, int i11, int i12) {
        super(2);
        this.f7659Y = i12;
        this.f7662i0 = obj;
        this.f7663j0 = obj2;
        this.f7660Z = i10;
        this.f7661h0 = i11;
    }
}
