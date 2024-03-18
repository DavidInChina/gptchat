package q9;

import G0.J;
import Ng.H;
import id.AbstractC3557B;
import jf.y;
import kotlin.jvm.internal.o;
import nf.AbstractC4828h;
import q0.C5254f;
import r0.AbstractC5350n;
import r0.C5334A;
import t0.AbstractC5646e;
import t0.AbstractC5648g;
import t0.C5644c;
import wf.k;

/* renamed from: q9.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5289f extends o implements k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ boolean f44001Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC5350n f44002Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ boolean f44003h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ float f44004i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5289f(boolean z10, C5334A c5334a, boolean z11, float f6) {
        super(1);
        this.f44001Y = z10;
        this.f44002Z = c5334a;
        this.f44003h0 = z11;
        this.f44004i0 = f6;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        float f6;
        float f10;
        AbstractC5646e abstractC5646e = (AbstractC5646e) obj;
        AbstractC3557B.c0("$this$drawWithContent", abstractC5646e);
        if (this.f44001Y) {
            boolean z10 = this.f44003h0;
            if (z10) {
                f6 = C5254f.b(((J) abstractC5646e).f5596Y.g()) * 0.1f;
            } else {
                f6 = 0.0f;
            }
            long r10 = R4.b.r(0.0f, f6);
            C5644c c5644c = ((J) abstractC5646e).f5596Y;
            float d10 = C5254f.d(c5644c.g());
            if (z10) {
                f10 = C5254f.b(c5644c.g()) * 0.8f;
            } else {
                f10 = C5254f.b(c5644c.g());
            }
            long i10 = AbstractC4828h.i(d10, f10);
            float f11 = this.f44004i0;
            AbstractC5648g.l(abstractC5646e, this.f44002Z, r10, i10, H.b(f11, f11), null, 240);
        } else {
            ((J) abstractC5646e).a();
        }
        return y.f36177a;
    }
}
