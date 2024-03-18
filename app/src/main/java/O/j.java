package O;

import W.I2;
import Z.AbstractC1725n;
import Z.AbstractC1734s;
import jf.y;
import kotlin.jvm.internal.o;
import l0.AbstractC4326r;
import wf.n;

/* loaded from: classes.dex */
public final class j extends o implements n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f13256Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f13257Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ long f13258h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ float f13259i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ long f13260j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ int f13261k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ int f13262l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ int f13263m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(AbstractC4326r abstractC4326r, long j6, float f6, long j10, int i10, int i11, int i12, int i13) {
        super(2);
        this.f13256Y = i13;
        this.f13257Z = abstractC4326r;
        this.f13258h0 = j6;
        this.f13259i0 = f6;
        this.f13260j0 = j10;
        this.f13261k0 = i10;
        this.f13262l0 = i11;
        this.f13263m0 = i12;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f13256Y;
        int i12 = this.f13262l0;
        switch (i11) {
            case 0:
                int p10 = AbstractC1734s.p(i12 | 1);
                l.a(this.f13257Z, this.f13258h0, this.f13259i0, this.f13260j0, this.f13261k0, abstractC1725n, p10, this.f13263m0);
                return;
            default:
                int p11 = AbstractC1734s.p(i12 | 1);
                I2.b(this.f13257Z, this.f13258h0, this.f13259i0, this.f13260j0, this.f13261k0, abstractC1725n, p11, this.f13263m0);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        switch (this.f13256Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
