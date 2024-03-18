package Hd;

import Qg.D0;
import Z.AbstractC1725n;
import Z.AbstractC1734s;
import jf.y;
import kh.m;
import kotlin.jvm.internal.o;
import l0.AbstractC4326r;
import q1.AbstractC5260f;
import r0.C5347k;
import wf.AbstractC6216a;
import wf.n;

/* loaded from: classes.dex */
public final class i extends o implements n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f7651Y = 0;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ String f7652Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f7653h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ float f7654i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ int f7655j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ int f7656k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ Object f7657l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ Object f7658m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(D0 d02, AbstractC4326r abstractC4326r, float f6, String str, AbstractC6216a abstractC6216a, int i10, int i11) {
        super(2);
        this.f7657l0 = d02;
        this.f7653h0 = abstractC4326r;
        this.f7654i0 = f6;
        this.f7652Z = str;
        this.f7658m0 = abstractC6216a;
        this.f7655j0 = i10;
        this.f7656k0 = i11;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f7651Y;
        int i12 = this.f7655j0;
        Object obj = this.f7658m0;
        Object obj2 = this.f7657l0;
        switch (i11) {
            case 0:
                int p10 = AbstractC1734s.p(i12 | 1);
                AbstractC4326r abstractC4326r = this.f7653h0;
                int i13 = this.f7656k0;
                AbstractC5260f.a((D0) obj2, abstractC4326r, this.f7654i0, this.f7652Z, (AbstractC6216a) obj, abstractC1725n, p10, i13);
                return;
            default:
                int p11 = AbstractC1734s.p(i12 | 1);
                String str = this.f7652Z;
                int i14 = this.f7656k0;
                P4.a.g((m) obj2, str, this.f7653h0, this.f7654i0, (C5347k) obj, abstractC1725n, p11, i14);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        switch (this.f7651Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(m mVar, String str, AbstractC4326r abstractC4326r, float f6, C5347k c5347k, int i10, int i11) {
        super(2);
        this.f7657l0 = mVar;
        this.f7652Z = str;
        this.f7653h0 = abstractC4326r;
        this.f7654i0 = f6;
        this.f7658m0 = c5347k;
        this.f7655j0 = i10;
        this.f7656k0 = i11;
    }
}
