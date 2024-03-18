package y;

import W.I2;
import r0.AbstractC5350n;
import t0.AbstractC5646e;
import t0.AbstractC5648g;
import t0.AbstractC5650i;
import t0.AbstractC5651j;
import t0.C5654m;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class Z extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f50171Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ long f50172Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ long f50173h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f50174i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f50175j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Z(int i10, long j6, long j10, Object obj, Object obj2) {
        super(1);
        this.f50171Y = i10;
        this.f50174i0 = obj;
        this.f50172Z = j6;
        this.f50173h0 = j10;
        this.f50175j0 = obj2;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f50171Y;
        long j6 = this.f50172Z;
        Object obj2 = this.f50175j0;
        Object obj3 = this.f50174i0;
        switch (i10) {
            case 0:
                int i11 = Z0.i.f22798c;
                long j10 = this.f50173h0;
                ((E0.c0) obj).getClass();
                E0.c0.j((E0.d0) obj3, ((int) (j6 >> 32)) + ((int) (j10 >> 32)), ((int) (j6 & 4294967295L)) + ((int) (j10 & 4294967295L)), 0.0f, (wf.k) obj2);
                return yVar;
            case 1:
                G0.J j11 = (G0.J) ((AbstractC5646e) obj);
                j11.a();
                long j12 = this.f50173h0;
                AbstractC5648g.j(j11, (AbstractC5350n) obj3, this.f50172Z, j12, 0.0f, (AbstractC5651j) obj2, 104);
                return yVar;
            default:
                AbstractC5650i abstractC5650i = (AbstractC5650i) obj;
                C5654m c5654m = (C5654m) obj2;
                I2.e(abstractC5650i, 0.0f, 360.0f, j6, c5654m);
                I2.e(abstractC5650i, 270.0f, ((Number) ((AbstractC6216a) obj3).mo122invoke()).floatValue() * 360.0f, this.f50173h0, c5654m);
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(AbstractC6216a abstractC6216a, long j6, C5654m c5654m, long j10) {
        super(1);
        this.f50171Y = 2;
        this.f50174i0 = abstractC6216a;
        this.f50172Z = j6;
        this.f50175j0 = c5654m;
        this.f50173h0 = j10;
    }
}
