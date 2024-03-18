package c1;

import D1.H;
import D1.Z;
import E0.AbstractC0461u;
import E0.c0;
import H0.C0704t;
import H0.C0714y;
import androidx.compose.ui.node.Owner;
import java.util.WeakHashMap;
import jf.y;

/* loaded from: classes2.dex */
public final class f extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f26049Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ l f26050Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.node.a f26051h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(l lVar, androidx.compose.ui.node.a aVar, int i10) {
        super(1);
        this.f26049Y = i10;
        this.f26050Z = lVar;
        this.f26051h0 = aVar;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        C0714y c0714y;
        y yVar = y.f36177a;
        int i10 = this.f26049Y;
        androidx.compose.ui.node.a aVar = this.f26051h0;
        l lVar = this.f26050Z;
        switch (i10) {
            case 0:
                Owner owner = (Owner) obj;
                if (owner instanceof C0714y) {
                    c0714y = (C0714y) owner;
                } else {
                    c0714y = null;
                }
                if (c0714y != null) {
                    c0714y.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().put(lVar, aVar);
                    c0714y.getAndroidViewsHandler$ui_release().addView(lVar);
                    c0714y.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(aVar, lVar);
                    WeakHashMap weakHashMap = Z.f3247a;
                    H.s(lVar, 1);
                    Z.l(lVar, new C0704t(c0714y, aVar, c0714y));
                }
                if (lVar.getView().getParent() != lVar) {
                    lVar.addView(lVar.getView());
                }
                return yVar;
            case 1:
                c0 c0Var = (c0) obj;
                AbstractC2279d.g(lVar, aVar);
                return yVar;
            default:
                AbstractC0461u abstractC0461u = (AbstractC0461u) obj;
                AbstractC2279d.g(lVar, aVar);
                return yVar;
        }
    }
}
