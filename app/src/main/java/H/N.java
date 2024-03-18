package H;

import B.AbstractC0130h1;
import B.L0;
import nf.AbstractC4825e;
import of.EnumC5000a;
import w.C6077x;

/* loaded from: classes2.dex */
public final class N implements L0 {

    /* renamed from: a  reason: collision with root package name */
    public final C.j f6588a;

    /* renamed from: b  reason: collision with root package name */
    public final F f6589b;

    public N(C.j jVar, F f6) {
        this.f6588a = jVar;
        this.f6589b = f6;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    @Override // B.L0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(AbstractC0130h1 abstractC0130h1, float f6, AbstractC4825e abstractC4825e) {
        M m10;
        int i10;
        if (abstractC4825e instanceof M) {
            m10 = (M) abstractC4825e;
            int i11 = m10.f6587h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                m10.f6587h0 = i11 - Integer.MIN_VALUE;
                Object obj = m10.f6585Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = m10.f6587h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    C6077x c6077x = new C6077x(14, this);
                    m10.f6587h0 = 1;
                    obj = this.f6588a.d(abstractC0130h1, f6, c6077x, m10);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                return new Float(((Number) obj).floatValue());
            }
        }
        m10 = new M(this, abstractC4825e);
        Object obj2 = m10.f6585Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = m10.f6587h0;
        if (i10 == 0) {
        }
        return new Float(((Number) obj2).floatValue());
    }
}
