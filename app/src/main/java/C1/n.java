package c1;

import androidx.lifecycle.AbstractC2086v;
import jf.y;
import l0.AbstractC4326r;

/* loaded from: classes2.dex */
public final class n extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Z  reason: collision with root package name */
    public static final n f26090Z = new n(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final n f26091h0 = new n(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final n f26092i0 = new n(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final n f26093j0 = new n(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final n f26094k0 = new n(4);

    /* renamed from: l0  reason: collision with root package name */
    public static final n f26095l0 = new n(5);

    /* renamed from: m0  reason: collision with root package name */
    public static final n f26096m0 = new n(6);

    /* renamed from: n0  reason: collision with root package name */
    public static final n f26097n0 = new n(7);

    /* renamed from: o0  reason: collision with root package name */
    public static final n f26098o0 = new n(8);

    /* renamed from: p0  reason: collision with root package name */
    public static final n f26099p0 = new n(9);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f26100Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i10) {
        super(2);
        this.f26100Y = i10;
    }

    public final void a(androidx.compose.ui.node.a aVar, wf.k kVar) {
        switch (this.f26100Y) {
            case 0:
                AbstractC2279d.h(aVar).setResetBlock(kVar);
                return;
            case 1:
                AbstractC2279d.h(aVar).setUpdateBlock(kVar);
                return;
            case 2:
                AbstractC2279d.h(aVar).setReleaseBlock(kVar);
                return;
            case 3:
                AbstractC2279d.h(aVar).setUpdateBlock(kVar);
                return;
            default:
                AbstractC2279d.h(aVar).setReleaseBlock(kVar);
                return;
        }
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        int i10;
        y yVar = y.f36177a;
        switch (this.f26100Y) {
            case 0:
                a((androidx.compose.ui.node.a) obj, (wf.k) obj2);
                return yVar;
            case 1:
                a((androidx.compose.ui.node.a) obj, (wf.k) obj2);
                return yVar;
            case 2:
                a((androidx.compose.ui.node.a) obj, (wf.k) obj2);
                return yVar;
            case 3:
                a((androidx.compose.ui.node.a) obj, (wf.k) obj2);
                return yVar;
            case 4:
                a((androidx.compose.ui.node.a) obj, (wf.k) obj2);
                return yVar;
            case 5:
                AbstractC2279d.h((androidx.compose.ui.node.a) obj).setModifier((AbstractC4326r) obj2);
                return yVar;
            case 6:
                AbstractC2279d.h((androidx.compose.ui.node.a) obj).setDensity((Z0.b) obj2);
                return yVar;
            case 7:
                AbstractC2279d.h((androidx.compose.ui.node.a) obj).setLifecycleOwner((AbstractC2086v) obj2);
                return yVar;
            case 8:
                AbstractC2279d.h((androidx.compose.ui.node.a) obj).setSavedStateRegistryOwner((A3.f) obj2);
                return yVar;
            default:
                q h10 = AbstractC2279d.h((androidx.compose.ui.node.a) obj);
                int ordinal = ((Z0.l) obj2).ordinal();
                if (ordinal != 0) {
                    i10 = 1;
                    if (ordinal != 1) {
                        throw new RuntimeException();
                    }
                } else {
                    i10 = 0;
                }
                h10.setLayoutDirection(i10);
                return yVar;
        }
    }
}
