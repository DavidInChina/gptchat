package U;

import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class c extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f17329Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ n f17330Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(n nVar, int i10) {
        super(0);
        this.f17329Y = i10;
        this.f17330Z = nVar;
    }

    public final Float a() {
        int i10 = this.f17329Y;
        n nVar = this.f17330Z;
        switch (i10) {
            case 0:
                float a5 = nVar.a() / nVar.b();
                float f6 = 1.0f;
                if (a5 < 1.0f) {
                    f6 = 0.3f;
                }
                return Float.valueOf(f6);
            default:
                return Float.valueOf(nVar.f17370f.h() * 0.5f);
        }
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo122invoke() {
        switch (this.f17329Y) {
            case 0:
                return a();
            default:
                return a();
        }
    }
}
