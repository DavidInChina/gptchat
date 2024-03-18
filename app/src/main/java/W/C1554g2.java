package W;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: W.g2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1554g2 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f20075Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C1550f3 f20076Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ float f20077h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1554g2(C1550f3 c1550f3, float f6, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f20076Z = c1550f3;
        this.f20077h0 = f6;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C1554g2(this.f20076Z, this.f20077h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1554g2) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
        if (r7 == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
        r7 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
        if (r7 == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
        if (r7 != r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
        r7 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
        if (r7 != r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
        return r0;
     */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3 = EnumC5000a.f41328Y;
        int i10 = this.f20075Y;
        Object obj4 = jf.y.f36177a;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            this.f20075Y = 1;
            C c10 = this.f20076Z.f20062c;
            Object value = c10.f18997f.getValue();
            float g10 = c10.g();
            float f6 = this.f20077h0;
            Object c11 = c10.c(g10, f6, value);
            if (((Boolean) c10.f18994c.invoke(c11)).booleanValue()) {
                Object p10 = kotlin.jvm.internal.m.p(c10, c11, f6, this);
                obj2 = p10;
            } else {
                Object p11 = kotlin.jvm.internal.m.p(c10, value, f6, this);
                obj2 = p11;
            }
        }
        return obj4;
    }
}
