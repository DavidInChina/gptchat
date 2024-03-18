package i2;

import X1.m;
import Z.AbstractC1725n;
import Z.AbstractC1734s;
import java.util.List;
import kotlin.jvm.internal.o;
import l0.AbstractC4326r;
import r9.x;
import r9.y;
import wf.k;
import wf.n;

/* renamed from: i2.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3463e extends o implements n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f32603Y = 0;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f32604Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ int f32605h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f32606i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f32607j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ Object f32608k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ Object f32609l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3463e(String str, m mVar, C3464f c3464f, int i10, int i11, int i12) {
        super(2);
        this.f32607j0 = str;
        this.f32608k0 = mVar;
        this.f32609l0 = c3464f;
        this.f32604Z = i10;
        this.f32605h0 = i11;
        this.f32606i0 = i12;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f32603Y;
        int i12 = this.f32605h0;
        Object obj = this.f32609l0;
        Object obj2 = this.f32608k0;
        Object obj3 = this.f32607j0;
        switch (i11) {
            case 0:
                y.y((String) obj3, (m) obj2, (C3464f) obj, this.f32604Z, abstractC1725n, i12 | 1, this.f32606i0);
                return;
            default:
                int p10 = AbstractC1734s.p(i12 | 1);
                x.d((List) obj3, this.f32604Z, (k) obj2, (AbstractC4326r) obj, abstractC1725n, p10, this.f32606i0);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f32603Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3463e(List list, int i10, k kVar, AbstractC4326r abstractC4326r, int i11, int i12) {
        super(2);
        this.f32607j0 = list;
        this.f32604Z = i10;
        this.f32608k0 = kVar;
        this.f32609l0 = abstractC4326r;
        this.f32605h0 = i11;
        this.f32606i0 = i12;
    }
}
