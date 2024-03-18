package z4;

import Ng.z0;
import Z.C1724m0;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import nf.AbstractC4831k;
import nf.C4832l;
import of.EnumC5000a;
import pf.AbstractC5163j;
import v4.C5971a;

/* renamed from: z4.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6766e extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f51603Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C6770i f51604Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ int f51605h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f51606i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ boolean f51607j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ float f51608k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ C5971a f51609l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ float f51610m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ boolean f51611n0;

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ boolean f51612o0;

    /* renamed from: p0  reason: collision with root package name */
    public final /* synthetic */ n f51613p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6766e(C6770i c6770i, int i10, int i11, boolean z10, float f6, C5971a c5971a, float f10, boolean z11, boolean z12, n nVar, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f51604Z = c6770i;
        this.f51605h0 = i10;
        this.f51606i0 = i11;
        this.f51607j0 = z10;
        this.f51608k0 = f6;
        this.f51609l0 = c5971a;
        this.f51610m0 = f10;
        this.f51611n0 = z11;
        this.f51612o0 = z12;
        this.f51613p0 = nVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new C6766e(this.f51604Z, this.f51605h0, this.f51606i0, this.f51607j0, this.f51608k0, this.f51609l0, this.f51610m0, this.f51611n0, this.f51612o0, this.f51613p0, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((C6766e) create((AbstractC4825e) obj)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        AbstractC4831k abstractC4831k;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f51603Y;
        y yVar = y.f36177a;
        C6770i c6770i = this.f51604Z;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    N.B0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                N.B0(obj);
                c6770i.g(this.f51605h0);
                int i11 = this.f51606i0;
                c6770i.f51626h0.setValue(Integer.valueOf(i11));
                c6770i.f51627i0.setValue(Boolean.valueOf(this.f51607j0));
                float f6 = this.f51608k0;
                c6770i.f51629k0.setValue(Float.valueOf(f6));
                c6770i.f51628j0.setValue(null);
                C1724m0 c1724m0 = c6770i.f51632n0;
                C5971a c5971a = this.f51609l0;
                c1724m0.setValue(c5971a);
                c6770i.h(this.f51610m0);
                c6770i.f51630l0.setValue(Boolean.valueOf(this.f51611n0));
                if (!this.f51612o0) {
                    c6770i.f51635q0.setValue(Long.MIN_VALUE);
                }
                C1724m0 c1724m02 = c6770i.f51624Y;
                if (c5971a == null) {
                    c1724m02.setValue(Boolean.FALSE);
                    return yVar;
                } else if (Float.isInfinite(f6)) {
                    c6770i.h(c6770i.e());
                    c1724m02.setValue(Boolean.FALSE);
                    c6770i.g(i11);
                    return yVar;
                } else {
                    c1724m02.setValue(Boolean.TRUE);
                    int ordinal = this.f51613p0.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            abstractC4831k = z0.f13000Y;
                        } else {
                            throw new RuntimeException();
                        }
                    } else {
                        abstractC4831k = C4832l.f40334Y;
                    }
                    C6765d c6765d = new C6765d(this.f51613p0, Ad.l.v0(getContext()), this.f51606i0, this.f51605h0, this.f51604Z, null);
                    this.f51603Y = 1;
                    if (Ad.l.n1(this, abstractC4831k, c6765d) == enumC5000a) {
                        return enumC5000a;
                    }
                }
            }
            Ad.l.i0(getContext());
            return yVar;
        } finally {
            C6770i.d(c6770i, false);
        }
    }
}
