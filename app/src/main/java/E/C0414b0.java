package E;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;

/* renamed from: E.b0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0414b0 extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f3844Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ float f3845Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ float f3846h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0414b0(float f6, float f10, int i10) {
        super(1);
        this.f3844Y = i10;
        this.f3845Z = f6;
        this.f3846h0 = f10;
    }

    public final void a() {
        switch (this.f3844Y) {
            case 0:
                throw null;
            case 1:
                throw null;
            default:
                throw null;
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        float f6;
        switch (this.f3844Y) {
            case 0:
                AbstractC2469q0.p(obj);
                a();
                throw null;
            case 1:
                AbstractC2469q0.p(obj);
                a();
                throw null;
            default:
                if (((Boolean) obj).booleanValue()) {
                    f6 = this.f3845Z;
                } else {
                    f6 = this.f3846h0;
                }
                return Float.valueOf(f6);
        }
    }
}
