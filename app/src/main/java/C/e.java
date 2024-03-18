package C;

import kotlin.jvm.internal.y;

/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f2442Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ y f2443Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.k f2444h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(y yVar, wf.k kVar, int i10) {
        super(1);
        this.f2442Y = i10;
        this.f2443Z = yVar;
        this.f2444h0 = kVar;
    }

    public final void a(float f6) {
        int i10 = this.f2442Y;
        wf.k kVar = this.f2444h0;
        y yVar = this.f2443Z;
        switch (i10) {
            case 0:
                float f10 = yVar.f37646Y - f6;
                yVar.f37646Y = f10;
                kVar.invoke(Float.valueOf(f10));
                return;
            default:
                float f11 = yVar.f37646Y - f6;
                yVar.f37646Y = f11;
                kVar.invoke(Float.valueOf(f11));
                return;
        }
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f2442Y) {
            case 0:
                a(((Number) obj).floatValue());
                return yVar;
            default:
                a(((Number) obj).floatValue());
                return yVar;
        }
    }
}
