package U;

import G0.J;
import L0.v;
import jf.y;
import t0.AbstractC5646e;
import t0.C5643b;

/* loaded from: classes2.dex */
public final class b extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final b f17326Z = new b(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final b f17327h0 = new b(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f17328Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10) {
        super(1);
        this.f17328Y = i10;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        y yVar = y.f36177a;
        switch (this.f17328Y) {
            case 0:
                v vVar = (v) obj;
                return yVar;
            default:
                J j6 = (J) ((AbstractC5646e) obj);
                C5643b c5643b = j6.f5596Y.f45612Z;
                long b10 = c5643b.b();
                c5643b.a().h();
                c5643b.f45609a.a(-3.4028235E38f, 0.0f, Float.MAX_VALUE, Float.MAX_VALUE, 1);
                j6.a();
                c5643b.a().q();
                c5643b.c(b10);
                return yVar;
        }
    }
}
