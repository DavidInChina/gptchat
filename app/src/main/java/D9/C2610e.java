package d9;

import id.AbstractC3557B;
import jf.y;
import s3.C5538A;
import y.AbstractC6482u;
import y.d0;
import y.e0;

/* renamed from: d9.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2610e extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final C2610e f28133Z = new C2610e(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C2610e f28134h0 = new C2610e(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C2610e f28135i0 = new C2610e(2);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f28136Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2610e(int i10) {
        super(1);
        this.f28136Y = i10;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        switch (this.f28136Y) {
            case 0:
                AbstractC3557B.c0("$this$NavHost", (AbstractC6482u) obj);
                return d0.f50196b;
            case 1:
                AbstractC3557B.c0("$this$NavHost", (AbstractC6482u) obj);
                return e0.f50199b;
            default:
                C5538A c5538a = (C5538A) obj;
                AbstractC3557B.c0("$this$navDeepLink", c5538a);
                c5538a.f45207b = "com.openai.chat://auth/{event}";
                return y.f36177a;
        }
    }
}
