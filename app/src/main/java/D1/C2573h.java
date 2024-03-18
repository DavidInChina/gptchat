package d1;

import H0.B0;
import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import z.AbstractC6708l;

/* renamed from: d1.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2573h extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f27869Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f27870Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C2584s f27871h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2573h(C2584s c2584s, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f27871h0 = c2584s;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C2573h c2573h = new C2573h(this.f27871h0, abstractC4825e);
        c2573h.f27870Z = obj;
        return c2573h;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2573h) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0046 -> B:14:0x0049). Please submit an issue!!! */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        F f6;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f27869Y;
        if (i10 != 0) {
            if (i10 == 1) {
                f6 = (F) this.f27870Z;
                N.B0(obj);
                C2584s c2584s = this.f27871h0;
                int[] iArr = c2584s.f27905G0;
                int i11 = iArr[0];
                int i12 = iArr[1];
                c2584s.f27909s0.getLocationOnScreen(iArr);
                if (i11 == iArr[0] || i12 != iArr[1]) {
                    c2584s.k();
                }
                if (Ad.l.F0(f6)) {
                    C2567b c2567b = C2567b.f27848h0;
                    this.f27870Z = f6;
                    this.f27869Y = 1;
                    AbstractC6708l.e(getContext().get(B0.f6714Y));
                    if (kotlin.jvm.internal.m.v(getContext()).S(c2567b, this) == enumC5000a) {
                        return enumC5000a;
                    }
                    C2584s c2584s2 = this.f27871h0;
                    int[] iArr2 = c2584s2.f27905G0;
                    int i112 = iArr2[0];
                    int i122 = iArr2[1];
                    c2584s2.f27909s0.getLocationOnScreen(iArr2);
                    if (i112 == iArr2[0]) {
                    }
                    c2584s2.k();
                    if (Ad.l.F0(f6)) {
                        return y.f36177a;
                    }
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            f6 = (F) this.f27870Z;
            if (Ad.l.F0(f6)) {
            }
        }
    }
}
