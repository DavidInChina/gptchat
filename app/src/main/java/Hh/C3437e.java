package hh;

import wf.AbstractC6216a;

/* renamed from: hh.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3437e extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Z  reason: collision with root package name */
    public static final C3437e f32351Z = new C3437e(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C3437e f32352h0 = new C3437e(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f32353Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3437e(int i10) {
        super(0);
        this.f32353Y = i10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        switch (this.f32353Y) {
            case 0:
                return Boolean.TRUE;
            default:
                return Class.forName("android.app.ActivityThread");
        }
    }
}
