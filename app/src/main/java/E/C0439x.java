package E;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import kb.AbstractC4208B;
import l0.AbstractC4313e;
import l0.AbstractC4326r;
import ud.AbstractC5903b;
import wf.AbstractC6216a;

/* renamed from: E.x  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0439x extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f3971Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f3972Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ boolean f3973h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f3974i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ int f3975j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ int f3976k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ Object f3977l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0439x(Object obj, Object obj2, boolean z10, AbstractC4326r abstractC4326r, int i10, int i11, int i12) {
        super(2);
        this.f3971Y = i12;
        this.f3977l0 = obj;
        this.f3972Z = obj2;
        this.f3973h0 = z10;
        this.f3974i0 = abstractC4326r;
        this.f3975j0 = i10;
        this.f3976k0 = i11;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f3971Y;
        Object obj = this.f3977l0;
        int i12 = this.f3975j0;
        Object obj2 = this.f3972Z;
        switch (i11) {
            case 0:
                int p10 = AbstractC1734s.p(i12 | 1);
                boolean z10 = this.f3973h0;
                int i13 = this.f3976k0;
                androidx.compose.foundation.layout.a.a(this.f3974i0, (AbstractC4313e) obj, z10, (wf.o) obj2, abstractC1725n, p10, i13);
                return;
            case 1:
                int p11 = AbstractC1734s.p(i12 | 1);
                r9.y.h(this.f3977l0, (wf.o) obj2, this.f3973h0, this.f3974i0, abstractC1725n, p11, this.f3976k0);
                return;
            case 2:
                int p12 = AbstractC1734s.p(i12 | 1);
                AbstractC4326r abstractC4326r = this.f3974i0;
                int i14 = this.f3976k0;
                Ad.l.m((x9.l) obj, this.f3973h0, (wf.k) obj2, abstractC4326r, abstractC1725n, p12, i14);
                return;
            case 3:
                int p13 = AbstractC1734s.p(i12 | 1);
                AbstractC4326r abstractC4326r2 = this.f3974i0;
                int i15 = this.f3976k0;
                AbstractC4208B.b((String) obj, this.f3973h0, (wf.k) obj2, abstractC4326r2, abstractC1725n, p13, i15);
                return;
            case 4:
                int p14 = AbstractC1734s.p(i12 | 1);
                r9.y.G((wd.o0) obj, (AbstractC6216a) obj2, this.f3973h0, this.f3974i0, abstractC1725n, p14, this.f3976k0);
                return;
            default:
                int p15 = AbstractC1734s.p(i12 | 1);
                AbstractC5903b.a((String) obj, (String) obj2, this.f3973h0, this.f3974i0, abstractC1725n, p15, this.f3976k0);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f3971Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 1:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 2:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 3:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 4:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0439x(Object obj, boolean z10, wf.k kVar, AbstractC4326r abstractC4326r, int i10, int i11, int i12) {
        super(2);
        this.f3971Y = i12;
        this.f3977l0 = obj;
        this.f3973h0 = z10;
        this.f3972Z = kVar;
        this.f3974i0 = abstractC4326r;
        this.f3975j0 = i10;
        this.f3976k0 = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0439x(AbstractC4326r abstractC4326r, AbstractC4313e abstractC4313e, boolean z10, wf.o oVar, int i10, int i11) {
        super(2);
        this.f3971Y = 0;
        this.f3974i0 = abstractC4326r;
        this.f3977l0 = abstractC4313e;
        this.f3973h0 = z10;
        this.f3972Z = oVar;
        this.f3975j0 = i10;
        this.f3976k0 = i11;
    }
}
