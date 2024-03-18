package r9;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import l0.AbstractC4326r;
import wf.AbstractC6216a;

/* renamed from: r9.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5387d extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f44538Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.n f44539Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f44540h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f44541i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ int f44542j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ int f44543k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5387d(AbstractC6216a abstractC6216a, AbstractC4326r abstractC4326r, wf.n nVar, int i10, int i11, int i12) {
        super(2);
        this.f44538Y = i12;
        this.f44540h0 = abstractC6216a;
        this.f44541i0 = abstractC4326r;
        this.f44539Z = nVar;
        this.f44542j0 = i10;
        this.f44543k0 = i11;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f44538Y;
        int i12 = this.f44542j0;
        switch (i11) {
            case 0:
                K8.d.W(AbstractC1734s.p(i12 | 1), this.f44543k0, abstractC1725n, this.f44541i0, this.f44540h0, this.f44539Z);
                return;
            case 1:
                sb.l.a(AbstractC1734s.p(i12 | 1), this.f44543k0, abstractC1725n, this.f44541i0, this.f44540h0, this.f44539Z);
                return;
            default:
                y.D(AbstractC1734s.p(i12 | 1), this.f44543k0, abstractC1725n, this.f44541i0, this.f44540h0, this.f44539Z);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f44538Y) {
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
    public C5387d(wf.n nVar, AbstractC6216a abstractC6216a, AbstractC4326r abstractC4326r, int i10, int i11) {
        super(2);
        this.f44538Y = 1;
        this.f44539Z = nVar;
        this.f44540h0 = abstractC6216a;
        this.f44541i0 = abstractC4326r;
        this.f44542j0 = i10;
        this.f44543k0 = i11;
    }
}
