package v0;

import android.graphics.PathMeasure;
import r0.C5345i;
import wf.AbstractC6216a;

/* renamed from: v0.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5954g extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Z  reason: collision with root package name */
    public static final C5954g f46950Z = new C5954g(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C5954g f46951h0 = new C5954g(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f46952Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5954g(int i10) {
        super(0);
        this.f46952Y = i10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        switch (this.f46952Y) {
            case 0:
                return new C5345i(new PathMeasure());
            default:
                return jf.y.f36177a;
        }
    }
}
