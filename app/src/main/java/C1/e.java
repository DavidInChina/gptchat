package c1;

import E0.c0;
import H0.RunnableC0712x;
import L0.v;
import android.view.View;
import jf.y;

/* loaded from: classes2.dex */
public final class e extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final e f26044Z = new e(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final e f26045h0 = new e(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final e f26046i0 = new e(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final e f26047j0 = new e(3);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f26048Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10) {
        super(1);
        this.f26048Y = i10;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        y yVar = y.f36177a;
        switch (this.f26048Y) {
            case 0:
                l lVar = (l) obj;
                lVar.getHandler().post(new RunnableC0712x(lVar.f26084u0, 2));
                return yVar;
            case 1:
                c0 c0Var = (c0) obj;
                return yVar;
            case 2:
                v vVar = (v) obj;
                return yVar;
            default:
                View view = (View) obj;
                return yVar;
        }
    }
}
