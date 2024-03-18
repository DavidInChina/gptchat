package h;

import Df.H;
import Z.AbstractC1725n;
import Z.AbstractC1734s;
import jf.AbstractC3953c;
import jf.y;
import kotlin.jvm.internal.o;
import wf.AbstractC6216a;
import wf.n;

/* renamed from: h.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3282h extends o implements n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f31667Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ boolean f31668Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ int f31669h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f31670i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ AbstractC3953c f31671j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3282h(int i10, boolean z10, wf.k kVar, int i11) {
        super(2);
        this.f31667Y = 2;
        this.f31669h0 = i10;
        this.f31668Z = z10;
        this.f31671j0 = kVar;
        this.f31670i0 = i11;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f31667Y;
        boolean z10 = this.f31668Z;
        int i12 = this.f31669h0;
        int i13 = this.f31670i0;
        AbstractC3953c abstractC3953c = this.f31671j0;
        switch (i11) {
            case 0:
                H.e(z10, (AbstractC6216a) abstractC3953c, abstractC1725n, i12 | 1, i13);
                return;
            case 1:
                A7.b.F(z10, (n) abstractC3953c, abstractC1725n, AbstractC1734s.p(i12 | 1), i13);
                return;
            default:
                P4.a.b(i12, AbstractC1734s.p(i13 | 1), abstractC1725n, (wf.k) abstractC3953c, z10);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        switch (this.f31667Y) {
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
    public /* synthetic */ C3282h(boolean z10, AbstractC3953c abstractC3953c, int i10, int i11, int i12) {
        super(2);
        this.f31667Y = i12;
        this.f31668Z = z10;
        this.f31671j0 = abstractC3953c;
        this.f31669h0 = i10;
        this.f31670i0 = i11;
    }
}
