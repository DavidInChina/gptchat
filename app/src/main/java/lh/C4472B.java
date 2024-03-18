package lh;

import android.graphics.Matrix;
import wf.AbstractC6216a;

/* renamed from: lh.B  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4472B extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Z  reason: collision with root package name */
    public static final C4472B f38423Z = new C4472B(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C4472B f38424h0 = new C4472B(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f38425Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4472B(int i10) {
        super(0);
        this.f38425Y = i10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        switch (this.f38425Y) {
            case 0:
                return C4484c.f38464a;
            default:
                return new Matrix();
        }
    }
}
