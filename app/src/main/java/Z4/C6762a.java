package z4;

import A.B0;
import A.D0;
import A.F0;
import Ng.F;
import Z.AbstractC1710f0;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import v4.C5971a;

/* renamed from: z4.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6762a extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f51585Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ boolean f51586Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ boolean f51587h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6763b f51588i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ C5971a f51589j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ int f51590k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ boolean f51591l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ float f51592m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ n f51593n0;

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ boolean f51594o0;

    /* renamed from: p0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1710f0 f51595p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6762a(boolean z10, boolean z11, AbstractC6763b abstractC6763b, C5971a c5971a, int i10, boolean z12, float f6, n nVar, boolean z13, AbstractC1710f0 abstractC1710f0, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f51586Z = z10;
        this.f51587h0 = z11;
        this.f51588i0 = abstractC6763b;
        this.f51589j0 = c5971a;
        this.f51590k0 = i10;
        this.f51591l0 = z12;
        this.f51592m0 = f6;
        this.f51593n0 = nVar;
        this.f51594o0 = z13;
        this.f51595p0 = abstractC1710f0;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C6762a(this.f51586Z, this.f51587h0, this.f51588i0, this.f51589j0, this.f51590k0, this.f51591l0, this.f51592m0, this.f51593n0, this.f51594o0, this.f51595p0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C6762a) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        Object obj2 = EnumC5000a.f41328Y;
        int i10 = this.f51585Y;
        Object obj3 = y.f36177a;
        B0 b02 = B0.f14Y;
        AbstractC6763b abstractC6763b = this.f51588i0;
        AbstractC1710f0 abstractC1710f0 = this.f51595p0;
        boolean z11 = this.f51586Z;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    N.B0(obj);
                    return obj3;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            N.B0(obj);
        } else {
            N.B0(obj);
            if (z11 && !((Boolean) abstractC1710f0.getValue()).booleanValue() && this.f51587h0) {
                this.f51585Y = 1;
                C6770i c6770i = (C6770i) abstractC6763b;
                C5971a c5971a = (C5971a) c6770i.f51632n0.getValue();
                AbstractC2469q0.p(c6770i.f51628j0.getValue());
                int i11 = (((Number) c6770i.f51629k0.getValue()).floatValue() > 0.0f ? 1 : (((Number) c6770i.f51629k0.getValue()).floatValue() == 0.0f ? 0 : -1));
                float f6 = 1.0f;
                if ((i11 >= 0 || c5971a != null) && (c5971a == null || i11 >= 0)) {
                    f6 = 0.0f;
                }
                C5971a c5971a2 = (C5971a) c6770i.f51632n0.getValue();
                if (f6 == ((Number) c6770i.f51634p0.getValue()).floatValue()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C6769h c6769h = new C6769h(c6770i, c5971a2, f6, 1, !z10, null);
                F0 f02 = c6770i.f51637s0;
                f02.getClass();
                Object e02 = Ad.l.e0(new D0(b02, f02, c6769h, null), this);
                Object obj4 = e02;
                if (e02 != obj2) {
                    obj4 = obj3;
                }
                if (obj4 != obj2) {
                    obj4 = obj3;
                }
                if (obj4 == obj2) {
                    return obj2;
                }
            }
        }
        abstractC1710f0.setValue(Boolean.valueOf(z11));
        if (!z11) {
            return obj3;
        }
        C6770i c6770i2 = (C6770i) abstractC6763b;
        float floatValue = ((Number) c6770i2.f51634p0.getValue()).floatValue();
        this.f51585Y = 2;
        int f10 = c6770i2.f();
        c6770i2.getClass();
        C6766e c6766e = new C6766e(c6770i2, f10, this.f51590k0, this.f51591l0, this.f51592m0, this.f51589j0, floatValue, this.f51594o0, false, this.f51593n0, null);
        F0 f03 = c6770i2.f51637s0;
        f03.getClass();
        Object e03 = Ad.l.e0(new D0(b02, f03, c6766e, null), this);
        if (e03 != obj2) {
            e03 = obj3;
        }
        if (e03 == obj2) {
            return obj2;
        }
        return obj3;
    }
}
